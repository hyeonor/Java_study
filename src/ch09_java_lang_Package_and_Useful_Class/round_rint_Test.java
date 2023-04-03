package ch09_java_lang_Package_and_Useful_Class;

public class round_rint_Test {
    public static void main(String[] args) {
        double sum = 0;
        double roundSum = 0;
        double rintSum = 0;

        for (double d = 0.0; d <= 2.0; d += 0.1) {
            double round = Math.round(d);
            double rint = Math.rint(d);

            System.out.printf("%4.1f %4.1f %4.1f\n", d, round, rint);

            sum += d;
            roundSum += round;
            rintSum += rint;
        }

        //결과: sum 19.0 roundSum 20.0 rintSum 19.0
        System.out.printf("sum %4.1f roundSum %4.1f rintSum %4.1f\n", sum, roundSum, rintSum);
    }
}
