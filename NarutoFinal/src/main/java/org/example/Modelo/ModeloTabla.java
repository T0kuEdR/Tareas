package org.example.Modelo;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;

public class ModeloTabla implements TableModel {
    private ArrayList <PersonajesNaruto> info;
    public static final int COLS = 7;

    public ModeloTabla() {
        info = new ArrayList<>();
    }

    public ModeloTabla(ArrayList<PersonajesNaruto> info) {
        this.info = info;
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
        switch (columnIndex){
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
        switch (columnIndex ){
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
        switch (columnIndex){
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
    public void agregarPer(PersonajesNaruto per){
        info.add(per);
    }
    public PersonajesNaruto getPerIndex(int index){
        return info.get(index);
    }

}