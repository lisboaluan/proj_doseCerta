package br.com.alura.dosecerta.modelos;

public class Medicamentos {
    private String nome;
    private String formato;
    private int unidadeMedida;
    private int quantEstoque;

    public String getNome() {
        return nome;
    }

    public String getFormato() {
        return formato;
    }

    public int getUnidadeMedida() {
        return unidadeMedida;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setUnidadeMedida(int unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    public void exibeCadastroMedicamento(){
        System.out.println("\n********************************");
        System.out.println("\nNome do Medicamento: "+ nome);
        System.out.println("Formato: "+ formato);
        System.out.println("Unidade de Medida: "+ unidadeMedida + " gr");
        System.out.println("Quantidade em Estoque: "+ quantEstoque + " " + formato);
    }
}
