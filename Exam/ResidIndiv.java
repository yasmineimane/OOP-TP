public class ResidIndiv extends Projet{
    float superficie;
    int nbrPiece, backyard;

    public ResidIndiv(float s, int n, int b)
    {
        this.superficie = s;
        this.nbrPiece = n;
        this.backyard = b;
    }

    public float CalcPrix()
    {
        return (50000 * superficie + 30000 * nbrPiece + 100000 * backyard);
    }
}
