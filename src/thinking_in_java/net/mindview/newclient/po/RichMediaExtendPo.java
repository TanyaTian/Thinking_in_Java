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

import com.cmcc.spam.simu.newclient.util.ExtendMsgEnum;

/**
 * @Type RichMediaExtendPo.java
 * @Desc 
 * @author Tanya
 * @date 2016年12月22日 下午3:19:50
 * @version 
 */
public class RichMediaExtendPo extends ExtendPo {
    
    public RichMediaExtendPo(){
        this.setCommandId(ExtendMsgEnum.RCS_RMEXTENDREQ.msgType());
    }

    private String fileName;
    private byte[] content;
    
    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public byte[] getContent() {
        return content;
    }
    public void setContent(byte[] content) {
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