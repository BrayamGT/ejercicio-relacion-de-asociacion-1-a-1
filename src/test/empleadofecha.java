package test;

import dominio.empleado;
import dominio.fecha;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class empleadofecha {

    public static void main(String[] args) {
        Calendar fecha = new GregorianCalendar();
        Scanner entrada = new Scanner(System.in);
        fecha fNacimiento;
        fecha fIngreso;
        empleado empleado1;
        int anio = 2022, mes = 0, dia = 0;
        String nombre;
        System.out.print("Ingrese el nombre del empleado: ");
        nombre = entrada.nextLine();
        System.out.println("Fecha de nacimiento");
        System.out.print("Anio: ");
        while (anio > fecha.get(Calendar.YEAR)) {
            anio = entrada.nextInt();
        }
        System.out.print("Mes: ");
        while (mes < 1 || mes > 12) {
            mes = entrada.nextInt();
        }
        System.out.print("Dia: ");
        while (dia < 1 || dia > 31) {
            dia = entrada.nextInt();
        }
        fNacimiento = new fecha(anio, mes, dia);
        anio = 2022;
        mes = 0;
        dia = 0;
        System.out.println("Fecha de ingreso a la empresa");
        System.out.print("Anio: ");
        while (anio > fecha.get(Calendar.YEAR)) {
            anio = entrada.nextInt();
        }
        System.out.print("Mes: ");
        while (mes < 1 || mes > 12) {
            mes = entrada.nextInt();
        }
        System.out.print("Dia: ");
        while (dia < 1 || dia > 31) {
            dia = entrada.nextInt();
        }
        fIngreso = new fecha(anio, mes, dia);
        empleado1 = new empleado(nombre, fNacimiento, fIngreso);
        System.out.println("Datos Ingresados");
        empleado1.verDatos();
    }

}