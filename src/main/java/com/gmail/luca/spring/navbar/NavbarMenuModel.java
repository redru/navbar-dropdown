package com.gmail.luca.spring.navbar;

import com.vaadin.flow.templatemodel.Include;
import com.vaadin.flow.templatemodel.TemplateModel;
import java.util.List;

public interface NavbarMenuModel extends TemplateModel {

  @Include({ "text", "href" })
  void setNavigators(List<Navigator> navigators);

  List<Navigator> getNavigators();

}
