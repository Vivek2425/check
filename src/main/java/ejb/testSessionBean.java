/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package ejb;

import entity.Usertb;
import java.util.Collection;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author root
 */
@Stateless
public class testSessionBean implements testSessionBeanLocal {
    
    @PersistenceContext(unitName = "vivekPu")
    EntityManager em;
    
    @Override
    public Collection<Usertb> getAll() {
       return em.createNamedQuery("Usertb.findAll").getResultList();
    }
    
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void insertuser(Integer Id, String name, String pass) {
        Usertb u = new Usertb();
        u.setId(Id);
        u.setName(name);
        u.setPassword(pass);
        em.persist(u);
    }

    @Override
    public void UPDATEuser(Integer Id, String name, String pass) {

           Usertb u = (Usertb) em.find(Usertb.class, Id);
        u.setName(name);
        u.setPassword(pass);
        em.merge(u);
        
    }

    @Override
    public void REMOVEuser(Integer Id) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
           Usertb u = (Usertb) em.find(Usertb.class, Id);
        em.remove(u);
    }
    
    
    
    
    
}
