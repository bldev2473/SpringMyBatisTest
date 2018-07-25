package mybatis.controller;

import mybatis.model.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import mybatis.service.EmpService;
import mybatis.service.Paging;

import java.util.List;

@Controller
public class EmpController {
    @Autowired
    private EmpService es;

    @RequestMapping(value = "list")
    public String list(Emp emp, String currentPage, Model model) {
        int total = es.total();
        System.out.println("total=>" + total);
        System.out.println("currentPage=>" + currentPage);
        Paging pg = new Paging(total, currentPage);
        emp.setStart(pg.getStart());
        emp.setEnd(pg.getEnd());
        List<Emp> list = es.list(emp);
        model.addAttribute("list", list);
        System.out.println(list);
        model.addAttribute("pg", pg);
        return "list";
    }
}
