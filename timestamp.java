package realtimecases;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
public class timestamp {
    public static void main(String[] args) {
        Date d=new Date() ;
        System.out.println(d);
        Timestamp t=new Timestamp(d.getTime());
        System.out.println(t);
    }
}
