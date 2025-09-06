package app;


import model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Aplicacion {


            public static void main(String[] args) {

                // 1. Crear la fábrica
                FabricaAutos fabrica = new FabricaAutos("AutoFácil", "Av. Principal 123", "555-1234", "123456789");

                // 2. Crear automóviles
                Automovil auto1 = new Automovil("Toyota", "Corolla", "Gasolina", "5", TipoCarroceria.SEDAN, 20000, fabrica);
                Automovil auto2 = new Automovil("Mazda", "CX-5", "Diesel", "5", TipoCarroceria.ROADSTER, 30000, fabrica);
                Automovil auto3 = new Automovil("Honda", "Civic", "Gasolina", "5", TipoCarroceria.SEDAN, 22000, fabrica);

                // Registrar automóviles en la fábrica
                fabrica.getListaAutomoviles().add(auto1);
                fabrica.getListaAutomoviles().add(auto2);
                fabrica.getListaAutomoviles().add(auto3);

                // 3. Crear empleado
                Empleado empleado1 = new Empleado("Juan", "Perez", 1500, "Ventas", fabrica);

                // Registrar empleado en la fábrica
                fabrica.getListaEmpleados().add(empleado1);

                // 4. Crear la lista de autos vendidos para la venta
                List<Automovil> autosVendidos = new ArrayList<>();
                autosVendidos.add(auto1);
                autosVendidos.add(auto3);

                // 5. Registrar una venta usando el método que creamos
                String resultadoVenta = fabrica.crearYRegistrarVenta(
                        "V001",
                        LocalDate.now(),
                        autosVendidos,
                        empleado1
                );

                System.out.println(resultadoVenta);

                // Opcional: Mostrar todas las ventas registradas en la fábrica
                System.out.println("\nVentas registradas:");
                for (Venta venta : fabrica.getListaVentas()) {
                    System.out.println(venta);
                }
            }

}
