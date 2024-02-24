public class TestDessin {
    public static void main(String args[])
    {
        Dessin dessins = new Dessin(4);
        Rectangle r1 = new Rectangle(1 , 1, 5, 5);
        Rectangle r3 = new Rectangle(2 , 2, 6, 6);
        Rectangle r4 = new Rectangle(1 , 1, 5, 5);
        Point pnt1 = new Point(3, 3);
        Point pnt2 = new Point(9, 9);
        Rectangle r2 = new Rectangle(pnt1, pnt2);

        dessins.ajouter(r1);
        dessins.ajouter(r2);
        dessins.ajouter(r3);
        dessins.ajouter(r4);

        System.out.println("Sum of Area = " + dessins.somme());
        // dessins.printSize();

    }
}
