import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EFFY_Users {
    List users = new ArrayList();
    User user = new User();
    User user1 = new User();
    User user2 = new User();



    public void addUser(int n,String IP,String userName,String comment){
        if(n == 1) {
            user.setIP(IP);
            user.setUserName(userName);
            user.setComment(comment);
            users.add(user);
        }
        else if(n==2){
            user1.setIP(IP);
            user1.setUserName(userName);
            user1.setComment(comment);
            users.add(user1);
        }
        else if(n==3){
            user2.setIP(IP);
            user2.setUserName(userName);
            user2.setComment(comment);
            users.add(user);
        }
        else if(n>=4){
            System.out.println("Превышено допустимое количество пользователей");
        }
    }



    public void saveJSON(String path) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(path), users);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            String jsonString = mapper.writeValueAsString(users);
            System.out.println(jsonString);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }




}
