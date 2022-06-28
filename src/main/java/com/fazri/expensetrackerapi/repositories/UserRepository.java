package com.fazri.expensetrackerapi.repositories;

import com.fazri.expensetrackerapi.domain.User;
import com.fazri.expensetrackerapi.exceptions.EtAuthException;

public interface UserRepository {

    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;
    User findByEmailAndPassword(String email, String password) throws EtAuthException;
    User findById(Integer id) throws EtAuthException;
    Integer getCountByEmail(String email) throws EtAuthException;

}
