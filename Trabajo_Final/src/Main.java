public class Main {
    public static void main(String[] args) {

        //INSTANCIAMOS LOS PUNTOS

        Punto3D primerPunto = new Punto3D(2,7,6);
        Punto3D segundoPunto = new Punto3D(6,7,2);
        Punto3D tercerPunto = new Punto3D(3);

        System.out.println("Primer punto = "+primerPunto);
        System.out.println("---------------------------");
        System.out.println("Segundo punto = "+segundoPunto);
        System.out.println("---------------------------");
        System.out.println("Tercer punto = "+tercerPunto);
        System.out.println("---------------------------");

        //DISTANCIA AL ORIGEN
        System.out.println("Calcular Distancia al Origen del Segundo Punto = " + segundoPunto.calcularDistanciaOrigen());
        System.out.println("---------------------------");

        //DISTANCIA A OTRO PUNTO
        System.out.println("Calcular Distancia a Otro Punto desde el Segundo Punto = " + segundoPunto.calcularDistanciaOtroPunto(0,0,0));
        System.out.println("---------------------------");

        //DISTANCIA A OTRO PUNTO
        System.out.println("Calcular Distancia a Otro Punto desde el Segundo Punto = " + segundoPunto.calcularDistanciaOtroPunto(primerPunto));
        System.out.println("---------------------------");

        //INSTANCIAMOS LOS VECTORES
        Vector3D primerVector = new Vector3D(primerPunto,segundoPunto);
        Vector3D segundoVector = new Vector3D(tercerPunto);

        System.out.println("Primer vector = "+primerVector);
        System.out.println("---------------------------");
        System.out.println("Segundo vector = "+segundoVector);
        System.out.println("---------------------------");

        //MOSTRAR MAGNITUDES
        System.out.println("Magnitudes del Primer Vector = "+ primerVector.calcularMagnitud());
        System.out.println("---------------------------");
        System.out.println("Magnitudes del Segundo Vector = "+ segundoVector.calcularMagnitud());
        System.out.println("---------------------------");

        //MOSTRAMOS COMPONENTES
        primerVector.mostrarComponentes();
        System.out.println("---------------------------");
        segundoVector.mostrarComponentes();
        System.out.println("---------------------------");

    }
}
