package testes;
import negocio.EmpresaBandida;

public class TestadorEmpresaBandida {
	public static void main(String[] args) {
		EmpresaBandida empresaBandida = new EmpresaBandida ();
		empresaBandida.razaoSocial = "China com peixeira";
		empresaBandida.nomeFantasia = "Yakuza";
		empresaBandida.favor = "Propina";
		empresaBandida.cidadeAtuacao = "China";
		empresaBandida.nomeResponsavel = "Chiiro";
		empresaBandida.cpfResponsavel = "12345678910";
		empresaBandida.email = "chiiro@hotmail.com";
		empresaBandida.endereco = "China";
		empresaBandida.bairro = "chininha";
		empresaBandida.cidade = "osaka";
		empresaBandida.unFederacao = "CH";
		empresaBandida.whatsapp = "9 69734297";
		empresaBandida.valorSolicitado = 100;
		empresaBandida.qtFuncionarios = 5;
		empresaBandida.qtParcelas = 2;
		empresaBandida.exibir();
	}
}
