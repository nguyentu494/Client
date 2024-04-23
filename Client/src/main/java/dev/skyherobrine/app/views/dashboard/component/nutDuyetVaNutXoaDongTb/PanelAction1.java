/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package dev.skyherobrine.app.views.dashboard.component.nutDuyetVaNutXoaDongTb;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Virtue Nguyen
 */
public class PanelAction1 extends JPanel {

    /**
     * Creates new form PanelAction
     */
    public PanelAction1() {
        initComponents();
    }
    
    public void initEvent(TableActionEvent1 event, int row) {
        cmdDuyet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                event.onDuyet(row);
            }
        });
        cmdHuy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                event.onHuy(row);
            }
        });
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {


        cmdHuy = new dev.skyherobrine.app.views.dashboard.component.nutDuyetVaNutXoaDongTb.ActionButton1();
        cmdDuyet = new JButton();

        cmdHuy.setIcon(new ImageIcon(getClass().getResource("/img/imgIconQuanLyNhapHang/huy.png"))); // NOI18N
        cmdHuy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cmdHuyActionPerformed(evt);
            }
        });

        cmdDuyet.setText("Duyệt");


        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdDuyet)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmdHuy, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(cmdDuyet)
                    .addComponent(cmdHuy, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdHuyActionPerformed(ActionEvent evt) {//GEN-FIRST:event_cmdHuyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdHuyActionPerformed

    public JButton getCmdDuyet(){return cmdDuyet;}
    public JButton getCmdHuy(){return cmdHuy;}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton cmdDuyet;
    private dev.skyherobrine.app.views.dashboard.component.nutDuyetVaNutXoaDongTb.ActionButton1 cmdHuy;
    // End of variables declaration//GEN-END:variables

}
