package test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import com.order.OrderNumber;

import org.junit.jupiter.api.Test;

class OrderNumberSortTest {

	@Test
	void OrderNumerSortTest() {
		List<OrderNumber> sortList = new ArrayList<OrderNumber>();
		sortList.add(new OrderNumber("abc1hdj8894f9-45hj"));
		sortList.add(new OrderNumber("abc954hdj8894f9-45hj"));
		sortList.add(new OrderNumber("abc01234hdj894f9-45hj"));
		sortList.add(new OrderNumber("abc1234hdj8894f9-45hj"));
		sortList.add(new OrderNumber("abc1234hdj8894f9-45hj"));
		sortList.add(new OrderNumber("abc1234hdj8894f9-45hj"));
		sortList.add(new OrderNumber("abc1234hdj8894f9-45hj"));
		sortList.add(new OrderNumber("abc1234hdj8894f9-45hj"));
		sortList.add(new OrderNumber("abc1234hdj8894f9-45hj"));
		sortList.add(new OrderNumber("abc1234hdj8894f9-45hj"));
		sortList.add(new OrderNumber("abc012345hdj8894f9-45hj"));
		sortList.add(new OrderNumber("a012345hdj8894f9-45hj"));
		

		
		List<OrderNumber> unsortedList = new ArrayList<OrderNumber>(sortList);
		Collections.shuffle(unsortedList);
		Collections.sort(unsortedList);
		int count=0;
		for(OrderNumber on: unsortedList) {
			System.out.println(on.getData()+ " " + sortList.get(count).getData());
			assertEquals(on.getData(),sortList.get(count).getData());
			count++;
		}
		//assertEquals(sortList,unsortedList);
	}

}
