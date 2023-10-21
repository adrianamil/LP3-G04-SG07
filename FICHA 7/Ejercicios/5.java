public class CuentaBancaria {
    private double saldo;
    public CuentaBancaria(double saldoInicial) {
        assert saldoInicial >= 0 : "El saldo inicial no puede ser negativo";
        saldo = saldoInicial;
    }
    public void depositar(double cantidad) {
        assert cantidad > 0 : "La cantidad a depositar debe ser positiva";
        saldo += cantidad;
    }
    public void retirar(double cantidad) {
        assert cantidad > 0 : "La cantidad a retirar debe ser positiva";
        assert (saldo - cantidad) >= 0 : "El saldo no puede ser negativo después del retiro";
        saldo -= cantidad;
    }
    public double obtenerSaldo() {
        return saldo;
    }
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000.0);
        cuenta.depositar(500.0);
        cuenta.retirar(300.0);
        cuenta.retirar(1500.0);  // Esto generará una aserción en tiempo de desarrollo
        System.out.println("Saldo actual: " + cuenta.obtenerSaldo());
    }
}
