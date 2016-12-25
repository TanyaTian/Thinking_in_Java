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


/**
 * @Type ResponsePo.java
 * @Desc 
 * @author Tanya
 * @date 2016年12月22日 下午3:28:40
 * @version 
 */
public class ResponsePo extends TcpHead{

    /**
     * 消息鉴权结果
     */
    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
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