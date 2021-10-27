package loptriangle;

public class Triangle {
    private Point a,b,c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean valid(){
        if(a.khoangCach(b)+b.khoangCach(c)>c.khoangCach(a) && a.khoangCach(b)<b.khoangCach(c)+c.khoangCach(a) && a.khoangCach(b)+c.khoangCach(a)>b.khoangCach(c))
            return true;
        else return false;
    }
    public String getPerimeter(){
        return String.format("%.03f",a.khoangCach(b)+b.khoangCach(c)+c.khoangCach(a));
    }
}
