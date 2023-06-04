package org.example;

import org.example.controlador.ControladorNaruto;
import org.example.vista.Ventana;

public class Main {
    public static void main(String[] args) {
        Ventana window = new Ventana("NarutoMVC");
        ControladorNaruto control = new ControladorNaruto(window);
    }
}