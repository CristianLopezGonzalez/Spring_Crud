package proyecto_crud_v1.domain.ports.input;

import proyecto_crud_v1.domain.models.AdditionalTasksInfo;

public interface GetAdditionalTaskInfoUseCase {

    AdditionalTasksInfo informacionAdicional(Long id);

}
