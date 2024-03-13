public class Usine {
    public static void main(String args[])
    {
        SimplePieces piece1 = new SimplePieces(4);
        SimplePieces piece2 = new SimplePieces(2.4);
        SimplePieces piece3 = new SimplePieces(4.3);
        CompositePiece piece4 = new CompositePiece(3);
        CompositePiece Cpiece = new CompositePiece(5);

        System.err.println("time for a simple piece1 is: " + piece1.fab_time());
        System.err.println("time for a simple piece2 is: " + piece2.fab_time());
        System.err.println("time for a simple piece1 is: " + piece3.fab_time());

        piece4.add(piece3);
        piece4.add(piece1);
        Cpiece.add(piece1);
        Cpiece.add(piece2);
        Cpiece.add(piece4);

        System.out.println("time for a complexe piece is: " + Cpiece.fab_time());

    }
}
