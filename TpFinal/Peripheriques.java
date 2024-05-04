import java.util.ArrayList;

public class Peripheriques {
    ArrayList <peripherique> PER = new ArrayList<peripherique>();

    public void add(peripherique p)
    {
        PER.add(p);
    }

    public double calculerPuissance()
    {
        double totalPuiss = 0;
        for (peripherique p: PER)
        {
            totalPuiss += p.calculerPuissance();
        }
        return totalPuiss;
    }
}
