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
	 * ��ѯ����
	 * @return
	 */
	public List<Position> findAll();
	/****
	 * ��ѯ����
	 * @return
	 */
	public Position findById(Long id);
	
	/****
	 * ���
	 */
	public void clear();
	
	public void update(Position position);
	
}
