package br.com.alura.dosecerta.modelos;

public class Alertas {
    private int periodicidade;
    private int horarioPrimeiraDose;
    private int duracaoTratamento;


    public int getPeriodicidade() {
        return periodicidade;
    }

    public int getHorarioPrimeiraDose() {
        return horarioPrimeiraDose;
    }

    public int getDuracaoTratamento() {
        return duracaoTratamento;
    }

    public void setPeriodicidade(int periodicidade) {
        this.periodicidade = periodicidade;
    }

    public void setHorarioPrimeiraDose(int horarioPrimeiraDose) {
        this.horarioPrimeiraDose = horarioPrimeiraDose;
    }

    public void setDuracaoTratamento(int duracaoTratamento) {
        this.duracaoTratamento = duracaoTratamento;
    }

    public void exibeCadastroAlertas(){
        System.out.println("Horário 1º Dose: " + horarioPrimeiraDose + " horas.");
        System.out.println("Periodicidade: a cada " + periodicidade + " horas.");
        System.out.println("Duração do Tratamento: " + duracaoTratamento + " dias.");
        System.out.println("\n********************************");
    }

    public int calculaAlertas(){
        return horarioPrimeiraDose += periodicidade;
    }
}
