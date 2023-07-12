import java.util.Timer;
import java.util.TimerTask;

public class TimerExample {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int counter = 0;

            public void run() {
                counter++;
                System.out.println("Timer tick: " + counter);
            }
        };

        // 1秒ごとにタスクを実行
        timer.schedule(task, 0, 1000);
    }
}
