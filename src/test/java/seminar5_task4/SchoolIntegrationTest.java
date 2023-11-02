package seminar5_task4;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

public class SchoolIntegrationTest {

    @Test
    public void testSchoolIntegration() {
        // Задания:
        // 1. Создайте учебное заведение (School).

        School school = new School();

        // 2. добавьте преподавателя (Леонид) и студентов (Роман, Сергей, Алмаз, Сакен, Алма, Айдын, Мадина, Жан) в учебное заведение.

        Person person1 = new Person("Леонид", true);
        Person person2 = new Person("Роман", false);
        Person person3 = new Person("Сергей", false);
        Person person4 = new Person("Алмаз", false);
        Person person5 = new Person("Сакен", false);
        Person person6 = new Person("Алма", false);
        Person person7 = new Person("Айдын", false);
        Person person8 = new Person("Мадина", false);
        Person person9 = new Person("Жан", false);

        school.addPerson(person1);
        school.addPerson(person2);
        school.addPerson(person3);
        school.addPerson(person4);
        school.addPerson(person5);
        school.addPerson(person6);
        school.addPerson(person7);
        school.addPerson(person8);
        school.addPerson(person9);

        // 3. Проверьте, что Леонид является преподавателем в учебном заведении

        assertTrue(school.isTeacherInSchool("Леонид"));

        // 4. Проверьте, что Айдын является студентом в учебном заведении

        assertTrue(school.isStudentInSchool("Айдын"));

        // 5. Попробуйте добавить еще одного студента и убедитесь, что он также является студентом в учебном заведении

        Person person10 = new Person("Елена", false);
        school.addPerson(person10);
        assertTrue(school.isStudentInSchool("Елена"));



        // Подсказка: Используйте методы addPerson, isTeacherInSchool и isStudentInSchool из класса School.
        // Проверьте, что результаты соответствуют ожиданиям
    }
}
