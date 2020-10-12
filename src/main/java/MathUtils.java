public class MathUtils {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) throws Exception {

        try {
            return a/b;
        } catch (Exception e) {
            throw new Exception("DivideByZero Exception");
        }
    }

    public double computeCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
