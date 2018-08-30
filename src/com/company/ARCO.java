package com.company;

public class ARCO {
private String color;
private double precio;

    public ARCO(String rojo, double precio) {
        this.precio = precio;
    }

    public ARCO(String color) {
        this.color = color;

    }

    public double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void disparar (String flecha){
        System.out.println(flecha);
    }

    @Override
    public boolean equals(Object obj) {
        ARCO otroarco = (ARCO) obj;
        return this.color.equals(otroarco.getColor());
    }
}

