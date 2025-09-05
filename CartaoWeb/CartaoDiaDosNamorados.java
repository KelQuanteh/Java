public class CartaoDiaDosNamorados extends CartaoWeb {
    // Atributo
    private String destinatario;

    // Getter
    public String getDestinatario() {
        return this.destinatario;
    }

    // Setter
    public void setDestinatario(String dest) {
        this.destinatario = dest;
    }

    // Método
    public void retornarMensagem(String remetente) {
        this.setDestinatario(remetente);
        System.out.println("Querido(a) " + this.getDestinatario() + ", feliz Dia dos Namorados!");
    }
}
