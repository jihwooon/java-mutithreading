package multithreading.ch05;

public class Main {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int result = sum(x, y);
        System.out.println(result);
    }

    private static int sum(int a, int b) {
        int s = a + b;
        return s;
    }
}
