public enum TennisPoint {
    ZERO("0"),
    FIFTEEN("15"),
    THIRTY("30"),
    FORTY("40"),
    ADVANTAGE("A");

    private final String pointName;

    TennisPoint(String pointName) {
        this.pointName = pointName;
    }

    public String toString() {
        return pointName;
    }
}
