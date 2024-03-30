package allotherprograms;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Student_fetch {
    public static void main(String[] args) {
        Student s1=new Student(101,"Sono",180);
        Student s2=new Student(77,"mine",9);
        Student s3=new Student(12,"skandana",21);

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

//        list.forEach(a->{
//            System.out.println(list);
//        });
        Iterator itr=list.iterator();
        while(((Iterator<?>) itr).hasNext()){
            Student st=(Student)itr.next();
            System.out.println(st.rollno + " " + st.Age+ " "+st.Name);
        }



    }
}
