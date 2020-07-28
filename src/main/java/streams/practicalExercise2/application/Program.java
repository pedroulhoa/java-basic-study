package streams.practicalExercise2.application;

import streams.practicalExercise2.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter full file path: ");
        String path = sc.nextLine();

        System.out.println("Enter salary: ");
        Double salary = sc.nextDouble();

        List<Employee> list = new ArrayList<>();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

            String line = bufferedReader.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = bufferedReader.readLine();
            }

            List<String> emails = list.stream()
                    .filter(employee -> employee.getSalary() > salary)
                    .map(employee -> employee.getEmail())
                    .sorted()
                    .collect(Collectors.toList());

            emails.forEach(System.out::println);

            double sum = list.stream()
                    .filter(employee -> employee.getName().charAt(0) == 'M')
                    .map(employee -> employee.getSalary())
                    .reduce(0.0, (e1, e2) -> e1 + e2);

            System.out.println("Sum of salary of people whose name starts with 'M': " + sum);

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }




    }

}
