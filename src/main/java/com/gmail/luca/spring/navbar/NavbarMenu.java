package com.gmail.luca.spring.navbar;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import java.util.ArrayList;
import java.util.List;

@Tag("navbar-menu")
@HtmlImport("src/navbar-menu/NavbarMenu.html")
public class NavbarMenu extends PolymerTemplate<NavbarMenuModel> {

  private List<Navigator> navigators = new ArrayList<>();

  public void setNavigators(List<Navigator> navigators) {
    getModel().setNavigators(navigators);
  }

  public List<Navigator> getNavigators() {
    return getModel().getNavigators();
  }

}
