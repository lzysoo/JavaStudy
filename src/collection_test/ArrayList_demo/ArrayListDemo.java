package collection_test.ArrayList_demo;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<ArrayList<Student>> bigclass = new ArrayList<ArrayList<Student>>();

        ArrayList<Student> firstClass = new ArrayList<Student>();
        Student s1 = new Student("Tony",21);
        Student s2 = new Student("Lisa",18);
        firstClass.add(s1);
        firstClass.add(s2);
        bigclass.add(firstClass);

        ArrayList<Student> secondClass = new ArrayList<Student>();
        Student ss1 = new Student("Tom",21);
        Student ss2 = new Student("Amy",18);
        secondClass.add(ss1);
        secondClass.add(ss2);
        bigclass.add(secondClass);

        ArrayList<Student> thirdClass = new ArrayList<Student>();
        Student sss1 = new Student("Jery",19);
        Student sss2 = new Student("Quso",23);
        thirdClass.add(sss1);
        thirdClass.add(sss2);
        bigclass.add(thirdClass);

        for(ArrayList<Student> array:bigclass){
            for(Student s:array){
                System.out.println(s.getName()+","+s.getAge());
            }
        }
    }
}
