/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

import java.util.ArrayList;

/**
 *
 * @author 1059237155
 */
public class Agenda {
    private String Nombre_Agenda,Id;
     ArrayList <Contacto> lscontactos;

    public Agenda() {
    }

    public Agenda(String Nombre_Agenda, String Id, ArrayList<Contacto> lscontactos) {
        this.Nombre_Agenda = Nombre_Agenda;
        this.Id = Id;
        this.lscontactos = lscontactos;
    }

    public String getNombre_Agenda() {
        return Nombre_Agenda;
    }

    public void setNombre_Agenda(String Nombre_Agenda) {
        this.Nombre_Agenda = Nombre_Agenda;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public ArrayList<Contacto> getLscontactos() {
        return lscontactos;
    }

    public void setLscontactos(ArrayList<Contacto> lscontactos) {
        this.lscontactos = lscontactos;
    }

    
     
}
