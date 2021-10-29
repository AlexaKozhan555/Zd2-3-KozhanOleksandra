import java.util.Scanner;

public class Zd2_3_KozhanOleksandra {
    static float Scan( ){
        Scanner ScanKozhan = new Scanner(System.in);
        float XKozhan = ScanKozhan.nextFloat();
        return XKozhan;
    }
    public static void main(String[] args) {
        System.out.println("Podaj wzrost (metry) ");
        float HeightKozhan = Scan();
        System.out.println("Podaj wage (kg) ");
        float WeightKozhan = Scan();
        HeightKozhan = (float) Math.pow(HeightKozhan, 2);
        float BmiKozhan = WeightKozhan/HeightKozhan;
        String float_4_Kozhan;
        float_4_Kozhan = String.format("%.4f\n", BmiKozhan);

        if (BmiKozhan < 16){
            System.out.println(float_4_Kozhan + " wyglodzienie");
        } else if (BmiKozhan < 16.99){
            System.out.println(float_4_Kozhan + " wychodzenie");
        } else if (BmiKozhan < 18.49){
            System.out.println(float_4_Kozhan + " niedowaga");
        } else if (BmiKozhan < 22.99){
            System.out.println(float_4_Kozhan + " norma niski przedział");
        } else if (BmiKozhan < 24.99){
            System.out.println(float_4_Kozhan + " norma wysoki przedział");
        } else if (BmiKozhan < 27.99){
            System.out.println(float_4_Kozhan + " nadwaga niski przedział");
        }else if (BmiKozhan < 29.99){
            System.out.println(float_4_Kozhan + " nadwaga wysoki przedział");
        }else if (BmiKozhan < 34.9){
            System.out.println(float_4_Kozhan + " otyłość I stopnia");
        }else if (BmiKozhan < 39.9){
            System.out.println(float_4_Kozhan + " otyłość II stopnia");
        }else if (BmiKozhan > 40) {
            System.out.println(float_4_Kozhan + " otyłość III stopnia");
        }
    }
}
