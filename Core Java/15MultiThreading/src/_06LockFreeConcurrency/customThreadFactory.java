package _06LockFreeConcurrency;

import java.util.concurrent.ThreadFactory;

class customThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread th = new Thread(r);
        th.setPriority(Thread.MIN_PRIORITY);
        th.setDaemon(false);
        return th;
    }
}
