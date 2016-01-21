/**
 * 
 */
package com.market.demo.service;

import java.util.List;

import com.market.demo.model.Position;

/**
 * @author Administrator
 *
 */
public interface PositionService {
	/****
	 * 查询所有
	 * @return
	 */
	public List<Position> findAll();
	/****
	 * 查询所有
	 * @return
	 */
	public Position findById(Long id);
	
	/****
	 * 清空
	 */
	public void clear();
	
	public void update(Position position);
	
}
