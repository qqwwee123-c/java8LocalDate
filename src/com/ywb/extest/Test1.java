package com.ywb.extest;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Test1 {
    public static void main(String[] args) {
        List<Student> students = ititList();
        // 这种遍历会让下标乱掉
//        for (int i = 0; i < students.size(); i++) {
//            Student student = students.get(i);
//            System.out.println(student);
//            if (i % 2 == 0) {
//                students.remove(student);
//            }
//        }
        // 会出现乱序问题
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println(student);
            if (i % 2 == 0) {
                students.remove(i);
            }
        }



        // 迭代器遍历会出现 java.util.ConcurrentModificationException
//        int count = 0;
//        for (Student student : students) {
//            count++;
//            System.out.println(student);
//            if (count % 2 == 0) {
//                students.remove(count);
//            }
//        }
        // 迭代器遍历会出现 java.util.ConcurrentModificationException
//        int count = 0;
//        for (Student student : students) {
//            count++;
//            System.out.println(student);
//            if (count % 2 == 0) {
//                students.remove(student);
//            }
//        }
        System.out.println("-----------------------");
        for (Student student:students) {
            System.out.println(student);
        }

    }

    public static void test11(){
        List<Integer> list = new ArrayList<>();
        System.out.println("开始添加元素 size:" + list.size());
        for (int i = 0; i < 100; i++) {
            list.add(i + 1);
        }
        System.out.println("元素添加结束 size:" + list.size());
        Iterator<Integer> iterator = list.iterator();
    }
    public static List<Student> ititList() {
        List<Student> students = new ArrayList<>();
        Student s1 = new Student();
        s1.setName("zhangsan");
        s1.setAge(20);
        s1.setSex(1);
        students.add(s1);
        Student s2 = new Student();
        s2.setName("lisi");
        s2.setAge(14);
        s2.setSex(1);
        students.add(s2);
        Student s3 = new Student();
        s3.setName("xiaomei");
        s3.setAge(18);
        s3.setSex(0);
        students.add(s3);

        Student s4 = new Student();
        s4.setName("klav");
        s4.setAge(24);
        s4.setSex(1);
        students.add(s4);
        return students;
    }
}

class Student {
    String name;
    int age;
    int sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}