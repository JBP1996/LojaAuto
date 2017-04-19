/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author JBP1996 Atec
 */
public class Venda {
    private Carro carroVendido;
    private Pessoa comprador;
    private double preco;
    private String data;
    
    public Venda(Carro carroVendido, Pessoa comprador, double preco, String data) {
        this.carroVendido = carroVendido;
        this.comprador = comprador;
        this.preco = preco;
        this.data = data;
    }
    
    public Carro getCarroVendido() {
        return carroVendido;
    }

    public void setCarroVendido(Carro carroVendido) {
        this.carroVendido = carroVendido;
    }

    public Pessoa getComprador() {
        return comprador;
    }

    public void setComprador(Pessoa comprador) {
        this.comprador = comprador;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
