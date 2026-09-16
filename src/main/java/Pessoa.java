
public class Pessoa {
    
    public static void main(String[] args){

        
        private String nome;
        private int idade;
        private CPF cpf;
        private Endereco endereco;
        private Profissao profissao;

        public Pessoa pessoa = new Pessoa(String nome, int idade, CPF cpf, Endereco endereco, Profissao profissao){
            this.nome = nome;
            this.idade= idade;
            this.cpf = new CPF();
            this.endereco = new Endereco();
            this.profissao= new Profissao();
        }

        public String getNome(){
            return this.nome;
        }

        public int getIdade(){
            return this.idade;
        }

        public void setIdade(int novaIdade){
            this.idade = novaIdade;
        }


    }
}
