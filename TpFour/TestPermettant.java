public class TestPermettant {
    public static void main(String args [])
    {
        Employe eFix = new EmployeFixe("zz", 1000);
        Employe eCom = new EmployeCommission("qq", 200, 50, 5);
        Employe eHor = new EmployeHoraire("rr", 500, 4);

        Entreprise entreprise = new Entreprise(10);
        entreprise.add(eFix);
        entreprise.add(eCom);
        entreprise.add(eHor);

        System.out.println("La moyenne = " + entreprise.moyenne());
    }
}
