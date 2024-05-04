public class Monitor extends peripherique{
    int classCons;
    int dim;
    int maxReso;

    public Monitor(int id, String m, int c, int d, int r)
    {
        super(id, m);
        this.classCons = c;
        this.dim = d;
        this.maxReso = r;
    }

    public double calculerPuissance()
    {
        return (classCons * dim + maxReso * 0.015);
    }
}
