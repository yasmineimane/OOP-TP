public class Dessin {
    public Rectangle[] rectangleTab;
    public int n;

    public Dessin(int size)
    {
        this.rectangleTab = new Rectangle[size];
        this.n = 0;
    }

    public void ajouter(Rectangle r)
    {
        rectangleTab[n] = r;
        n++;
    }

    public float somme()
    {
        float sum = 0;
        for (int i = 0 ; i < n ; i++)
        {
            sum += rectangleTab[i].area();
            System.out.println(rectangleTab[i].area());
        }
        return sum;
    }
}


// Second way using ArrayList
// import java.util.ArrayList;

// public class Dessin {
//     ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();

//     public void ajouter(Rectangle r)
//     {
//         this.rectangles.add(r);
//     }

//     public float somme()
//     {
//         float sum = 0;

//         for (Rectangle i : this.rectangles)
//         {
//             sum += i.area();
//             System.out.println(i.area());
//         }
//         return sum;
//     }

// }
