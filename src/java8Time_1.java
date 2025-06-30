import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class java8Time_1 {
    public static void main(String[] args) {
        LocalDate t=LocalDate.now();
        System.out.println(t);
        LocalDate d=LocalDate.of(1990, Month.JULY,23);
        System.out.println(d);
        LocalTime tt=LocalTime.now();
        System.out.println(tt);
        LocalTime dd=LocalTime.of(14,43,32,2333200);
        System.out.println(dd);
        System.out.println(ZoneId.getAvailableZoneIds());
        LocalTime td=LocalTime.now(ZoneId.of("Japan"));
        System.out.println(td);
        for (String i:ZoneId.getAvailableZoneIds())
        {
            System.out.println(i);
        }
    }
}
