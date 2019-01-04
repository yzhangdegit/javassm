package com.zy.service;

import com.zy.pojo.Message;
import org.springframework.stereotype.Service;

@Service
public interface MessageService {

    public Message getMessageInfo(String id);
}
