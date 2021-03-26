import java.util.Scanner;

public class BmiRechner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie Ihr Gewicht in Kilogramm an: ");
        double weight = scanner.nextDouble();

        System.out.println("Geben Sie Ihre Grösse in Metern an: ");
        double height = scanner.nextDouble();

        double bmiValue = bmi(weight, height);
        System.out.println("Ihr BMI: " + bmiValue);

        if(bmiValue < 18.5){
            System.out.println("Untergewicht");
        }
        else if(bmiValue >= 18.5 && bmiValue <= 25){
            System.out.println("Normalgewicht");
        }
        else if(bmiValue >= 25 && bmiValue <= 30){
            System.out.println("leichtes Uebergewicht");
        }
        else if(bmiValue >= 30 && bmiValue <= 40){
            System.out.println("deutliches Uebergewicht");
        }
        else if(bmiValue > 40){
            System.out.println("sehr starkes Uebergewicht");
        }
    }

    private static double bmi(double weight, double height){
        return weight/(height*height);
    }
}
