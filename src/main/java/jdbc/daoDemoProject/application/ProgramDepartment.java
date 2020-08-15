package jdbc.daoDemoProject.application;

import jdbc.daoDemoProject.model.dao.DaoFactory;
import jdbc.daoDemoProject.model.dao.DepartmentDao;
import jdbc.daoDemoProject.model.entities.Department;

import java.util.List;

public class ProgramDepartment {

    public static void main(String[] args) {

        DepartmentDao dao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department findAll ===");
        List<Department> departments = dao.findAll();
        for (Department d : departments) {
            System.out.println(d.toString());
        }

        System.out.println("=== TEST 2: department insert ===");
        Department department = new Department(null, "Test Dep 1");
        dao.insert(department);
        System.out.println("Inserted! new id: " + department.getId());

        System.out.println("=== TEST 3: department update ===");
        Department departmentUpdate = new Department(5, "Test Dep Update");
        dao.update(departmentUpdate);
        System.out.println("Updated complete!");

        System.out.println("=== TEST 4: department findById ===");
        Department departmentFind = dao.findById(5);
        System.out.println(departmentFind);

        System.out.println("=== TEST 5: department delete ===");
        dao.deleteById(9);
        System.out.println();
        System.out.println("Delete completed!");

    }
}
