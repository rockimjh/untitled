package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.HomeApplication;
import untitled.domain.HomeStatus;

@Entity
@Table(name = "HomeStatus_table")
@Data
//<<< DDD / Aggregate Root
public class HomeStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String status;

    @PostPersist
    public void onPostPersist() {
        HomeStatus homeStatus = new HomeStatus(this);
        homeStatus.publishAfterCommit();
    }

    public static HomeStatusRepository repository() {
        HomeStatusRepository homeStatusRepository = HomeApplication.applicationContext.getBean(
            HomeStatusRepository.class
        );
        return homeStatusRepository;
    }

    //<<< Clean Arch / Port Method
    public static void monitorStatus(WorkStatus workStatus) {
        //implement business logic here:

        /** Example 1:  new item 
        HomeStatus homeStatus = new HomeStatus();
        repository().save(homeStatus);

        HomeStatus homeStatus = new HomeStatus(homeStatus);
        homeStatus.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(workStatus.get???()).ifPresent(homeStatus->{
            
            homeStatus // do something
            repository().save(homeStatus);

            HomeStatus homeStatus = new HomeStatus(homeStatus);
            homeStatus.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
