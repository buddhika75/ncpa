/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ncpa.facade;

import ncpa.entity.PersonContact;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author IT
 */
@Stateless
public class PersonContactFacade extends AbstractFacade<PersonContact> {
    @PersistenceContext(unitName = "ncpaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonContactFacade() {
        super(PersonContact.class);
    }
    
    
    
    
    
    
}
