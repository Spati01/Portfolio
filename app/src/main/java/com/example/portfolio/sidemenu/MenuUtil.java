package com.example.portfolio.sidemenu;

import com.example.portfolio.R;

import java.util.ArrayList;
import java.util.List;

public class MenuUtil {

    public static final int HOME_FRAGMENT_CODE = 0;
    public static final int CV_FRAGMENT_CODE = 1;
    public static final int PORTFOLIO_FRAGMENT_CODE = 2;
    public static final int TEAM_FRAGMENT_CODE = 3;


    public static List<MenuItem> getMenuList() {

        List<MenuItem> list = new ArrayList<>();
        // first menu item is selected
        list.add(new MenuItem(R.drawable.baseline_home_24, HOME_FRAGMENT_CODE, true));
        list.add(new MenuItem(R.drawable.baseline_school_24, CV_FRAGMENT_CODE, false));
        list.add(new MenuItem(R.drawable.skill, TEAM_FRAGMENT_CODE, false));
        list.add(new MenuItem(R.drawable.baseline_dashboard_24, PORTFOLIO_FRAGMENT_CODE, false));

        return list;

    }
}