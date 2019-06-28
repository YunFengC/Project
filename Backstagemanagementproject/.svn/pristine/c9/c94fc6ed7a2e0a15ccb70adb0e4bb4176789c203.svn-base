package com.backstage.service.Impl;

import com.backstage.damain.Role;
import com.backstage.damain.UserInfo;
import com.backstage.dao.UserDao;
import com.backstage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 权限验证
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException  {
        //获取查询到的数据
        UserInfo byUsername = userDao.findByUsername(username);
        //获得roles集合
        List<Role> roles = byUsername.getRoles();
        //调用getAuthority方法
        List<SimpleGrantedAuthority> authority = getAuthority(roles);
        /**
         * User是UserDetails接口的实现类,需要传入查出来的用户名和密码还有权限
         * 参数三：权限
         */
        User user = new User(byUsername.getUsername(),"{noop}" + byUsername.getPassword(),
                byUsername.getStatus()==0?false:true, true, true, true, authority);
        //把封装好的user返回
        return user;
    }

    /**
     * 返回一个集合,集合中装的是角色描述
     * @param roles
     * @return
     */
    public List<SimpleGrantedAuthority> getAuthority(List<Role> roles){
            //新建一个集合
            List<SimpleGrantedAuthority> arrayList = new ArrayList();
            //循环角色表获取角色名
            for (Role role : roles ){
                //把角色名添加到List<SimpleGrantedAuthority>集合中
                arrayList.add(new SimpleGrantedAuthority("ROLE_"+role.getRoleName()));
            }
            //返回已添加角色名的集合
            return arrayList;
        }

    public List<UserInfo> findAll() {
        return userDao.findAll();
    }

    public List<Role> addByIdRoleName(String id) {
        return userDao.addByIdRoleName(id);
    }

    public void addRoleToUser(String s, String uid) {
        userDao.addRoleToUser(s,uid);
    }

    public void save(UserInfo userInfo) {
        userDao.save(userInfo);
    }

    public void delete(String s) {
        userDao.delete(s);
    }

    public UserInfo findUserId(String id) {
        return userDao.findUserId(id);
    }

    public UserInfo findById(String uid) {
        return userDao.findByRid(uid);
    }
}
