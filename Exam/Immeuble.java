import java.util.ArrayList;

public class Immeuble extends Projet{
    int nbrEt;
    ArrayList <Appartement> Appartements = new ArrayList<Appartement>();

    public Immeuble(int nbr)
    {
        this.nbrEt = nbr;
    }

    public void addApp(Appartement a)
    {
        Appartements.add(a);
    }

    public float CalcPrix()
    {
        float prix = 0;
        for (Appartement appartement : Appartements) {
            prix += appartement.CalcPrix();
        }
        return prix;
    }
}
