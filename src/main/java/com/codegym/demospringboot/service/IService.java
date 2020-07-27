package com.codegym.demospringboot.service;

import jdk.nashorn.internal.runtime.options.Option;

import java.util.Optional;

public interface IService<T> {
    Iterable<T> findAll();
    Optional<T> findById(Long id);
    T save (T t);
    void remove (Long id);
}
