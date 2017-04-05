package relationship.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name = "pessoa_grupo")
public class PessoaGrupo {
	
	@EmbeddedId
	private PessoaGrupoId id;

	public PessoaGrupoId getId() {
		return id;
	}

	public void setId(PessoaGrupoId id) {
		this.id = id;
	}
	
	

}
