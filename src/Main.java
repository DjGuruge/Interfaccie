public class Main {
    public static void main(String[] args) {
        Forma rettangolo = new Rettangolo(5, 10);
        Forma triangolo = new Triangolo(4, 6);
        System.out.println(rettangolo.calcolaArea());
        System.out.println(triangolo.calcolaArea());
    }
}