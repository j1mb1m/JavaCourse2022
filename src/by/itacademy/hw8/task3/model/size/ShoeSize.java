package by.itacademy.hw8.task3.model.size;

public enum ShoeSize {
    SIZE36("36"),
    SIZE37("37"),
    SIZE38("38"),
    SIZE39("39"),
    SIZE40("40"),
    SIZE41("41"),
    SIZE42("42"),
    SIZE43("43"),
    SIZE44("44"),
    SIZE45("45");

    private final String size;

    ShoeSize(String str) {
        this.size = str;
    }

    @Override
    public String toString() {
        return size;
    }

}
