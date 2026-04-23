import java.util.LinkedList;
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
    public Queue<ObjBanco>LlenarCola(Queue<ObjBanco> c){
        boolean seguir=true;
        while (seguir) {
            ObjBanco o=new ObjBanco(0, null, null, null,false);
            System.out.println("Cual es su turno");
            o.setID(sc.nextInt());
            System.out.println("Cual es su nombre?");
            o.setNombre(sc.next());
            System.out.println("Que tipo de servicio requiere?");
            o.setTipodeServicio(sc.next());
            System.out.println("Ah que horas llego?");
            o.setHoradeLlegada(sc.next());
            o.setEstado(false);
            c.offer(o);
            System.out.println("Desea continuar agregando mas clientes? 1) si 2) no");
            int opt=sc.nextInt();
            if (opt==2) {
                seguir=false;
            }
        }   
        return c;
    }

    //METODO DE ATENDER
    public Queue<ObjBanco>AtenderCliente(Queue<ObjBanco> c){
        
        if (c.isEmpty()) {
        System.out.println("No hay clientes en la cola.");
    } else {

        ObjBanco cliente = c.poll(); 
        cliente.setEstado(true);

        System.out.println("Atendiendo cliente:");
        System.out.println("Turno: " + cliente.getID());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Servicio: " + cliente.getTipodeServicio());
        System.out.println("Hora llegada: " + cliente.getHoradeLlegada());
    }
        return c;
    }

    //METODO PARA SIGUIENTE EN LA FILA
    public void Siguienteenfila(Queue<ObjBanco>c){
        if (c.isEmpty()) {
            System.out.println("La cola esta vacia");
        }else{
            ObjBanco o=c.peek();

            System.out.println("turno: "+ o.getID());
            System.out.println("Nombre: "+ o.getNombre());
            System.out.println("Tipo de Servicio: "+ o.getTipodeServicio());
            System.out.println("Hora de llegada: "+ o.getHoradeLlegada());
            
        }
    }

    //MOSTRAR LOS QUE FALTAN
    public void LosqueFaltan(Queue<ObjBanco> c){
        if (c.isEmpty()) {
            System.out.println("esta vaciooo");

        }else{
            System.out.println("fila que hay");
            for (ObjBanco o : c) {
                System.out.println("turno: "+ o.getID());
                System.out.println("Nombre: "+ o.getNombre());
                System.out.println("Tipo de Servicio: "+ o.getTipodeServicio());
                System.out.println("Hora de llegada: "+ o.getHoradeLlegada());
            }
        }
    }

    //METODO PARA LOS ATENDIDOS Y LOS QUE NO
    public void AtendidosyNO(Queue<ObjBanco> c, Queue<ObjBanco> atendido, Queue<ObjBanco> pendientes){
        Queue<ObjBanco> atendidos = new LinkedList<>();
        if (c.isEmpty()) {
            System.out.println("no hay personas en la cola");
        }
        else{
            ObjBanco cliente= c.poll();
            cliente.setEstado(true);
            atendidos.offer(cliente);
            System.out.println(cliente.getNombre());
        }
        
        System.out.println("pendientes");
        for (ObjBanco p : pendientes) {
            System.out.println("turno: "+ p.getID());
        }
        System.out.println("atendidos");
        for (ObjBanco a : atendidos) {
            System.out.println("turno: "+ a.getID());
        }
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
