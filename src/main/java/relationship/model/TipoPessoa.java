package relationship.model;

public enum TipoPessoa {
	
	FISICA("Fisica"),
	JURIDICA("Juridica");
	
	TipoPessoa(String descricao) {
		this.descricao = descricao;
	}
	
	private String descricao;

	public String getDescricao() {
		return descricao;
	}	
	

}
