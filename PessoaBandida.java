package negocio;

public class PessoaBandida {
	final float VALOR_TAXA = 0.50f;
	final float PERCENTUAL_VL_SOLICITADO = 1.25f;
	final float VALOR_PARCELA = 150;
	public String apelido;
	public String nome;
	public String favor;
	public String cidade;
	public String cargo;
	public float valorSolicitado;
	public float taxaAdm;
	public float juros;
	public float qtParcelas;
	public float anoNascimento;
	public void exibir() {
		System.out.println(
		"Querido, "+apelido +" ("+nome+")\n"
		+"o seu empréstimo acabou de ser aceito:\n"
		+favor+".\n"
		+"espero que esse valor possa melhoras nossa parceria na cidade de "+cidade+"."
		+" E que o poder do seu cargo ("+cargo+") posso geras bons retornos pra mim:\n"
		+">>> Valor solicitado: "+valorSolicitado+"\n"
		+">>> Taxa administrativa: "+calcularTaxaAdm()+"\n"
		+">>> Juros: "+calcularJuros()+"\n"
		+">>> Valor a ser pago: "+calcularValorPago()+"\n"
		+"Valor da parcela: "+calcularValorParcela()+" ("+qtParcelas+")\r\n"
		+"Sem temer, muito obrigado pela confiança,\r\n" 
		+"Michel.\n");
	}
	
	private float calcularTaxaAdm() {
		return anoNascimento * VALOR_TAXA;
	}

	private float calcularValorPago() {
		return (valorSolicitado*PERCENTUAL_VL_SOLICITADO)+ (VALOR_PARCELA * qtParcelas)+ calcularTaxaAdm();
	}
	private float calcularJuros() {
		return calcularValorPago() - valorSolicitado;
	}

	private float calcularValorParcela() {
		return calcularValorPago() / qtParcelas;
	}

}
