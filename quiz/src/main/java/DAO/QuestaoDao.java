package DAO;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.pbmulesoft.quiz.modelo.Questao;

public class QuestaoDao {

	private EntityManager em;
	
	public QuestaoDao(EntityManager em) {
		this.em = em;
	}
	
	public List<Questao> todasAsQuestoes(){
		String jpql = "SELECT q FROM Questao q";
		return em.createQuery(jpql, Questao.class).getResultList();
	}
}

