import java.util.ArrayList;

public class Portfolio {
    ArrayList <Projet> Projets = new ArrayList<Projet>();

    public void addPro(Projet p)
    {
        Projets.add(p);
    }

    public float calcChifre()
    {
        float sum = 0;
        for (Projet projet : Projets) {
            sum += projet.CalcPrix();
        }

        return sum;
    }
}
