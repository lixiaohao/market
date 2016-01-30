/**
 * 
 */
package serviceTest;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.market.dao.MarketDao;
import com.market.model.Market;
import com.market.service.MarketService;

/**
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(defaultRollback=true)
@ContextConfiguration(locations={"/applicationContext-hbt.xml"})
public class MarketServiceTest {

	@Autowired
	private MarketService marketService;
	@Test
	public void deleteTest(){
		
//		market.set
//		marketService.delete(market)
	}
	
	@Test
	public void saveTest(){
		Market market = new Market();
		market.setAddress("����.����");
		market.setComment("����˳��ܺ�");
		market.setName("����ũó�г�");
//		market.setCreateDate(new Date());
		marketService.save(market);
	}
}
