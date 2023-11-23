package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.OfficeApplication;
import untitled.domain.WorkStatus;

@Entity
@Table(name = "WorkStatus_table")
@Data
//<<< DDD / Aggregate Root
public class WorkStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String status;

    private String name;

    @PostPersist
    public void onPostPersist() {
        WorkStatus workStatus = new WorkStatus(this);
        workStatus.publishAfterCommit();
    }

    public static WorkStatusRepository repository() {
        WorkStatusRepository workStatusRepository = OfficeApplication.applicationContext.getBean(
            WorkStatusRepository.class
        );
        return workStatusRepository;
    }
}
//>>> DDD / Aggregate Root
