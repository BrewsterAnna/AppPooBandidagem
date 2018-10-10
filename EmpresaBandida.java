package negocio;

public class EmpresaBandida {
	final float VL_PERCENT_SOLICITADO = 1.50f;
	final float VL_TAXA = 1000;
	final float VL_PERCENT_FUNC = 0.50f;
	final float VL_PARCELA = 250;
	public String nomeFantasia;
	public String razaoSocial;
	public String favor;
	public String cidadeAtuacao;
	public int qtFuncionarios;
	public String nomeResponsavel;
	public String cpfResponsavel;
	public String email;
	public String endereco;
	public String bairro;
	public String cidade;
	public String unFederacao;
	public String whatsapp;
	public float valorSolicitado;
	public int qtParcelas;
	
	public void exibir(){
		System.out.println(
			"Querida, "+nomeFantasia+"("+razaoSocial+").\r\n" 
			+"O seu empr�stimo acabou de ser aceito:\r\n"  
			+favor+".\r\n" 
			+"Espero que esse valor possa melhorar a nossa parceria na cidade de "+cidadeAtuacao+".\r\n"  
			+"E que a quantidade de funcion�rios que trabalham para voc� ("+qtFuncionarios+") possa voltar como votos!\r\n"  
			+"A nossa comunica��o ser� feita pelos contatos informados pelo "+nomeResponsavel+" ("+cpfResponsavel+") :\r\n" 
			+">>> E-mail: "+email+"\r\n" 
			+">>> Endereco comercial: "+endereco+" - "+bairro+" - "+cidade+" - "+unFederacao+"\r\n"  
			+">>> Whatsapp: "+whatsapp+"\r\n" 
			+"Abaixo apresento os valores:\r\n"  
			+">>> Valor solicitado: "+valorSolicitado+"\r\n" 
			+">>> Taxa administrativa: "+calcularTaxaAdm()+"\r\n"  
			+">>> Juros: "+calcularJuros()+"\r\n" 
			+">>> Valor a ser pago: "+calcularValorPago()+"\r\n"  
			+">>> Valor da parcela: "+calcularValorParcela()+" ("+qtParcelas+")\r\n"  
			+"Sem temer, muito obrigado pela confian�a,\r\n"  
			+"Michel.\r\n");
	}
	
	private float calcularTaxaAdm() {
		return qtFuncionarios * VL_PERCENT_FUNC;
	}

	private float calcularValorPago() {
		return (valorSolicitado * VL_PERCENT_SOLICITADO)+(VL_PARCELA* qtParcelas)+ calcularTaxaAdm() + VL_TAXA;
	}
	
	private float calcularJuros() {
		return calcularValorPago() - valorSolicitado; 
	}

	private float calcularValorParcela() {
		return calcularValorPago() / qtParcelas;
	}
	
}



