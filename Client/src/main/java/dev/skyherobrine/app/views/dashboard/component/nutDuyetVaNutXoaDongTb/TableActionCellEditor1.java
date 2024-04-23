/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.skyherobrine.app.views.dashboard.component.nutDuyetVaNutXoaDongTb;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Virtue Nguyen
 */
public class TableActionCellEditor1 extends DefaultCellEditor {

    private TableActionEvent1 event;

    public TableActionCellEditor1(TableActionEvent1 event) {
        super(new JCheckBox());
        this.event = event;
    }

    @Override
    public Component getTableCellEditorComponent(JTable jtable, Object o, boolean bln, int row, int column) {
        PanelAction1 action = new PanelAction1();
        action.initEvent(event, row);
        action.setBackground(jtable.getSelectionBackground());
        return action;
    }
}