import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;

public class Main {
    public static void main(String[] args) {
        EFFY_Users myUsers = new EFFY_Users();
        myUsers.loadJSON("test.json");
        myUsers.addUser("{\"IP\":\"68.188.12.122\"}","Alex","Hello");
       // myUsers.addUser("{\"IP\":\"68.188.12.122\"}","Linda","Hi were!");
        myUsers.saveJSON("test.json");
        myUsers.RemoveUser("Alex");
        myUsers.saveJSON("test.json");

    }
}
