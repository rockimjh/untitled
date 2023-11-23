package untitled.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import untitled.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "workStatuses",
    path = "workStatuses"
)
public interface WorkStatusRepository
    extends PagingAndSortingRepository<WorkStatus, Long> {}
