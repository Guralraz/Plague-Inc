package com.plague.controller;

import com.plague.view.JButtonRegion;
import com.plague.view.MapFrame;

import javax.swing.*;

public class MapController {
    private final MapFrame mapFrame;

    public MapController() {
        mapFrame = new MapFrame();
    }

    public void control() {
        init();

        mapFrame.getBtnCountriesGroup().forEach(btn -> btn.addActionListener(e -> onClickBtnCountry(btn.getText(), btn)));
    }

    private void onClickBtnCountry(String country, JButton source) {
        ((JButtonRegion) source).setNoOfClicks(((JButtonRegion) source).getNoOfClicks() + 1);
        System.out.println(((JButtonRegion) source).getCountryName() + " " + ((JButtonRegion) source).getNoOfClicks());
    }

    public void init() {
        mapFrame.setVisible(true);
    }
}
