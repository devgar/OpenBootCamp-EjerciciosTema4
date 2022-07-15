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
        System.out.println("Hello world!");
    }
}