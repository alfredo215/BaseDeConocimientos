/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedeconocimiento;

import javax.swing.Spring;

/**
 *
 * @author calfr
 */
public class BaseDeConocimiento {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     //Sexo Hombre = 1 Mujer = 0    
     //Bailar = 1   Comer = 0
     //Nombre , Sexo, Comer o Bailar
    PersonaMaria p1 = new PersonaMaria("Pedro", 1, 1);
    PersonaMaria p2 = new PersonaMaria("Luis", 1, 1);
    PersonaMaria p3 = new PersonaMaria("Juan", 1, 0);
    PersonaMaria p4 = new PersonaMaria("Mateo", 1, 0);
    PersonaMaria p5 = new PersonaMaria("Maria", 0, 0);
    PersonaMaria p6 = new PersonaMaria("Ana", 0, 0);
    
    // le agrada hombre y bailar
    //Persona 1
        if (p1.Sexo == 1 && p1.Gustos == 1) {
            p1.mostrardatos();
 //Persona 2
        }if (p2.Sexo == 1 && p2.Gustos == 1 ) {
             p2.mostrardatos();
             //Persona 3
        }if (p3.Sexo == 1 && p3.Gustos == 1) {
            p3.mostrardatos();
 //Persona 4
        }if (p4.Sexo == 1 && p4.Gustos == 1 ) {
             p4.mostrardatos();
             //Persona 5
        }if (p5.Sexo == 1 && p5.Gustos == 1) {
            p5.mostrardatos();
 //Persona 6
        }if (p6.Sexo == 1 && p6.Gustos == 1 ) {
             p6.mostrardatos();
        }
        
      /*  // le agrada hombre y comer
    //Persona 1
        if (p1.Sexo == 1 && p1.Gustos == 0) {
            p1.mostrardatos();
 //Persona 2
        }if (p2.Sexo == 1 && p2.Gustos == 0 ) {
             p2.mostrardatos();
             //Persona 3
        }if (p3.Sexo == 1 && p3.Gustos == 0) {
            p3.mostrardatos();
 //Persona 4
        }if (p4.Sexo == 1 && p4.Gustos == 0 ) {
             p4.mostrardatos();
             //Persona 5
        }if (p5.Sexo == 1 && p5.Gustos == 0) {
            p5.mostrardatos();
 //Persona 6
        }if (p6.Sexo == 1 && p6.Gustos == 0 ) {
             p6.mostrardatos();
        }
       */
       /*  // le agrada Mujer y Bailar
    //Persona 1
        if (p1.Sexo == 0 && p1.Gustos == 1) {
            p1.mostrardatos();
 //Persona 2
        }if (p2.Sexo == 0 && p2.Gustos == 1 ) {
             p2.mostrardatos();
             //Persona 3
        }if (p3.Sexo == 0 && p3.Gustos == 1) {
            p3.mostrardatos();
 //Persona 4
        }if (p4.Sexo == 0 && p4.Gustos == 1 ) {
             p4.mostrardatos();
             //Persona 5
        }if (p5.Sexo == 0 && p5.Gustos == 1) {
            p5.mostrardatos();
 //Persona 6
        }if (p6.Sexo == 0 && p6.Gustos == 1 ) {
             p6.mostrardatos();
        }
       */
        /*  // le agrada mujer y comer
    //Persona 1
        if (p1.Sexo == 0 && p1.Gustos == 0) {
            p1.mostrardatos();
 //Persona 2
        }if (p2.Sexo == 0 && p2.Gustos == 0 ) {
             p2.mostrardatos();
             //Persona 3
        }if (p3.Sexo == 0 && p3.Gustos == 0) {
            p3.mostrardatos();
 //Persona 4
        }if (p4.Sexo == 0 && p4.Gustos == 0 ) {
             p4.mostrardatos();
             //Persona 5
        }if (p5.Sexo == 0 && p5.Gustos == 0) {
            p5.mostrardatos();
 //Persona 6
        }if (p6.Sexo == 0 && p6.Gustos == 0 ) {
             p6.mostrardatos();
        }
       */

    }
    
}
