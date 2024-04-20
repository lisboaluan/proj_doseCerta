import br.com.alura.dosecerta.modelos.Alertas;
import br.com.alura.dosecerta.modelos.Medicamentos;

public class Main {

    public static void main(String[] args) {

        Medicamentos cadastroMedicamento = new Medicamentos();
        cadastroMedicamento.setNome("Paracetamol");
        cadastroMedicamento.setFormato("Cápsula");
        cadastroMedicamento.setUnidadeMedida(250);
        cadastroMedicamento.setQuantEstoque(5);

        Alertas cadastroAlertas = new Alertas();
        cadastroAlertas.setHorarioPrimeiraDose(8);
        cadastroAlertas.setPeriodicidade(4);
        cadastroAlertas.setDuracaoTratamento(15);

        cadastroMedicamento.exibeCadastroMedicamento();
        cadastroAlertas.exibeCadastroAlertas();

        System.out.println("\nVocê deve tomar seu medicamento ás " + cadastroAlertas.calculaAlertas() + " horas.");
    }
}
