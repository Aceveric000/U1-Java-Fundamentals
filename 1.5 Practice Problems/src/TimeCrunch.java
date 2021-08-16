import java.sql.SQLOutput;

public class TimeCrunch {

    /*
    Create a program which takes a number in seconds and breaks it down into hours, minutes and seconds.

    Example: get 5 hours
   */
    public static void main(String[] args) {
        int seconds = 4287421;


      int numHours = seconds/3600;
      seconds = seconds % 3600;
      int numMinutes = seconds/60;
      seconds = seconds % 60;
      int numSeconds = seconds;

        System.out.println(" hours " + numHours);
        System.out.println(" minutes " + numMinutes);
        System.out.println(" seconds " + numSeconds);

    }

}
