package se.zust.edu.cn;

public class WechatMessageServiceImpl implements MessageService{
    private String wxKey;
    private String wxSecret;

    @Override
    public boolean sendMsg(Message message) {
        System.out.println("wechat");
        return false;
    }

    public WechatMessageServiceImpl(String wxKey,String wxSecret){
        this.wxKey=wxKey;
        this.wxSecret=wxSecret;
    }

    public String getWxKey() {
        return wxKey;
    }

    public String getWxSecret() {
        return wxSecret;
    }
}
