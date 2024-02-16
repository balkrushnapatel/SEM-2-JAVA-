class Circle{
    void area(int r){
        double area = 3.14159*r*r;
        System.out.println(area);
    }
}

class Square{
    void area(int a){
        double square = a*a;
        System.out.println(square);
    }
}

public class Lab5_1 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.area(2);
        Square s = new Square();
        s.area(2);
    }
}
