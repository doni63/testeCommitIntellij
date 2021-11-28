package br.com.dio;

import model.Gato;

public class Program {
    public static void main(String[] args) {
        /*System.out.println("Ola mundo!");
        int a = 10;
        int b = 20;
        int soma = a + b;
        System.out.println("soma: "+ soma);*/

        Gato gato = new Gato("Thor", "Branco",8);

        System.out.println(gato);
    }
}
