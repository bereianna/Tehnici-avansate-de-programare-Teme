import java.awt.Point;

public class point_si_polygon {
    private float x, y;
    private int n;
    private Point[] Polygon;
    //un constructor care să primească cele două numere reale (de tip float) ce reprezintă
    //coordonatele.
    point_si_polygon(float x, float y)
    {
        this.x=x;
        this.y=y;
    }
    //o metodă changeCoords ce primește două numere reale și modifică cele două coordonate ale punctului.
    public void changeCoords(float newx, float newy)
    {
        x=newx;
        y=newy;
    }
    //o funcție de afișare a unui punct astfel: (x, y).
    public String toString(){
        return "("+ x+","+ y +")";
    }
    //un constructor care preia ca parametru un singur număr n (reprezentând numărul de
    //colțuri al poligonului) și alocă spațiu pentru puncte (un punct reprezentând o instanță a
    //clasei Point).
    point_si_polygon(int n){
        this.n=n;
        Polygon=new Point[n];
    }
    //un constructor care preia ca parametru un vector, cu 2n numere reale reprezentând
    //colțurile. Acest constructor apelează constructorul de la punctul de mai sus și
    //completează vectorul de puncte cu cele n instanțe ale clasei Point obținute din parametrii
    //primiți.

    point_si_polygon(Point[] temp)
    {   
        this(temp.length);        
        n=temp.length;
        for(int i=0;i<Polygon.length;i++)
        {
            Polygon=temp;
        }
    }
}
