public class Rectangle {
    public Point pointInfGauche;
    public Point pointSupDroit;
    static int nbr = 0;

    public Rectangle(Point P1, Point P2)
    {
        this.pointInfGauche = P1;
        this.pointSupDroit = P2;
        nbr++;
    }

    public Rectangle(float x1, float y1, float x2, float y2)
    {
        pointInfGauche = new Point(x1, y1);
        pointSupDroit = new Point(x2, y2);
        nbr++;
    }

    public float longueur()
    {
        return ((this.pointSupDroit.getx() - this.pointInfGauche.getx()));
    }

    public float largeur()
    {
        return ((this.pointSupDroit.gety() - this.pointInfGauche.gety()));
    }

    public float area()
    {
        return (this.longueur() * this.largeur());
    }
}
