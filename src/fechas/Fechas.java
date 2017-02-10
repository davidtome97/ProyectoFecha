/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author 203p21
 */
public class Fechas { 
        int dia;
        int mes;
        int ano; 

    public Fechas(int dias, int mes, int ano) {
        this.dia = dias;
        this.mes = mes;
        this.ano = ano;
    }
        
    public Fechas(){
        Calendar c=new GregorianCalendar();
        dia=c.get(Calendar.DAY_OF_MONTH);
        mes=c.get(Calendar.MONTH);
        ano=c.get(Calendar.YEAR);
    }    
        
    
}
