package hsp.chapter26_mhl.mhl.service;

import hsp.chapter26_mhl.mhl.dao.MenuDAO;
import hsp.chapter26_mhl.mhl.domain.Menu;

import java.util.List;

/**
 * @author shenjie
 * @version 1.0.0
 * @ClassName MenuService.java
 * @Description TODO 完成对menu表的各种操作(通过调用MenuDAO)
 * @createTime 2022-04-25 19:46:00
 */
public class MenuService {
    //定义MenuDAO 属性
    private MenuDAO menuDAO = new MenuDAO();

    //返回所有的菜品, 返回给界面使用
    public List<Menu> list() {
        return menuDAO.queryMulti("select * from menu", Menu.class);
    }

    //需要方法，根据id, 返回Menu对象
    public Menu getMenuById(int id) {
        return menuDAO.querySingle("select * from menu where id = ?", Menu.class, id);
    }
}
