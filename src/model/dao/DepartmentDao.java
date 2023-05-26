package model.dao;

import java.util.List;

import model.entities.Department;

// Define as operações de acesso a dados de Department
public interface DepartmentDao {

    void insert(Department obj);

    void update(Department obj);

    void deleteById(Integer id);

    Department findById(Integer id);

    List<Department> findAll();
}
