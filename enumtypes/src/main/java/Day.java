public enum Day {
    MONDAY("Mondays are exciting beginning!", 7),
    TUESDAY("When things get serious..", 7),
    WEDNESDAY("Almost there!!", 8);
    // THURSDAY("Getting ready for Friday!"),
    // FRIDAY("Best day of the week"),
    // SATURDAY("2nd best day of the week"),
    // SUNDDAY("Getting ready for MONDAY!"); // Notice the semicolon

    private final String message;
    private final int moodWeight;

    // By default, enums constructors are private or package-private. Not invokeable.
    Day(String message, int moodWeight) {
        this.message = message;
        this.moodWeight = moodWeight;
    }

    public String getMessage() {
        return message;
    }

    public int calculateMood() {
        return this.moodWeight;
    }

    /* public int calculateMood() {
        return
    } */

}
