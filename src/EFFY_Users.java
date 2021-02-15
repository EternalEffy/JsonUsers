import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;

public class EFFY_Users {
    User user = new User();
    User newUser = new User();

    public void loadJSON(String path) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            User user = mapper.readValue(new File(path), User.class);
            System.out.println(user.toString());
            this.user = user;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addUser(String IP,String userName,String comment){
        newUser.setIP(IP);
        newUser.setUserName(userName);
        newUser.setComment(comment);
        this.user = newUser;
    }
    public void RemoveUser(String userName){

        if(userName==user.getUserName()){
            user.setIP("null");
            user.setUserName("null");
            user.setComment("null");
        }
    }


    public void saveJSON(String path) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(path), user);
            System.out.println(user.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
