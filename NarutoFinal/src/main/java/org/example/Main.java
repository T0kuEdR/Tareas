package org.example;

import org.example.Vista.Ventana;
import org.example.Controlador.ControladorNaruto;
public class Main {
    public static void main(String[] args) {
        Ventana window = new Ventana("Naruto");
        ControladorNaruto control = new ControladorNaruto(window);
    }
}