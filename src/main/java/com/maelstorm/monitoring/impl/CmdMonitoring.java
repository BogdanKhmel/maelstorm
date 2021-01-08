package main.java.com.maelstorm.monitoring.impl;

import main.java.com.maelstorm.monitoring.Monitoring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CmdMonitoring implements Monitoring {


    public void defaultPing() {
        String cmd = "ping -l 32 -n 6 google.com";
        Runtime run = Runtime.getRuntime();

        try {
            Process process = run.exec(cmd);
            process.waitFor();
            BufferedReader buf = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line = "";
            while ((line = buf.readLine()) != null) {
                System.out.println(line);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }catch (IOException ioException){
            ioException.printStackTrace();
        }

    }


    public void ping(String resourceName) {

    }


    public void ping(String resourceName, int packageAmount) {

    }
}