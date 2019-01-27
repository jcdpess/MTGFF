/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejbs;

import javax.annotation.PostConstruct;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import logica.MTGFFLogica;

/**
 *
 * @author jcdpess
 */
@Stateless
@Remote
public class MTGFF implements MTGFFRemote {

    @PersistenceContext(unitName="MTGFF-ejbPU")
    private EntityManager em;

    private MTGFFLogica logica;

    @PostConstruct
    private void init() {
        logica = new MTGFFLogica(em);
    }

    @Override
    public void persistirCartas() {
        logica.persistCards();
    }

    @Override
    public void persistirSets() {
        logica.persistSets();
    }
}
