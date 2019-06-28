package com.maven.dao;

import com.maven.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DaoMapper {

    public List<Account> getAll();
}
