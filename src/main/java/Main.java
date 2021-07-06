public class Main {
    public static void main(String[] args) {
        Ints calcAdapter = new IntsCalculator();
        System.out.println("Cумма: " + calcAdapter.sum(10,20));
        System.out.println("Произведение: " + calcAdapter.mult(10,20));
        System.out.println("Возведение в степень: " + calcAdapter.pow(2,10));
    }
}