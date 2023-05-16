package Task3_id9200;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FDate date = InputDate();
        System.out.println(date);

        FDate formatDate = formatDate(date);
        System.out.println("Current date: "+ formatDate);

        formatDate.setDay(formatDate.getDay() + 1);
        System.out.println("Next date: " + formatDate);

    }

    public static boolean isLeapYear(int year) {
        boolean isDivisibleBy4 = year % 4 == 0;
        boolean isDivisibleBy100 = year % 100 == 0;
        boolean isDivisibleBy400 = year % 400 == 0;

        if (isDivisibleBy4) {
            if (isDivisibleBy100) {
                return isDivisibleBy400;
            } else
                return true;
        }
        return false;
    }

    public static FDate formatDate(FDate date) {

        while (!checkFormatDate(date)) {
            if (date.getMonth() > 12) {
                date.setYear(date.getYear() + Math.floorDiv(date.getMonth(), 12));
                date.setMonth(date.getMonth() % 12);
            } else if (date.getMonth() < 1) {
                date.setYear(date.getYear() - 1 + Math.floorDiv(date.getMonth(), 12));
                date.setMonth(12 + 1 + date.getMonth() % 12);
            }
            switch (date.getMonth()) {
                case 2:
                    if (isLeapYear(date.getYear())) {
                        if (date.getDay() > 29) {
                            date.setMonth(date.getMonth() + 1);
                            date.setDay(date.getDay() - 29);
                        }
                    } else {
                        if (date.getDay() > 28) {
                            date.setMonth(date.getMonth() + 1);
                            date.setDay(date.getDay() - 28);
                        }
                    }
                    if (date.getDay() < 1) {
                        date.setMonth(date.getMonth() - 1);
                        if (date.getMonth() == 0)
                            date.setMonth(-1);
                        date.setDay(31 + 1 + date.getDay());        //
                        if (date.getDay() == 0)
                            date.setDay(-1);
                    }
                    break;
                case 1:
                case 8:
                    if (date.getDay() > 31) {
                        date.setMonth(date.getMonth() + 1);
                        date.setDay(date.getDay() - 31);
                    } else if (date.getDay() < 1) {
                        date.setMonth(date.getMonth() - 1);
                        if (date.getMonth() == 0)
                            date.setMonth(-1);
                        date.setDay(31 + 1 + date.getDay());        //
                        if (date.getDay() == 0)
                            date.setDay(-1);
                    }
                    break;
                case 3:
                    if (date.getDay() > 31) {
                        date.setMonth(date.getMonth() + 1);
                        date.setDay(date.getDay() - 31);
                    } else if (date.getDay() < 1) {
                        date.setMonth(date.getMonth() - 1);
                        if (date.getMonth() == 0)
                            date.setMonth(-1);
                        if (isLeapYear(date.getYear()))     //
                            date.setDay(29 + 1 + date.getDay());        //
                        else        //
                            date.setDay(8 + 1 + date.getDay());     //
                        if (date.getDay() == 0)
                            date.setDay(-1);
                    }
                    break;
                case 5:
                case 7:
                case 10:
                case 12:
                    if (date.getDay() > 31) {
                        date.setMonth(date.getMonth() + 1);
                        date.setDay(date.getDay() - 31);
                    } else if (date.getDay() < 1) {
                        date.setMonth(date.getMonth() - 1);
                        if (date.getMonth() == 0)
                            date.setMonth(-1);
                        date.setDay(30 + 1 + date.getDay());        //
                        if (date.getDay() == 0)
                            date.setDay(-1);
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (date.getDay() > 30) {
                        date.setMonth(date.getMonth() + 1);
                        date.setDay(date.getDay() - 31);
                    } else if (date.getDay() < 1) {
                        date.setMonth(date.getMonth() - 1);
                        if (date.getMonth() == 0)
                            date.setMonth(-1);
                        date.setDay(31 + 1 + date.getDay());        //
                        if (date.getDay() == 0)
                            date.setDay(-1);
                    }
                    break;
            }
        }
        return date;
    }

    public static FDate InputDate() {
        while (true) {
            String dayStr = "", monthStr = "", yearStr = "";
            int day, month, year;

            Scanner sc = new Scanner(System.in);
            System.out.print("Input date (format dd/MM/yyyy): ");
            String text = sc.nextLine();
            int count = 0;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) != "/".charAt(0)) {
                    switch (count) {
                        case 0:
                            dayStr += text.charAt(i);
                            break;
                        case 1:
                            monthStr += text.charAt(i);
                            break;
                        case 2:
                            yearStr += text.charAt(i);
                            break;
                    }
                } else {
                    count++;
                }
            }

            if (count != 2) {
                System.out.println("Wrong input format.");
                continue;
            } else {
                try {
                    day = Integer.parseInt(dayStr);
                    month = Integer.parseInt(monthStr);
                    if (day == 0 || month == 0)
                        continue;
                    year = Integer.parseInt(yearStr);
                    return new FDate(day, month, year);
                } catch (Exception e) {
                    System.out.println("Wrong input format.");
                }
            }
        }
    }

    public static boolean checkFormatDate(FDate date) {
        if ((date.getMonth() > 12) || (date.getMonth() < 1) || (date.getDay() < 1) || (date.getDay() > 31))
            return false;
        switch (date.getMonth()) {
            case 2:
                if (isLeapYear(date.getYear()) && date.getDay() <= 29)
                    return true;
                return !isLeapYear(date.getYear()) && date.getDay() <= 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return (date.getDay() <= 30);
            default:
                return true;

        }
    }
}
