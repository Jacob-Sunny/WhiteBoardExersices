package Week3Exersice;
//How do parent and child classes work?  Demonstrate with pseudocode
public class ParentChildClass {
    public static void main(String[] args) {
    student s = new student();
    System.out.println(s.name + " is from " + s.Address + " and he graduated from " + s.schoolName);
    System.out.println(s.name + " ID is:" + s.studentID + " and his phone number is : " + s.phoneNum);

    }

    public static class Person {
        String name = "jacob";
        String Address= "philly";
        String phoneNum= "123456789";
    }

    public static class student extends Person {
        String studentID = "915193641";
        String schoolName = "Temple";

    }


}
