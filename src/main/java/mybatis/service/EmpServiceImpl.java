package mybatis.service;

import java.util.List;

import mybatis.dao.EmpDao;
import mybatis.model.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpDao ed;

    // ed->EmpDaoImpl
    public List<Emp> list(Emp emp) {
        return ed.list(emp);
    }

    // ed->EmpDaoImpl
    public int total() {
        return ed.total();
    }
}