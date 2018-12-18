package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import sistema.Pessoa;;


@Path("pessoa")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PessoaREST {

	
	@PersistenceContext
	protected EntityManager entityManager;
	
	@POST
	@Transactional
	public void create(Pessoa pessoa) {
		entityManager.persist(pessoa);
	}
	
	
	@GET
	public List<Pessoa>list(){
		CriteriaQuery<sistema.Pessoa> q = entityManager.getCriteriaBuilder().createQuery(sistema.Pessoa.class);
		q.select(q.from(Pessoa.class));
		return entityManager.createQuery(q).getResultList();
	}
}
