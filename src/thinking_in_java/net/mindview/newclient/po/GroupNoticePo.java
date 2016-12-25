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
 * @Type GroupNoticePo.java
 * @Desc 
 * @author Tanya
 * @date 2016年12月22日 下午3:25:56
 * @version 
 */
public class GroupNoticePo extends TcpHead {
    
    public GroupNoticePo(){
        this.setCommandId(ExtendMsgEnum.RCS_GROUPNOTICEREQ.msgType());
    }
    
    private String groupNotice;

    public String getGroupNotice() {
        return groupNotice;
    }

    public void setGroupNotice(String groupNotice) {
        this.groupNotice = groupNotice;
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