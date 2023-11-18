package com312.first_springboot.model;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    @Pattern(regexp = "[a-zA-ZА-Яа-яЁё]+", message = "Неверно указано имя")
    private String firstName;

    @Column(name = "last_name")
    @Pattern(regexp = "[a-zA-ZА-Яа-яЁё]+", message = "Неверно указана фамилия")
    private String lastName;

    @Column(name = "year")
    @Min(value = 0, message = "Неверно указан год")
    @Max(value = 2023, message = "Неверно указан год")
    @NotNull(message = "Неверно указан год")
    private Long year;
}