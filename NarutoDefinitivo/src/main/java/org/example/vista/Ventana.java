package org.example.vista;
import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblKekkei;
    private JLabel lblClan;
    private JLabel lblAldea;
    private JLabel lblRango;
    private JLabel lblFoto;
    private JLabel lblEspacio1;
    private TextField txtNombre;
    private TextField txtKekkei;
    private TextField txtClan;
    private TextField txtAldea;
    private TextField txtRango;
    private TextField txtFoto;
    private Button botonAdd;
    private Button botonCargar;
    private JLabel lblNombreM;
    private JLabel lblKekkeiM;
    private JLabel lblClanM;
    private JLabel lblAldeaM;
    private JLabel lblRangoM;
    private JLabel lblFotoM;
    private JLabel lblEspacio1M;
    private TextField txtId;
    private TextField txtNombreM;
    private TextField txtKekkeiM;
    private TextField txtClanM;
    private TextField txtAldeaM;
    private TextField txtRangoM;
    private TextField txtFotoM;
    private Button botonMod;
    private Button botonDel;
    private JTable tabla;
    private JScrollPane scroll;
    private GridLayout layout;
    private JLabel imagenNaruto;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;

    public Ventana(String title) throws HeadlessException {
        this.setSize(950, 800);
        layout = new GridLayout(2, 2);
        this.getContentPane().setLayout(layout);

        //Agregar
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(212, 177, 107));

        lblId = new JLabel("ID:");
        lblNombre = new JLabel("Nombre:");
        lblKekkei = new JLabel("Kekkei Genkkai:");
        lblClan = new JLabel("Clan:");
        lblAldea = new JLabel("Aldea:");
        lblRango = new JLabel("Rango:");
        lblFoto = new JLabel("Foto");

        txtId = new TextField(3);
        txtNombre = new TextField(15);
        txtKekkei = new TextField(10);
        txtClan = new TextField(10);
        txtAldea = new TextField(10);
        txtRango = new TextField(10);
        txtFoto = new TextField(40);
        botonAdd = new Button("Agregar");
        lblEspacio1 = new JLabel("0(:3 )~ ");

        panel1.add(lblId);
        panel1.add(txtId);

        panel1.add(lblNombre);
        panel1.add(txtNombre);

        panel1.add(lblClan);
        panel1.add(txtClan);

        panel1.add(lblAldea);
        panel1.add(txtAldea);

        panel1.add(lblKekkei);
        panel1.add(txtKekkei);

        panel1.add(lblRango);
        panel1.add(txtRango);

        panel1.add(lblEspacio1);

        panel1.add(lblFoto);
        panel1.add(txtFoto);

        panel1.add(botonAdd);

        //Tabla
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(214, 214, 120));
        botonCargar = new Button("Cargar.");
        tabla = new JTable();
        scroll = new JScrollPane(tabla);
        panel2.add(botonCargar);
        panel2.add(scroll);
        //Imagen
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(41, 22, 6));
        imagenNaruto = new JLabel("");

        panel3.add(imagenNaruto);
        //Modificar
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(126, 120, 116));

        lblNombreM = new JLabel("Nombre:");
        lblKekkeiM = new JLabel("Kekkei Genkkai:");
        lblClanM = new JLabel("Clan:");
        lblAldeaM = new JLabel("Aldea:");
        lblRangoM = new JLabel("Rango:");
        lblFotoM = new JLabel("Foto");
        txtNombreM = new TextField(15);
        txtKekkeiM = new TextField(10);
        txtClanM = new TextField(10);
        txtAldeaM = new TextField(10);
        txtRangoM = new TextField(10);
        txtFotoM = new TextField(40);
        botonMod = new Button("Modificar");
        botonDel = new Button("Borrar");
        lblEspacio1M = new JLabel("0(:3 )~                     ");


        panel4.add(lblNombreM);
        panel4.add(txtNombreM);

        panel4.add(lblClanM);
        panel4.add(txtClanM);

        panel4.add(lblAldeaM);
        panel4.add(txtAldeaM);

        panel4.add(lblKekkeiM);
        panel4.add(txtKekkeiM);

        panel4.add(lblRangoM);
        panel4.add(txtRangoM);

        panel4.add(lblEspacio1M);

        panel4.add(lblFotoM);
        panel4.add(txtFotoM);

        panel4.add(botonMod);
        panel4.add(botonDel);

        this.getContentPane().add(panel1, 0);
        this.getContentPane().add(panel2, 1);
        this.getContentPane().add(panel3, 2);
        this.getContentPane().add(panel4, 3);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JLabel getLblKekkei() {
        return lblKekkei;
    }

    public void setLblKekkei(JLabel lblKekkei) {
        this.lblKekkei = lblKekkei;
    }

    public JLabel getLblClan() {
        return lblClan;
    }

    public void setLblClan(JLabel lblClan) {
        this.lblClan = lblClan;
    }

    public JLabel getLblAldea() {
        return lblAldea;
    }

    public void setLblAldea(JLabel lblAldea) {
        this.lblAldea = lblAldea;
    }

    public JLabel getLblRango() {
        return lblRango;
    }

    public void setLblRango(JLabel lblRango) {
        this.lblRango = lblRango;
    }

    public JLabel getLblFoto() {
        return lblFoto;
    }

    public void setLblFoto(JLabel lblFoto) {
        this.lblFoto = lblFoto;
    }

    public JLabel getLblEspacio1() {
        return lblEspacio1;
    }

    public void setLblEspacio1(JLabel lblEspacio1) {
        this.lblEspacio1 = lblEspacio1;
    }

    public TextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(TextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public TextField getTxtKekkei() {
        return txtKekkei;
    }

    public void setTxtKekkei(TextField txtKekkei) {
        this.txtKekkei = txtKekkei;
    }

    public TextField getTxtClan() {
        return txtClan;
    }

    public void setTxtClan(TextField txtClan) {
        this.txtClan = txtClan;
    }

    public TextField getTxtAldea() {
        return txtAldea;
    }

    public void setTxtAldea(TextField txtAldea) {
        this.txtAldea = txtAldea;
    }

    public TextField getTxtRango() {
        return txtRango;
    }

    public void setTxtRango(TextField txtRango) {
        this.txtRango = txtRango;
    }

    public TextField getTxtFoto() {
        return txtFoto;
    }

    public void setTxtFoto(TextField txtFoto) {
        this.txtFoto = txtFoto;
    }

    public Button getBotonAdd() {
        return botonAdd;
    }

    public void setBotonAdd(Button botonAdd) {
        this.botonAdd = botonAdd;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JLabel getImagenNaruto() {
        return imagenNaruto;
    }

    public void setImagenNaruto(JLabel imagenNaruto) {
        this.imagenNaruto = imagenNaruto;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    public JLabel getLblNombreM() {
        return lblNombreM;
    }

    public void setLblNombreM(JLabel lblNombreM) {
        this.lblNombreM = lblNombreM;
    }

    public JLabel getLblKekkeiM() {
        return lblKekkeiM;
    }

    public void setLblKekkeiM(JLabel lblKekkeiM) {
        this.lblKekkeiM = lblKekkeiM;
    }

    public JLabel getLblClanM() {
        return lblClanM;
    }

    public void setLblClanM(JLabel lblClanM) {
        this.lblClanM = lblClanM;
    }

    public JLabel getLblAldeaM() {
        return lblAldeaM;
    }

    public void setLblAldeaM(JLabel lblAldeaM) {
        this.lblAldeaM = lblAldeaM;
    }

    public JLabel getLblRangoM() {
        return lblRangoM;
    }

    public void setLblRangoM(JLabel lblRangoM) {
        this.lblRangoM = lblRangoM;
    }

    public JLabel getLblFotoM() {
        return lblFotoM;
    }

    public void setLblFotoM(JLabel lblFotoM) {
        this.lblFotoM = lblFotoM;
    }

    public JLabel getLblEspacio1M() {
        return lblEspacio1M;
    }

    public void setLblEspacio1M(JLabel lblEspacio1M) {
        this.lblEspacio1M = lblEspacio1M;
    }

    public TextField getTxtNombreM() {
        return txtNombreM;
    }

    public void setTxtNombreM(TextField txtNombreM) {
        this.txtNombreM = txtNombreM;
    }

    public TextField getTxtKekkeiM() {
        return txtKekkeiM;
    }

    public void setTxtKekkeiM(TextField txtKekkeiM) {
        this.txtKekkeiM = txtKekkeiM;
    }

    public TextField getTxtClanM() {
        return txtClanM;
    }

    public void setTxtClanM(TextField txtClanM) {
        this.txtClanM = txtClanM;
    }

    public TextField getTxtAldeaM() {
        return txtAldeaM;
    }

    public void setTxtAldeaM(TextField txtAldeaM) {
        this.txtAldeaM = txtAldeaM;
    }

    public TextField getTxtRangoM() {
        return txtRangoM;
    }

    public void setTxtRangoM(TextField txtRangoM) {
        this.txtRangoM = txtRangoM;
    }

    public TextField getTxtFotoM() {
        return txtFotoM;
    }

    public void setTxtFotoM(TextField txtFotoM) {
        this.txtFotoM = txtFotoM;
    }

    public Button getBotonMod() {
        return botonMod;
    }

    public void setBotonMod(Button botonMod) {
        this.botonMod = botonMod;
    }

    public Button getBotonCargar() {
        return botonCargar;
    }

    public void setBotonCargar(Button botonCargar) {
        this.botonCargar = botonCargar;
    }

    public JLabel getLblIdd() {
        return lblId;
    }

    public void setLblIdd(JLabel id) {
        this.lblId = id;
    }

    public TextField getTxtId() {
        return txtId;
    }

    public void setTxtId(TextField txtId) {
        this.txtId = txtId;
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public Button getBotonDel() {
        return botonDel;
    }

    public void setBotonDel(Button botonDel) {
        this.botonDel = botonDel;
    }
}
