package com.zy.dao;

import com.zy.pojo.Message;
import org.springframework.stereotype.Repository;

@Repository
public class messageMapperImp implements MessageMapper {


    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Message record) {
        return 0;
    }

    @Override
    public int insertSelective(Message record) {
        return 0;
    }

    @Override
    public Message selectByPrimaryKey(Integer id) {

        Message mes=new Message();
        mes.setId(2);
        mes.setCommand("hhhhh");
        mes.setContent("hhhhhh");
        mes.setDescription("hhhhhh");
        return mes;
    }

    @Override
    public int updateByPrimaryKeySelective(Message record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Message record) {
        return 0;
    }
}
