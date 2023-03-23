package aplicacion;

import mates.Matematicas;

public class Principal {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Debes proporcionar un argumento que indique el número de pasos para generar una estimación de PI.");
            return;
        }

        System.out.println("El número PI es " + Matematicas.generarNumeroPi(Long.parseLong(args[0])));
    }
}