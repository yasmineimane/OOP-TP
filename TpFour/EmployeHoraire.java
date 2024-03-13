public class EmployeHoraire extends Employe{
    float taux_h, nbr_h;

    public EmployeHoraire(String n, float t, float nh)
    {
        super(n);
        this.taux_h = t;
        this.nbr_h = nh;
    }

    public float salaire()
    {
        return taux_h * nbr_h;
    }
}
