package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.time.Year;
import lojaAuto.Principal;
import model.ContaBancaria;
import model.Pessoa;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import model.Carro;
import model.Venda;

/**
 *
 * @author JBP1996 Atec
 */
public class funcionalidade {
    ArrayList <Pessoa> ap = Principal.ap;
    ArrayList <ContaBancaria> acb= Principal.acb;
    ArrayList <Carro> ac = Principal.ac;
    ArrayList <Venda> av = Principal.av;
       
    public void inserirPessoa(Pessoa p,ArrayList <Pessoa> ap,String nome){
        p = new Pessoa(nome);
        ap.add(p);
    }
    
    public void inserirConta(ContaBancaria cb,int pessoa,double preco,ArrayList <ContaBancaria> acb){
        cb = new ContaBancaria(acb.size(),ap.get(pessoa),preco);
        acb.add(cb);
    }
    
    public void inserirCarro(Carro c,int pessoa,String matricula,String marca,String modelo,int ano,
        String cor,String combustivel,double preco,ArrayList <Carro> ac){
        
        c= new Carro(matricula, marca, modelo, ano, cor, combustivel,preco, ap.get(pessoa));
        ac.add(c);
    }
    
    public void inserirVenda(Carro carro, Pessoa pessoa,double preco,Date data){
        Venda v = new Venda(carro,pessoa,preco,data);
        av.add(v);
    }
    
    /*
    public void inserirVenda(Carro carro, Pessoa pessoa,double preco,String data){
        Venda v = new Venda(carro,pessoa,preco,data);
        av.add(v);
    }
    */
}
