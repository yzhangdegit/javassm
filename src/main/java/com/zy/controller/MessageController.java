package com.zy.controller;

import com.zy.pojo.Message;
import com.zy.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private MessageService messageServiceImp;

    @RequestMapping(method = RequestMethod.GET, value = "/info/{id}")
    public ModelAndView getMessageDetail(@PathVariable Integer id){
        //定义的modal和view的对象
        ModelAndView view=new ModelAndView();
        //对应的视图名称
        view.setViewName("message/info/test");
        //操作数据
        Message mes=messageServiceImp.getMessageInfo(id+"");
        System.out.println("------------");
        view.addObject("description",mes.getDescription());
        view.addObject("content",mes.getContent());
        view.addObject("command",mes.getCommand());
        return view;
    }


//    public void setMessageService(MessageService messageServiceImp) {
//        this.messageServiceImp = messageServiceImp;
//    }


}
