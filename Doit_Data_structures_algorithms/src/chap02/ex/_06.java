package chap02.ex;

public class _06 {
    int year;
    int month;
    int day;

    public _06(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public _06 afterDay(int n) {
        return new _06(year, month, day + n);
    }

    public _06 beforeDay(int n) {
        return new _06(year, month, day - n);
    }
}
