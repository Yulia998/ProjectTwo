package netcracker.hobbies;

import java.util.Objects;

public class Football extends Hobby {
    private int goals;

    public Football(int amountAwards, float hoursInWeek, double field1, char mark, byte fromAge, short field3, long field4, boolean relatedWork, int goals) {
        super("Football", amountAwards, hoursInWeek, field1, mark, fromAge, field3, field4, relatedWork);
        this.goals = goals;
    }

    public Football(String name, float hoursInWeek, int goals) {
        super.setName(name);
        super.setHoursInWeek(hoursInWeek);
        this.goals = goals;
    }

    public int getGoals() {
        return goals;
    }

    public void setMaxGoals(int goals) {
        this.goals = goals;
    }

    public void tellAboutHobby() {
        System.out.println(super.toString() + ", goals=" + goals);
    }

    @Override
    public String toString() {
        return "Football{" +
                "name=" + super.getName() +
                "; hoursInWeek=" + super.getHoursInWeek() +
                "; goals=" + goals +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Football football = (Football) o;
        return goals == football.goals &&
                getHoursInWeek() == football.getHoursInWeek();
    }

    @Override
    public int hashCode() {
        return Objects.hash(goals) + Objects.hash(getHoursInWeek());
    }
}
