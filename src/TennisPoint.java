public enum TennisPoint {
    ZERO("0"),
    FIFTEEN("1"),
    THIRTY("2"),
    FORTY("3"),
    ADVANTAGE("4");

    private final String pointName;

    TennisPoint(String pointName) {
        this.pointName = pointName;
    }

    public String toString() {
        return pointName;
    }
}
