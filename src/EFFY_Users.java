import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EFFY_Users {
    List <User> usersData = new ArrayList<>();


    public void loadJSON(String path) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            usersData = mapper.readValue(reader.readLine(), new TypeReference<List<User>>() {});
            usersData.stream().forEach(x -> System.out.println(x));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        public void addUser(User newUser){
        usersData.add(newUser);
    }

    public void RemoveUser(String userName){
        usersData.removeIf(a -> userName.equals(a.getUserName()));
    }

    public void RemoveAll(){
        usersData.clear();
    }


    public void saveJSON(String path) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(path),usersData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
