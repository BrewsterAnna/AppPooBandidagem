package testes;

import negocio.PessoaBandida;

public class TestaBandido {
	public static void main(String[] args) {
		PessoaBandida pessoaBandida = new PessoaBandida();
		pessoaBandida.nome = "Michel";
		pessoaBandida.apelido = "Vampirão";
		pessoaBandida.favor = "Propina pra galera";
		pessoaBandida.cidade = "Distrito Federal";
		pessoaBandida.cargo = "Assessor";
		pessoaBandida.anoNascimento = 1994;
		pessoaBandida.valorSolicitado = 10000;
		pessoaBandida.qtParcelas = 2;
		pessoaBandida.exibir();
		
	}
	
}
