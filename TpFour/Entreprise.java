public class Entreprise {
    public Employe EmpTab[];
    public int nbrE = 0;

    public Entreprise(int size)
    {
        EmpTab = new Employe[size];
    }

    public void add(Employe E)
    {
        EmpTab[nbrE] = E;
        nbrE++;
    }

    public float moyenne()
    {
        float sum = 0;

        for (int i = 0; i < nbrE; i++)
        {
            sum += EmpTab[i].salaire();
        }
        return sum / nbrE;
    }
}
