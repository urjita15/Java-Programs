class Shapes {

    double area;

    
    Shapes(double r) {
        area = 3.14 * r * r;
        System.out.println("Circle Area = " + area);
    }

    Shapes(double l, double b) {
        area = l * b;
        System.out.println("Rectangle Area = " + area);
    }

    void area(int b, int h) {
        area = 0.5 * b * h;
        System.out.println("Triangle Area = " + area);
    }

    void area(int s) {
        area = s * s;
        System.out.println("Square Area = " + area);
    }

    public static void main(String[] args) {

        Shapes c = new Shapes(5);      
        Shapes r = new Shapes(4, 6);   

        Shapes obj = new Shapes(1);   
        obj.area(5, 10);               
        obj.area(4);                   
    }
}
