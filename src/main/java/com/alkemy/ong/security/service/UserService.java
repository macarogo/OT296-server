package com.alkemy.ong.security.service;

import com.alkemy.ong.dto.UserDTO;
import javassist.NotFoundException;

import com.alkemy.ong.security.dto.RegisterDTO;
import java.util.Map;

public interface UserService {
    void delete(String id) throws NotFoundException;

    RegisterDTO create (RegisterDTO user);
    void patchUser(String id, Map<Object, Object> objectMap) throws NotFoundException;

    public UserDTO meData(String authorization);

}