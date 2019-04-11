package bai_tap;

public class Main {
    public static void main(String args[]){
        System.out.println("My thread.");
        myJavaThread s2 = new myJavaThread();
        s2.start();
        System.out.println("My Java thread"+Thread.currentThread());
    }
}
