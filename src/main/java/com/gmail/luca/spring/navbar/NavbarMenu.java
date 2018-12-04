package com.gmail.luca.spring.navbar;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import java.util.ArrayList;
import java.util.List;

@StyleSheet("styles/navbar-menu.css")
public class NavbarMenu extends FlexLayout {

  private List<NavbarMenuItemLink> menuItems = new ArrayList<>();

  public NavbarMenu() {
    setClassName("navbar-menu");
  }

  public void addMenuItemLink(String text, Class<? extends Component> view) {
    NavbarMenuItemLink itemLink = new NavbarMenuItemLink(text, view);
    itemLink.setOnClick(e -> {
      menuItems.forEach(item -> item.setSelected(false));
      itemLink.setSelected(true);
    });

    menuItems.add(itemLink);
    add(itemLink);
  }

}
