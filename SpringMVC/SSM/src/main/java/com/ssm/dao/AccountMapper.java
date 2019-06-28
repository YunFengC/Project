package com.ssm.dao;

import com.ssm.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountMapper {
    /**
     * 查询所有
     * @return
     */
    //@Select("select * from account")
    public List<Account> findAll();

    /**
     * 保存数据
     */
    @Insert("insert into account(name,money) values(#{name},#{money})")
    public void Save(Account account);

    /**
     * 删除数据
     * @param account
     */
    @Delete("delete from account where id=#{id}")
    void delete(Account account);
}
