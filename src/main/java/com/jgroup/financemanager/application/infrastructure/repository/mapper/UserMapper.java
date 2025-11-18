package com.jgroup.financemanager.application.infrastructure.repository.mapper;

import com.jgroup.financemanager.application.domain.model.User;
import com.jgroup.financemanager.application.infrastructure.repository.entities.UserEntity;

public class UserMapper {
    public static UserEntity toEntity(User user) {
        UserEntity entity = new UserEntity();
        entity.setId(user.getId());
        entity.setName(user.getName());
        entity.setEmail(user.getEmail());
        entity.setCellphone(user.getCellphone());
        entity.setPassword(user.getPassword());
        return entity;
    }

    public static User toDomain(UserEntity entity) {
        return new User(entity.getId(),
                entity.getName(),
                entity.getEmail(),
                entity.getCellphone(),
                entity.getPassword());
    }
}
