package sumdu.edu.ua;

import sumdu.Student;
import sumdu.edu.Subject;

public class Utils {
    public static String getTheBestSubject(Student[] student){
        float maxscore = 0;
        String subname = "";
        float temp[] = new float[5];

        for (Student st:student){
            Subject[] sub = st.getSubject();
            for(int i = 0; i < sub.length; i++){
                temp[i] += (sub[i].getMark()/student.length);
                if(maxscore < temp[i]){
                    maxscore = temp[i];
                    subname = sub[i].getNameSubject();
                }
            }
        }

        return subname;
    }

    public static Student getTheBestStudent(Student[] student){
        float middleMarks[] = new float[5];
        float maxscoreMark = 0;
        Student thebeststudent = new Student();

        for (Student studs:student){
            Subject[] subjects = studs.getSubject();
            for (int i = 0; i < student.length; i++){
                middleMarks[i] += (subjects[i].getMark()/subjects.length);
                if(maxscoreMark < middleMarks[i]){
                    maxscoreMark = middleMarks[i];
                    thebeststudent = studs; }
            }
        }

        return thebeststudent;
    }

}
