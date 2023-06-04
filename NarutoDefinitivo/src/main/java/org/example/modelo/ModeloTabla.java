package org.example.modelo;
import org.example.persistencia.NarutoDAO;

import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTabla implements TableModel {
    private ArrayList<PersonajesNaruto> info;
    public static final int COLS = 7;
    private NarutoDAO nDAO = new NarutoDAO();

    public ModeloTabla() {
        info = new ArrayList<>();
        nDAO = new NarutoDAO();
    }

    public ModeloTabla(ArrayList<PersonajesNaruto> info) {
        this.info = info;
        nDAO = new NarutoDAO();
    }

    @Override
    public int getRowCount() {
        return info.size();
    }

    @Override
    public int getColumnCount() {
        return COLS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String NomCol = "";
        switch (columnIndex) {
            case 0:
                NomCol = "ID";
                break;
            case 1:
                NomCol = "Nombre";
                break;
            case 2:
                NomCol = "Clan";
                break;
            case 3:
                NomCol = "Aldea";
                break;
            case 4:
                NomCol = "Kekkei";
                break;
            case 5:
                NomCol = "Rango";
                break;
            case 6:
                NomCol = "Imagen";
                break;
        }
        return NomCol;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;

            case 2:
                return String.class;

            case 3:
                return String.class;

            case 4:
                return String.class;

            case 5:
                return String.class;
            case 6:
                return String.class;
            default:
                return String.class;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        PersonajesNaruto tmp = info.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getNombre();
            case 2:
                return tmp.getClan();
            case 3:
                return tmp.getAldea();
            case 4:
                return tmp.getKekkeiGenkkai();
            case 5:
                return tmp.getRango();
            case 6:
                return tmp.getImagenUrl();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                info.get(rowIndex).setId((int) aValue);
                break;
            case 1:
                info.get(rowIndex).setNombre((String) aValue);
                break;
            case 2:
                info.get(rowIndex).setKekkeiGenkkai((String) aValue);
                break;
            case 3:
                info.get(rowIndex).setClan((String) aValue);
                break;
            case 4:
                info.get(rowIndex).setAldea((String) aValue);
                break;
            case 5:
                info.get(rowIndex).setRango((String) aValue);
                break;
            case 6:
                info.get(rowIndex).setImagenUrl((String) aValue);
                break;
        }

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    public boolean agregarPer(PersonajesNaruto per){
        boolean res = false;
        try {
            if(nDAO.insentar(per)){
                info.add(per);
                res = true;
            }else{
                res = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return  res;
    }
    public boolean modPer (PersonajesNaruto per){
        boolean res = false;
        try {
            if (nDAO.update(per)){
                res = true;
            }else{
                res = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return res;
    }
    public boolean delPersonaje (String id){
        boolean res = false;
        try {
            if (nDAO.delete(id)){
                res = true;
            }else{
                res = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return res;
    }

    public PersonajesNaruto getPerIndex(int index){
        if (index >= 0 && index < info.size()) {
            return info.get(index);
        } else {
            return null;
        }
    }
    public void cargarInfo(){
        try{
            info = nDAO.obtenerTodo();
        }catch (SQLException sqle){
            JOptionPane.showMessageDialog(null,"No se pudo obtener los datos");
        }


    }
}
