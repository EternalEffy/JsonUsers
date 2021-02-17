import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;

public class Main {
    public static void main(String[] args) {
        EFFY_Users myUsers = new EFFY_Users();
        myUsers.loadJSON("test1.json");
        myUsers.addUser(new User(Generator.getIp(),Generator.getStringNameorComment(),Generator.getStringNameorComment()));
        myUsers.saveJSON("test1.json");
    }
}
