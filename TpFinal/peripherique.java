abstract class peripherique {
    int id;
    String model;

    public peripherique(int i, String m)
    {
        this.id = i;
        this.model = m;
    }

    public abstract double calculerPuissance();
}
