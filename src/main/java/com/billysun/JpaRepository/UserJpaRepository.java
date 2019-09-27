package com.billysun.JpaRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.billysun.entity.User;

@Repository
public interface UserJpaRepository  extends CrudRepository<User, String> {

}
