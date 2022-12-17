package com.plague.controller;

import com.plague.view.MenuFrame;

public class MenuController {
    private final MenuFrame menuFrame;
    private final MapController mapController;

    public MenuController() {
        menuFrame = new MenuFrame();
        mapController = new MapController();
    }

    public void control() {
        init();

        menuFrame.getBtnNewGame().addActionListener(e -> onClickBtnNewGame());
    }

    private void onClickBtnNewGame() {
        menuFrame.setVisible(false);
        mapController.control();
    }

    private void init() {
        menuFrame.setVisible(true);
    }
}
