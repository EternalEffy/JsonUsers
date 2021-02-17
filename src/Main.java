import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;

public class Main {
    public static void main(String[] args) {
        EFFY_Users myUsers = new EFFY_Users();
        myUsers.loadJSON("test1.json");
        long start = System.currentTimeMillis();
        /*for(int i = 0; i <5000;i++) {
            myUsers.addUser(new User(Generator.getIp(), Generator.getStringNameorComment(), Generator.getStringNameorComment()));
        }*/
        myUsers.RemoveAll();
        myUsers.saveJSON("test1.json");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Прошло времени, мс: " + elapsed);
    }
}
