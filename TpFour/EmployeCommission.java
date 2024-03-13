public class EmployeCommission extends Employe{
    float salaire_base, vente, pourcentage;

    public EmployeCommission(String n, float sB, float v, float p)
    {
        super(n);
        this.salaire_base = sB;
        this.vente = v;
        this.pourcentage = p;
    }

    public float salaire()
    {
        return salaire_base + vente * pourcentage;
    }
}
