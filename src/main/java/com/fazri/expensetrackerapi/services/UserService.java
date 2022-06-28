package com.fazri.expensetrackerapi.services;

import com.fazri.expensetrackerapi.domain.User;
import com.fazri.expensetrackerapi.exceptions.EtAuthException;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;
    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;

}
