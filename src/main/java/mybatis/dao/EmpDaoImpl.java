package mybatis.dao;

import java.util.List;

import mybatis.model.Emp;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDaoImpl implements EmpDao {
    @Autowired
    private SqlSession session;

    public List<Emp> list(Emp emp) {
        // emp.xml->id(listALL), parameterType(emp), return List
        return session.selectList("listAll", emp);

    }

    public int total() {
        // emp.xml->id(total), return int
        return session.selectOne("total");
    }
}