package enums;

import static enums.Mountain.*;

public enum Course {
    TAN_1("Eisige Allee", TAN.getName()),
    TAN_2("Weinender Wald", TAN.getName()),
    TAN_3("Grimmiger Hang", TAN.getName()),
    TAN_4("Saphir See", TAN.getName()),

    MON_1("Sendero Perdido", MON.getName()),
    MON_2("Velo Glacial", MON.getName()),
    MON_3("Cuesta Del Alba", MON.getName()),
    MON_4("Salto Rizado", MON.getName()),

    SIE_1("Barren Plateau", SIE.getName()),
    SIE_2("Spiraling Descent", SIE.getName()),
    SIE_3("Queens Canyon", SIE.getName()),
    SIE_4("Crimson Pool", SIE.getName()),

    BAI_1("Hanlin", BAI.getName()),
    BAI_2("Donggu", BAI.getName()),
    BAI_3("Huanta", BAI.getName()),
    BAI_4("Jingku", BAI.getName()),

    BEN_1("Isle of Tamh", BEN.getName()),
    BEN_2("Glen Darach", BEN.getName()),
    BEN_3("Auld Monadh", BEN.getName()),
    BEN_4("Loch Rioghail", BEN.getName());

    private final String courseName;
    private final String mountainName;

    Course(String courseName, String mountainName) {
        this.courseName = courseName;
        this.mountainName = mountainName;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getMountainName() {
        return mountainName;
    }
}
