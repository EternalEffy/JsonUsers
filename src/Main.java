import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;

public class Main {
    public static void main(String[] args) {
        EFFY_Users myUsers = new EFFY_Users();
        myUsers.addUser(1,"{\"IP\":\"68.188.12.122\"}","Alex","Hello");
        myUsers.addUser(2,"{\"IP\":\"68.188.12.122\"}","Linda","Hi were!");
        myUsers.addUser(3,"{\"IP\":\"68.188.12.122\"}","Monika","Hi were!");
        myUsers.addUser(4,"{\"IP\":\"68.188.12.122\"}","Bred","Hi were!");
        myUsers.addUser(5,"{\"IP\":\"68.188.12.122\"}","Xan","Hi were!");
        myUsers.saveJSON("test.json");
    }
}
