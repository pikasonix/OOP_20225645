import java.util.Scanner;
public class DayOfMonth {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String monthInput;
        int year = 0;

        System.out.print("Year: ");
        year = keyboard.nextInt();
        if (year < 0) System.out.println("Error: invalid year");

        keyboard.nextLine();

        System.out.print("Month: ");
        monthInput = keyboard.nextLine().trim();

        int monthNumber = getMonthNumber(monthInput);

        if (monthNumber != 0) {
            int days = getDaysInMonth(monthNumber, year);
            System.out.println(monthNumber + "/" + year + " has " + days + " days");
        } else {
            System.out.println("Error: invalid month");
        }
    }

    // convert month to number
    public static int getMonthNumber(String month) {
        switch (month.toLowerCase()) {
            case "1": case "january": case "jan.": case "jan":
                return 1;
            case "2": case "february": case "feb.": case "feb":
                return 2;
            case "3": case "march": case "mar.": case "mar":
                return 3;
            case "4": case "april": case "apr.": case "apr":
                return 4;
            case "5": case "may":
                return 5;
            case "6": case "june": case "jun.": case "jun":
                return 6;
            case "7": case "july": case "jul.": case "jul":
                return 7;
            case "8": case "august": case "aug.": case "aug":
                return 8;
            case "9": case "september": case "sep.": case "sep":
                return 9;
            case "10": case "october": case "oct.": case "oct":
                return 10;
            case "11": case "november": case "nov.": case "nov":
                return 11;
            case "12": case "december": case "dec.": case "dec":
                return 12;
            default:
                return 0;
        }
    }

    // caculate day
    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 0; 
        }
    }

    // check leapyear
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0)
            if (year % 100 == 0) return year % 400 == 0;
            else return true;
        return false;
    }
}