package Praktikum5;

import java.util.Scanner;

public class pemilihanhari12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dayname, daytype;

        System.out.print("Input day name: ");
        dayname = sc.nextLine();

        switch (dayname.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "firday":
                daytype = "weekday";
                break;
            case "saturday":
            case "sunday":
                daytype = "weekend";
                break;
            default:
                daytype = "invalid day name";
        }

        System.out.println(dayname + "is a " + daytype);
    }
}