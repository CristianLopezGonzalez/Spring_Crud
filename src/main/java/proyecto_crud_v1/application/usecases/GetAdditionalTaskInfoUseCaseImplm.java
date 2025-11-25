package proyecto_crud_v1.application.usecases;

import proyecto_crud_v1.domain.models.AdditionalTasksInfo;
import proyecto_crud_v1.domain.ports.input.GetAdditionalTaskInfoUseCase;
import proyecto_crud_v1.domain.ports.output.ExternalServicePort;

public class GetAdditionalTaskInfoUseCaseImplm implements GetAdditionalTaskInfoUseCase{

    private final ExternalServicePort externalServicePort;
    
    public GetAdditionalTaskInfoUseCaseImplm(ExternalServicePort externalServicePort) {
        this.externalServicePort = externalServicePort;
    }

    @Override
    public AdditionalTasksInfo informacionAdicional(Long id) {
        return externalServicePort.tareaInfoTareaAdicional(id);
    }
    

}
