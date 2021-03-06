package netcracker.hobbies;

import netcracker.exceptions.HobbyException;

public class Swimming extends Hobby {
    private float maxMeters;

    public Swimming(String name, float hoursInWeek, byte fromAge, boolean relatedWork, float maxMeters) {
        super(name, hoursInWeek, fromAge, relatedWork);
        this.maxMeters = maxMeters;
    }

    public Swimming(String name, float hoursInWeek, float maxMeters) {
        super.setName(name);
        super.setHoursInWeek(hoursInWeek);
        this.maxMeters = maxMeters;
    }

    public float getMaxMeters() {
        return maxMeters;
    }

    public void setMaxMeters(float maxMeters) {
        this.maxMeters = maxMeters;
    }

    public void tellAboutHobby() throws HobbyException {
        if (maxMeters < 0) {
            throw new HobbyException("Wrong value of maxMeters");
        }
        System.out.println("Swimming{" +
                "name='" + super.getName() + '\'' +
                ", hoursInWeek=" + super.getHoursInWeek() +
                ", fromAge=" + super.getFromAge() +
                ", relatedWork=" + super.isRelatedWork() +
                ", maxMeters=" + maxMeters +
                '}');
    }

    @Override
    public String toString() {
        return "Swimming{" +
                "name=" + super.getName() +
                "; hoursInWeek=" + String.format("%.1f", super.getHoursInWeek()).replace(',', '.') +
                "; maxMeters=" + String.format("%.1f", maxMeters).replace(',', '.') +
                '}';
    }
}
