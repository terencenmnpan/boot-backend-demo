package com.tpan.bootbackenddemo.repositories;

import com.tpan.bootbackenddemo.entities.TaskUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskUserRepository extends JpaRepository<TaskUser, Long> {
    TaskUser findByUserName(String userName);

}