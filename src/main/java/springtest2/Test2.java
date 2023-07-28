package springtest2;

import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @program: git125
 * @description:用线程池 ThreadPoolExecutor 完成输出五个时间的操作
 * @author: zy
 * @create: 2023-07-25 20:40
 */
public class Test2 {
    public static void main(String[] args) {
        ExecutorService executorService = new ThreadPoolExecutor(3, 5,
                0, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(100   ), // 使用有界队列，避免OOM
                new ThreadPoolExecutor.DiscardPolicy());

        for( int i=0;i<5;i++) {
            executorService.submit(() -> {
                while (true) {
                    Date d = new Date();
                    System.out.println(Thread.currentThread().getName() + "的时间为" + d);
                    Thread.sleep(1000);
                }
            });
        }
        //  corePoolSize+queue+maxi

        // 3个线程 +  1任务不运行   +  1个新线程  => 4个线程


    }
}
