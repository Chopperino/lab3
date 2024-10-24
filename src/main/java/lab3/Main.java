package lab3;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Виконавчий клас
 * @author Denys
 */
public class Main {
  /**
   * Головний метод для виконання програми.
   * Створює масив студентів, сортує його і шукає ідентичний об'єкт.
   *
   * @param args аргументи командного рядка
   */
  public static void main(String[] args) {
    // Створення масиву студентів
    Student[] students = {
            new Student("Anna", 90.0, 22, "Mathematics", 3),
            new Student("Ivan", 75.0, 21, "Physics", 1),
            new Student("Ivan", 85.5, 20, "Computer Science", 2),
            new Student("Maria", 88.0, 23, "Biology", 3),
            new Student("Petro", 85.5, 20, "Chemistry", 2)
    };

    // Сортування масиву: спершу за ім'ям за зростанням, потім за оцінкою за спаданням
    Arrays.sort(students, Comparator.comparing(Student::getName)
            .thenComparing(Comparator.comparing(Student::getGrade).reversed()));

    // Виведення відсортованого масиву
    System.out.println("Відсортований масив студентів:");
    for (Student student : students) {
      System.out.println(student);
    }

    // Пошук ідентичного студента
    Student target = new Student("Petro", 85.5, 20, "Chemistry", 2);
    boolean found = Arrays.asList(students).contains(target);
    System.out.println("Чи знайдено ідентичного студента: " + found);
  }
}
