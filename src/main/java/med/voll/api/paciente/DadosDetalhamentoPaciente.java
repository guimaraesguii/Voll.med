package med.voll.api.paciente;

public record DadosDetalhamentoPaciente (String nome, String email, String telefone, String cpf, med.voll.api.endereco.Endereco endereco){
        public DadosDetalhamentoPaciente (Paciente paciente){
            this(paciente.getNome(), paciente.getEmail(), paciente.getTelefone(), paciente.getCpf(), paciente.getEndereco());
        }
}
