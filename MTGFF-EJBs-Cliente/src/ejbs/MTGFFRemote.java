/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejbs;

import javax.ejb.Remote;

/**
 *
 * @author jcdpess
 */
@Remote
public interface MTGFFRemote {

    public void persistirCartas();

    public void persistirSets();

}
