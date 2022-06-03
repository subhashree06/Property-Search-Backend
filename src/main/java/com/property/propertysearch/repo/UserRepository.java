package com.property.propertysearch.repo;

import com.property.propertysearch.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    public User findByUsername(String userName);
}

