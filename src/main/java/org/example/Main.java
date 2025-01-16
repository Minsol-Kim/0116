package org.example;

import org.example.menu.ComposeMenuService;
import org.example.menu.MegaMenuService;
import org.example.menu.Menu;
import org.example.menu.MenuService;
import org.example.store.BasicRes;
import org.example.store.BusanRes;
import org.example.store.DaeguRes;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)throws Exception {
    HashMap<String, MenuService> map = new HashMap<>();
    map.put("mega",new MegaMenuService());
    map.put("compose",new ComposeMenuService());



        //megacoffee 메뉴 추출
//        String url = "https://www.mega-mgccoffee.com/menu/menu.php?menu_category1=1&menu_category2=1&category=&list_checkbox_all=all";
//        Document doc = Jsoup.connect(url).get();
//        // System.out.println(doc); //HTML 추출
//
//        Element element = doc.selectFirst("#menu_list");
//        //System.out.println(element); //HTML에서 이름만 추출
//
//        Elements names = element.select(".text1 b");
//
//        List<String> nameList = names.eachText();
//        System.out.println(nameList);


//        Document doc = Jsoup.connect("https://composecoffee.com/menu?amp%3Bcategory=185").get();

        //System.out.println(doc); //웹페이지를 HTML로 전송해줌

//       Element element = doc.selectFirst("#masonry-container");
//       //System.out.println(element); // 내용 추출 -> h4로 시작하는 것이 메뉴임을 알아냄
//
//        Elements names = element.select("h4");
//        //System.out.println(names); //이름만 추출
//
//        List<String> nameList=names.eachText();
//        System.out.println(nameList); //제품명을 List형태로 반환


//        //abstract 붙음 : 추상 클래스 -> 객체 생성 불가, 물려주거나 타입으로는 유용 Menu[] m = new Menu();불가
//        //Menu m= new Coffee();는 가능
//        Menu[]m =new Menu[10];

//        HashMap<String,BasicRes> resHashMap = new HashMap<>();
//
//        resHashMap.put("서울",new BasicRes());
//        resHashMap.put("부산",new BusanRes());
//        resHashMap.put("대구",new DaeguRes());
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("도시를 입력하세요");
//        String city = scanner.nextLine();
//
//
//        BasicRes target = resHashMap.get(city);
//
//        target.makeZazang();



//        BasicRes r1 = new DaeguRes();
//        r1.makeZazang();
//
//        ArrayList<BasicRes> resList = new ArrayList();
//
//        resList.add(new BasicRes());
//        resList.add(new BusanRes());
//        resList.add(new DaeguRes());
//
//        resList.forEach(r->{  r.makeZazang();}
//    );




    }
}