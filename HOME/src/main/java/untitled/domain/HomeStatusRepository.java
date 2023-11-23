package untitled.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import untitled.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "homeStatuses",
    path = "homeStatuses"
)
public interface HomeStatusRepository
    extends PagingAndSortingRepository<HomeStatus, Long> {}
