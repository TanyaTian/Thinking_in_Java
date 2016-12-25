/*
 * Project: msg_simu
 * 
 * File Created at 2016年12月23日
 * 
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */
package com.cmcc.spam.simu.newclient.encoder;

import com.cmcc.spam.simu.newclient.po.TxtExtendPo;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * @Type TxtExtendEncoder.java
 * @Desc 
 * @author Tanya
 * @date 2016年12月23日 上午11:36:40
 * @version 
 */
public class TxtExtendEncoder extends MessageToByteEncoder<TxtExtendPo> {

    @Override
    protected void encode(ChannelHandlerContext ctx, TxtExtendPo msg, ByteBuf out)
            throws Exception {
        out.writeInt(msg.getLength());
        out.writeInt(msg.getCommandId());
        out.writeInt(msg.getTransactionId());
        out.writeBytes(msg.getPlatFrom().getBytes("UTF-8"));
        out.writeBytes(msg.getMsgId().getBytes("UTF-8"));
        out.writeBytes(msg.getFrom().getBytes("UTF-8"));
        out.writeByte(msg.getSendType());
        out.writeInt(msg.getToCount());
        out.writeBytes(msg.getTo().getBytes("UTF-8"));
        out.writeZero(1);
        out.writeBytes(msg.getDate().getBytes("UTF-8"));
        out.writeBytes(msg.getChatId().getBytes("UTF-8"));
        out.writeBytes(msg.getHash().getBytes("UTF-8"));
        out.writeZero(1);
        out.writeBytes(msg.getContentType().getBytes("UTF-8"));
        out.writeZero(1);
        out.writeInt(msg.getContentLength());
        out.writeBytes(msg.getContent().getBytes("UTF-8"));
        out.writeZero(1);
    }

}


/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2016年12月23日 Tanya creat
 */