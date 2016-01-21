/**
 * 
 */
package com.market.service;

import com.market.model.Market;

/**
 * @author Administrator
 *
 */
public interface MarketService {

	/****
	 * É¾³ı
	 * @return
	 */
	public int delete(Market market);
	
	/****
	 * ±£´æ
	 * @return
	 */	
	public int save(Market market);
	
	/****
	 * ¸üĞÂ
	 * @return
	 */	
	public int update(Market market);
}
