import java.util.ArrayList;

public class CompositePiece extends Piece{
    ArrayList <Piece> CPieces;
    private double assemblyTime;

    public CompositePiece(double t)
    {
        this.assemblyTime = t;
        this.CPieces = new ArrayList<>();
    }

    public void add(Piece P)
    {
        CPieces.add(P);
    }

    public double fab_time()
    {
        double total_time = assemblyTime;
        for (Piece piece : CPieces)
        {
            total_time += piece.fab_time();
        }
        return total_time;
    }
}
