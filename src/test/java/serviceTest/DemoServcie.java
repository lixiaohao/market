package serviceTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.market.demo.model.Position;
import com.market.demo.service.PositionService;

/**
 * Created by Administrator on 2016/1/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext-hbt.xml"})
public class DemoServcie {
	@Autowired
	private PositionService positionService;
	
	@Test
	public void findAllTest(){
		List<Position> pList = new ArrayList<Position>();
		pList = positionService.findAll();
		for(Position p:pList){
			System.out.println(p.toString());	
		}
		
	}
	
	@Test
	public void findById(){
		Position position = positionService.findById(1l);
		System.out.println(position.toString());
	}
}
