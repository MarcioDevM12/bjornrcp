package com.example.bjornrcp;

public class Coleta {

    String nome;
    String material;
    String peso;

    public Coleta(String nome, String material, String peso) {
        this.nome = nome;
        this.material = material;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public String getMaterial() {
        return material;
    }

    public String getPeso() {
        return peso;
    }
}