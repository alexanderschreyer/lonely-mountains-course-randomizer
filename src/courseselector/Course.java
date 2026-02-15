package courseselector;

public enum Course {
    TAN_1("Eisige Allee"),
    TAN_2("Weinender Wald"),
    TAN_3("Grimmiger Hang"),
    TAN_4("Saphir See"),

    MON_1("Sendero Perdido"),
    MON_2("Velo Glacial"),
    MON_3("Cuesta Del Alba"),
    MON_4("Salto Rizado"),

    SIE_1("Barren Plateau"),
    SIE_2("Spiraling Descent"),
    SIE_3("Queens Canyon"),
    SIE_4("Crimson Pool"),

    BAI_1("Hanlin"),
    BAI_2("Donggu"),
    BAI_3("Huanta"),
    BAI_4("Jingku"),

    BEN_1("Isle of Tamh"),
    BEN_2("Glen Darach"),
    BEN_3("Auld Monadh"),
    BEN_4("Loch Rioghail");

    private final String courseName;

    Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
}
