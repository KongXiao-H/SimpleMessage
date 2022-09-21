package se.zust.edu.cn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSimpleMessage {
    public static void main (String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");

        Message msg = (Message) ac.getBean("message");
        MessageService service = ac.getBean("emailService", MessageService.class);
        service.sendMsg(msg);
        service = ac.getBean("smsService", MessageService.class);
        service.sendMsg(msg);
        service = ac.getBean("wechatService", MessageService.class);
        service.sendMsg(msg);

        User from = new User();
        from.setName("Tom");
        from.setWx("wx0001");
        User to = new User();
        to.setName("Peter");
        to.setWx("wx0002");

        Message message = new Message();
        message.setTopic("消息主题");
        message.setContent("消息内容");
        message.setFrom(from);
        message.setTo(to);
        service.sendMsg(message);
    }
}
