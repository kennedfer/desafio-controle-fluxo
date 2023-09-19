/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kennedfer.desafiocontrolefluxo.exceptions;

/**
 *
 * @author Administrator
 */
public class ParametrosInvalidosException extends RuntimeException{
    public ParametrosInvalidosException(){
        super();
        System.out.println("O segundo parâmetro deve ser maior que o primeiro");
    }
}
