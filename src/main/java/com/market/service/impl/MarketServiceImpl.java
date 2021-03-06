/**
 * 
 */
package com.market.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.market.dao.MarketDao;
import com.market.model.Market;
import com.market.service.MarketService;

/**
 * @author LiXiaoHao
 *
 */
@Service("marketService")
public class MarketServiceImpl implements MarketService {

	@Autowired
	private MarketDao marketDao;
	
	/* (non-Javadoc)
	 * @see com.market.service.MarketService#delete()
	 */
	public int delete(Market market) {
		// TODO Auto-generated method stub
		try {
			marketDao.remove(market);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	/* (non-Javadoc)
	 * @see com.market.service.MarketService#save(com.market.model.Market)
	 */
	public int save(Market market) {
		// TODO Auto-generated method stub
		try {
			marketDao.save(market);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	/* (non-Javadoc)
	 * @see com.market.service.MarketService#update(com.market.model.Market)
	 */
	public int update(Market market) {
		// TODO Auto-generated method stub
		try {
			this.marketDao.update(market);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

}
