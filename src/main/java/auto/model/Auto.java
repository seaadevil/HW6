package auto.model;


public class Auto {

    private String mark;
    private  int year;

    public Auto() {
    }

    public Auto(String mark, int year) {
        this.mark = mark;
        this.year = year;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "mark='" + mark + '\'' +
                ", year=" + year +
                '}';
    }
}
