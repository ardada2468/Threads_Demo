import static Colors.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_BLUE + "Thread 1 is Running!!!");
        AnotherThread anotherThread = new AnotherThread();
        anotherThread.start();

        new Thread(){
            public void run(){
                System.out.println(ANSI_GREEN + "Hello from Thread 3!!!");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunable());

        System.out.println(ANSI_BLUE + "Back to main class");

    }

}
