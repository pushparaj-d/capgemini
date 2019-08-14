package Lab12;

import java.util.function.BiConsumer;

public class Lab12_Exercise_4 {
	public String name;
	public int age;
@Override
	public String toString() {
		return "Lab12_Exercise_4 [name=" + name + ", age=" + age + "]";
	}
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
public Lab12_Exercise_4(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
public static void main(String[] args) {
	BiConsumer<String, Integer> biConsumer= Lab12_Exercise_4::new;
	biConsumer.accept("arun", 21);
	biConsumer.accept("shakthi", 22);
}
}
