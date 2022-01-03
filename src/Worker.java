import java.util.Random;

public class Worker {

    public void start() {
        new Thread(() -> {}).start();
        // TODO - 쓰레드를 생성하고 시작한다.
    }

    public void stop() {
        // TODO - 쓰레드를 중지한다.
        // 쓰레드가 동작하고 있지 않으면 중지하지 않고, 쓰레드가 동작하고 있을 때만 중지시킨다.
        //
    }

    public void run() {
        // TODO - 쓰레드를 실행한다.
        init();
        process();
        fini();
    }

    protected void init() throws InterruptedException {
        // TODO - 쓰레드를 초기화 한다.
    }

    protected void process() {
        // TODO - 루프를 돌면서 연산을 한다.
        while (isRunning()) {
            Thread.sleep(new Random(System.currentTimeMillis()).nextInt(100));
        }
    }

    protected void fini() {
        // TODO - 연산이 끝난 후 종료시킨다.
        Thread.sleep(new Random(System.currentTimeMillis()).nextInt(10));
    }
}