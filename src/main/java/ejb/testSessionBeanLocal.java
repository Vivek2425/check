/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package ejb;

import entity.Usertb;
import java.util.Collection;
import javax.ejb.Local;

/**
 *
 * @author root
 */
@Local
public interface testSessionBeanLocal {
    Collection<Usertb> getAll();
    void insertuser(Integer Id,String name,String pass);
    void UPDATEuser(Integer Id,String name,String pass);
    void REMOVEuser(Integer Id);
    
}
