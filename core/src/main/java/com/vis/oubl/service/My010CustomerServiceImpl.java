// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: Data::com.vis.oubl::service::My010CustomerService
 * STEREOTYPE:  Service
 */
package com.vis.oubl.service;

import com.vis.oubl.vo.My010CustomerVO;

/**
 * @see com.vis.oubl.service.My010CustomerService
 */
public class My010CustomerServiceImpl
    extends My010CustomerServiceBase
{

    /**
     * @see com.vis.oubl.service.My010CustomerService#getCustomernfoByMobileNumber(Long)
     */
    protected  My010CustomerVO handleGetCustomernfoByMobileNumber(Long mobileNumber)
        throws Exception
    {
        // TODO implement protected  My010CustomerVO handleGetCustomernfoByMobileNumber(Long mobileNumber)
        throw new UnsupportedOperationException("com.vis.oubl.service.My010CustomerService.handleGetCustomernfoByMobileNumber(Long mobileNumber) Not implemented!");
    }

    /**
     * @see com.vis.oubl.service.My010CustomerService#getAllCustomers()
     */
    protected  My010CustomerVO[] handleGetAllCustomers()
        throws Exception
    {
        // TODO implement protected  My010CustomerVO[] handleGetAllCustomers()
     //   throw new UnsupportedOperationException("com.vis.oubl.service.My010CustomerService.handleGetAllCustomers() Not implemented!");
return  getMy010CustomerDao().toMy010CustomerVOArray(getMy010CustomerDao().loadAll());
    }

    /**
     * @see com.vis.oubl.service.My010CustomerService#getCustomerById(Long)
     */
    protected  My010CustomerVO handleGetCustomerById(Long id)
        throws Exception
    {
        // TODO implement protected  My010CustomerVO handleGetCustomerById(Long id)
        throw new UnsupportedOperationException("com.vis.oubl.service.My010CustomerService.handleGetCustomerById(Long id) Not implemented!");
    }

    /**
     * @see com.vis.oubl.service.My010CustomerService#createCustomer(My010CustomerVO)
     */
    protected  Integer handleCreateCustomer(My010CustomerVO patient)
        throws Exception
    {
        // TODO implement protected  Integer handleCreateCustomer(My010CustomerVO patient)
        throw new UnsupportedOperationException("com.vis.oubl.service.My010CustomerService.handleCreateCustomer(My010CustomerVO patient) Not implemented!");
    }

    /**
     * @see com.vis.oubl.service.My010CustomerService#editCustomer(My010CustomerVO)
     */
    protected  Integer handleEditCustomer(My010CustomerVO patient)
        throws Exception
    {
        // TODO implement protected  Integer handleEditCustomer(My010CustomerVO patient)
        throw new UnsupportedOperationException("com.vis.oubl.service.My010CustomerService.handleEditCustomer(My010CustomerVO patient) Not implemented!");
    }

    /**
     * @see com.vis.oubl.service.My010CustomerService#deleteCustomer(Long)
     */
    protected  Integer handleDeleteCustomer(Long id)
        throws Exception
    {
        // TODO implement protected  Integer handleDeleteCustomer(Long id)
        throw new UnsupportedOperationException("com.vis.oubl.service.My010CustomerService.handleDeleteCustomer(Long id) Not implemented!");
    }

	@Override
	protected String handleGetBalance(Integer custid) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}