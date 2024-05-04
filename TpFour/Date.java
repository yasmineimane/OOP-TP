public class Date {
    int day, month, year;

    public Date(int d, int m, int y) throws DException
    {
        String msg = "";        
        if (d < 1 || d > 30 || m < 1 || m > 30)
        {
            if ((d < 1) || (d > 30))
            {
                msg = "Valeur du jour Erronee" + d;
                // DException de = new DException();
                // throw de;
            }
            if ((m < 1) || (m > 12))
            {
                msg = "Valeur du mois Erronee" + m;
            }
            DException de = new DException(msg);
            throw de;
        }
        this.day = d;
        this.month = m;
        this.year = y;
    }
}
