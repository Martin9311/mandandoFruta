package com.company;
//Crear la clase Coca que tenga como atributos un tamaño (Integer) y precio (Double).
//2. Definir un constructor para la clase Coca que reciba como parámetro el tamaño y el precio.
//3. En la clase Main, crear dos cocas con el mismo tamaño.
//4. Comparar utilizando equals si la primer coca creada es igual a la segunda. ¿Cuál es su resultado?
//5. Sobreescribir el equals de la clase Coca, para que solo compare el tamaño.
//6. Realizar nuevamente la comparación utilizando el equals. ¿Cuál es su resultado? ¿Qué cambió? ¿Por qué?
public class Coca {

private Integer tamaño;
private Double precio;

    public Coca(Integer tamaño, Double precio) {
        this.tamaño = tamaño;
        this.precio = precio;
    }

    public Integer getTamaño() {
        return tamaño;
    }


    // @Override
    //    public boolean equals(Object obj) {
    //        Persona otraPersona = (Persona) obj;
    //        return this.dni.equals(otraPersona.getdni());


    @Override
    public boolean equals(Object obj) {
        Coca otraCoca = (Coca)obj;
        return this.tamaño.equals(otraCoca.getTamaño());
    }
}
