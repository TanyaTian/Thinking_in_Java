/*
 * Project: msg_simu
 * 
 * File Created at 2016年12月22日
 * 
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */
package com.cmcc.spam.simu.newclient.po;

import java.io.Serializable;

import com.cmcc.spam.simu.newclient.util.ExtendMsgEnum;

/**
 * @Type TxtExtendPo.java
 * @Desc 
 * @author Tanya
 * @date 2016年12月22日 上午11:42:52
 * @version 
 */
public class TxtExtendPo extends ExtendPo{


    public TxtExtendPo(){
        this.setCommandId(ExtendMsgEnum.RCS_TXTEXTENDREQ.msgType());
    }

    /**
     * 消息内容
     */
    private String content;
    

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}


/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2016年12月22日 Tanya creat
 */