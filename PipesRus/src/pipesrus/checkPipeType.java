/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipesrus;

/**
 *
 * @author up746804
 */
public class checkPipeType extends Pipetype {
    public checkPipeType(double ln , double in, int co, int qty, int gr, String insu, String rein, String ch){
        lengthInch= ln;
        innerRadius = in;
        colour = co;
        quantity = qty; 
        grade = gr;
        insulations = insu;
        reinforcements = rein;
        chemicals = ch;
    }
   public double getLength(){
       return lengthInch; 
    }
    public double getInner(){
        return innerRadius;
    }
    public int getColour(){
        return colour;
    }
    public int getQuantity(){
        return quantity;
    }               
    public int getGrade(){
        return grade;
    }
    public String getInsulations(){
        return insulations;
    }
    public String getReinforcements(){
       return reinforcements;
    }
    public String getChemicals(){
        return chemicals;
    }
   
       
       
   }
    

