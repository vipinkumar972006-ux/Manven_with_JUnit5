
package calculator;

public class mul {

    public static int muloperation(int... arr) {
        int result = 1;

        for (int number : arr) {
            result *= number;
        }

        return result;
    }
}
