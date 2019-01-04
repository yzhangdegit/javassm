package com.zy.service;

import com.zy.dao.MessageMapper;
import com.zy.pojo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class messageServiceImp implements MessageService{

    @Autowired
    private MessageMapper messageMapperImp;

    @Override
    public Message getMessageInfo(String id) {

        return messageMapperImp.selectByPrimaryKey(Integer.parseInt(id));
    }

}
