
package calculator;

public class sub {

    public static int suboperation(int... arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Enter at least one number");
        }

        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            result -= arr[i];
        }

        return result;
    }
}
