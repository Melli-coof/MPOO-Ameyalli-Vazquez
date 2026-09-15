import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Resultadoss {

   static class PilaDinamica {

        private double[] elementos;
        private int cima;

        public PilaDinamica(int capacidadInicial) {
            this.elementos = new double[capacidadInicial];
            this.cima = 0; 
        }

        public void push(double valor) {
            if (this.cima == this.elementos.length) {
                ampliarCapacidad();
            }
            this.elementos[this.cima] = valor;
            this.cima++;
        }

        public double pop() {
            if (isEmpty()) {
                return Double.NaN;
            }
            this.cima--;
            return this.elementos[this.cima];
        }

        public double peek() {
            if (isEmpty()) {
                return Double.NaN;
            }
            return this.elementos[this.cima - 1];
        }

        public boolean isEmpty() {
            return this.cima == 0;
        }

        public int size() {
            return this.cima;
        }

        public int capacity() {
            return this.elementos.length;
        }

        private void ampliarCapacidad() {
            double[] nuevoArreglo = new double[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                nuevoArreglo[i] = this.elementos[i];
            }
            this.elementos = nuevoArreglo;
        }
    }
}
 

