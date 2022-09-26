public abstract class Cliente {
    private String email;
    private Float totalDeCompra;

    public Cliente(String email, Float totalDeCompra) {
        this.email = email;
        this.totalDeCompra = totalDeCompra;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Float getTotalDeCompra() {
        return totalDeCompra;
    }

    public void setTotalDeCompra(Float totalDeCompra) {
        this.totalDeCompra = totalDeCompra;
    }

    public abstract float calculaValorCompra(float valorCompra);

    public void equals(Cliente cliente, Cliente cliente2) {
        if (cliente.getEmail().equalsIgnoreCase(cliente2.getEmail())) {
            System.out.println("Clientes são iguais");
        }
    }

}
