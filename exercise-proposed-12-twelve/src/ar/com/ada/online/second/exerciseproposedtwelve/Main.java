package ar.com.ada.online.second.exerciseproposedtwelve;
/*Realice un diagrama de flujo y pseudocódigo que representen el algoritmo para
determinar cuánto pagará finalmente una persona por un artículo equis, considerando
que tiene un descuento de 20%, y debe pagar 15% de IVA (debe mostrar el precio con
descuento y el precio final).*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Este programa calcula el precio final por la compra de un articulo");

        double price;
        double discount;
        double iva;
        double priceWhitDiscount;
        double priceWhitIva;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: $");
        price = keyboard.nextDouble();

        discount = price * 0.20;
        priceWhitDiscount = price - discount;
        System.out.println("El precio con descuento sera: $" + priceWhitDiscount);

        iva = price * 0.15;
        priceWhitIva = priceWhitDiscount + iva;
        System.out.println("El precio final con iva es: $" + priceWhitIva);



    }
}
