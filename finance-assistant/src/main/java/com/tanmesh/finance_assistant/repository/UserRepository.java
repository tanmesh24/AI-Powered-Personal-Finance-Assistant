package com.tanmesh.finance_assistant.repository;

import com.tanmesh.finance_assistant.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}