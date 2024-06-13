package time;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {
    public static void main(String[] args) {
        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println("availableZoneId = " + availableZoneId);
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println("zoneId = " + zoneId);
            System.out.println("zoneId = " + zoneId.getRules());
        }
        ZoneId zoneId1 = ZoneId.systemDefault();
        System.out.println("zoneId1 = " + zoneId1);
    }
}
