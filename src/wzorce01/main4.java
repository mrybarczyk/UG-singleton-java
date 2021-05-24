package wzorce01;

public class main4 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(TLSingleton.getInstance().hashCode());
            }
        });
        t1.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(TLSingleton.getInstance().hashCode());
            }
        });
        t2.start();
    }
}
