package me.aline.lab_api_rest.service;

import me.aline.lab_api_rest.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
