package com.example.application.views.list;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.map.Map;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;

@PermitAll
@Route(value="explore", layout = MainLayout.class)
@PageTitle("Explore")
public class Explore extends VerticalLayout {
    public Explore(){
        Map map = new Map();
        add(new H1("Explore"), map);
        map.setWidth("30em");
    }
}
