package com.gmail.luca.spring;

import com.gmail.luca.spring.navbar.NavbarMenu;
import com.gmail.luca.spring.navbar.Navigator;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;
import java.util.ArrayList;
import java.util.List;

@Theme(value = Lumo.class, variant = Lumo.DARK)
public class MainLayout extends Div implements RouterLayout {

  public MainLayout() {
    NavbarMenu navbarMenu = new NavbarMenu();

    List<Navigator> navigators = new ArrayList<>();
    navigators.add(new Navigator("About", "about"));
    navigators.add(new Navigator("Home", "home"));

    navbarMenu.setNavigators(navigators);

    add(navbarMenu);
  }

}
