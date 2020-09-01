package com.qiguliuxing.dts.wx.web;

import com.qiguliuxing.dts.core.util.ResponseUtil;
import com.qiguliuxing.dts.db.domain.DtsAboutMe;
import com.qiguliuxing.dts.db.service.DtsAboutMeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: WxCorpController</p>
 * <p>Description:
 * 描述：
 * </p>
 *
 * @author jinpu.shi
 * @version v1.0.0
 * @since 2020-09-01 19:08
 */
@RestController
@RequestMapping("/wx/corp")
public class WxCorpController {
    @Autowired
    private DtsAboutMeService dtsAboutMeService;

    @GetMapping("query")
    public Object query(@RequestParam("corpId") int corpId){
        DtsAboutMe query = dtsAboutMeService.query(corpId);
        return ResponseUtil.ok(query);
    }

}
