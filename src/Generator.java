import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class Generator {

    public static String getStringNameorComment() {
        int leftLimit = 97;
        int rightLimit = 122;
        int targetStringLength = 8;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();
        return generatedString;
    }

    public static String getIp(){
        Random r = new Random();
        String stringIp = "{\"IP\":\""+ r.nextInt(256) + "."+ r.nextInt(256) + "." + r.nextInt(256) + "." + r.nextInt(256) + "\"}";
        return  stringIp;
    }

}
