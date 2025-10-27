package org.example.repository;

import org.example.dto.UserAccount;
import org.example.entity.UserAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccountEntity, Integer> {
}
