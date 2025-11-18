package com.jgroup.financemanager.application.infrastructure.repository.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "users")
@Getter
@Setter
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @NotNull
    private String name;
    @NotNull
    private String email;
    private String cellphone;
    @NotNull
    private String password;
}
