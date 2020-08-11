package com.ywb.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class testStream {
    public static void main(String[] args) {

        //testList();
        streamDemo();
    }

    public static void testList() {
        List list = Arrays.asList("zhangsan", "lisi", "wangwu");
        Stream stream = list.stream();
        Object collect = stream.filter(name -> name != "lisi").collect(Collectors.toList());
        System.out.println(collect);
        List<Student> students = ititList();
        Stream<Student> stream1 = students.stream();
        stream1.forEach(s -> {
            System.out.println(s);
        });
        List<Student> collect1 = stream1.filter(s -> s.getAge() > 17).distinct().sorted(Comparator.comparing(Student::getAge)).collect(Collectors.toList());
        System.out.println(collect1.size());
        // System.out.println(collect1.get(1).getName());
        collect1.stream().forEach(s -> System.out.println(s.getName()));
        List<Integer> collect2 = students.stream().map(s -> s.getAge() + 1).collect(Collectors.toList());
//        collect2.stream().forEach(s1 -> System.out.println(s1));
        collect2.stream().forEach(System.out::println);
//        List array = ArrayList::new;  //不能这样创建

//        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
//
//        IntSummaryStatistics stats = numbers.stream().mapToInt(x -> x).summaryStatistics();
//
//        System.out.println("列表中最大的数 : " + stats.getMax());
//        System.out.println("列表中最小的数 : " + stats.getMin());
//        System.out.println("所有数之和 : " + stats.getSum());
//        System.out.println("平均数 : " + stats.getAverage());
//        IntSummaryStatistics intSummaryStatistics = students.stream().mapToInt(s -> s.getAge()).summaryStatistics();
//        System.out.println("年龄最大的数 : " + intSummaryStatistics.getMax());
//        System.out.println("年龄中最小的数 : " + intSummaryStatistics.getMin());
//        System.out.println("所有数之和 : " + intSummaryStatistics.getSum());
//        System.out.println("平均数 : " + intSummaryStatistics.getAverage());
        String[] words = new String[]{"Hello", "World"};
        Stream<String[]> stream2 = Arrays.asList(words).stream().map(word -> word.split(""));
        List<String[]> collect4 = stream2.collect(Collectors.toList());
        collect4.forEach(s -> {
            for (String s1 : s) {
                System.out.println(s1);
            }
            System.out.println("--------");
        });
        //flat将多个Stream《String》 拼成一个  stream |    Arrays::stream 将数组专程stream
        List<String> collect3 = Arrays.asList(words).stream().map(word -> word.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        System.out.println();
        collect3.forEach(s -> System.out.println(s));

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
        return students;
    }

    public static void streamDemo() {
        List<Student> students = ititList();
        //男生人数
        Long count = students.stream().filter(student -> student.getSex() == 1).collect(Collectors.counting());
        System.out.println(count);
        System.out.println(students.stream().filter(student -> student.getSex() == 1).count());

        //大于15岁的人平均年龄
        System.out.println(students.stream().filter(student -> student.getAge() > 15).collect(Collectors.averagingInt(Student::getAge)));
        System.out.println(students.stream().filter(student -> student.getAge() > 15).collect(Collectors.summarizingInt(Student::getAge)).getAverage());
        System.out.println(students.stream().filter(student -> student.getAge() > 15).mapToInt(Student::getAge).average().getAsDouble());

        //求和
        System.out.println(students.stream().filter(student -> student.getAge() > 15).collect(Collectors.summingInt(Student::getAge)));

        //数据统计相关的东西都有
        IntSummaryStatistics collect = students.stream().filter(student -> student.getAge() > 15).collect(Collectors.summarizingInt(Student::getAge));

        //最小
        System.out.println(students.stream().filter(student -> student.getAge() > 15).map(student -> student.getAge()).
                collect(Collectors.minBy(Integer::compareTo)).get());
        System.out.println(students.stream().filter(student -> student.getAge() > 15).map(student -> student.getAge()).
                collect(Collectors.maxBy(Integer::compareTo)));

        //分组
        Map<Integer, List<Student>> collect1 = students.stream().collect(Collectors.groupingBy(Student::getSex));
        System.out.println(collect1);

        Map<String, List<Student>> collect2 = students.stream().collect(Collectors.groupingBy(s -> {
            if (s.getSex() == 0) {
                return "女";
            } else if (s.getSex() == 1) {
                return "男";
            } else {
                return "未知";
            }
        }));
        System.out.println(collect2);
        collect2.forEach((a,b) -> {
            System.out.println(a);
            b.forEach(System.out::println);
        });

        //分区  分区通过 表达式true flase 判断分区
        Map<Boolean, List<Student>> collect3 = students.stream().collect(Collectors.partitioningBy(s -> s.getAge() >15));
        System.out.println(collect3);

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