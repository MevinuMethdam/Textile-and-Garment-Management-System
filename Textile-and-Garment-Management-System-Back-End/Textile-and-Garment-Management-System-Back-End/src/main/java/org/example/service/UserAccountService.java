package org.example.service;

import org.example.dto.UserAccount;

import java.util.List;

public interface UserAccountService {
    List<UserAccount> getAll();

    void addUserAccount(UserAccount userAccount);

    void deleteUserAccountById(Integer id);

    UserAccount searchUserAccountById(Integer id);

    void updateUserAccountById(UserAccount userAccount);
}
