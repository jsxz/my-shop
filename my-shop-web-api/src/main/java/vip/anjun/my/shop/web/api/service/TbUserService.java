package vip.anjun.my.shop.web.api.service;

import vip.anjun.my.shop.domain.TbUser;

/**
 * 会员管理
 * <p>Title: TbUserService</p>
 * <p>Description: </p>
 */
public interface TbUserService {

    /**
     * 登录
     * @param tbUser
     * @return
     */
    TbUser login(TbUser tbUser);
}
