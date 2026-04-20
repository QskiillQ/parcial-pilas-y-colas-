import java.util.Scanner;
import java.util.Stack;

public class menu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int elegir, optc,optp;
        metodos m=new metodos();
        Stack<ObjNavegador> pila=new Stack<>();
        boolean seguir=true, secuenciap=true;
        while (seguir) {

            System.out.println("Que deseas hacer? 1)Pilas 2)Colas");
            elegir =sc.nextInt();
            if(elegir==1){
                while (secuenciap) {
                    System.out.println();
                    System.out.println("Que desea realizar?");
                    System.out.println("1) Llenar Pila");
                    System.out.println("2) Agregar Pila");
                    System.out.println("3) Retroceder Pila");
                    System.out.println("4) Mostrar Pila");
                    System.out.println("5) Salir");
                    optp=sc.nextInt();
                    switch (optp) {
                        case 1:
                            m.LlenarPila(pila);
                        break;
                        case 2:
                            m.AgregarPila(pila);
                        break;
                        case 3:
                            m.EliminarPila(pila);
                        break;
                        case 4:
                            m.MostrarPila(pila);
                        break;
                        case 5:
                            System.out.println("hasta pronto");
                            secuenciap=false;
                        break;

                        default:
                            System.out.println("Escoge un rango del 1 al 7");
                            break;
                    }
                }
                    
            }
            else{
                System.out.println();
                System.out.println("Que desea realizar?");
                System.out.println("1) Llenar Cola");
                System.out.println("2) Agregar Cola");
                System.out.println("3) Retroceder Cola");
                System.out.println("4) Mostrar Cola");
                System.out.println("5) Salir");
                optc=sc.nextInt();
                switch (optc) {
                    case 1:
                        
                    break;
                    case 2:
                        
                    break;
                    case 3:
                        
                    break;
                    case 4:
                        
                    break;
                    case 5:
                        System.out.println("Hasta pronto");
                        seguir=false;
                    break;
                    default:
                        System.out.println("Opcion no valida ingrese un numero dentro del 1-9");
                    break;
                }

            }
            
            
        }
    }
}
