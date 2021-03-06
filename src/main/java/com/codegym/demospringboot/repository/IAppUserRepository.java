package com.codegym.demospringboot.repository;

import com.codegym.demospringboot.model.AppUser;
import org.springframework.data.repository.CrudRepository;

public interface IAppUserRepository extends CrudRepository<AppUser, Long> {
    AppUser findByName(String name);
}
