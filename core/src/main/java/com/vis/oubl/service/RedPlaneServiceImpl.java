// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: Data::com.vis.oubl::service::RedPlaneService
 * STEREOTYPE:  Service
 */
package com.vis.oubl.service;

import com.vis.oubl.vo.RedPlaneServiceVO;

/**
 * @see com.vis.oubl.service.RedPlaneService
 */
public class RedPlaneServiceImpl
    extends RedPlaneServiceBase
{

    /**
     * @see com.vis.oubl.service.RedPlaneService#getRedPlanerService()
     */
    protected  RedPlaneServiceVO[] handleGetRedPlanerService()
        throws Exception
    {
        // TODO implement protected  RedPlaneServiceVO[] handleGetRedPlanerService()
      //  throw new UnsupportedOperationException("com.vis.oubl.service.RedPlaneService.handleGetRedPlanerService() Not implemented!");
  return this.getRedPlaneServiceDao().toRedPlaneServiceVOArray(this.getRedPlaneServiceDao().loadAll());
    }

}