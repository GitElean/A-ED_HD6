package hdt6;


import java.util.*;
public class Constructor {
    //atributos
    private TextReader rtxt;
    private Functions funcs;
    private Tree tree;
    private Node nodo;
    Scanner sc = new Scanner(System.in);


    public Constructor(){
        rtxt = new TextReader();
        funcs = new Functions();
        tree = new Tree();
    }

    public String menu(){
        System.out.println("1. Ordenar datos del archiv");
        System.out.println("2. Mostrar la categoría del producto.");
        System.out.println("3. Mostrar datos producto");
        System.out.println("4. Inventario categoría");
        System.out.println("5. Mostrar inventario completo");
        System.out.println("6. Salir");

        String option = sc.nextLine();
        return option;
    }

    String op=menu();

    public void mainMenu(){
        do {
            switch (op){
                case "1":
                    String datos=rtxt.readFile("src/ListadoProducto.txt");
                    System.out.println("El listado a sido creado");
                    String category=funcs.getCategory(datos);
                    String product=funcs.getProduct(datos);
                    tree.push(category, product);
                    break;
                case "2":
                    boolean empty;
                    System.out.println("Ingrese el nombre del producto");
                    String resp = sc.nextLine();
                    empty = tree.isEmpty();
                    if (empty==true){
                        System.out.println("El listado de productos está vacío");
                    }

                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    System.out.println("Gracias por usar el sistema");
                    System.exit(0);
                    break;

            }
        }while (op!="6");
    }

}
