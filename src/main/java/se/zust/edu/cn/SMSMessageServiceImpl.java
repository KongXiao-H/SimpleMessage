package se.zust.edu.cn;

public class SMSMessageServiceImpl implements MessageService{
    private String signName;
    private String templateCode;
    private String templateParam;

    public String getSignName() {
        return signName;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public String getTemplateParam() {
        return templateParam;
    }

    @Override
    public boolean sendMsg(Message message) {
        System.out.println("sms");
        return false;
    }

    public SMSMessageServiceImpl(String signName, String templateCode, String templateParam) {
        this.signName = signName;
        this.templateCode = templateCode;
        this.templateParam = templateParam;
    }
}
