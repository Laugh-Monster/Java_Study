public class StudentUtil {
    public void printStudentWithState(Student[] students, int state) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].state == state) {
                //System.out.println("学号" + students[i].number + "的学生为三年级！");
                Student stu_3 = students[i];
                System.out.println(stu_3.show());
            }


        }
    }
}
