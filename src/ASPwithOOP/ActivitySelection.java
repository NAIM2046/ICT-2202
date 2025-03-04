package ASPwithOOP;

import java.util.Comparator;
import java.util.List;

public class ActivitySelection {
    public static void selectActivite(List<Activity> activities) {
        activities.sort(Comparator.comparingInt(a -> a.end));
        // System.out.println(activities);
        System.out.println(activities.get(0).name);
        int i = 0;
        for (int j = 1; j < activities.size(); j++) {
            if (activities.get(j).start >= activities.get(i).end) {
                System.out.println(activities.get(j).name);
                i++;
            }

        }
    }
}
