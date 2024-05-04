public class Clavier extends peripherique{
    int NbTouches;
    double puissance;

    public Clavier(int id, String m, int nb, double p)
    {
        super(id, m);
        this.NbTouches = nb;
        this.puissance = p;
    }

    public double calculerPuissance()
    {
        return puissance;
    }
}
