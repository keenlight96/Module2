import java.util.Scanner;

public class Bai1_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Input number: ");
        int number = sc.nextInt();
        String onesRead = "", tensRead = "", hundredsRead = "";
        int ones = number % 10;
        if (number >= 10) {
            int tens = (number / 10) % 10;
            switch (tens) {
                case 1:
                    if (number == 10) onesRead = "ten";
                    else if (number == 11) onesRead = "eleven";
                    else if (number == 12) onesRead = "twelve";
                    else onesRead = "teen";
                    break;
                case 2:
                    tensRead = "twenty";
                    break;
                case 3:
                    tensRead = "thirty";
                    break;
                case 4:
                    tensRead = "forty";
                    break;
                case 5:
                    tensRead = "fifty";
                    break;
                case 6:
                    tensRead = "sixty";
                    break;
                case 7:
                    tensRead = "seventy";
                    break;
                case 8:
                    tensRead = "eighty";
                    break;
                case 9:
                    tensRead = "ninety";
                    break;
                case 0:
                    tensRead = "";
                    break;
            }
        }
        if (onesRead != "") {
            switch (ones) {
                case 3:
                    tensRead = "thir";
                    break;
                case 4:
                    tensRead = "for";
                    break;
                case 5:
                    tensRead = "fif";
                    break;
                case 6:
                    tensRead = "six";
                    break;
                case 7:
                    tensRead = "seven";
                    break;
                case 8:
                    tensRead = "eigh";
                    break;
                case 9:
                    tensRead = "nine";
                    break;
            }
        } else {
            switch (ones) {
                case 1:
                    onesRead = "one";
                    break;
                case 2:
                    onesRead = "two";
                    break;
                case 3:
                    onesRead = "three";
                    break;
                case 4:
                    onesRead = "four";
                    break;
                case 5:
                    onesRead = "five";
                    break;
                case 6:
                    onesRead = "six";
                    break;
                case 7:
                    onesRead = "seven";
                    break;
                case 8:
                    onesRead = "eight";
                    break;
                case 9:
                    onesRead = "nine";
                    break;
                case 0:
                    onesRead = "";
                    break;

            }
        }
        if (number >= 100) {
            int hundreds = (number / 100);
            switch (hundreds) {
                case 1:
                    hundredsRead = "one";
                    break;
                case 2:
                    hundredsRead = "two";
                    break;
                case 3:
                    hundredsRead = "three";
                    break;
                case 4:
                    hundredsRead = "four";
                    break;
                case 5:
                    hundredsRead = "five";
                    break;
                case 6:
                    hundredsRead = "six";
                    break;
                case 7:
                    hundredsRead = "seven";
                    break;
                case 8:
                    hundredsRead = "eight";
                    break;
                case 9:
                    hundredsRead = "nine";
                    break;
            }
        }
        //
        if (number >= 100) System.out.println(hundredsRead + " hundred and " + tensRead + " " + onesRead);
        else if ((number >= 10) && (number <= 20)) System.out.println(tensRead + onesRead);
        else System.out.println(tensRead + " " + onesRead);
    }

}
