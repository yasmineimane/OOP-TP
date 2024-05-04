public class UC {
    private double CPU_Frequence;
    private double RAM_Capacitee;
    private double puissance;

    public UC(double c, double r, double p)
    {
        this.CPU_Frequence = c;
        this.RAM_Capacitee = r;
        this.puissance = p;
    }

    public double get_puissance()
    {
        return this.puissance;
    }
}
