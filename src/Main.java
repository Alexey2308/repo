public class Main {
    public static void main(String[] args) {

        long[] sale = {67, 87, 89};
        SalesManager manager = new SalesManager(sale);
        System.out.println("Максимальное значение:" + " " + manager.max());
        System.out.println("Среднее значение,исключая минимальное и максимальное:" + " " + manager.medium());

    }
}
