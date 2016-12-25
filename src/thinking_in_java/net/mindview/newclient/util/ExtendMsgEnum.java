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
package com.cmcc.spam.simu.newclient.util;

/**
 * @Type ExtendMsgEnum.java
 * @Desc 
 * @author Tanya
 * @date 2016年12月22日 下午3:56:48
 * @version 
 */
public enum ExtendMsgEnum {
    
    RCS_ENQUIRELINKREQ {

        @Override
        public int msgType() {
            return 0x00000001;
        }

        @Override
        public String msgName() {
            return "RCS链路检测请求";
        }

    },

    RCS_ENQUIRELINKRSP {

        @Override
        public int msgType() {
            return 0x80000001;
        }

        @Override
        public String msgName() {
            return "RCS链路检测请求响应";
        }

    },
    
    RCS_TXTEXTENDREQ {

        @Override
        public int msgType() {
            return 0x00000012;
        }

        @Override
        public String msgName() {
            return "文本消息鉴权请求-扩展";
        }

    },
    
    RCS_TXTEXTENDRSP {

        @Override
        public int msgType() {
            return 0x80000012;
        }

        @Override
        public String msgName() {
            return "文本消息鉴权反馈-扩展";
        }

    },
    
    RCS_RMEXTENDREQ {

        @Override
        public int msgType() {
            return 0x00000013;
        }

        @Override
        public String msgName() {
            return "富媒体消息鉴权请求-扩展";
        }

    },
    
    RCS_RMEXTENDRSP {

        @Override
        public int msgType() {
            return 0x80000013;
        }

        @Override
        public String msgName() {
            return "富媒体消息鉴权反馈-扩展";
        }

    },
    
    RCS_GROUPNOTICEREQ {

        @Override
        public int msgType() {
            return 0x00000006;
        }

        @Override
        public String msgName() {
            return "群公告消息鉴权请求";
        }

    },
    
    RCS_GROUPNOTICERSP {

        @Override
        public int msgType() {
            return 0x80000006;
        }

        @Override
        public String msgName() {
            return "群公告消息鉴权反馈";
        }

    };
    
    /**
     * 消息类型
     * @return
     */
    public abstract int msgType();

    /**
     * 消息名称
     * @return
     */
    public abstract String msgName();

}


/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2016年12月22日 Tanya creat
 */