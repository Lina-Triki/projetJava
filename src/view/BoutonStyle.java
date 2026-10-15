package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class BoutonStyle extends JButton {
    private static final Color PRIMARY_COLOR = new Color(30, 136, 229);
    private static final Color HOVER_COLOR = new Color(25, 118, 210);

    public BoutonStyle(String texte) {
        super(texte);
        setBackground(PRIMARY_COLOR);
        setForeground(Color.WHITE);
        setFont(new Font("Segoe UI", Font.BOLD, 16));
        setFocusPainted(false);
        setBorderPainted(false);
        setContentAreaFilled(true);
        setBorder(BorderFactory.createEmptyBorder(12, 24, 12, 24));
        setPreferredSize(new Dimension(280, 50));
        setCursor(new Cursor(Cursor.HAND_CURSOR));

        addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                setBackground(HOVER_COLOR);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                setBackground(PRIMARY_COLOR);
            }
        });
    }
}
