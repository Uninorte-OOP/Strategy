/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import core.base.contexts.Context;
import core.base.strategies.AddStrategy;
import core.base.strategies.MultiplyStrategy;
import core.base.strategies.Strategy;

/**
 *
 * @author edangulo
 */
public class Main {
    
    public static void main(String[] args) {
        Strategy add = new AddStrategy();
        Strategy multiply = new MultiplyStrategy();
        
        Context context = new Context(add);
        int result1 = context.executeStrategy(5, 9);
        System.out.println(result1);
        
        context.setStrategy(multiply);
        int result2 = context.executeStrategy(5, 9);
        System.out.println(result2);
    }
    
}
