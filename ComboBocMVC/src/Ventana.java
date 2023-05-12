import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Ventana extends JFrame {
    private JLabel lblNombre;
    private TextField txtNombre;
    private JButton boton;
    private JComboBox combo;
    private ModeloNombreCombo modelo;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(400,400);
        setLayout(new FlowLayout());
        lblNombre = new JLabel("Ingresar nombre:");
        this.getContentPane().add(lblNombre);
        txtNombre = new TextField(30);
        this.getContentPane().add(txtNombre);
        boton = new JButton("Agregar.");
        this.getContentPane().add(boton);
        //modelo

        modelo = new ModeloNombreCombo();
        modelo.agregarNombre("Diana");
        modelo.agregarNombre("Diego");
        modelo.agregarNombre("Suana");
        combo = new JComboBox<>(modelo);
        this.getContentPane().add(combo);

        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String nuevo = txtNombre.getText();
                modelo.agregarNombre(nuevo);
                txtNombre.setText("");
            }
        });

        combo.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(combo.getSelectedIndex());
                System.out.println(combo.getSelectedItem());
                JOptionPane.showMessageDialog(null, "Hola " + combo.getSelectedItem());
            }
        });
    }
}
