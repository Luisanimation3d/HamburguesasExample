import java.util.ArrayList;
import java.util.Scanner;

public class MainHamburguesa {
    public static void main(String[] args) {
        ArrayList<Adiciones> ingredientes = new ArrayList<Adiciones>();
        Scanner sc = new Scanner(System.in);
        Scanner ad = new Scanner(System.in);
        Scanner adi = new Scanner(System.in);
        double acum = 0;
        int numeroAdicion = 0;
        HamburguesaSaludable hs = new HamburguesaSaludable("Centeno", "Tocino", 18000, "Hamburguesa saludable");
        HamburguesaBasica hb = new HamburguesaBasica("Pan Blanco", "Salchicha", 13000,"Hamburguesa básica");
        HamburguesaDeluxe hd = new HamburguesaDeluxe("Pan blanco", "Salchicha y Tocino", 23000, "Hamburguesa deluxe");
        int opcion = 0;
        int cont = 0;
        boolean salir = true;
        Adiciones add1 = new Adiciones("Tomate", 2000);
        Adiciones add2 = new Adiciones("Lechuga", 1000);
        Adiciones add3 = new Adiciones("Queso", 4000);
        Adiciones add4 = new Adiciones("Huevo", 3000);
        Adiciones add5 = new Adiciones("Lentejas", 4000);
        Adiciones add6 = new Adiciones("Papas", 9300);
        Adiciones add7 = new Adiciones("Bebida", 7500);

        ingredientes.add(add1);
        ingredientes.add(add2);
        ingredientes.add(add3);
        ingredientes.add(add4);
        ingredientes.add(add5);
        ingredientes.add(add6);
        ingredientes.add(add7);

        do {
            System.out.println("------BIENVENIDOS------\n \n Evidencia # 2 de Java \n \n 1.Hamburguesa Básica \n 2.Hamburguesa Saludable \n 3.Hamburguesa Deluxe  \n 4.Salir");
            System.out.printf("Ingrese un valor numérico entre 1 y 4: ");
            opcion = sc.nextInt();
            cont = 0;
            switch (opcion){
                case 1:{
                    System.out.println(hb.toString());
                    System.out.println("Desea agregar un ingrediente?");
                    String adicion = ad.nextLine();
                    acum = 13000;
                    if (adicion.equals("SI")){
                        for(Adiciones i : ingredientes) {
                            cont++;
                            System.out.println((cont) + ". Nombre: " + i.name + " Precio: " + i.price);
                        }
                        numeroAdicion = adi.nextInt();
                    }
                    System.out.println("Haz añadido "+ ingredientes.get(numeroAdicion-1).name);
                    acum += ingredientes.get(numeroAdicion-1).price;

                }
                case 4:{
                    salir = false;
                    System.out.println("Has salido. Gracias por usar nuestro sistema");
                }
            }
        }while(salir);
        System.out.println("Precio final: "+acum);
    }
}