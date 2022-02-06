package labb.upg.fyra;

public class MinTråd implements Runnable {
    private int start;
    private int end;

    public MinTråd(int s, int e) {
        this.start = s;
        this.end = e;
    }

    @Override
    public void run() {
        int k = 0;
        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    k++;
            }
            if (k == 2)
                System.out.print(" " + i);
            k = 0;
        }
    }
}

