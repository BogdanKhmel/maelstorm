package main.java.com.maelstorm.monitoring;

public interface Monitoring {
    void defaultPing();
    void  ping(String resourcesName);
    void  ping(String resourcesName,int n);
}
