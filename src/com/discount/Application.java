package com.discount;

import java.util.Date;

public class Application {

    public static void main(String[] args) throws Exception {
        System.out.println("############### DATE ###############");
        while (true) {

            System.out.println("# " + getLocalCurrentDate() + "     #");
            Thread.sleep(1000);

        }


    }

    private static Date getLocalCurrentDate() {
        return new Date();
    }
}
