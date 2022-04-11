package Ejercicio;

import javax.swing.JOptionPane;


public class Concierto {
    
    public static void main(String[] args){
        
        
        
       
        
        int TipoPersona;
        int edad;
        int NumDosis;
            
       
        
        TipoPersona=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de persona\n  1. Senior\n  2. Kids"));
        
        edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
        
        NumDosis=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de dosis"));
        
       
        
        if(TipoPersona==1 && edad>51 && NumDosis>2){
            JOptionPane.showMessageDialog(null,"El precio que debe pagar es 150.000 ");
        }
        else{
           
            if(TipoPersona==1 && edad>51 && (NumDosis==1 || NumDosis==2)  ){
                JOptionPane.showMessageDialog(null,"El precio que debe pagar es 190.000");
            }
            else{
                if(TipoPersona==1 && edad>51 && NumDosis==0){
                    JOptionPane.showMessageDialog(null,"El precio que debe pagar es 200.000");
                }
            }
        }
        
        
         
    }
    }
    
    
    


