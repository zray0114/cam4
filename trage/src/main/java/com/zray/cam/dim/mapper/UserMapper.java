package com.zray.cam.dim.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zray.cam.dim.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper  extends BaseMapper<User> {
}
