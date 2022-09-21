package se.zust.edu.cn;

public class EmailMessageServiceImpl implements MessageService{
    private String smtp;
    private String userName;

    public String getSmtp() {
        return smtp;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    private String password;

    @Override
    public boolean sendMsg(Message message) {
        System.out.println("email");
        return false;
    }

    public EmailMessageServiceImpl(String smtp, String userName, String password) {
        this.smtp = smtp;
        this.userName = userName;
        this.password = password;
    }
}
