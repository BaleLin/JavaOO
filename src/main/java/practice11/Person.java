package practice11;

import java.util.Objects;

public class Person {
    private Integer id;
    private String name;
    private Integer age;

    public Person(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public boolean equals(Object obj) {
        //先比较对象是否相等
        if (this == obj) return true;
        //判断是否出现空的情况
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return Objects.equals(id, person.id);
    }



    public String introduce() {
        return "My name is " + name + ". I am " + age + " years old.";
    }
}
