import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) throws IOException {
        String filename = "abc.txt";
        byte[] inputBytes = {0};
        long startTime, endTime;

        inputBytes = Files.readAllBytes(Paths.get(filename));
        startTime = System.currentTimeMillis();
        // Write faster with StringBuffer
        StringBuffer buf = new StringBuffer();
        for (byte b : inputBytes){
            buf.append((char)b);
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime- startTime);
    }
}
