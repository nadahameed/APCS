public class Time{
  public static void main(String[] args){
    int hour = 17;
    int minute = 10;
    int second = 20;
    double hour2 = hour;
    double minute2 = minute;
    double second2 = second;
    System.out.println("Seconds since midnight: ");
    System.out.println(hour * 60 * 60 + minute * 60 + second);
    System.out.println("Seconds remaining in the day: ");
    System.out.println(24 * 60 * 60 - (hour * 60 * 60 + minute * 60 + second));
    System.out.println("Percentage of day that has passed: ");
    System.out.print(((hour2 * 60 * 60 + minute2 * 60 + second2) / (24 * 60 * 60)) * 100);
    System.out.print("%");
  }
}
