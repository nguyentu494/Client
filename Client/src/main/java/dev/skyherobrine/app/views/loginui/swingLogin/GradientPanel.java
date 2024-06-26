package dev.skyherobrine.app.views.loginui.swingLogin;

import javax.swing.*;
import java.awt.*;

public class GradientPanel extends JPanel {

    public GradientPanel() {
        setOpaque(false);
    }

    @Override
    public void paint(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setPaint(new GradientPaint(0, 0, new Color(18, 99, 63), 0, getWidth(), new Color(43, 141, 98)));
        g2.fillRect(0, 0, getWidth(), getHeight());
        g2.dispose();
        super.paint(grphcs);
    }
}
