package mybatis.service;

import mybatis.model.Emp;

import java.util.List;

public interface EmpService {
    List<Emp> list(Emp emp);

    int total();
}