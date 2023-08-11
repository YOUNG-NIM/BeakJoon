import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        PrintDate(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
    }

    private static void PrintDate(int month, int date) {
        System.out.println(DayofDate(2007, month, date));
    }

    public static int MonthDays(int year, int month){
        int dayOfMonth = 0;

        //윤년인가
        Boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0;
        //31일로 끝나는가
        Boolean is31 = (month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12);

        if(isLeapYear && month == 2){
            dayOfMonth = 29;
        }else if(!isLeapYear && month ==2){
            dayOfMonth = 28;
        }else if(is31){
            dayOfMonth = 31;
        }else{
            dayOfMonth = 30;
        }

        return dayOfMonth;
    }

    private static String DayofDate(int year, int month, int date) {
        String dayOfWeek = "";
        int totalDay = 0;

        for(int i = 1900; i <= year; i++){
            if(i<year){
                for(int j=1; j <= 12; j++){
                    totalDay += MonthDays(i, j);
                }
            }else{
                for(int j=1; j < month; j++){
                    totalDay += MonthDays(i, j);
                }
            }
        }

        totalDay += date;

        switch(totalDay % 7){
            case 0:{
                dayOfWeek = "SUN";
                break;
            }
            case 1:{
                dayOfWeek = "MON";
                break;
            }
            case 2:{
                dayOfWeek = "TUE";
                break;
            }
            case 3:{
                dayOfWeek = "WED";
                break;
            }
            case 4:{
                dayOfWeek = "THU";
                break;
            }
            case 5:{
                dayOfWeek = "FRI";
                break;
            }
            case 6:{
                dayOfWeek = "SAT";
                break;
            }
        }

        return dayOfWeek;
    }
}
