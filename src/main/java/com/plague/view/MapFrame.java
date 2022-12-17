package com.plague.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.util.ArrayList;
import java.util.List;

public class MapFrame extends JFrame {
    private final JPanelBackground contentPane;
    private final JButton btnIberia;
    private final JButton btnTuriye;
    private final JButton btnNorthernEurope;
    private final JButton btnIsland;
    private final JButton btnFrance;
    private final JButton btnWesternUnion;
    private final JButton btnGermany;
    private final JButton btnPoland;
    private final JButton btnCentralEurope;
    private final JButton btnEasternEurope;
    private final JButton btnBaltic;
    private final JButton btnSouthEastEurope;
    private final JButton btnGreece;
    private final JButton btnItaly;
    private final JButton btnBalkans;
    private final JButton btnSwitzerland;
    private final JButton btnUnitedKingdom;

    private final java.util.List<JButton> btnCountriesGroup = new ArrayList<>();

    public MapFrame() {
        setResizable(false);
        setIconImage(new ImageIcon("biohazard-warning-symbol.jpg").getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1016, 898);
        contentPane = new JPanelBackground();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        btnIberia = new JButtonRegion("Iberia");
        btnCountriesGroup.add(btnIberia);
        btnIberia.setBounds(102, 683, 91, 23);
        contentPane.add(btnIberia);

        btnTuriye = new JButtonRegion("Turkiye");
        btnCountriesGroup.add(btnTuriye);
        btnTuriye.setBounds(710, 659, 91, 23);
        contentPane.add(btnTuriye);

        btnNorthernEurope = new JButtonRegion("NorthernEurope");
        btnCountriesGroup.add(btnNorthernEurope);
        btnNorthernEurope.setBounds(390, 216, 91, 23);
        contentPane.add(btnNorthernEurope);

        btnIsland = new JButtonRegion("Island");
        btnCountriesGroup.add(btnIsland);
        btnIsland.setBounds(88, 169, 91, 23);
        contentPane.add(btnIsland);

        btnFrance = new JButtonRegion("France");
        btnCountriesGroup.add(btnFrance);
        btnFrance.setBounds(209, 545, 91, 23);
        contentPane.add(btnFrance);

        btnWesternUnion = new JButtonRegion("WesternUnion");
        btnCountriesGroup.add(btnWesternUnion);
        btnWesternUnion.setBounds(254, 484, 91, 23);
        contentPane.add(btnWesternUnion);

        btnGermany = new JButtonRegion("Germany");
        btnCountriesGroup.add(btnGermany);
        btnGermany.setBounds(328, 451, 91, 23);
        contentPane.add(btnGermany);

        btnPoland = new JButtonRegion("Poland");
        btnCountriesGroup.add(btnPoland);
        btnPoland.setBounds(429, 451, 91, 23);
        contentPane.add(btnPoland);

        btnCentralEurope = new JButtonRegion("CentralEurope");
        btnCountriesGroup.add(btnCentralEurope);
        btnCentralEurope.setBounds(421, 545, 91, 23);
        contentPane.add(btnCentralEurope);

        btnEasternEurope = new JButtonRegion("EasternEurope");
        btnCountriesGroup.add(btnEasternEurope);
        btnEasternEurope.setBounds(603, 471, 91, 23);
        contentPane.add(btnEasternEurope);

        btnBaltic = new JButtonRegion("Baltic");
        btnCountriesGroup.add(btnBaltic);
        btnBaltic.setBounds(501, 367, 91, 23);
        contentPane.add(btnBaltic);

        btnSouthEastEurope = new JButtonRegion("SouthEastEurope");
        btnCountriesGroup.add(btnSouthEastEurope);
        btnSouthEastEurope.setBounds(562, 586, 91, 23);
        contentPane.add(btnSouthEastEurope);

        btnGreece = new JButtonRegion("Greece");
        btnCountriesGroup.add(btnGreece);
        btnGreece.setBounds(539, 716, 91, 23);
        contentPane.add(btnGreece);

        btnItaly = new JButtonRegion("Italy");
        btnCountriesGroup.add(btnItaly);
        btnItaly.setBounds(377, 671, 91, 23);
        contentPane.add(btnItaly);

        btnBalkans = new JButtonRegion("Balkans");
        btnCountriesGroup.add(btnBalkans);
        btnBalkans.setBounds(469, 625, 91, 23);
        contentPane.add(btnBalkans);

        btnSwitzerland = new JButtonRegion("Switzerland");
        btnCountriesGroup.add(btnSwitzerland);
        btnSwitzerland.setBounds(302, 573, 91, 23);
        contentPane.add(btnSwitzerland);

        btnUnitedKingdom = new JButtonRegion("UnitedKingdom");
        btnCountriesGroup.add(btnUnitedKingdom);
        btnUnitedKingdom.setBounds(161, 414, 91, 23);
        contentPane.add(btnUnitedKingdom);

        contentPane.paintAll(getGraphics());
    }

    public List<JButton> getBtnCountriesGroup() {
        return btnCountriesGroup;
    }
}
