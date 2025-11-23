package proyecto_crud_v1.domain.ports.output;

import proyecto_crud_v1.domain.models.AdditionalTasksInfo;

public interface ExternalServicePort {
    AdditionalTasksInfo tareaInfoTareaAdicional(Long id);
}
