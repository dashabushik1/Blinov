/**
 * 2. Создать класс Department с внутренним классом, с помощью объектов которого можно хранить информацию обо
 * всех должностях отдела и обо всех сотрудниках, когда-либо занимавших конкретную должность.
 */
package chapter5.task2;

public class Main {

    public static void main(String[] args) {

        Department department = new Department();

        System.out.println("All sales staff: " + department.getEmployees().toString().replace("[", "")
                .replace("]", ""));
    }
}
