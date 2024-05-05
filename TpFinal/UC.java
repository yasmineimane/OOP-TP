public class UC {
    public double CPU_Frequence;
    public double RAM_Capacitee;
    public double puissance;

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
