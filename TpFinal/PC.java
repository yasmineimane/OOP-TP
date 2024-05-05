public class PC {
    UC uc;
    Peripheriques per;

    public PC(UC uc, Peripheriques pr)
    {
        this.uc = uc;
        this.per = pr;
    }

    public double calcConsoElec(int duree) throws ConsoExeption
    {
        double pcPuiss = uc.get_puissance() + per.calculerPuissance();

        double cons = pcPuiss * duree;

        if (cons > 1000)
        {
            throw new ConsoExeption("La consommation électrique dépasse 1000 Watts");
        }
        return cons;
    }
}
