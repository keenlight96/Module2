package Task2_id9252;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

//      Tìm chuỗi liên tiếp, tăng dần có độ dài lớn nhất
//        int start = 0, end = 0, range = 0, max = 0, index = 0;
//
//        while (++end < text.length()) {
//            if (text.charAt(end) <= text.charAt(end - 1)) {
//                range = end - start;
//                if (range > max) {
//                    max = range;
//                    index = start;
//                }
//                start = end;
//            }
//        }
//
//        String result = "";
//        for (int i = index; i < (max - index); i++) {
//            result += text.charAt(i);
//        }
//        System.out.println(result);


//      Tìm chuỗi, tăng dần có độ dài lớn nhất
        int max = 0;
        String str = "";
        for (int i = 0; i < text.length() - 1; i++) {
            String strTemp = text.substring(i, i + 1);
            char character = text.charAt(i);
            for (int j = i + 1; j < text.length(); j++) {
                if (character < text.charAt(j)) {
                    character = text.charAt(j);
                    strTemp += text.substring(j, j + 1);
                }
            }

            if (strTemp.length() > str.length()) {
                str = strTemp;
            }
        }
        System.out.println(str);
    }
}
