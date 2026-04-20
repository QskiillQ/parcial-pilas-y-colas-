import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class metodos {
    Scanner sc=new Scanner(System.in);




    //METODO DE LLENAR PILA 
    public Stack<ObjNavegador>LlenarPila(Stack<ObjNavegador> l){
        boolean seguir=true;

        
        while (seguir) {
            ObjNavegador o=new ObjNavegador(null, null, null);

            System.out.println("Cual es la Url de la Pagina que visito");
            o.setUrl(sc.next());
            
            System.out.println("Ingrese cual es el titulo de la pagina que visito");
            o.setTitulo(sc.next());
            
            System.out.println("Cual es la fecha en la que accedio a esa pagina");
            o.setFechadeAcceso(sc.next());
            
            l.push(o);

            System.out.println("Desea continuar agregando mas objetos? 1) si 2) no");
            int opt=sc.nextInt();
            if (opt==2) {
                seguir=false;
            }
        }   
        return l;
    }

    //METODO DE LLENAR COLA 
    public Queue<ObjNavegador>LlenarCola(Queue<ObjNavegador> C){
        boolean seguir=true;

        
        while (seguir) {
            ObjNavegador o=new ObjNavegador(null, null, null);

            System.out.println("Cual es la Url de la Pagina que visito");
            o.setUrl(sc.next());
            
            System.out.println("Ingrese cual es el titulo de la pagina que visito");
            o.setTitulo(sc.next());
            
            System.out.println("Cual es la fecha en la que accedio a esa pagina");
            o.setFechadeAcceso(sc.next());
            
            l.push(o);

            System.out.println("Desea continuar agregando mas objetos? 1) si 2) no");
            int opt=sc.nextInt();
            if (opt==2) {
                seguir=false;
            }
        }   
        return l;
    }


    //METODO DE INGRESAR UNA NUEVA PAGINA 
    public Stack<ObjNavegador>AgregarPila(Stack<ObjNavegador> l){
        ObjNavegador o=new ObjNavegador(null, null, null);
        boolean seguir=true;
        while (seguir) {
            System.out.println("Cual es la Url de la Pagina que visito recientemenete ");
            o.setUrl(sc.next());
            
            System.out.println("Ingrese cual es el titulo de la pagina que visito recientemente ");
            o.setTitulo(sc.next());
            
            System.out.println("Cual es la fecha en la que accedio a esa pagina recientemente");
            o.setFechadeAcceso(sc.next());
            
            l.push(o);
            System.out.println("Desea continuar agregando mas objetos? 1) si 2) no");
            int opt=sc.nextInt();
            if (opt==2) {
                seguir=false;
            }
        }
            
        return l;
    }

    //METODO DE ELIMINAR EL PRIMER ELEMENTO DE LA PILA
    public Stack<ObjNavegador> EliminarPila(Stack<ObjNavegador> l){
        if (l.empty()) {
            System.out.println("la pila esta vacia llenela");
        }
        else{
            l.pop();
        }
        return l;
    }

    //METODO DE MOSTRAR PILA
    public void MostrarPila(Stack<ObjNavegador> l){
        for (ObjNavegador o : l) {
            System.out.println("url: "+ o.getUrl());
            System.out.println("Titulo: "+ o.getTitulo());
            System.out.println("Fecha: "+ o.getFechadeAcceso());
            System.out.println("______________________________________");
        }
    }
}
