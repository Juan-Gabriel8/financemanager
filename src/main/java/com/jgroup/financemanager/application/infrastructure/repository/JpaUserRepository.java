package com.jgroup.financemanager.application.infrastructure.repository;

import com.jgroup.financemanager.application.infrastructure.repository.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaUserRepository extends JpaRepository<UserEntity, UUID> {
}
