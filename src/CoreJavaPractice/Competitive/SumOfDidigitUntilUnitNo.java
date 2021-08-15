package CoreJavaPractice.Competitive;

class $sduu {
    public static void main(String[] args) {

        int sum = 0, n = -99999, f = 0;
        if (n < 0) {
            n = n * (-1);
            f = 1;
        }

        while (n > 0 || sum > 9) {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        if (f == 1) {
            sum = sum * (-1);
        }
        System.out.println("sum=" + sum);
        // Driver code

    }

}

