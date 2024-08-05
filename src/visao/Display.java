package visao;

import modelo.Memoria;
import modelo.MemoriaObserver;

import javax.swing.*;
import java.awt.*;

public class Display extends JPanel implements MemoriaObserver {

    private JLabel textoPainel;

    public Display() {
        Memoria.getIsntancia().adicionarObserver(this);

        setBackground(new Color(46,49,50));
        textoPainel = new JLabel(Memoria.getIsntancia().getTextoAtual());
        textoPainel.setForeground(Color.WHITE);
        textoPainel.setFont(new Font("courier", Font.PLAIN, 50));

        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 45));

        add(textoPainel);
    }

    @Override
    public void valorAlterado(String novoValor) {
        textoPainel.setText(novoValor);
    }
}
