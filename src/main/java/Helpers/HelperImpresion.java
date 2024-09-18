/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import Logica_Negocio.Agenda;
import java.util.ArrayList;

/**
 *
 * @author 1059237155
 */
public class HelperImpresion {
     public static void ImprimirInformacionAgenda(ArrayList<Agenda> lsagenda) {
        for (int i = 0; i < lsagenda.size(); i++) {
            System.out.println("El nombre de la agenda es:" + "\t" + lsagenda.get(i).getNombre_Agenda());
            System.out.println("El id de la agenda es: "+ "\t" +lsagenda.get(i).getId());
            
            for (int j = 0; j < lsagenda.get(i).getLscontactos().size(); j++) {
                 System.out.println("El nombre del contacto es:" + "\t" + lsagenda.get(i).getLscontactos().get(j).getTelefono());
                System.out.println("El telefono del contacto es:" + "\t" + "+57"+lsagenda.get(i).getLscontactos().get(j).getNombre());
                
            }
               
                
            }

             
            }
        }

    

   


