package test1;

import java.util.Scanner;

public class Assignment {
	

   public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
		{
			int count1=100;
			for (int i=0;i<count1;i++)
			{
				System.out.print("=");
			}
			System.out.println("\n");
			System.out.println("\t FEDERATION UNIVERSITY PHONE BILL COMPARISON SYSTEM");
			System.out.println( );
			System.out.println("Developed by Nian Liu, student ID 30332500, for ITECH1000 Sem1 2017");
			System.out.println("\n");
			int count2=100;
			for (int i=0;i<count2;i++)
			{
				System.out.print("=");
			}
			System.out.println("\n");
			handleMainMenu();
			
		}
   }
   
            /**
			 * handle MainMenu
			 * grab the user input
			 */
   public static Integer phoneCallLen=0;
   public static Integer phoneCallCount=0;
   public static Integer smsCount=0;
   public static Integer dataUsage=0;
   
	public static void handleMainMenu() 
			{
				printMainMenu();
				Scanner inputMain = new Scanner(System.in); 
				Integer sel = inputMain.nextInt();
				inputMain.nextLine();
				while (sel!=6)
				{
					switch (sel)
					{
						case 1: handleEnterUsageDetail();
						break;
						case 2: handleDisplayCostUnderPlanA(); 
						break;
						case 3: handleDisplayCostUnderPlanB(); 
						break;
						case 4: handleClearUsageDetails(); 
						break;
						case 5: handleDisplayCostUnderPlanC();
						break;
						default: System.out.println("Value must be between 1 and 5. Please try again:");
					}
					printMainMenu();
					sel = inputMain.nextInt();
					inputMain.nextLine();
				}
				if (sel==6)
				{
					handleExitSystem();
				}
				//inputMain.close();
			}
			
			/**
			 * handle the user input in Enter Usage Details
			 */
			public static void handleEnterUsageDetail() 
			{
				printEnterUsageDetail();
				Scanner inputUsageDetail = new Scanner(System.in); 
				Integer sel = inputUsageDetail.nextInt();
				inputUsageDetail.nextLine();
				while (sel!=4)
				{
					switch (sel)
					{
						case 1: handlePhoneCall();
						break;
						case 2: handleSMS(); 
						break;
						case 3: handleDataUsage(); 
						break;
						//case 4: break;
						default: System.out.println("Value must be between 1 and 4. Please try again:");
					}
					printEnterUsageDetail();
					sel = inputUsageDetail.nextInt();
					inputUsageDetail.nextLine();
				}
				
				//inputUsageDetail.close();
			}
			
			/**
			 * handle the user input in phone call and count the call length
			 */
			public static void handlePhoneCall() 
			{
				System.out.println("Enter call length in seconds:");
				Scanner inputPhoneCallLen = new Scanner(System.in);
				Integer sel = inputPhoneCallLen.nextInt();
				inputPhoneCallLen.nextLine();
				while (sel<=0)
				{
					System.out.println("Value must be positive. Please try again:");
					sel = inputPhoneCallLen.nextInt();
					inputPhoneCallLen.nextLine();
				}
				phoneCallLen += sel;
				phoneCallCount++;
				//inputPhoneCallLen.close();
			}
			
			/**
			 * handle SMS
			 */
			public static void handleSMS() 
			{
				smsCount++;
				System.out.println("Total number of SMS so far = "+smsCount);
			}
			
			/**
			 *  handle data usage
			 */
			public static void handleDataUsage() 
			{
				System.out.println("Enter the amount of data in MB:");
				Scanner inputDataUsage = new Scanner(System.in); 
				Integer sel = inputDataUsage.nextInt();
				inputDataUsage.nextLine();
				while (sel<=0)
				{
					System.out.println("Value must be positive. Please try again:");
					sel = inputDataUsage.nextInt();
					inputDataUsage.nextLine();
				}
				dataUsage = sel;
				//inputDataUsage.close();
			}
			
			public static void handleDisplayCostUnderPlanA() 
			{
				int costPhoneCall = phoneCallLen * 23;
				int costCallTimes = phoneCallCount * 2;
				int costSMS = smsCount * 12;
				int costData = dataUsage * 3;
				int totalCost = costPhoneCall + costCallTimes + costSMS + costData;
				
				System.out.println("Cost under Plan A");
				displayEqualMarkLine(40);
				System.out.print("Number of calls = "+costPhoneCall+"\t");
				displayAsDollarsAndCents(costPhoneCall);
				System.out.println();
				System.out.print("Total call time (secs) = "+costCallTimes+"\t");
				displayAsDollarsAndCents(costCallTimes);
				System.out.println();
				System.out.print("Number of SMS = "+smsCount+"\t");
				displayAsDollarsAndCents(costSMS);
				System.out.println();
				System.out.print("Data usage (MB) = "+dataUsage+"\t");
				displayAsDollarsAndCents(costData);
				System.out.println();
				displayEqualMarkLine(40);
				System.out.print("TOTAL COST\t");
				displayAsDollarsAndCents(totalCost);
				System.out.println();
			}
			
			public static void handleDisplayCostUnderPlanB() 
			{
				int costPhoneCall = phoneCallLen * 17;
				int costCallTimes = phoneCallCount * 3;
				int costSMS = smsCount * 15;
				int costData = dataUsage * 2;
				int totalCost = costPhoneCall + costCallTimes + costSMS + costData;
				
				System.out.println("Cost under Plan B");
				displayEqualMarkLine(40);
				System.out.print("Number of calls = "+costPhoneCall+"\t");
				displayAsDollarsAndCents(costPhoneCall);
				System.out.println();
				System.out.print("Total call time (secs) = "+costCallTimes+"\t");
				displayAsDollarsAndCents(costCallTimes);
				System.out.println();
				System.out.print("Number of SMS = "+smsCount+"\t");
				displayAsDollarsAndCents(costSMS);
				System.out.println();
				System.out.print("Data usage (MB) = "+dataUsage+"\t");
				displayAsDollarsAndCents(costData);
				System.out.println();
				displayEqualMarkLine(40);
				System.out.print("TOTAL COST\t");
				displayAsDollarsAndCents(totalCost);
				System.out.println();
			}
			public static void handleDisplayCostUnderPlanC() 
			{
				int costPhoneCall = phoneCallLen * 11;
				int costCallTimes = phoneCallCount * 3;
				int costSMS = smsCount * 9;
				int costData = dataUsage * 2;
                int totalCost = costPhoneCall + costCallTimes + costSMS + costData;
                if (costData>100)
				{ 
					costData=dataUsage*1;
				}
				
				System.out.println("Cost under Plan C");
				displayEqualMarkLine(40);
				System.out.print("Number of calls = "+costPhoneCall+"\t");
				displayAsDollarsAndCents(costPhoneCall);
				System.out.println();
				System.out.print("Total call time (secs) = "+costCallTimes+"\t");
				displayAsDollarsAndCents(costCallTimes);
				System.out.println();
				System.out.print("Number of SMS = "+smsCount+"\t");
				displayAsDollarsAndCents(costSMS);
				System.out.println();
				System.out.print("Data usage (MB) = "+dataUsage+"\t");
				displayAsDollarsAndCents(costData);
				System.out.println();
				displayEqualMarkLine(40);
				System.out.print("TOTAL COST\t");
				displayAsDollarsAndCents(totalCost);
				System.out.println();
				
				}
			
			public static void handleClearUsageDetails()
			{
				phoneCallLen=0;
				phoneCallCount=0;
				smsCount=0;
				dataUsage=0;
				displayEqualMarkLine(70);
				System.out.println("ALL USAGE DETAILS HAVE BEEN RESET TO 0");
				displayEqualMarkLine(70);
			}
			
			public static void handleExitSystem()
			{
				displayEqualMarkLine(70);
				System.out.println("Thank you for using this software. We hope you found it useful.");
				displayEqualMarkLine(70);
			}
			
			
			public static void printMainMenu() 
			{
				System.out.println("MAIN MENU\nPlease select an option from the menu:");
				System.out.println("1. Enter Usage Details\n"+
						"2. Display Cost Under Plan A\n"+
						"3. Display Cost Under Plan B\n"+
						"4. Clear Usage Details\n"+
						"5. Display Cost Under Plan C\n"+
						"6. Exit System\n");

			}
			
			public static void printEnterUsageDetail() 
			{
				System.out.println("ENTER USAGE DETAILS MENU\n"+
						"Please select an option from the menu:");
				System.out.println("1.Phone Call\n"+
						"2. SMS\n"+
						"3. Data Usage\n"+
						"4. Return to main menu");

			}
			
			private static void displayAsDollarsAndCents(int cents)
			{
				System.out.print("$" + (cents/100) + "." + (cents%100));
			}
			
			private static void displayEqualMarkLine(Integer number)
			{
				for(int i=0;i<number;i++)
				{
					System.out.print("=");
				}
				System.out.println();
			}
}
   

	


