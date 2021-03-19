package io.hari.multithreading.threadlocal.prod;

/**
 * @Author Hariom Yadav
 * @create 19-03-2021
 */
public class MyService_Adv2 {//1. simple normal service class, no extra stuff related to thread
    ExternalService1 externalService1;
    ExternalService2 externalService2;

    public MyService_Adv2(ExternalService1 externalService1, ExternalService2 externalService2) {//2. pass here obj, either by simple obj or by calling ThreadLocal variable .get()
        this.externalService1 = externalService1;
        this.externalService2 = externalService2;
    }


    public void myService() {
        final String output1 = externalService1.service1();
        final String output2 = externalService2.service2();

        final String combineResult = output1 + " - " + output2;
        System.out.println("combineResult = " + combineResult);
    }
}
