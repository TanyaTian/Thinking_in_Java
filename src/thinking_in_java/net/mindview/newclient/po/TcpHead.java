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
 * @Type TcpHeader.java
 * @Desc 
 * @author Tanya
 * @date 2016年12月22日 上午11:49:36
 * @version 
 */
public class TcpHead {
    
    /**
     * 一个PDU的总字节数
     */
    private int length;
    /**
     * 命令标识符
     */
    private int commandId;
    /**
     * 用于请求和响应间保持对应关系的序号
     */
    private int TransactionId;
    
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getCommandId() {
        return commandId;
    }
    public void setCommandId(int commandId) {
        this.commandId = commandId;
    }
    public int getTransactionId() {
        return TransactionId;
    }
    public void setTransactionId(int transactionId) {
        TransactionId = transactionId;
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