package punto8;

public class Calculadora {
    private double acumulado;

    public Calculadora() {
        this.acumulado = 0;
    }

    public Calculadora sumar(double valor) {
        acumulado += valor;
        mostrarAcumulado();
        return this;
    }

    public Calculadora restar(double valor) {
        acumulado -= valor;
        mostrarAcumulado();
        return this;
    }

    public Calculadora multiplicar(double valor) {
        acumulado *= valor;
        mostrarAcumulado();
        return this;
    }


    private void mostrarAcumulado() {
        System.out.println("Acumulado: " + acumulado);
    }

    public static void main(String[] args) {
        new Calculadora()
                .sumar(10)
                .restar(5)
                .multiplicar(2)
                .sumar(8)
                .multiplicar(3);
    }
}
