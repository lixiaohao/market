/**
 * 
 */
package com.market.service;

import com.market.model.Market;

/**
 * @author LiXiaoHao
 *
 */
public interface MarketService {

	/****
	 * ɾ��
	 * @return
	 */
	public int delete(Market market);
	
	/****
	 * ����
	 * @return
	 */	
	public int save(Market market);
	
	/****
	 * ����
	 * @return
	 */	
	public int update(Market market);
}
