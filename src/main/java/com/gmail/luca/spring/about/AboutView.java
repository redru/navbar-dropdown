package com.gmail.luca.spring.about;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.Route;

@Route("about")
public class AboutView extends Div {

  public AboutView() {
    add(new Label("About View!!"));
  }

}
