public class Test {
    public static void main(String args[])
    {
        Appartement a1 = new Appartement(3000, 2);
        Appartement a2 = new Appartement(40000, 5);

        Immeuble i = new Immeuble(3);
        i.addApp(a1);
        i.addApp(a2);

        ResidIndiv r = new ResidIndiv(3055, 4, 0);

        Portfolio p = new Portfolio();

        p.addPro(r);
        p.addPro(i);

        System.out.println("chifre d'affaire = " + p.calcChifre());
    }
}
