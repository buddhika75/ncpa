/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ncpa.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ncpa.entity.PoliceStation;

/**
 *
 * @author IT
 */
@Stateless
public class PoliceStationFacade extends AbstractFacade<PoliceStation> {
    @PersistenceContext(unitName = "ncpaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PoliceStationFacade() {
        super(PoliceStation.class);
    }
    
}
