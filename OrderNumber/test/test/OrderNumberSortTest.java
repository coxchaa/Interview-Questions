package test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import com.order.OrderNumber;

import org.junit.jupiter.api.Test;

/* Instructions:
 * Write the contents of the OrderNumber class that will satisfy the below test case(s).
 * An order number can contain any alpha numeric characters and/or a '-'.  Any alpha or '-'
 * characters should sort naturally against any other alpha or '-' charters.  Any Numeric
 * characters should be grouped contiguously and sort as their value against any other numeric
 * characters.  Any alpha or '-' characters should sort before numeric charters.
 * 
 * Examples:
 * abc should sort before 123.
 * 945 should sort before 01234.
 * abc should sort befere xyz.
 * ayz should sort before byz.
 */

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

		
		List<OrderNumber> unsortedList = new ArrayList<OrderNumber>(sortList);
		Collections.shuffle(unsortedList);
		Collections.sort(unsortedList);
		int count=0;
		for(OrderNumber on: unsortedList) {
			System.out.println(on.getData()+ " " + sortList.get(count).getData());
			assertEquals(on.getData(),sortList.get(count).getData());
			count++;
		}
	}

}
