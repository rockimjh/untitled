package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class HomeStatusHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<HomeStatus>> {

    @Override
    public EntityModel<HomeStatus> process(EntityModel<HomeStatus> model) {
        return model;
    }
}
