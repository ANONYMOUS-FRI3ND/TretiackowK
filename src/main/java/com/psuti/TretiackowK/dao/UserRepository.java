package com.psuti.TretiackowK.dao;

import com.psuti.TretiackowK.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

}
