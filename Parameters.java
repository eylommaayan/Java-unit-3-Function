public class Parameters {
    
    public static void main(String[] args) {
        calculatArea(2.3, 3.6);
        calculatArea(1.6, 2.4);
        calculatArea(2.6, 4.5);

    }

    public static void calculatArea(double lenght, double width){
      double area = lenght * width;
      System.out.println("Area: " + area);
    }
}
  

