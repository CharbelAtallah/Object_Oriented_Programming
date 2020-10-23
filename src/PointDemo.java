public class PointDemo {
    public static void main(String[] args) {
        Point p1= new Point();
        Point p2 = new Point();

        //Skriver ut referensvariabler, inte värdet
        System.out.println("p1 = " + p1);
        System.out.println("p1 = " + p2);

        //Skriv ut punkterna
        System.out.println("p1(" + p1.x + " , " + p1.y + ")");
        System.out.println("p1(" + p2.x + " , " + p2.y + ")");

        p1.x = 5; // flyttar x 5 steg åt höger
        p1.y = -5; // flyttar y 5 steg nedåt

        p2.x = 10.5;
        p2.y = -5.5;

        System.out.println("p1(" + p1.x + " , " + p1.y + ")"); // Formatering för kordinater p1(0.0 , 0.0)
        System.out.println("p2(" + p2.x + " , " + p2.y + ")"); // p2(0.0 , 0.0)
    }
}
