package proyecto_crud_v1.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto_crud_v1.infrastructure.entities.TaskEntity;

public interface JpaTaskRepository extends JpaRepository<TaskEntity,Long>{

    
}