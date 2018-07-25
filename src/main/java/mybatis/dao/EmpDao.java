package mybatis.dao;

import mybatis.model.Emp;

import java.util.List;

public interface EmpDao {
    List<Emp> list(Emp emp);

    int total();
}