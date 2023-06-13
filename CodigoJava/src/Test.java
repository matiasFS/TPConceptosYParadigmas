import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        int idCliente = 1;
        int idCliente1 = 2;
        int idCliente2 = 3;
        int idCliente3 = 4;
        int idCliente4 = 5;
        int idCliente5 = 6;



        // Agregar artículos
        empresa.agregarArticulo("Herramientas electricas", "Amoladora angular", 90);
        empresa.agregarArticulo("Herramientas electricas", "Taladro inalambrico", 41);
        empresa.agregarArticulo("Herramientas electricas", "Sierra circular", 420);
        empresa.agregarArticulo("Herramientas electricas", "Lijadora orbital", 450);
        empresa.agregarArticulo("Herramientas manuales", "Juego de llaves inglesas", 25);
        empresa.agregarArticulo("Herramientas manuales", "Destornilladores de precision", 29);
        empresa.agregarArticulo("Herramientas manuales", "Martillo perforador", 15);
        empresa.agregarArticulo("Herramientas manuales", "Sierra de mano", 22);
        empresa.agregarArticulo("Herramientas manuales", "Alicate de corte diagonal", 20);
        empresa.agregarArticulo("Equipos de seguridad y proteccion", "Gafas de seguridad", 50);
        empresa.agregarArticulo("Equipos de seguridad y proteccion", "Guantes de trabajo", 50);
        empresa.agregarArticulo("Equipos de seguridad y proteccion", "Mascara respiratoria", 30);
        empresa.agregarArticulo("Equipos de seguridad y proteccion", "Casco de seguridad", 25);
        empresa.agregarArticulo("Equipos de seguridad y proteccion", "Cinturon porta herramientas", 100);

        // Agregar clientes
        empresa.agregarCliente("Juan", "Perez", 11111111);
        empresa.agregarCliente("Maria", "Gomez", 22222222);
        empresa.agregarCliente("Carlos", "Rodriguez", 33333333);
        empresa.agregarCliente("Pedro", "Lopez", 44444444);
        empresa.agregarCliente("Ana", "Silva", 55555555);
        empresa.agregarCliente("Laura", "Torres", 66666666);

        Cliente cliente1 = empresa.traerCliente(idCliente);
        Cliente cliente2 = empresa.traerCliente(idCliente1);
        Cliente cliente3 = empresa.traerCliente(idCliente2);
        Cliente cliente4 = empresa.traerCliente(idCliente3);
        Cliente cliente5 = empresa.traerCliente(idCliente4);
        Cliente cliente6 = empresa.traerCliente(idCliente5);

        Articulo articulo1 = empresa.traeArticulo("Amoladora angular");
        Articulo articulo2 = empresa.traeArticulo("Taladro inalambrico");
        Articulo articulo3 = empresa.traeArticulo("Sierra circular");
        Articulo articulo4 = empresa.traeArticulo("Lijadora orbital");
        Articulo articulo5 = empresa.traeArticulo("Juego de llaves inglesas");
        Articulo articulo6 = empresa.traeArticulo("Destornilladores de precision");
        Articulo articulo7 = empresa.traeArticulo("Martillo perforador");
        Articulo articulo8 = empresa.traeArticulo("Sierra de mano");
        Articulo articulo9 = empresa.traeArticulo("Alicate de corte diagonal");
        Articulo articulo10 = empresa.traeArticulo("Gafas de seguridad");
        Articulo articulo11 = empresa.traeArticulo("Guantes de trabajo");
        Articulo articulo12 = empresa.traeArticulo("Mascara respiratoria");
        Articulo articulo13 = empresa.traeArticulo("Casco de seguridad");
        Articulo articulo14 = empresa.traeArticulo("Cinturon porta herramientas");

        empresa.agregarVenta(cliente1, articulo2, 1, LocalDate.of(2023, 5, 12));
        empresa.agregarVenta(cliente2, articulo3, 2, LocalDate.of(2023, 4, 28));
        empresa.agregarVenta(cliente3, articulo4, 1, LocalDate.of(2023, 6, 5));
        empresa.agregarVenta(cliente6, articulo5, 1, LocalDate.of(2023, 3, 18));
        empresa.agregarVenta(cliente5, articulo6, 3, LocalDate.of(2023, 2, 6));
        empresa.agregarVenta(cliente1, articulo7, 1, LocalDate.of(2023, 5, 1));
        empresa.agregarVenta(cliente4, articulo8, 2, LocalDate.of(2023, 2, 14));
        empresa.agregarVenta(cliente2, articulo10, 2, LocalDate.of(2023, 3, 22));
        empresa.agregarVenta(cliente1, articulo11, 2, LocalDate.of(2023, 5, 9));
        empresa.agregarVenta(cliente6, articulo9, 1, LocalDate.of(2023, 4, 27));
        empresa.agregarVenta(cliente3, articulo1, 1, LocalDate.of(2023, 5, 4));
        empresa.agregarVenta(cliente1, articulo12, 3, LocalDate.of(2023, 2, 17));
        empresa.agregarVenta(cliente2, articulo13, 1, LocalDate.of(2023, 3, 25));
        empresa.agregarVenta(cliente5, articulo14, 1, LocalDate.of(2023, 4, 8));
        empresa.agregarVenta(cliente4, articulo2, 1, LocalDate.of(2023, 6, 10));
        empresa.agregarVenta(cliente6, articulo4, 1, LocalDate.of(2023, 5, 16));
        empresa.agregarVenta(cliente1, articulo3, 2, LocalDate.of(2023, 3, 21));
        empresa.agregarVenta(cliente3, articulo6, 3, LocalDate.of(2023, 4, 30));
        empresa.agregarVenta(cliente2, articulo5, 1, LocalDate.of(2023, 2, 5));
        empresa.agregarVenta(cliente5, articulo7, 1, LocalDate.of(2023, 5, 12));
        empresa.agregarVenta(cliente4, articulo8, 2, LocalDate.of(2023, 3, 27));
        empresa.agregarVenta(cliente6, articulo9, 1, LocalDate.of(2023, 4, 4));
        empresa.agregarVenta(cliente3, articulo1, 1, LocalDate.of(2023, 6, 14));
        empresa.agregarVenta(cliente2, articulo10, 1, LocalDate.of(2023, 3, 20));
        empresa.agregarVenta(cliente5, articulo11, 2, LocalDate.of(2023, 4, 29));
        empresa.agregarVenta(cliente1, articulo12, 1, LocalDate.of(2023, 5, 2));
        empresa.agregarVenta(cliente4, articulo13, 1, LocalDate.of(2023, 2, 11));
        empresa.agregarVenta(cliente6, articulo14, 1, LocalDate.of(2023, 4, 26));
        empresa.agregarVenta(cliente3, articulo2, 1, LocalDate.of(2023, 3, 7));

        System.out.println("------------Listado de artículos vendidos con sus cantidades.------------\n ");

        // Listado de artículos vendidos con sus cantidades.
        empresa.mostrarArticulosVendidos();

        
        System.out.println("\n \n \n ");

        // Ventas realizadas dada una fecha, antes de esa fecha
    System.out.println("------------Ventas realizadas dada una fecha, antes de la fecha 2023/4/30 ------------ \n");

        empresa.mostrarVentasAntesDeFecha(LocalDate.of(2023, 4, 30));


        System.out.println("\n \n \n ");

    System.out.println("------------Dado un cliente, listar sus compras con su fecha correspondiente ------------ \n");

        
        // Dado un cliente, listar sus compras con su fecha correspondiente
        empresa.listarComprasPorCliente(cliente6);

        System.out.println("\n \n \n ");

    System.out.println("------------Listar por tipo de herramientas ------------ \n");

            empresa.listarPorTipo(empresa.getListArticulos(),"Herramientas manuales");
            empresa.listarPorTipo(empresa.getListArticulos(),"Herramientas electricas");
            empresa.listarPorTipo(empresa.getListArticulos(),"Equipos de seguridad y proteccion");




    }





}