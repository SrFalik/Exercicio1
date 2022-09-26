public class ClientePJ extends Cliente {
    private Long cnpj;
    private String razaoSocial;

    public ClientePJ(String email, Float totalDeCompra, Long cnpj, String razaoSocial) {
        super(email, totalDeCompra);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public float calculaValorCompra(float valorCompra) {
        if (valorCompra > 5000) {
            return (float) (valorCompra - (valorCompra * 0.15));
        } else {
            return valorCompra;
        }
    }
}
