package com.qiguliuxing.dts.db.service;

import com.qiguliuxing.dts.db.dao.DtsAboutMeMapper;
import com.qiguliuxing.dts.db.domain.DtsAboutMe;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>Title: DtsAboutMeService</p>
 * <p>Description:
 * 描述：
 * </p>
 *
 * @author jinpu.shi
 * @version v1.0.0
 * @since 2020-08-31 09:23
 */
@Service
public class DtsAboutMeService {
    @Resource
    DtsAboutMeMapper dtsAboutMeMapper;


    /**
     * 查询企业简介
     *
     * @return 企业简介
     */
    public DtsAboutMe query (int corpId) {
        return dtsAboutMeMapper.selectByPrimaryKey(corpId);
    }



}
