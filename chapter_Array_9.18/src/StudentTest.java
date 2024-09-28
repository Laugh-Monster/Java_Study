public class StudentTest {
    public static void main(String[] args) {
          //创建Student[]
        //String[] strs = new String[20];
        Student[] students = new Student[20];
        //使用循环，给数组的元素赋值
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].number = i + 1;
            students[i].state = (int)(Math.random() * 6 + 1);
            students[i].score = (int)(Math.random() * 101);

        }
        /*
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i].number + "\t");
            System.out.print(students[i].state + "\t");
            System.out.print(students[i].score + "\t");
            System.out.println();
        }
        /*
        for (int i = 0; i < students.length; i++) {
            if (students[i].state == 3){
                //System.out.println("学号" + students[i].number + "的学生为三年级！");
                Student stu_3 = students[i];
                System.out.println(stu_3.show());
            }



        }
        */

        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].score > students[j + 1].score){
                    Student temp = new Student();
                    temp = students[j + 1];
                    students[j + 1] = students[j];
                    students[j] = temp;
                }
            }
        }
        for (int i = 0; i < students.length; i++) {
//            System.out.print(students[i].number + "\t");
//            System.out.print(students[i].state + "\t");
//            System.out.print(students[i].score + "\t");
            System.out.println(students[i].show());
            System.out.println();
        }


    }
}
