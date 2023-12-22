public class Main {
    public static void main(String[] args) {
Fighter f1 = new Fighter("SELAMİ ÇETİN", 90, 100, 70,100,50);
Fighter f2 = new Fighter("Kaan ezik", 10,100,110,0,50);
Maç mac= new Maç(f1,f2,70 ,120);
mac.run();

    }
}