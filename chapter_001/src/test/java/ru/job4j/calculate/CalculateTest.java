package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
*@author Roman Merkin (roman.merkin@gmail.com)
*@version $ld$
*@since 0.1
*
*/
public class CalculateTest {
	/**
	*Test echo
	*
	*/	
	@Test
	public void whenTakeNameThenTreeEchoPlusName() {
		String input = "Roman Merkin";
		String expect = "Echo, echo, echo : Roman Merkin"; 
		Calculate calc = new Calculate();
		String result = calc.echo(input);
		assertThat(result, is(expect));	
	}
}