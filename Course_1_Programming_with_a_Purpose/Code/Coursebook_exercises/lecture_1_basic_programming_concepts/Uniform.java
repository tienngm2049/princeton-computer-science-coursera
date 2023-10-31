public class Uniform {
    public static void main(String[] args) {

        // Generate random numbers and store them in the variables
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        double d = Math.random();
        double e = Math.random();

        // Calculate average, minimum, and maximum
        double averageValue = (a + b + c + d + e) / 5;
        double minValue = Math.min(Math.min(Math.min(Math.min(a, b), c), d), e);
        double maxValue = Math.max(Math.max(Math.max(Math.max(a, b), c), d), e);

        // Print out to the terminal
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println("Average value: " + averageValue);
        System.out.println("Minimum value: " + minValue);
        System.out.println("Maximum value: " + maxValue);
    }
}
