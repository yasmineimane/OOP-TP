public class Etudiant
{
    //Attribut
    public String name, niveau, mat;
    public float note;

    //Methodes
    public Etudiant(String n, String v, String m, float t)
    {
        name = n;
        niveau = v;
        mat = m;
        note = t;
        System.out.println("Object Created");
    }

}


