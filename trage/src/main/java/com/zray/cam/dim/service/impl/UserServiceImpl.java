package com.zray.cam.dim.service.impl;

import com.zray.cam.base.impl.BaseServiceImpl;
import com.zray.cam.dim.domain.User;
import com.zray.cam.dim.mapper.UserMapper;
import com.zray.cam.dim.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper,User> implements UserService {


}
