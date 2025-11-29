package it.unibo.impl;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import it.unibo.api.HeartStoneController;
import it.unibo.api.HeartStoneView;

public class HeartStoneViewSwing implements HeartStoneView{

    private static final String FRAME_NAME = "HEARTSTONE: THE CARD GAME";
    private static final String QUIT = "Quit";
    private static final String RESET = "Reset";
    private static final String GO = "Go";
    private static final String NEW_GAME = ": a new game starts!";

    private HeartStoneController controller;
    private final JFrame frame = new JFrame(FRAME_NAME);

    public HeartStoneViewSwing() {
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel(new BorderLayout());
    }

    @Override
    public void start() {
        this.frame.setVisible(true);
    }

    @Override
    public void setController(HeartStoneController controller) {
        this.controller = controller;
    }

    @Override
    public void drawCard() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'drawCard'");
    }

}
