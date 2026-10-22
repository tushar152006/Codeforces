import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            long p = sc.nextLong();
            long f = sc.nextLong();

            long cntS = sc.nextLong();
            long cntW = sc.nextLong();

            long s = sc.nextLong();
            long w = sc.nextLong();

            if (s > w) {
                long temp = s;
                s = w;
                w = temp;

                temp = cntS;
                cntS = cntW;
                cntW = temp;
            }

            long ans = 0;

            for (long i = 0; i <= Math.min(cntS, p / s); i++) {
                long swordsP = i;
                long axesP = Math.min(cntW, (p - swordsP * s) / w);

                long swordsF = Math.min(cntS - swordsP, f / s);
                long axesF = Math.min(cntW - axesP,
                        (f - swordsF * s) / w);

                long total = swordsP + axesP + swordsF + axesF;
                ans = Math.max(ans, total);
            }

            sb.append(ans).append('\n');
        }

        System.out.print(sb);
        sc.close();
    }
}
