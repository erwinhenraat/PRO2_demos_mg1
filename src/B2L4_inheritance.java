

public class B2L4_inheritance {
    public static void main(String[] args){


        Student student1 = new Student();
        student1.setYear(1);
        student1.setName("Erwin");


        Teacher teacher1 = new Teacher();
        teacher1.setSubject("Programmeren 2");

        System.out.println(teacher1.getSubject());



/*

        Person p1 = new Person();
        p1.setName("henkhenkhenkhenkhenkhenkhenk");




        Person[] people = {
                new Teacher(),
                new Student()

        };
        Teacher t = (Teacher)people[0];
        t.setName("Erwin");
        t.setIq(130);
        t.addDiploma("HBO gamedesign & Development (HKU)");

        Student s = (Student)people[1];
        s.setName("Hendrik");
        s.setIq(130);
        s.addCourse("PRO2");
        s.addDiploma("VMBO T");

        for (Person person : people) {
            System.out.println(person.getName() + " has an IQ of " + person.getIq() + " and has the following diplomas " + person.getDiplomas());

        }
*/
    }
}
