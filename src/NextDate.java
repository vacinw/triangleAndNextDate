public class NextDate {
    public static void main(String[] args) {
        int year = 2024;
        int month = 12;
        int day = 31;
        System.out.println("Current date: " + year + "/" + month + "/" + day);
        System.out.println("Next date:    " + nextDate(year, month, day));
    }

    public static String nextDate(int year, int month, int day){
        String nextDate = String.valueOf(year) + "/";
        if(day < 28){
            nextDate += String.valueOf(month) + "/" + String.valueOf(day + 1);
        }
        switch (day) {
            case 28:
                if(month == 2 && year % 4 != 0){
                    nextDate += String.valueOf(month + 1) + "/" + "1";
                }else {
                    nextDate += String.valueOf(month) + "/" + String.valueOf(day + 1);
                }
                break;
            case 29:
                if(month == 2){
                    nextDate += String.valueOf(month + 1) + "/" + "1";
                }else {
                    nextDate += String.valueOf(month) + "/" + String.valueOf(day + 1);
                }
                break;
            case 30:
                if(month == 4 || month == 6 || month == 9 || month == 11){
                    nextDate += String.valueOf(month + 1) + "/" + "1";
                }else {
                    nextDate += String.valueOf(month) + "/" + String.valueOf(day + 1);
                }
                break;
            case 31:
                if(month == 12){
                    nextDate = String.valueOf(year + 1) + "/" + "1" + "/" + "1";
                }else{
                    nextDate += String.valueOf(month + 1) + "/" + "1";
                }
                break;
            default:
                break;
        }

        return nextDate;
    }
}
