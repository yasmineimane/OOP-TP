public class Circulation {
    public static void main(String[] args) {
        Object a = new Automobile(0, 50);
        Object v = new Velo(0, "VTT");
        Vehicule vh = new Automobile(3, 10);
        Conducteur c = new Conducteur("Karim", "1234567");
        //v.tombe(); //the method tombe() is undefined for the type Object
        ((Velo)v).tombe(); //convertion explicit
        c.conduit((Vehicule)v);
        c.conduit((Vehicule)a);
        ((Automobile)vh).faitLePlein(10);
}
}
