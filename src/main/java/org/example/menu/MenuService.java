package org.example.menu;

import org.example.ex.A1;

import java.util.ArrayList;
//추상 메서드 -> 반드시 추상 클래스여야함
//abstract : 실제로 구현하지는 않음, 상속받은 자식들이 무조건 구현되어야함
public abstract class MenuService {
    @A1 //-> 인터페이스,
    public abstract ArrayList<Menu> getMenuList();



}
