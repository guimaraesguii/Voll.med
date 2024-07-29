package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String uf;
    private String complemento;
    private String numero;
    private String cidade;

    public Endereco(DadosEndereco dados) {
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.uf = dados.uf();
        this.logradouro = dados.logradouro();
        this.numero = dados.numero();
        this.complemento = dados.complemento();
        this.cidade = dados.cidade();
    }

    public void atualizarInformacoes(DadosEndereco dados) {
        if (bairro != null){
            this.bairro = dados.bairro();
        }
        if (cep != null){
            this.cep = dados.cep();
        }
        if (uf != null){
            this.uf = dados.uf();
        }
        if (logradouro != null){
            this.logradouro = dados.logradouro();
        }
        if (numero != null){
            this.numero = dados.numero();
        }
        if (complemento != null){
            this.complemento = dados.complemento();
        }
        if (cidade != null){
            this.cidade = dados.cidade();
        }
    }
}
