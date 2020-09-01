Feature: Hotel Booking and cancelling feature.

Scenario Outline: verify hotel booking and cancellation in one login session

		Given user is on the login page , "<username>" And "<password>" and click the login button
		When user is logged in , selects the "<location>","<hotel>","<roomType>","<no_of_rooms>","<check_In>" And "<check_out>" And "<adults>" And "<children>" fields and click on the search button
		When user is navigated to the hotel selection page , select the hotel and click on continue
		And user should enter the "<first_name>","<last_name>" , "<address>","<credit_card>","<card_type>","<exp_mth>","<exp_year>","<cvv>"
		Then user should be able to click on the submit button
		And when user click on the show Itinerary button, the selected hotel should be displayed
		When user selects the checkbox of the booked record and click on the cancel selected button , popup should appear.
		When Ok is selected in the popup, booking should be cancelled. 
		
	Examples: 
  	|username|password|location|hotel|roomType|no_of_rooms|check_In|check_out|adults|children|first_name|last_name|address|credit_card|card_type|exp_mth|exp_year|cvv|
		|vamsinagasarapu|vamsi@1234|London|Hotel Sunshine|Standard|1 - One|24/08/2020|25/08/2020|1 - One|1 - One|ram|kumar|chennai|1234567891478526|VISA|March|2020|123|
	
	
	
		
Scenario Outline: verify hotel booking alone

		Given user is on the login page , "<username>" And "<password>" and click the login button
		When user is logged in , selects the "<location>","<hotel>","<roomType>","<no_of_rooms>","<check_In>" And "<check_out>" And "<adults>" And "<children>" fields and click on the search button
		When user is navigated to the hotel selection page , select the hotel and click on continue
		And user should enter the "<first_name>","<last_name>" , "<address>","<credit_card>","<card_type>","<exp_mth>","<exp_year>","<cvv>"
		Then user should be able to click on the submit button
		And when user click on the show Itinerary button, the selected hotel should be displayed
		 
	Examples: 
  	|username|password|location|hotel|roomType|no_of_rooms|check_In|check_out|adults|children|first_name|last_name|address|credit_card|card_type|exp_mth|exp_year|cvv|
		|vamsinagasarapu|vamsi@1234|London|Hotel Sunshine|Standard|1 - One|24/08/2020|25/08/2020|1 - One|1 - One|ram|kumar|chennai|1234567891478526|VISA|March|2020|123|
				
			
				
Scenario Outline: verify cancelling already booked hotel

		Given user is on the login page , "<username>" And "<password>" and click the login button
		Then user is on the search hotel page and clicks on the Booked Itinerary
		When user selects the checkbox of the booked record and click on the cancel selected button , popup should appear.
		When Ok is selected in the popup, booking should be cancelled.
		
	Examples: 
  	|username|password|
  	|vamsinagasarapu|vamsi@1234|
  	
  	
  	
  	 				