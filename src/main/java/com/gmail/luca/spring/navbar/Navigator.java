package com.gmail.luca.spring.navbar;

public class Navigator {

  private String text;

  private String href;

  public Navigator(String text, String href) {
    this.text = text;
    this.href = href;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

}
