/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ncpa.facade;

import ncpa.entity.Area;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author IT
 */
@Stateless
public class AreaFacade extends AbstractFacade<Area> {
    @PersistenceContext(unitName = "ncpaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AreaFacade() {
        super(Area.class);
    }
    
    
    
    
    
    
}
