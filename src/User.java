public class User {
    private String IP;
    private String userName;
    private String comment;


    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    @Override
    public String toString(){
        return "User [userName=" + userName + ", userId=" + IP + ", comment="+ comment + "]";
    }
}
