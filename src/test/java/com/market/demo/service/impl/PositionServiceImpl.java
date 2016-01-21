/**
 * 
 */
package com.market.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.market.demo.dao.PositionDao;
import com.market.demo.model.Position;
import com.market.demo.service.PositionService;

/**
 * @author LiXiaoHao
 *
 */
@Service("positionService")
public class PositionServiceImpl implements PositionService {

	@Autowired
	private PositionDao positionDao;
	public List<Position> findAll() {
		// TODO Auto-generated method stub
		return positionDao.findAll();
	}
	public Position findById(Long id) {
		// TODO Auto-generated method stub
		return this.positionDao.findById(id);
	}
	public void clear() {
		// TODO Auto-generated method stub
		this.positionDao.clear();
	}
	
	public void update(Position position) {
		// TODO Auto-generated method stub
		this.positionDao.update(position);
	}
	
	public void updates(Position position1,Position position2) {
		// TODO Auto-generated method stub
		this.positionDao.update(position1);
		this.positionDao.update(position2);
	}

}
