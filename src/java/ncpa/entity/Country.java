/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ncpa.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Inheritance;

/**
 *
 * @author Buddhika
 */
@Entity
@Inheritance
public class Country extends Area implements Serializable {

    public Country() {
    }
    
}
