import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // VARIABLES
        int birthyear;
        boolean isError = false;
        String zodiac = "";

        // SCANNER
        Scanner sc = new Scanner(System.in);

        // USER'S VALUES
        System.out.print("Lütfen Doğum Yılınızı Giriniz: ");
        birthyear = sc.nextInt();

        // CONTROL
        if(birthyear > 0){
            if(birthyear % 12 == 0){
                zodiac = "Maymun";
            }else if(birthyear % 12 == 1){
                zodiac = "Horoz";
            }else if(birthyear % 12 == 2){
                zodiac = "Köpek";
            }else if(birthyear % 12 == 3){
                zodiac = "Domuz";
            }else if(birthyear % 12 == 4){
                zodiac = "Fare";
            }else if(birthyear % 12 == 5){
                zodiac = "Öküz";
            }else if(birthyear % 12 == 6){
                zodiac = "Kaplan";
            }else if(birthyear % 12 == 7){
                zodiac = "Tavşan";
            }else if(birthyear % 12 == 8){
                zodiac = "Ejderha";
            }else if(birthyear % 12 == 9){
                zodiac = "Yılan";
            }else if(birthyear % 12 == 10){
                zodiac = "At";
            }else if(birthyear % 12 == 11){
                zodiac = "Koyun";
            }else{
                isError = true;
            }
        }else {
            isError = true;
        }

        // RESULT
        if(isError){
            System.out.println("Veriler Hatalı!!!");
        }else{
            System.out.println("Çin Zodyağınız: " + zodiac);
        }

    }
}
