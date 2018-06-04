package com.qwkj.user.service.Impl;

import com.qwkj.common.mapper.UUserMapper;
import com.qwkj.common.pojo.UUser;
import com.qwkj.core.mybatis.BaseMybatisDao;
import com.qwkj.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseMybatisDao<UUserMapper> implements UserService {

    @Autowired(required = false)
    UUserMapper uUserMapper;

    @Override
    public UUser getUUSerByEmail(UUser user) {
        UUser user1 = uUserMapper.getUUSerByEmail(user.getEmail(),user.getPswd());

        return user1;
    }
}
