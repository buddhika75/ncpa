/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ncpa.facade;

import ncpa.entity.WebUserRole;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author IT
 */
@Stateless
public class WebUserRoleFacade extends AbstractFacade<WebUserRole> {
    @PersistenceContext(unitName = "ncpaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public WebUserRoleFacade() {
        super(WebUserRole.class);
    }
    
}
