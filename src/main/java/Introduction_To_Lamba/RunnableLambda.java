package main.java;

public class RunnableLambda {

    public static void main(String[] args) {


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world");
            }
        };

        new Thread(runnable).start();


        Runnable runnable1 = () -> System.out.println("hello world lambda !!");

        new Thread(runnable1).start();


    }
}
