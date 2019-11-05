/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipesrus;

/**
 *
 * @author Aseged
 */
public abstract class Pipetype {
    public Pipetype(){
        
    }
     int type1colour = 0, type2colour = 1, type3colour = 2, type4colour = 2, type5colour = 2;
        String type1insulations = "No", type2insulations = "No", type3insulations = "No", type4insulations = "Yes", type5insulations = "Yes";
        String type1Reinforcements = "No", type2Reinforcements = "No", type3Reinforcements = "No", type4Reinforcements = "No", type5Reinforcements = "Yes";
        double lengthInch,innerRadius;
        int quantity, grade, colour;
        String insulations,reinforcements,chemicals; 
    
    public void type1(int colour, String insulations, String Reinforcements){
        colour = 0;
        insulations = "No";
        Reinforcements = "No";
        
    }
     public void type2(int colour, String insulations, String Reinforcements){
        colour = 1;
        insulations = "No";
        Reinforcements = "No";
    }
    public void type3(int colour, String insulations, String Reinforcements){
        colour = 2;
        insulations = "No";
        Reinforcements = "No";
    }
    public void type4(int colour, String insulations,String Reinforcements){
        colour = 2;
        insulations = "Yes";
        Reinforcements = "No";
    }
    public void type5(int colour, String insulations, String Reinforcements){
        colour = 2;
        insulations = "Yes";
        Reinforcements = "Yes";
        
    }
    public Pipetype(double ln , double in, int co, int qty, int gr, String insu, String rein, String ch){
        lengthInch=ln;
        innerRadius = in;
        colour = co;
        quantity = qty; 
        grade = gr;
        insulations = insu;
        reinforcements = rein;
        chemicals = ch;
    }
    public void setLength(double ln){
        lengthInch=ln; 
    }
    public void setInner(double in){
        innerRadius = in;
    }
    public void setColour(int co){
        colour = co;
    }
    public void setQuantity(int qty){
        quantity = qty;
    }               
    public void setGrade(int gr){
        grade = gr;
    }
    public void setInsulations(String insu){
        insulations = insu;
    }
    public void setReinforcements(String rein){
        reinforcements = rein;
    }
    public void setChemicals(String ch){
        chemicals = ch;
    }
 
}
