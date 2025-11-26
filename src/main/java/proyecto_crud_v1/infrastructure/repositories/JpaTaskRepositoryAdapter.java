package proyecto_crud_v1.infrastructure.repositories;

import java.util.List;
import java.util.Optional;

import proyecto_crud_v1.domain.models.Tasks;
import proyecto_crud_v1.domain.ports.output.TaskRepositoryPort;
import proyecto_crud_v1.infrastructure.entities.TaskEntity;

public class JpaTaskRepositoryAdapter implements TaskRepositoryPort {

    private final JpaTaskRepository jpaTaskRepository;

    public JpaTaskRepositoryAdapter(JpaTaskRepository jpaTaskRepository) {
        this.jpaTaskRepository = jpaTaskRepository;
    }


    @Override
    public Tasks save(Tasks tasks) {
        TaskEntity taskEntity = TaskEntity.fromDomainModel(tasks);
        TaskEntity savedTaskEntity = jpaTaskRepository.save(taskEntity);
        return savedTaskEntity.toDomainModel();
    }


    @Override
    public Optional<Tasks> findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }


    @Override
    public List<Tasks> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }


    @Override
    public Optional<Tasks> update(Tasks tarea) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }


    @Override
    public boolean deleteById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

   

}
