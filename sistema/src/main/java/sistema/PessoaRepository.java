package sistema;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sistema.Pessoa;

public class PessoaRepository {

	private final EntityManagerFactory entityManagerFactory;
	 
	private final EntityManager entityManager;
 
	public PessoaRepository(){
 
		/*CRIANDO O NOSSO EntityManagerFactory COM AS PORPRIEDADOS DO ARQUIVO persistence.xml */
		this.entityManagerFactory = Persistence.createEntityManagerFactory("persistence_unit_db_estudo");
 
		this.entityManager = this.entityManagerFactory.createEntityManager();
	}
	
	
	/**
	 * CRIA UM NOVO REGISTRO NO BANCO DE DADOS
	 * */
	public void Salvar(Pessoa pessoaEntity){
 
		this.entityManager.getTransaction().begin();
		this.entityManager.persist(pessoaEntity);
		this.entityManager.getTransaction().commit();
	}
 
	/**
	 * ALTERA UM REGISTRO CADASTRADO
	 * */
	public void Alterar(Pessoa pessoaEntity){
 
		this.entityManager.getTransaction().begin();
		this.entityManager.merge(pessoaEntity);
		this.entityManager.getTransaction().commit();
	}
 
	/**
	 * RETORNA TODAS AS PESSOAS CADASTRADAS NO BANCO DE DADOS 
	 * */
	@SuppressWarnings("unchecked")
	public List<Pessoa> TodasPessoas(){
 
		return this.entityManager.createQuery("SELECT p FROM Pessoa p ORDER BY p.nome").getResultList();
	}
 
	/**
	 * CONSULTA UMA PESSOA CADASTRA PELO CÓDIGO
	 * */
	public Pessoa GetPessoa(Integer codigo){
 
		return this.entityManager.find(Pessoa.class, codigo);
	}
 
	/**
	 * EXCLUINDO UM REGISTRO PELO CÓDIGO
	**/
	public void Excluir(Integer codigo){
 
		Pessoa pessoa = this.GetPessoa(codigo);
 
		this.entityManager.getTransaction().begin();
		this.entityManager.remove(pessoa);
		this.entityManager.getTransaction().commit();
 
	}
	
	
}
