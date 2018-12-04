package com.gmail.luca.spring;

import com.gmail.luca.spring.navbar.NavbarMenu;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

@Theme(value = Lumo.class, variant = Lumo.DARK)
public class MainLayout extends Div implements RouterLayout {

  private NavbarMenu navbarMenu = new NavbarMenu();

  public MainLayout() {
    add(navbarMenu);
  }

}
