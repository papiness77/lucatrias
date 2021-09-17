public class Main {
    public static void main(String[]args){
        Fecha fecha1 = new Fecha(12,"Julio",30);
        Empresa empresa1= new Empresa("Intel");
        Empleado empleado1 = new Empleado("Juan","Torre",3133,"Julio 2020");
        Empleado empleado2 = new Empleado("Juancito","Torresss",3123333,"Marzo 2020");

        empleado1.ingresaAsistencia(fecha1,12);
        empleado1.ingresaAsistencia(fecha1,13);
        empleado1.ingresaAsistencia(fecha1,124);
        empleado1.comprobarAsistencia("Julio");
        System.out.println(empleado1.calcularPorcentaje());

        empresa1.aniadirEmpleado(empleado1);
        empresa1.aniadirEmpleado(empleado2);
        empresa1.porceentajesEmpresa("Julio");

    }
}
