package com.woniu.onestage.tostring0821;
import java.util.Date;
/**
 * ObjectTest
 */
class Person {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    // @Override
    // public int hashCode() {
    //     final int prime = 31;
    //     int result = 1;
    //     result = prime * result + age;
    //     result = prime * result + ((name == null) ? 0 : name.hashCode());
    //     return result;
    // }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Person [age=" + age + ", name=" + name + "]";
    }

    

    

}

public class ObjectTest {

    public static void main(String[] args) {
        // System.out.println(Person.class.getSuperclass());
        // new Object();

        // int i = 65;
        // int j = 65;
        // double d = 65.0;
        // System.out.println(i == j); // true
        // // 鏁版嵁绫诲瀷鍙笉涓�鑷�
        // System.out.println(i == d); // true
        // System.out.println(j == d); // true

        // 鍩烘湰鏁版嵁绫诲瀷涓璪oolean绫诲瀷鍜屽叾浠栫被鍨嬩笉鑳芥瘮杈�
        // boolean b = true;
        // The operator == is undefined for the argument type(s) int, boolean
        // System.out.print(j == b);

        // char涔熷彲浠�
        // char c = 65;
        // System.out.println(i == c); // true
        // char c2 = 'A';
        // System.out.println(c == c2); // true
        // System.out.println(i == c2); // true

        //浣跨敤鑷畾涔夌被Person锛屾敞鎰忔病鏈夐噸鍐檈quals
        Person p1 = new Person("tom",20);
        Person p2 = new Person("tom", 20);
        System.out.println(p1 == p2); //false
        System.out.println(p1.equals(p2)); //false 鍥犱负鐖剁被鐨別quals灏辨槸浣跨敤鐨�==

        // //string绫诲瀷閲嶅啓浜唀quals
        // String str1 = new String("abc");
        // String str2 = new String("abc");
        // System.out.println(str1 == str2); //false
        // System.out.println(str1.equals(str2)); //true 浣跨敤鐨勬槸瀛愮被閲嶅啓鐨別quals

        // Date d1 = new Date();
        // Date d2 = new Date();
        // System.out.println(d1 == d2); //false
        // System.out.println(d1.equals(d2)); //true 浣跨敤鐨勬槸瀛愮被閲嶅啓鐨別quals

    }
}