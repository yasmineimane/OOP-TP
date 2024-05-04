public class TestException {
    public static void main(String args[])
    {
        try 
        {
            Date d1 = new Date(-2, 34, 2024);
            System.out.println("after date");
        } catch(DException e) 
        {
            // if (e.jour < 1 || e.jour > 30)
            // {
            //     System.out.println("valeur du jour Erronee" + ' ' + e.jour);
            // }
                
            // else if (e.mois< 1 || e.mois > 12)
            // {
            //     System.out.println("valeur du mois Erronee" + ' ' + e.mois);
            // }
            System.out.println(e.getMessage());
        }
    }
    
}
