
package calculator;

public class add {

    public static int addoperation(int... arr) {
        int sum = 0;

        for (int number : arr) {
            sum += number;
        }

        return sum;
    }
}
