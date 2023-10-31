public class ThreeSort 
{
    public static void main(String[] args) 
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int minValue = Math.min(Math.min(a, b), c);
        int maxValue = Math.max(Math.max(a, b), c);
        int midValue = a + b + c - minValue - maxValue;

        System.out.println("Minimum Value: " + minValue);
        System.out.println("Middle Value: " + midValue);
        System.out.println("Maximum Value: " + maxValue);
    }
}
