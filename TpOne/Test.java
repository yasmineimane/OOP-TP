public class Test
{
    public static void main(String[] args)
    {
        Etudiant e1 = new Etudiant("Yasmine", "L2", "32114607", 18);
        System.out.println(e1);
        System.out.println(e1.name);
        System.out.println(e1.niveau);
        System.out.println(e1.mat);
        System.out.println(e1.note);
        // e1.name = "Yasmine";
        // System.out.println(e1); //adrress
        // System.out.println(e1.name); //name

        Etudiant e2 = new Etudiant("Aich", "L2", "32114607", 18);
        System.out.println(e2);
        System.out.println(e2.name);
        System.out.println(e2.niveau);
        System.out.println(e2.mat);
        System.out.println(e2.note);

        e2 = e1;
        System.out.println(e2);
        System.out.println(e2.name);
        System.out.println(e2.niveau);
        System.out.println(e2.mat);
        System.out.println(e2.note);
    }
}
