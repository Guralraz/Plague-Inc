package com.plague.view;

import javax.swing.*;

public class JButtonRegion extends JButton {
    private final String countryName;
    private String someOtherData;
    private Integer someOtherOtherData;
    private Integer noOfClicks = 0;
    private final JButton button;


    public JButtonRegion(String text) {
        super(text);
        countryName = super.getText();
        button = this;
    }

    public JButton getButton() {
        return button;
    }

    public String getCountryName() {
        return countryName;
    }

    public Integer getNoOfClicks() {
        return noOfClicks;
    }

    public void setNoOfClicks(Integer noOfClicks) {
        this.noOfClicks = noOfClicks;
    }
}
