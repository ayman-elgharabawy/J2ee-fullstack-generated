
package com.vis.oubl.service;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.vis.oubl.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.vis.oubl.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllRFIDResponse }
     * 
     */
    public GetAllRFIDResponse createGetAllRFIDResponse() {
        return new GetAllRFIDResponse();
    }

    /**
     * Create an instance of {@link GetAllItems }
     * 
     */
    public GetAllItems createGetAllItems() {
        return new GetAllItems();
    }

    /**
     * Create an instance of {@link GetAllRFID }
     * 
     */
    public GetAllRFID createGetAllRFID() {
        return new GetAllRFID();
    }

    /**
     * Create an instance of {@link GetAllItemsResponse }
     * 
     */
    public GetAllItemsResponse createGetAllItemsResponse() {
        return new GetAllItemsResponse();
    }

}
