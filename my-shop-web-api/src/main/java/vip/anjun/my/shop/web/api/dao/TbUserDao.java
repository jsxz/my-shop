package vip.anjun.my.shop.web.api.dao;

import vip.anjun.my.shop.domain.TbUser;
import org.springframework.stereotype.Repository;

/**
 * 会员管理
 * <p>Title: TbUserDao</p>
 * <p>Description: </p>
 */
@Repository
public interface TbUserDao {
    /**
     * 登录
     * @param tbUser
     * @return
     */
    TbUser login(TbUser tbUser);
}
