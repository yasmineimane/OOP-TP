public class EmployeFixe extends Employe{
    float salaire;

    public EmployeFixe(String n, float s)
    {
        super(n);
        this.salaire = s;
    }

    public float salaire()
    {
        return salaire;
    }
}
