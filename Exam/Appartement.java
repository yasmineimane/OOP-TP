public class Appartement {
    float superficie;
    int nbrPiece;

    public Appartement(float s, int n)
    {
        this.superficie = s;
        this.nbrPiece = n;
    }

    public float CalcPrix()
    {
        return (superficie * nbrPiece * 50000);
    }
}
