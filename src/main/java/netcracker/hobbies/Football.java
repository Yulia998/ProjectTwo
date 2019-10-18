package netcracker.hobbies;

public class Football extends Hobby {
    private int goals;

    public Football(int amountAwards, float hoursInWeek, double field1, char mark, byte fromAge, short field3, long field4, boolean relatedWork, int goals) {
        super("Football", amountAwards, hoursInWeek, field1, mark, fromAge, field3, field4, relatedWork);
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
}
