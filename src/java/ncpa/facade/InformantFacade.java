/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ncpa.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ncpa.entity.Informant;

/**
 *
 * @author IT
 */
@Stateless
public class InformantFacade extends AbstractFacade<Informant> {
    @PersistenceContext(unitName = "ncpaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public InformantFacade() {
        super(Informant.class);
    }
    
}
