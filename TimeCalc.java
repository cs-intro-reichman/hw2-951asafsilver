public class TimeCalc {
    public static void main(String[] args) {
        String currentTimeString = args[0]; // current time
        String MinutesToAdd = args[1]; // add minutes
        int intMinutesToAdd = Integer.parseInt(MinutesToAdd);//parsing
        String[] parts = currentTimeString.split(":"); // splits  the input time to 2 numbers
        int hour = Integer.parseInt(parts[0]); // first part is hour
        int min = Integer.parseInt(parts[1]);// second part is minute
        int totalMin = (hour*60) + min + intMinutesToAdd; // sum of minutes
        int newHour = (totalMin / 60  ); // sum of hours
        int moduluHour = (newHour % 24);
        int moduluMinutes = (totalMin % 60);
        String finalhour;
        String finalminutes;
        if (moduluHour < 10) // if number is single digit
        {
                finalhour = ("0"+moduluHour);// add 0, example: show 5:5 as 05:05
        }
        else
        {
            finalhour = String.valueOf(moduluHour);
        }
       if (moduluMinutes < 10)
        {
                finalminutes = ("0"+moduluMinutes);
        }
        else 
        {
            finalminutes = String.valueOf(moduluMinutes);
        }
       // String finaltime = finalhour+finalminutes; // not needed
        System.out.println(finalhour+":"+finalminutes);

    }
}
