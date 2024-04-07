public class ReturnValues {
    public static void main(String[] args) {
        double area1 = calculatArea(2.3, 2.4);
        double area2 = calculatArea(4.3, 6.4);
        double area3 = calculatArea(3.3, 5.4);

        String englishExplanation = explainArea("English");
        String frenchhExplanation = explainArea("French");
        String spanishExplanation = explainArea("Spanish");
        String italianhExplanation = explainArea("Italianh");
    }

    public static double calculatArea(double lenght, double width){
        double area = lenght * width;
        return area;
    }

    public static String explainArea(String language) {
        switch (language) {
            case "English":return "Area equals length * width";
            case "French": return "La surface est egale a la longueur * la largeur";
            case " Spanish": return "area es igual a largo * ancho";
            default: return "Language not available";
              
        }
    }
}






