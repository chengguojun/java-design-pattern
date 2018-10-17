package singleton;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName ClientTest3
 * @Description 测试效率
 * @Author ChengGuojun
 * @Date 2018-10-16 22:31
 * @Version 1.0
 */
public class ClientTest3 {

    public static void main(String[] args) throws Exception {
        long s = System.currentTimeMillis();
        int threadnum = 1;
        final CountDownLatch countDownLatch = new CountDownLatch(threadnum);

        new Thread(() -> {

            for (int i = 0; i < 10; i++) {
                Object o = SingletDemo1.getInstance();
            }
            countDownLatch.countDown();
        }
        ).start();
        countDownLatch.await();//main阻塞直到计数器变为零
        long e = System.currentTimeMillis();
        System.out.println(e - s);

    }


}
