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


    }
}
