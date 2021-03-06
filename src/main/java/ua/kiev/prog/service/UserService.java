package ua.kiev.prog.service;

import ua.kiev.prog.entity.CustomUser;

public interface UserService {
    CustomUser getUserByLogin(String login);
    void addUser(CustomUser customUser);
    void updateUser(CustomUser customUser);
}
