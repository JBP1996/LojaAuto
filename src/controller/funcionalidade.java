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
import java.util.Scanner;
import model.Carro;

/**
 *
 * @author JBP1996 Atec
 */
public class funcionalidade {
    ArrayList <Pessoa> ap = Principal.ap;
    ArrayList <ContaBancaria> acb= Principal.acb;
    ArrayList <Carro> ac = Principal.ac;
       
    public void inserirPessoa(Pessoa p,ArrayList <Pessoa> ap,String nome){
        p = new Pessoa(nome);
        ap.add(p);
    }
    
    public void inserirConta(ContaBancaria cb,int pessoa,double preco,ArrayList <ContaBancaria> acb){
        cb = new ContaBancaria(acb.size(),ap.get(pessoa),preco);
        acb.add(cb);
    }
    
    public void inserirCarro(Carro c,int pessoa,String matricula,String marca,String modelo,Year ano,
        String cor,String combustivel,ArrayList <Carro> ac){
        
        c= new Carro(matricula, marca, modelo, ano, cor, combustivel, ap.get(pessoa));
        ac.add(c);
    }
}
