/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import ejbs.MTGFFRemote;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author jcdpess
 */
@WebService(serviceName = "NewWebService")
@Stateless()
public class NewWebService {

    @EJB(lookup = "java:global/MTGFF-EAR/MTGFF-ejb/MTGFF!ejbs.MTGFFRemote")
    private MTGFFRemote mTGFF;

    /**
     * This is a sample web service operation
     *
     * @param txt
     * @return
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     *
     * @return
     */
    @WebMethod(operationName = "uploadCards")
    public String uploadCards() {
        System.out.println("");
        mTGFF.persistirCartas();
        return "UploadCards";
    }

    /**
     * Web service operation
     *
     * @return
     */
    @WebMethod(operationName = "uploadSets")
    public String uploadSets() {
        System.out.println("");
        mTGFF.persistirSets();
        return "UploadSets";
    }
}
