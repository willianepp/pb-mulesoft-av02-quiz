package br.com.pbmulesoft.quiz.menu;

import java.util.List;

import javax.persistence.EntityManager;

import DAO.QuestaoDao;
import br.com.pbmulesoft.quiz.modelo.Questao;
import br.com.pbmulesoft.quiz.util.JPAUtil;

public class VerificarRespostas {
	EntityManager em = JPAUtil.getEntityManager();
	QuestaoDao questaoDao = new QuestaoDao(em);

	public boolean[] Respostas() {

		List<Questao> respostas = questaoDao.todasAsQuestoes();
		boolean[] selecao = new boolean[respostas.size()];

		for (int i = 0; i < respostas.size(); i++) {
			
			selecao[i] = respostas.get(i).isVerdadeira();

		}
		return selecao;
	}

}