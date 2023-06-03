package org.example.Controlador;


import org.example.Modelo.ModeloTabla;
import org.example.Modelo.PersonajesNaruto;
import org.example.Vista.Ventana;

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
        modelo = new ModeloTabla();
        this.vista.getTabla().setModel(modelo);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == vista.getBotonAdd()){

            PersonajesNaruto per = new PersonajesNaruto();
            try {
                per.setId(Integer.parseInt(this.vista.getTxtId().getText()));

                per.setNombre(this.vista.getTxtNombre().getText());
                per.setKekkeiGenkkai(this.vista.getTxtKekkei().getText());
                per.setClan(this.vista.getTxtClan().getText());
                per.setAldea(this.vista.getTxtAldea().getText());
                per.setRango(this.vista.getTxtRango().getText());
                per.setImagenUrl(this.vista.getTxtFoto().getText());
                this.vista.getTabla().updateUI();
                modelo.agregarPer(per);
            }catch (NumberFormatException nfe){
                JOptionPane.showMessageDialog(null,"Datos Invalidos :C");
            }

            this.vista.getTxtNombre().setText("");
            this.vista.getTxtKekkei().setText("");
            this.vista.getTxtClan().setText("");
            this.vista.getTxtAldea().setText("");
            this.vista.getTxtRango().setText("");
            this.vista.getTxtFoto().setText("");
            this.vista.getTxtId().setText("");

        }
        if (e.getSource() == vista.getTabla()){
            System.out.println("Tabla");
            int index = this.vista.getTabla().getSelectedRow();

            PersonajesNaruto tmp = modelo.getPerIndex(index);

            try {
                this.vista.getImagenNaruto().setIcon(tmp.getImagen());

            }catch (MalformedURLException mfue){
                JOptionPane.showMessageDialog(null,"La imagen no se puede mostrar :c");
            }

            vista.getTxtNombreM().setText(tmp.getNombre());
            vista.getTxtClanM().setText(tmp.getClan());
            vista.getTxtAldeaM().setText(tmp.getAldea());
            vista.getTxtKekkeiM().setText(tmp.getKekkeiGenkkai());
            vista.getTxtRangoM().setText(tmp.getRango());
            vista.getTxtFotoM().setText(tmp.getImagenUrl());
        }
        if (e.getSource() == vista.getBotonMod()){
            int renglon = vista.getTabla().getSelectedRow();
            PersonajesNaruto perMod = modelo.getPerIndex(renglon);

            perMod.setNombre(this.vista.getTxtNombreM().getText());
            perMod.setClan(this.vista.getTxtClanM().getText());
            perMod.setAldea(this.vista.getTxtAldeaM().getText());
            perMod.setKekkeiGenkkai(this.vista.getTxtKekkeiM().getText());
            perMod.setRango(this.vista.getTxtRangoM().getText());
            perMod.setImagenUrl(this.vista.getTxtFotoM().getText());
            this.vista.getTabla().updateUI();

            this.vista.getTxtNombreM().setText("");
            this.vista.getTxtKekkeiM().setText("");
            this.vista.getTxtClanM().setText("");
            this.vista.getTxtAldeaM().setText("");
            this.vista.getTxtRangoM().setText("");
            this.vista.getTxtFotoM().setText("");

        }
        if (e.getSource() == vista.getBotonDel()){
            int renglon = vista.getTabla().getSelectedRow();
            PersonajesNaruto perDel = modelo.getPerIndex(renglon);
            perDel.setNombre(null);
            perDel.setClan(null);
            perDel.setAldea(null);
            perDel.setKekkeiGenkkai(null);
            perDel.setRango(null);
            perDel.setImagenUrl(null);
            this.vista.getTabla().updateUI();
        }
    }
}