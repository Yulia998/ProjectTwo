package netcracker.hobbies;

public class Hobby {
    private String name;
    private int amountAwards;
    private float hoursInWeek;
    private double field1;
    private char mark;
    private byte fromAge;
    private short field3;
    private long field4;
    private boolean relatedWork;

    public Hobby() {
        this("none", 0, 0f, 0d, 'X',
                (byte) 0, (short) 0, 0, false);
    }

    public Hobby(String name, int amountAwards, float hoursInWeek, double field1, char mark, byte fromAge, short field3, long field4, boolean relatedWork) {
        this.name = name;
        this.amountAwards = amountAwards;
        this.hoursInWeek = hoursInWeek;
        this.field1 = field1;
        this.mark = mark;
        this.fromAge = fromAge;
        this.field3 = field3;
        this.field4 = field4;
        this.relatedWork = relatedWork;
    }

    public Hobby(String name, float hoursInWeek, byte fromAge, boolean relatedWork) {
        this.name = name;
        this.hoursInWeek = hoursInWeek;
        this.fromAge = fromAge;
        this.relatedWork = relatedWork;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountAwards() {
        return amountAwards;
    }

    public void setAmountAwards(int amountAwards) {
        this.amountAwards = amountAwards;
    }

    public float getHoursInWeek() {
        return hoursInWeek;
    }

    public void setHoursInWeek(float hoursInWeek) {
        this.hoursInWeek = hoursInWeek;
    }

    public double getField1() {
        return field1;
    }

    public void setField1(double field1) {
        this.field1 = field1;
    }

    public char getMark() {
        return mark;
    }

    public void setMark(char mark) {
        this.mark = mark;
    }

    public byte getFromAge() {
        return fromAge;
    }

    public void setFromAge(byte fromAge) {
        this.fromAge = fromAge;
    }

    public short getField3() {
        return field3;
    }

    public void setField3(short field3) {
        this.field3 = field3;
    }

    public long getField4() {
        return field4;
    }

    public void setField4(long field4) {
        this.field4 = field4;
    }

    public boolean isRelatedWork() {
        return relatedWork;
    }

    public void setRelatedWork(boolean relatedWork) {
        this.relatedWork = relatedWork;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", amountAwards=" + amountAwards +
                ", hoursInWeek=" + hoursInWeek +
                ", field1=" + field1 +
                ", mark=" + mark +
                ", fromAge=" + fromAge +
                ", field3=" + field3 +
                ", field4=" + field4 +
                ", relatedWork=" + relatedWork +
                '}';
    }
}
