package sistema;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable=false)
	private Integer id;
	

	@Column(nullable=false, length=11)
	//@Size(min = 1, message = "{required.field}")
	private String cpf;
	
	@Column(nullable=false, length=255)
	private String nome;
	  
	@Column
    private String tipoLogradouro; //Rua, Avenida
	
	@Column
    private String logradouro;
	
	@Column
    private String numero;
	
	@Column
    private String bairro;
	
	@Column
    private String cidade;
	
	@Column
    private String estado;
	
	@Column
	private String telefoneCelular;
    
	@Column
	private String telefoneFixo;
	
			
	public Pessoa() {
		// TODO Auto-generated constructor stub
		
	}
	
	public Pessoa(Integer id, String nome, String cpf) {
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
	}


	public Pessoa( Integer Id, String cpf, String nome, String tipoLogradouro, String logradouro, String numero,
			String bairro, String cidade, String estado, String telefoneCelular, String telefoneFixo) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.tipoLogradouro = tipoLogradouro;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.telefoneCelular = telefoneCelular;
		this.telefoneFixo = telefoneFixo;
	}
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipoLogradouro() {
		return tipoLogradouro;
	}

	public void setTipoLogradouro(String tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public String getTelefoneFixo() {
		return telefoneFixo;
	}

	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}

}
