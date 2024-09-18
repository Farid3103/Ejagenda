/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Helpers.HelperImpresion;

import Logica_Negocio.Agenda;
import Logica_Negocio.Contacto;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 1059237155
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
     String Nombre,Telefono,Nombre_Agenda,Id ;
     int num_contactos=0;
     int  opc=0,rta = 0,conteo;
      ArrayList listacontactosglobal;
        Contacto objContacto;
        Agenda objAgenda;
        ArrayList<Agenda> lsagenda= new ArrayList<>();
     do{
            System.out.println("1. Registrar contactos");
            System.out.println("2. Mostrar agenda");
            System.out.println("3. Salir");
           
             do {
                try {

                    System.out.println("Digite una opcion valida");
                    opc = scan.nextInt();

                } catch (InputMismatchException e) {
                    System.out.println("Error");
                }
                scan.nextLine();
            } while (opc <= 0);
             
             
             switch(opc)
             {
                 case 1:
                     ArrayList<Contacto> listacontactoslocal= new ArrayList<>();
                      do {
                        try {

                            System.out.println("Digite el numero de contactos");
                            num_contactos = scan.nextInt();

                        } catch (InputMismatchException e) {
                            System.out.println("Error");
                        }
                        scan.nextLine();

                    } while (num_contactos <= 0);
                     
                      for (int i = 0; i < num_contactos; i++) {
                         
                          System.out.println("Digite el nombre del contacto");
                          Nombre=scan.nextLine();
                            while (rta > 0) {
                            System.out.println("Digite el nombre del contacto: ");
                            Nombre=scan.nextLine();
                            rta = Helpers.HelperValidacion.ValidarVacio(Nombre);
            }
            
                       conteo = Helpers.HelperValidacion.ValidarTodo(Nombre);

                       while (conteo != 0) {
                     System.out.println("Digite el nombre del contacto: ");
                     Nombre = scan.nextLine();
                     conteo = Helpers.HelperValidacion.ValidarTodo(Nombre);
              }
                          System.out.println("Digite el numero de celular del contacto");
                          Telefono=scan.nextLine();
                        
                            rta = Helpers.HelperValidacion.ValidarTodoLetra(Telefono);
             
            
             
              while (rta > 0) {
                System.out.println("Digite el numero de celular del contacto: ");
                Telefono=scan.nextLine();
                 rta = Helpers.HelperValidacion.ValidarTodoLetra(Telefono);
              }
                while (conteo != 0) {
                System.out.println("Digite el numero de celular  del contacto: ");
                Telefono= scan.nextLine();
                conteo = Helpers.HelperValidacion.ValidarTodoLetra(Telefono);
              }
           
                         
                          objContacto= new Contacto(Nombre,Telefono); //aqui se hace la agregacion
                          listacontactoslocal.add(objContacto);
                     }
                      listacontactosglobal=listacontactoslocal;
                      listacontactoslocal=null;
                     
                      System.out.println("Digite el nombre de la agenda");
                      Nombre_Agenda= scan.nextLine();
                       while (rta > 0) {
                            System.out.println("Digite el nombre de la agenda: ");
                            Nombre=scan.nextLine();
                            rta = Helpers.HelperValidacion.ValidarVacio(Nombre_Agenda);
            }
            
                       conteo = Helpers.HelperValidacion.ValidarTodo(Nombre_Agenda);

                       while (conteo != 0) {
                     System.out.println("Digite el nombre de la agenda: ");
                     Nombre = scan.nextLine();
                     conteo = Helpers.HelperValidacion.ValidarTodo(Nombre_Agenda);
              }
                         
             
                      System.out.println("Digite el id de la agenda");
                      Id=scan.nextLine();
                         
                            rta = Helpers.HelperValidacion.ValidarTodoLetra(Id);
             
            
             
              while (rta > 0) {
                System.out.println("Digite el id de la agenda: ");
                Id=scan.nextLine();
                 rta = Helpers.HelperValidacion.ValidarTodoLetra(Id);
              }
                while (conteo != 0) {
                System.out.println("Digite el id de la agenda: ");
                Id= scan.nextLine();
                conteo = Helpers.HelperValidacion.ValidarTodoLetra(Id);
              }
                      objAgenda= new Agenda(Nombre_Agenda,Id, listacontactosglobal);
                      lsagenda.add(objAgenda);
                     break;
                     
                 case 2:
                     HelperImpresion.ImprimirInformacionAgenda(lsagenda);
                     break;
                     
                 case 3:
                     break;
             }
           
           
        }while(opc!=3);
    }
    
}

             