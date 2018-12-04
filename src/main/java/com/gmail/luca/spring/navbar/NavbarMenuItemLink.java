package com.gmail.luca.spring.navbar;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;

@StyleSheet("styles/navbar-menu.css")
class NavbarMenuItemLink extends Div {

  private Span textSpan = new Span();

  private boolean selected = false;

  private ComponentEventListener onClick;

  NavbarMenuItemLink(String text, Class<? extends Component> view) {
    addClassName("navbar-menu-item-link");

    addClickListener(e -> {
      if (onClick != null) {
        onClick.onComponentEvent(e);
      }

      getUI().ifPresent(ui -> ui.navigate(view));
    });

    textSpan.setClassName("item-link-text");
    textSpan.setText(text);
    add(textSpan);
  }

  public Span getTextSpan() {
    return textSpan;
  }

  public void setTextSpan(Span textSpan) {
    this.textSpan = textSpan;
  }

  public boolean isSelected() {
    return selected;
  }

  public void setSelected(boolean selected) {
    this.selected = selected;

    if (selected) {
      textSpan.addClassName("selected");
    } else {
      textSpan.removeClassName("selected");
    }
  }

  public ComponentEventListener getOnClick() {
    return onClick;
  }

  public void setOnClick(ComponentEventListener onClick) {
    this.onClick = onClick;
  }

}
