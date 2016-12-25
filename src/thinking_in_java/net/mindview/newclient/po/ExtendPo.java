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
 * @Type ExtendPo.java
 * @Desc 
 * @author Tanya
 * @date 2016年12月22日 下午3:21:10
 * @version 
 */
public class ExtendPo extends TcpHead {
    
    /**
     * 消息来源
     */
    private String platFrom;
    /**
     * 唯一标识号
     */
    private String msgId;
    /**
     * 消息发送方地址
     */
    private String from;
    /**
     * 发送方式（1-点对点，2-群发，3-群聊）
     */
    private int sendType;
    /**
     * 消息接收方用户数量
     */
    private int toCount;
    /**
     * 消息接收方地址，用户号码之间用”,”分隔
     */
    private String to;
    /**
     * RCS业务平台时间
     */
    private String date;
    /**
     * 群组id
     */
    private String chatId;
    /**
     * 消息内容的HASH值编码
     */
    private String hash;
    /**
     * Text/plain
     */
    private String contentType;
    /**
     * 消息内容长度
     */
    private int contentLength;
    public String getPlatFrom() {
        return platFrom;
    }
    public void setPlatFrom(String platFrom) {
        this.platFrom = platFrom;
    }
    public String getMsgId() {
        return msgId;
    }
    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }
    public String getFrom() {
        return from;
    }
    public void setFrom(String from) {
        this.from = from;
    }
    public int getSendType() {
        return sendType;
    }
    public void setSendType(int sendType) {
        this.sendType = sendType;
    }
    public int getToCount() {
        return toCount;
    }
    public void setToCount(int toCount) {
        this.toCount = toCount;
    }
    public String getTo() {
        return to;
    }
    public void setTo(String to) {
        this.to = to;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getChatId() {
        return chatId;
    }
    public void setChatId(String chatId) {
        this.chatId = chatId;
    }
    public String getHash() {
        return hash;
    }
    public void setHash(String hash) {
        this.hash = hash;
    }
    public String getContentType() {
        return contentType;
    }
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
    public int getContentLength() {
        return contentLength;
    }
    public void setContentLength(int contentLength) {
        this.contentLength = contentLength;
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