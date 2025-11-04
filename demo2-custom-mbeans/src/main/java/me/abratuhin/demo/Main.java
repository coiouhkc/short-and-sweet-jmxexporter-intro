package me.abratuhin.demo;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;
import java.util.Random;

public class Main {
    public static void main(String[] args)
            throws Exception {

        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = new ObjectName("me.abratuhin.demo:type=Features,name=otest");
        Features mbean = new Features();
        mbean.setName("Brownbag");
        mbs.registerMBean(mbean, name);

        Random r = new Random();

        while (true) {
            mbean.setCounter(r.nextInt(100));
            Thread.sleep(1_000L);
        }
    }
}
