package main.java.com.maelstorm.io;

import java.io.*;

public class CmdReader {
    public void ReadUnixCmd(){

    };
    public String ReadWinCmd(InputStream inputStream) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(inputStream);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        int result = 0;
        try {
            result = bis.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        while(result != -1) {
            buf.write((byte) result);
            result = bis.read();
        }
        return buf.toString("UTF-8");

    };

}
