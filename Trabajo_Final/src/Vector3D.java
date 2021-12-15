public class Vector3D {

    //ATRIBUTOS

    Punto3D puntoInicial = new Punto3D();
    Punto3D puntoFinal = new Punto3D();

    //CONSTRUCTORES

    public Vector3D(Punto3D puntoInicial, Punto3D puntoFinal) {
        this.puntoInicial = puntoInicial;
        this.puntoFinal = puntoFinal;
    }

    public Vector3D(Punto3D puntoFinal) {
        this.puntoFinal = puntoFinal;
        this.puntoInicial.x = 0;
        this.puntoInicial.y = 0;
        this.puntoInicial.z = 0;
    }

//METODOS

    public double calcularMagnitud(){
       return Math.sqrt(Math.pow(this.puntoFinal.x-this.puntoInicial.x,2)+Math.pow(this.puntoFinal.y-this.puntoInicial.y,2)+Math.pow(this.puntoFinal.z-this.puntoInicial.z,2)) ;
    }

    public void mostrarComponentes(){
        double Vx = this.puntoFinal.x-this.puntoInicial.x;
        double Vy = this.puntoFinal.y-this.puntoInicial.y;
        double Vz = this.puntoFinal.z-this.puntoInicial.z;
        System.out.println("Vector x = " + Vx);
        System.out.println("------");
        System.out.println("Vector y = " + Vy);
        System.out.println("------");
        System.out.println("Vector z = " + Vz);
    }

    @Override
    public String toString() {
        return "El vector comienza en el punto "+ puntoInicial +" y " +"termina en el punto " + puntoFinal ;
    }
}
