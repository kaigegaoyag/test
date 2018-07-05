package com.gat.service;

import com.gat.bean.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chen_kai on 2018/3/28.
 */
public interface UserService {
    User getUserById(Integer id);

    public List<User> getUserList();

    public int add(User user);

    public int update(Integer id, User user);

    public int delete(Integer id);
}
