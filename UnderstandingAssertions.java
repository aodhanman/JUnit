import org.junit.Assert;
import org.junit.Test;

public class UnderstandingAssertions {


	@Test
		public void testFriendListFacebook(){
			int actual_total_friends=100;//selenium
			int expected_total_friends=100;//xlsx file
			
			/*if (actual_total_friends==expected_total_friends){
			System.out.println("Pass");}
			else {System.out.println("Fail");
			}*/

			//syntax of method
			//Assert.assertEquals(expected,actual);

			System.out.println("A");

			try{
			Assert.assertEquals(expected_total_friends,actual_total_friends);

			}  

			catch(Throwable t){

			System.out.println("Error encountered");
			//java code -report error

			//errCollector.addError(t);
			}
			System.out.println("B");

			}


	}
