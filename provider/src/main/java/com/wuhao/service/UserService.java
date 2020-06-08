package com.wuhao.service;

import com.wuhao.domain.User;

/**
 * @Description: User的Service
 * @CreateDate: 2020-02-05 09:35
 * @Author: wuhao
 */
public interface UserService {

    User queryUserById(Long id);

    int addUser(User user);

    int modifyUser(User user);

    int deleteUserById(Long id);

}
