package courseselector;

import enums.Course;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static enums.Course.*;

public class CourseSelector {
    private List<Course> tannenstein;
    private List<Course> monteGuanaco;
    private List<Course> sierraGelida;
    private List<Course> baifushan;
    private List<Course> benFiadhein;

    private boolean allowMixed = false;
    private boolean includeDlc = false;

    public CourseSelector() {
        tannenstein = new ArrayList<>();
        tannenstein.add(TAN_1);
        tannenstein.add(TAN_2);
        tannenstein.add(TAN_3);
        tannenstein.add(TAN_4);

        monteGuanaco = new ArrayList<>();
        monteGuanaco.add(MON_1);
        monteGuanaco.add(MON_2);
        monteGuanaco.add(MON_3);
        monteGuanaco.add(MON_4);

        sierraGelida = new ArrayList<>();
        sierraGelida.add(SIE_1);
        sierraGelida.add(SIE_2);
        sierraGelida.add(SIE_3);
        sierraGelida.add(SIE_4);

        baifushan = new ArrayList<>();
        baifushan.add(BAI_1);
        baifushan.add(BAI_2);
        baifushan.add(BAI_3);
        baifushan.add(BAI_4);

        benFiadhein = new ArrayList<>();
        benFiadhein.add(BEN_1);
        benFiadhein.add(BEN_2);
        benFiadhein.add(BEN_3);
        benFiadhein.add(BEN_4);
    }

    public void setAllowMixed(boolean allowMixed) {
        this.allowMixed = allowMixed;
    }

    public void setIncludeDlc(boolean includeDlc) {
        this.includeDlc = includeDlc;
    }

    public List<Course> generateRandomCourseList() {
        List<Course> courses = new ArrayList<>();
        courses.addAll(tannenstein);
        courses.addAll(monteGuanaco);
        courses.addAll(sierraGelida);
        courses.addAll(baifushan);
        if (includeDlc) {
            courses.addAll(benFiadhein);
        }
        Collections.shuffle(courses);
        return courses;
    }
}
