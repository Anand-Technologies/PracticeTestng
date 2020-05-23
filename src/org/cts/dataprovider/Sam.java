package org.cts.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sam {

	@Test(dataProvider="sam")
	private void meth(String s1,int s2) {
		System.out.println(s1);
		System.out.println(s2);
	}
	
	
	@DataProvider(name="sam")
	public Object[][]  sa(){
		
		return new Object[][] {
			{"nisha",2345678	},
			{"java",26745345	},
		};
	}
}
