public class EnumRunner {
    private Day day;

    public EnumRunner(Day day) {
        this.day = day;
    }

    public String tellItLikeItIs() {
        return day.getMessage();
    }
}
