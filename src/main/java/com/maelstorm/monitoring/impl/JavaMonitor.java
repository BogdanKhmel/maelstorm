package main.java.com.maelstorm.monitoring.impl;

import main.java.com.maelstorm.monitoring.Monitoring;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;

public class JavaMonitor implements Monitoring {

    /* TODO :
     *    1. Используя пакет java.net и вспомогательные,реализовать все методы.
     *    2. Использовать этот пример для получения потока байт и преобразования его в String с соответствующей кодировкой.
     *    3. Сделать фабрику для монитора и ридера.
     *    4. Реализовать орхитиктуру для интерфейса MonitorReader.
     *    5. Реализовать методы интерфейса Monitoring.
     * */

    @Override
    public void defaultPing() {

        try {
            String ipAddress = "localhost";
            InetAddress inet = InetAddress.getByName(ipAddress);
            long finish = 0;
            long start = new GregorianCalendar().getTimeInMillis();

            if (inet.isReachable(5000)) {
                finish = new GregorianCalendar().getTimeInMillis();
                System.out.println("Ответ от " + inet + ": время=" + (finish - start) + "мс");
            } else {
                System.out.println(" Сервер не доступен.");
            }
        } catch (Exception e) {
            System.out.println("Exception:" + e.getMessage());
        }

    }

    @Override
    public void ping(String resourcesName) {
        try {
            String ipAddress = resourcesName;
            InetAddress inet = InetAddress.getByName(ipAddress);
            long finish = 0;
            long start = new GregorianCalendar().getTimeInMillis();

            if (inet.isReachable(5000)) {
                finish = new GregorianCalendar().getTimeInMillis();
                System.out.println("Ответ от " + inet + ": время=" + (finish - start) + "мс");
            } else {
                System.out.println(" Сервер не доступен.");
            }
        } catch (Exception e) {
            System.out.println("Exception:" + e.getMessage());
        }

    }

    @Override
    public void ping(String resourcesName, int n) {
        int tSum=0;
        ArrayList list = new ArrayList();
        for (int i = 0; i < n; i++) {
            try {
                String ipAddress = resourcesName;
                InetAddress inet = InetAddress.getByName(ipAddress);
                long finish = 0;
                long start = new GregorianCalendar().getTimeInMillis();
                long t;

                if (inet.isReachable(5000)) {
                    finish = new GregorianCalendar().getTimeInMillis();
                   t = finish - start;
                    System.out.println("Ответ от " + inet + ": время=" + t + "мс");
                    tSum+=t;
                    list.add(t);
                } else {
                    System.out.println(" Сервер не доступен.");
                }
            } catch (Exception e) {
                System.out.println("Exception:" + e.getMessage());
            }

        }
        System.out.println();
        System.out.println("Приблизительное время приёма-передачи в мс:");
        System.out.println("Минимальное = "+Collections.min(list)+", Максимальное = " + Collections.max(list)+", Cреднее = "+tSum/n);

    }
}
