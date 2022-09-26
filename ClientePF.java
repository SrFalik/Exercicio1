public class ClientePF extends Cliente {
    private Long cpf;
    private String nome;

    public ClientePF(String email, Float totalDeCompra, Long cpf, String nome) {
        super(email, totalDeCompra);
        this.cpf = cpf;
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public float calculaValorCompra(float valorCompra) {
        if (valorCompra > 1000) {
            return (float) (valorCompra - (valorCompra * 0.10));
        } else {
            return valorCompra;
        }
    }
}
