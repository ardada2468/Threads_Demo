import static Colors.ThreadColor.ANSI_PURPLE;

public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_PURPLE + "Thread 2 is Running!!!!");

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            System.out.println(ANSI_PURPLE + "I woke up");
        }

        System.out.println(ANSI_PURPLE + "5 Seconds Latter");

    }
}
