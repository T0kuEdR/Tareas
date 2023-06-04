package org.example.controlador;

import org.example.modelo.ModeloTabla;
import org.example.modelo.PersonajesNaruto;
import org.example.vista.Ventana;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;

public class ControladorNaruto extends MouseAdapter {
    private Ventana vista;
    private ModeloTabla modelo;

    public ControladorNaruto(Ventana vista) {
        this.vista = vista;
        this.vista.getBotonAdd().addMouseListener(this);
        this.vista.getTabla().addMouseListener(this);
        this.vista.getBotonMod().addMouseListener(this);
        this.vista.getBotonDel().addMouseListener(this);
        this.vista.getBotonCargar().addMouseListener(this);
        modelo = new ModeloTabla();
        this.vista.getTabla().setModel(modelo);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == vista.getBotonAdd()) {

            PersonajesNaruto per = new PersonajesNaruto();
            try {
                per.setId(Integer.valueOf(this.vista.getTxtId().getText()));
                per.setNombre(this.vista.getTxtNombre().getText());
                per.setClan(this.vista.getTxtClan().getText());
                per.setAldea(this.vista.getTxtAldea().getText());
                per.setKekkeiGenkkai(this.vista.getTxtKekkei().getText());
                per.setRango(this.vista.getTxtRango().getText());
                per.setImagenUrl(this.vista.getTxtFoto().getText());
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Datos Invalidos :C");

            }
            if (modelo.agregarPer(per)) {
                JOptionPane.showMessageDialog(vista, "Se agrego c:", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                this.vista.getTabla().updateUI();
            } else {
                JOptionPane.showMessageDialog(vista, "Algo hiciste mal bro...", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
            this.vista.getTabla().updateUI();
            this.vista.getTxtId().setText("");
            this.vista.getTxtNombre().setText("");
            this.vista.getTxtClan().setText("");
            this.vista.getTxtAldea().setText("");
            this.vista.getTxtKekkei().setText("");
            this.vista.getTxtRango().setText("");
            this.vista.getTxtFoto().setText("");
            this.vista.getTxtId().setText("");


        }
        if (e.getSource() == vista.getBotonCargar()) {
            System.out.println("cargar");
            modelo = new ModeloTabla();
            modelo.cargarInfo();
            this.vista.getTabla().setModel(modelo);
            this.vista.getTabla().updateUI();
        }
        if (e.getSource() == vista.getTabla()) {
            int index = this.vista.getTabla().getSelectedRow();
            PersonajesNaruto tmp = modelo.getPerIndex(index);
            try {
                this.vista.getImagenNaruto().setIcon(tmp.getImagen());

            } catch (MalformedURLException mfue) {
                JOptionPane.showMessageDialog(null, "La imagen no se puede mostrar :c");
            }
            vista.getTxtNombreM().setText(tmp.getNombre());
            vista.getTxtClanM().setText(tmp.getClan());
            vista.getTxtAldeaM().setText(tmp.getAldea());
            vista.getTxtKekkeiM().setText(tmp.getKekkeiGenkkai());
            vista.getTxtRangoM().setText(tmp.getRango());
            vista.getTxtFotoM().setText(tmp.getImagenUrl());
        }
        if (e.getSource() == vista.getBotonMod()) {
            int renglon = vista.getTabla().getSelectedRow();
            PersonajesNaruto perMod = modelo.getPerIndex(renglon);

            perMod.setNombre(this.vista.getTxtNombreM().getText());
            perMod.setClan(this.vista.getTxtClanM().getText());
            perMod.setAldea(this.vista.getTxtAldeaM().getText());
            perMod.setKekkeiGenkkai(this.vista.getTxtKekkeiM().getText());
            perMod.setRango(this.vista.getTxtRangoM().getText());
            perMod.setImagenUrl(this.vista.getTxtFotoM().getText());

            if (modelo.modPer(perMod)) {
                JOptionPane.showMessageDialog(vista, "Se modifico correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                this.vista.getTabla().updateUI();
            } else {
                JOptionPane.showMessageDialog(vista, "Te fallo bro....", "Aviso", JOptionPane.ERROR_MESSAGE);
            }

            this.vista.getTxtNombreM().setText("");
            this.vista.getTxtKekkeiM().setText("");
            this.vista.getTxtClanM().setText("");
            this.vista.getTxtAldeaM().setText("");
            this.vista.getTxtRangoM().setText("");
            this.vista.getTxtFotoM().setText("");

        }
        if (e.getSource() == vista.getBotonDel()) {
            ModeloTabla tabla = new ModeloTabla();
            int index = this.vista.getTabla().getSelectedRow();
            PersonajesNaruto perNar = modelo.getPerIndex(index);
            if (tabla.delPersonaje(Integer.toString(perNar.getId()))) {
                JOptionPane.showMessageDialog(vista, "Se elimino sin problemas", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                this.vista.getTabla().updateUI();
            } else {
                JOptionPane.showMessageDialog(vista, "Te fallo bro....", "Aviso", JOptionPane.ERROR_MESSAGE);
            }


            this.vista.getTxtNombreM().setText("");
            this.vista.getTxtKekkeiM().setText("");
            this.vista.getTxtClanM().setText("");
            this.vista.getTxtAldeaM().setText("");
            this.vista.getTxtRangoM().setText("");
            this.vista.getTxtFotoM().setText("");

        }
}
}

