/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ncpa.facade;

import ncpa.entity.InstitutionType;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author IT
 */
@Stateless
public class InstitutionTypeFacade extends AbstractFacade<InstitutionType> {
    @PersistenceContext(unitName = "ncpaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public InstitutionTypeFacade() {
        super(InstitutionType.class);
    }
    
}
