package com.gmail.luca.spring.home;

import com.gmail.luca.spring.MainLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.Route;

@Route(value = "home", layout = MainLayout.class)
public class HomeView extends Div {

  public HomeView() {
    add(new Label("Home View!!"));
  }

}
