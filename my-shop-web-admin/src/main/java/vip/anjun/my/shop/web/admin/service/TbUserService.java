package vip.anjun.my.shop.web.admin.service;

import vip.anjun.my.shop.commons.persistence.BaseService;
import vip.anjun.my.shop.domain.TbUser;

public interface TbUserService extends BaseService<TbUser> {
    /**
     * 用户登录
     *
     * @param email
     * @param password
     * @return
     */
    TbUser login(String email, String password);
}
