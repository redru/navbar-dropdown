package com.gmail.luca.spring.navbar;

import com.gmail.luca.spring.about.AboutView;
import com.gmail.luca.spring.dropdown.DropdownTab;
import com.gmail.luca.spring.home.HomeView;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.RouterLink;

@StyleSheet("styles/navbar-menu.css")
public class NavbarMenu extends FlexLayout {

  private Tabs tabs = new Tabs();

  public NavbarMenu() {
    initTabs();
  }

  private void initTabs() {
    tabs.setClassName("navbar-menu");

    tabs.add(createLinkTab("Home", HomeView.class));
    tabs.add(createLinkTab("Home", HomeView.class));
    tabs.add(createLinkTab("Home", HomeView.class));
    tabs.add(createLinkTab("About", AboutView.class));
    tabs.add(createLinkTab("About", AboutView.class));
    tabs.add(new DropdownTab());

    add(tabs);
  }

  private Tab createLinkTab(String text, Class<? extends Component> view) {
    Tab tab = new Tab();
    tab.add(new RouterLink(text, view));

    return tab;
  }

}
