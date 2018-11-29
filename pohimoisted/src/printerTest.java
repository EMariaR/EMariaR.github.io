public class printerTest {
    public static void main(String[] args) {
        Printer printer1 = new Printer(50, false);
        printer1.lisaTooner(15);
        System.out.println("Printeri tooneri tase on " + printer1.getTooneriTase() + "%");
        printer1.lisaTooner(50);
        System.out.println("Printeri tooneri tase on " + printer1.getTooneriTase() +"%");
        System.out.println("Printeris on " + printer1.getTooneriTase() + "%");
    }
}
