import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;

public class Main {
    public static void main(String[] args) {
        EFFY_Users myUsers = new EFFY_Users();
        myUsers.loadJSON("test.json");
        myUsers.addUser(new User("{\"IP\":\"68.188.12.132\"}","Alex","Hi were!:D"));
        //myUsers.RemoveUser("Alex");
        myUsers.saveJSON("test.json");
    }
}
