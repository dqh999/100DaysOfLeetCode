public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Dùng StringBuilder (Không đồng bộ)
        StringBuilder sb = new StringBuilder();
        Runnable task1 = () -> {
            for (int i = 0; i < 10000; i++) {
                sb.append("A");
            }
        };
        Runnable task2 = () -> {
            for (int i = 0; i < 10000; i++) {
                sb.append("B");
            }
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("StringBuilder result: " + sb.length());

        // Dùng StringBuffer (Đồng bộ)
        StringBuffer sbf = new StringBuffer();
        Runnable task3 = () -> {
            for (int i = 0; i < 10000; i++) {
                sbf.append("A");
            }
        };
        Runnable task4 = () -> {
            for (int i = 0; i < 10000; i++) {
                sbf.append("B");
            }
        };

        Thread t3 = new Thread(task3);
        Thread t4 = new Thread(task4);

        t3.start();
        t4.start();

        t3.join();
        t4.join();

        System.out.println("StringBuffer result: " + sbf.length()); // An toàn
    }
}
