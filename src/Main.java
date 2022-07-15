abstract class SmartDevice {
    public String fabricante;
    public String modelo;
    public String OS;
    public int year;

    public SmartDevice() {
        this.fabricante = "";
        this.modelo = "";
        this.OS = "";
        this.year = 0;

    }

    public SmartDevice(String fabricante, String modelo, String OS, int year) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.OS = OS;
        this.year = year;
    }
}

class SmartPhone extends SmartDevice {
    public boolean tieneSensorDeHuellas;

    public SmartPhone() {
        super();
        this.tieneSensorDeHuellas = false;
    }

    public SmartPhone(String fabricante, String modelo, String OS, int year, boolean tieneSensorDeHuellas) {
        super(fabricante, modelo, OS, year);
        this.tieneSensorDeHuellas = tieneSensorDeHuellas;
    }
}

class SmartWatch extends SmartDevice {
    public String MaterialPulsera;
    public String ColorPulsera;

    public SmartWatch() {
        super();
        this.MaterialPulsera = "";
        this.ColorPulsera = "";
    }

    public SmartWatch(String fabricante, String modelo, String OS, int year, String MaterialPulsera, String ColorPulsera) {
        super(fabricante, modelo, OS, year);
        this.MaterialPulsera = MaterialPulsera;
        this.ColorPulsera = ColorPulsera;
    }
}

public class Main {
    public static void main(String[] args) {
        SmartPhone iPhone13 = new SmartPhone("Apple", "iPhone 13", "iOS 15", 2021, false);
        SmartWatch SamsungFit = new SmartWatch("Samsung", "Fit 2", "FreeRTOS", 2020, "Plástico", "Scarlet");

        System.out.println("Fabricante: " + iPhone13.fabricante);
        System.out.println("Modelo: " + iPhone13.modelo);
        System.out.println("OS: " + iPhone13.OS);
        System.out.println("Año: " + iPhone13.year);
        System.out.println("Tiene sensor de huellas: " + (iPhone13.tieneSensorDeHuellas ? "Sí" : "No"));
        System.out.println();
        System.out.println("Fabricante: " + SamsungFit.fabricante);
        System.out.println("Modelo: " + SamsungFit.modelo);
        System.out.println("OS: " + SamsungFit.OS);
        System.out.println("Año: " + SamsungFit.year);
        System.out.println("Material de la pulsera: " + SamsungFit.MaterialPulsera);
        System.out.println("Color de la pulsera: " + SamsungFit.ColorPulsera);

    }
}