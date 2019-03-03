package vip.anjun.my.shop.web.ui.api;

import vip.anjun.my.shop.commons.utils.HttpClientUtils;
import vip.anjun.my.shop.commons.utils.MapperUtils;
import vip.anjun.my.shop.web.ui.dto.TbContent;

import java.util.List;

/**
 * 内容管理接口
 * <p>Title: ContentsApi</p>
 * <p>Description: </p>
 */
public class ContentsApi {

    /**
     * 请求幻灯片
     *
     * @return
     */
    public static List<TbContent> ppt() {
        List<TbContent> tbContents = null;
        String result = HttpClientUtils.doGet(API.API_CONTENTS_PPT);
        try {
            tbContents = MapperUtils.json2listByTree(result, "data", TbContent.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tbContents;
    }
}
