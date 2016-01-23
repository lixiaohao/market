package serviceTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.market.demo.model.Position;
import com.market.demo.service.PositionService;

/**
 * Created by Administrator on 2016/1/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(defaultRollback = true)
//@Transactional()
@ContextConfiguration(locations={"/applicationContext-hbt1.xml"})
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
	       
	@Test
	public void clearTest(){
		positionService.clear();
	}
	
	@Test
	public void updateTest(){
		Position position = new Position();
		position.setId(1l);
		position.setDeparment("999");
		position.setName("ºÇºÇfsafs");
		
		positionService.update(position);
	}
	
	@Test
	public void saveTest(){
		Position position = new Position();
//		position.setId(3l);
		position.setDeparment("1234");
		position.setName("savesss");
		
		positionService.save(position);;
	}
}
