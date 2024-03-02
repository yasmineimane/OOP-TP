public class TestRectangle {
    public static void main(String args[])
    {
        Rectangle r1 = new Rectangle(1 , 1, 5, 5);
        Point pnt1 = new Point(3, 3);
        Point pnt2 = new Point(9, 9);
        Rectangle r2 = new Rectangle(pnt1, pnt2);

        System.out.println("Longueur de r1 = " + r1.longueur());
        System.out.println("longueur de r2 = " + r2.longueur());
        System.out.println("Largeur de r1 = " + r1.largeur());
        System.out.println("Largeur de r2 " + r2.largeur());
        System.out.println("Area of r1 = " + r1.area());
        System.out.println("Area of r2 = " + r2.area());
        System.out.println(Rectangle.nbr);


    }
}
