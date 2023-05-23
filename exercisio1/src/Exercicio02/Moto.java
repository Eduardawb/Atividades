/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio02;

/**
 *
 * @author Escola
 */
public class Moto {
    private String marca;
    private String modelo;
    private int ano;

    private boolean possuiPartidaEletrica;

    public Moto() {
    }
    
    public Moto(String marca, String modelo, int ano, boolean possuiPartidaEletrica) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.possuiPartidaEletrica = possuiPartidaEletrica;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isPossuiPartidaEletrica() {
        return possuiPartidaEletrica;
    }

    public void setPossuiPartidaEletrica(boolean possuiPartidaEletrica) {
        this.possuiPartidaEletrica = possuiPartidaEletrica;
    }

    @Override
    public String toString() {
        return "Moto{" + "marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", possuiPartidaEletrica=" + possuiPartidaEletrica + '}';
    
    }
    
}
