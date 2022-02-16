/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedeconocimiento;

/**
 *
 * @author calfr
 */
public class PersonaMaria {
    //Atributos
    String Nombre;
    int Sexo, Gustos;
    //Metodo
    public PersonaMaria(String _nombre, int _sexo, int _gustos){
        Nombre = _nombre;
        Sexo = _sexo;
        Gustos = _gustos;
    }
  
    public void mostrardatos(){
        System.out.println("A Maria le agrada "+Nombre);
    }

}
