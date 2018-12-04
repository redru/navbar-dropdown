package com.gmail.luca.spring.about;

import com.gmail.luca.spring.MainLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.Route;

@Route(value = "about", layout = MainLayout.class)
public class AboutView extends Div {

  public AboutView() {
    add(new Label("About View!!"));
  }

}
