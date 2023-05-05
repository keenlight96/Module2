public class Task7_id9111 {
    public static void main(String[] args) {
        int runVar = 2;

        while (runVar < 100) {
            boolean chk = true;
            for (int i = 2; i <= Math.sqrt(runVar); i++) {
                if (runVar % i == 0) {
                    chk = false;
                    break;
                }
            }
            if (chk) {
                System.out.printf(runVar + " ");
            }
            runVar++;

        }
    }
}
