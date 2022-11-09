package chapter7.task3;

public class User {
    private Long id;
    private int age;
    private String name;
    private String country;

    public User(int age, String name, String country) {
        this(null, age, name, country);
    }

    public User(Long id, int age, String name, String country) {
        if (age == 0) {
            throw new RuntimeException("Age must not be positive!");
        }
        if (name == null) {
            throw new RuntimeException("Name must not be null!");
        }
        if (country == null) {
            throw new RuntimeException("Country must not be null!");
        }
        this.id = id;
        this.age = age;
        this.name = name;
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "|id: " + id +
                " |age: " + age +
                " |name: " + name +
                " |country: " + '\'' + country + '\'';
    }
}

