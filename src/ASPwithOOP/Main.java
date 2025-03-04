package ASPwithOOP;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Activity> activities = new ArrayList<>();
        activities.add(new Activity("A1", 0, 6));
        activities.add(new Activity("A2", 3, 4));
        activities.add(new Activity("A3", 1, 2));
        activities.add(new Activity("A4", 5, 9));
        activities.add(new Activity("A5", 5, 7));
        activities.add(new Activity("A6", 8, 9));
        ActivitySelection.selectActivite(activities);
    }
}
