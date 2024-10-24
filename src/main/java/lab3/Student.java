package lab3;

import java.util.Objects;

/**
 * Клас представляє студента
 * @author Denys
 */
public class Student {
  private final String name;
  private final double grade;
  private final int age;
  private final String major;
  private final int year;

  /**
   * Конструктор для створення студента.
   * @param name  Ім'я студента
   * @param grade Оцінка студента
   * @param age   Вік студента
   * @param major Спеціальність студента
   * @param year  Рік навчання студента
   */
  public Student(String name, double grade, int age, String major, int year) {
    this.name = name;
    this.grade = grade;
    this.age = age;
    this.major = major;
    this.year = year;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Student student = (Student) o;
    return age == student.age && Double.compare(student.grade, grade) == 0 && year == student.year && Objects.equals(name, student.name) && Objects.equals(major, student.major);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age, grade, major, year);
  }

  @Override
  public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            ", grade=" + grade +
            ", age=" + age +
            ", major='" + major + '\'' +
            ", year=" + year +
            '}';
  }

  // Геттери
  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public double getGrade() {
    return grade;
  }

  public String getMajor() {
    return major;
  }

  public int getYear() {
    return year;
  }
}
