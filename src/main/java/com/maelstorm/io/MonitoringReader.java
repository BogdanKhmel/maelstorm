package main.java.com.maelstorm.io;

import java.io.IOException;
import java.io.InputStream;

public interface MonitoringReader {
    String readWindCmd(InputStream inputStream) throws IOException;

}
