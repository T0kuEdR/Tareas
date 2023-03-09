package Fes.ICO;

import java.awt.*;

public class Balon {
    private String tipo;
    private String tamanno;
    private Color color;

    public Balon(String tipo) {
        this.tipo = tipo;
    }

    public Balon(Color color) {
        this.color = color;
    }

    public Balon(String tipo, String tamanno, Color color) {
        this.tipo = tipo;
        this.tamanno = tamanno;
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanno() {
        return tamanno;
    }

    public void setTamanno(String tamanno) {
        this.tamanno = tamanno;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Balon{" +
                "tipo='" + tipo + '\'' +
                ", tamanno='" + tamanno + '\'' +
                ", color=" + color +
                '}';
    }

    public void botando(){
        System.out.println("El balon esta botando");
    }
    public void rodando(){
        System.out.println("El balon esta rodando;");
    }
    public void quieto(){
        System.out.println("El balon esta quieto");
    }
}
