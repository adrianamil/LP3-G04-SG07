public class Automovil {
    private String placa;
    private int numPuertas;
    private String marca;
    private String modelo;
    private Motor motor;
    public Automovil(String placa, int numPuertas, String marca, String modelo) {
        this.placa = placa;
        this.numPuertas = numPuertas;
        this.marca = marca;
        this.modelo = modelo;
    }
    // Getter para  placa
    public String getPlaca() {
        return placa;
    }
    // Setter para placa
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    // Getter para  nUmero de puertas
    public int getNumPuertas() {
        return numPuertas;
    }
    // Setter para numero de puertas
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    // Getter para la marca
    public String getMarca() {
        return marca;
    }
    // Setter para la marca
    public void setMarca(String marca) {
        this.marca = marca;
    }
    // Getter para el modelo
    public String getModelo() {
        return modelo;
    }
    // Setter para el modelo
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    // Getter para el motor
    public Motor getMotor() {
        return motor;
    }
    // Setter para el motor
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    public String toString() {
    String infoAutomovil = "Placa: " + placa + "\n";
    infoAutomovil += "Número de Puertas: " + numPuertas + "\n";
    infoAutomovil += "Marca: " + marca + "\n";
    infoAutomovil += "Modelo: " + modelo + "\n";
    
    if (motor != null) {
        infoAutomovil += "Motor: " + motor.toString() + "\n";
    }
    
    return infoAutomovil;
}

}
public class Motor {
    private int numMotor;
    private int revPorMin;
    private Automovil automovil;

    public Motor(int numMotor, int revPorMin) {
        this.numMotor = numMotor;
        this.revPorMin = revPorMin;
    }

    // Getter para el numero de motor
    public int getNumMotor() {
        return numMotor;
    }

    // Setter para el numero de motor
    public void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }

    // Getter para las revoluciones por minuto
    public int getRevPorMin() {
        return revPorMin;
    }

    // Setter para las revoluciones por minuto
    public void setRevPorMin(int revPorMin) {
        this.revPorMin = revPorMin;
    }

    // Getter y setter para la referencia al automovil
    public Automovil getAutomovil() {
        return automovil;
    }

    public void setAutomovil(Automovil automovil) {
        this.automovil = automovil;
    }

    public String toString() {
        String infoMotor = "Número de Motor: " + numMotor + "\n";
        infoMotor += "Revoluciones por Minuto: " + revPorMin + "\n";

        if (automovil != null) {
            infoMotor += "Información del Automóvil:\n";
            infoMotor += automovil.toString();
        }

        return infoMotor;
    }
}
public class TestAgregacion {
    public static void main(String[] args) {
        // Crear un objeto Motor
        Motor motor1 = new Motor(12345, 3000);

        // Crear un objeto Automovil y asignarle el motor
        Automovil automovil1 = new Automovil("ABC123", 4, "Toyota", "Corolla");
        automovil1.setMotor(motor1);

        // Crear otro objeto Automovil y asignarle el mismo motor
        Automovil automovil2 = new Automovil("XYZ789", 2, "SUzuki", "Swift");
        automovil2.setMotor(motor1);

        // Mostrar los datos de los automóviles
        System.out.println("Información del Automóvil 1:");
        System.out.println(automovil1.toString());

        System.out.println("\nInformación del Automóvil 2:");
        System.out.println(automovil2.toString());
    }
}

