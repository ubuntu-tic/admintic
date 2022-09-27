package com.ubuntu.admintic.repositories;

import com.ubuntu.admintic.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
        User findByEmail(String email);

}
