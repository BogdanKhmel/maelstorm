package main.java.com.maelstorm;

import main.java.com.maelstorm.monitoring.Monitoring;
import main.java.com.maelstorm.monitoring.impl.JavaMonitor;
import main.java.com.maelstorm.monitoring.impl.WinCmdMonitor;

public class Main {
    public static void main(String[] args) {
        Monitoring monitoring = new JavaMonitor();
        monitoring.defaultPing();
        monitoring.ping("google.com");
        monitoring.ping("ukr.net",5);

}}

