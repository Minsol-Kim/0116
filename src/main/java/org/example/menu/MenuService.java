package org.example.menu;

import java.util.ArrayList;

//abstract : 실제로 구현하지는 않음, 상속받은 자식들이 무조건 구현되어야함
public abstract class MenuService {
    public abstract ArrayList<Menu> getMenuList();



}
