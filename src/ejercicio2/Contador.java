package ejercicio2;

public class Contador {
    private int valor;

    public Contador() {
    }

    public Contador(int valor) {
        this.valor = valor;
    }

    public Contador(Contador c) {
        this.valor = c.getValor();
    }

    public void incrementarValor() {
        this.valor++;
    }
    public void decrementarValor() {
        this.valor--;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
