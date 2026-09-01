package com.tnsif.java.inh;
class Student {
    public void studentDetails() {
        String studentName = "Pranavi";
        int studentAge = 21;
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + studentAge);
    }
}
class Engineering extends Student {
    public void engineeringDetails() {
        String studentBranch = "IT";
        System.out.println("Student Branch: " + studentBranch);
    }
}
class Management extends Student {
    public void managementDetails() {
        String studentCourse = "BTech";
        System.out.println("Student Course: " + studentCourse);
    }
}
public class HierarchicalInh {
    public static void main(String[] args) {
        Engineering e = new Engineering();
        e.studentDetails();
        e.engineeringDetails();
        Management m = new Management();
        m.studentDetails();
        m.managementDetails();
    }
}
