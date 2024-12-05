public class Bebida {

    private String nome;
    private double preco;
    private int quantidade;
    private String tipo;
    private String descricao;


    public Bebida(String nome, double preco, int quantidade, String tipo, String descricao) {
        this.nome= nome;
      if(preco>0){
         this.preco= preco;
         
      }
      if(quantidade>=0){
         this.quantidade= quantidade;
    }else{
    	JOptionPane.showMessageDialog(null, 
                "Quantia não pode ser menor que 0!", 
                "Aviso", 
                JOptionPane.WARNING_MESSAGE);
    }
      this.tipo= tipo;
      this.descricao=descricao;
      JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso!","Aviso",JOptionPane.INFORMATION_MESSAGE);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public double calcularValorTotal() {
        return preco * quantidade;
    }
}
