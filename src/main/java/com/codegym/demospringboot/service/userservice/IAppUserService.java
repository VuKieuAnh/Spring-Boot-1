package com.codegym.demospringboot.service.userservice;

import com.codegym.demospringboot.model.AppUser;

public interface IAppUserService {
    AppUser getUserByUsername(String username);
}
