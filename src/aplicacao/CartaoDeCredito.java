package aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> compras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra) {
        if (compra.getValor() <= saldo) {
            saldo -= compra.getValor();
            compras.add(compra);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void exibirResumo() {
        Collections.sort(compras); // Ordena por valor (menor para o maior)

        System.out.println("\n===== COMPRAS REALIZADAS =====");
        double total = 0;

        for (Compra compra : compras) {
            System.out.println(compra);
            total += compra.getValor();
        }

        System.out.println("\nTotal gasto: R$ " + String.format("%.2f", total));
        System.out.println("Saldo disponivel: R$ " + String.format("%.2f", saldo));

    }

    public void cancelarCompras() {
        compras.clear();
        saldo = limite;
        System.out.println("\nX Todas as Compras foram canceladas. O cartão foi restaurado ao saldo original.");
    }
}
