package netcracker.hobbies;

public class Swimming extends Hobby {
    private float maxMeters;

    public Swimming(String name, float hoursInWeek, byte fromAge, boolean relatedWork, float maxMeters) {
        super(name, hoursInWeek, fromAge, relatedWork);
        this.maxMeters = maxMeters;
    }

    public float getMaxMeters() {
        return maxMeters;
    }

    public void setMaxMeters(float maxMeters) {
        this.maxMeters = maxMeters;
    }

    public void tellAboutHobby() {
        System.out.println("Swimming{" +
                "name='" + super.getName() + '\'' +
                ", hoursInWeek=" + super.getHoursInWeek() +
                ", fromAge=" + super.getFromAge() +
                ", relatedWork=" + super.isRelatedWork() +
                ", maxMeters=" + maxMeters +
                '}');
    }
}
