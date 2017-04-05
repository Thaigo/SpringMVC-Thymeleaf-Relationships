package relationship.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Pessoa implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	
	@ManyToOne
	@JoinColumn
	private Estado estado;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_pessoa")
	private TipoPessoa tipoPessoa;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="pessoa", fetch=FetchType.EAGER)
	private List<Filho> filhos;
	
	@ManyToMany
	@JoinTable(name = "pessoa_grupo", 
			  joinColumns = @JoinColumn(name = "pessoa_id"),
			  inverseJoinColumns = @JoinColumn(name = "grupo_id"))	
	private List<Grupo> grupos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	

	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public List<Filho> getFilhos() {
		return filhos;
	}

	public void setFilhos(List<Filho> filhos) {
		this.filhos = filhos;
	}

	public List<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}
	
	
	
	
	
	
	
	
	
	

}
