public class Test {
    public static void main(String[] args)
    {
        UC uc = new UC(3.2, 3, 150);
        Clavier clavier = new Clavier(1, "KB", 102, 5);
        Monitor monitor = new Monitor(1, "MN", 2, 18, 1700);
        Peripheriques p = new Peripheriques();

        p.add(clavier);
        p.add(monitor);

        PC Pc = new PC(uc, p);

        try {
            double consPc = Pc.calcConsoElec(5);
            System.out.println("La consommation électrique du PC est " + consPc + 
            " Watts pour une durée de 5 heures.");
        } catch (ConsoExeption e)
        {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
