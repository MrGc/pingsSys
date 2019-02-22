package cn.pings.service.api.sys.service;

import cn.pings.service.api.common.service.BaseService;
import cn.pings.service.api.sys.entity.User;

/**
 *********************************************************
 ** @desc  ： 用户管理
 ** @author  Pings
 ** @date    2019/1/14
 ** @version v1.0
 * *******************************************************
 */
public interface UserService extends BaseService<User> {

    /**
     *********************************************************
     ** @desc ： 根据id查询
     ** @author Pings
     ** @date   2019/1/8
     ** @param  id   编号
     ** @return User
     * *******************************************************
     */
    User getById(int id);

    /**
     *********************************************************
     ** @desc ： 根据用户名称查询用户
     ** @author Pings
     ** @date   2019/1/14
     ** @param  userName  用户名称
     ** @return User
     * *******************************************************
     */
    User getByUserName(String userName);

}
