package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class WorkStatusHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<WorkStatus>> {

    @Override
    public EntityModel<WorkStatus> process(EntityModel<WorkStatus> model) {
        return model;
    }
}
