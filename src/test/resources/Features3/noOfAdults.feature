Feature: Booking hotel with various input details

Scenario Outline: verify booking with different number of adults

		Given user is on the login page , "<username>" And "<password>" and click the login button
		When user is logged in , selects the "<location>","<hotel>","<roomType>","<no_of_rooms>","<check_In>" And "<check_out>" And "<adults>" And "<children>" fields and click on the search button
		When user is navigated to the hotel selection page , select the hotel and click on continue
		And user should enter the "<first_name>","<last_name>" , "<address>","<credit_card>","<card_type>","<exp_mth>","<exp_year>","<cvv>"
		Then user should be able to click on the submit button
		And when user click on the show Itinerary button, the selected hotel should be displayed 


	Examples: 
  	|username|password|location|hotel|roomType|no_of_rooms|check_In|check_out|adults|children|first_name|last_name|address|credit_card|card_type|exp_mth|exp_year|cvv|
		|vamsinagasarapu|vamsi@1234|London|Hotel Sunshine|Standard|1 - One|24/08/2020|25/08/2020|1 - One|1 - One|ram|kumar|chennai|1234567891478526|VISA|March|2020|123|
		|vamsinagasarapu|vamsi@1234|London|Hotel Sunshine|Standard|1 - One|24/08/2020|25/08/2020|2 - Two|1 - One|ram|kumar|chennai|1234567891478526|VISA|March|2020|123|
		|vamsinagasarapu|vamsi@1234|London|Hotel Sunshine|Standard|1 - One|24/08/2020|25/08/2020|3 - Three|1 - One|ram|kumar|chennai|1234567891478526|VISA|March|2020|123|
		|vamsinagasarapu|vamsi@1234|London|Hotel Sunshine|Standard|1 - One|24/08/2020|25/08/2020|4 - Four|1 - One|ram|kumar|chennai|1234567891478526|VISA|March|2020|123|
	
	


 Scenario Outline: verify booking with different number of children

Given user is on the login page , "<username>" And "<password>" and click the login button
When user is logged in , selects the "<location>","<hotel>","<roomType>","<no_of_rooms>","<check_In>" And "<check_out>" And "<adults>" And "<children>" fields and click on the search button
When user is navigated to the hotel selection page , select the hotel and click on continue
And user should enter the "<first_name>","<last_name>" , "<address>","<credit_card>","<card_type>","<exp_mth>","<exp_year>","<cvv>"
Then user should be able to click on the submit button
And when user click on the show Itinerary button, the selected hotel should be displayed 


  Examples: 
  |username|password|location|hotel|roomType|no_of_rooms|check_In|check_out|adults|children|first_name|last_name|address|credit_card|card_type|exp_mth|exp_year|cvv|
	|vamsinagasarapu|vamsi@1234|London|Hotel Sunshine|Standard|1 - One|24/08/2020|25/08/2020|1 - One|0 - None|ram|kumar|chennai|1234567891478526|VISA|March|2020|123|
	|vamsinagasarapu|vamsi@1234|London|Hotel Sunshine|Standard|1 - One|24/08/2020|25/08/2020|1 - One|1 - One|ram|kumar|chennai|1234567891478526|VISA|March|2020|123|
	|vamsinagasarapu|vamsi@1234|London|Hotel Sunshine|Standard|1 - One|24/08/2020|25/08/2020|1 - One|2 - Two|ram|kumar|chennai|1234567891478526|VISA|March|2020|123|
	|vamsinagasarapu|vamsi@1234|London|Hotel Sunshine|Standard|1 - One|24/08/2020|25/08/2020|1 - One|3 - Three|ram|kumar|chennai|1234567891478526|VISA|March|2020|123|
	|vamsinagasarapu|vamsi@1234|London|Hotel Sunshine|Standard|1 - One|24/08/2020|25/08/2020|1 - One|4 - Four|ram|kumar|chennai|1234567891478526|VISA|March|2020|123|
	
	


Scenario Outline: verify booking with different number of rooms

Given user is on the login page , "<username>" And "<password>" and click the login button
When user is logged in , selects the "<location>","<hotel>","<roomType>","<no_of_rooms>","<check_In>" And "<check_out>" And "<adults>" And "<children>" fields and click on the search button
When user is navigated to the hotel selection page , select the hotel and click on continue
And user should enter the "<first_name>","<last_name>" , "<address>","<credit_card>","<card_type>","<exp_mth>","<exp_year>","<cvv>"
Then user should be able to click on the submit button
And when user click on the show Itinerary button, the selected hotel should be displayed 


Examples: 
  |username|password|location|hotel|roomType|no_of_rooms|check_In|check_out|adults|children|first_name|last_name|address|credit_card|card_type|exp_mth|exp_year|cvv|
	|vamsinagasarapu|vamsi@1234|London|Hotel Sunshine|Standard|1 - One|24/08/2020|25/08/2020|2 - Two|1 - One|ram|kumar|chennai|1234567891478526|VISA|March|2020|123|
	|vamsinagasarapu|vamsi@1234|London|Hotel Sunshine|Standard|2 - Two|24/08/2020|25/08/2020|2 - Two|1 - One|ram|kumar|chennai|1234567891478526|VISA|March|2020|123|
	|vamsinagasarapu|vamsi@1234|London|Hotel Sunshine|Standard|3 - Three|24/08/2020|25/08/2020|2 - Two|1 - One|ram|kumar|chennai|1234567891478526|VISA|March|2020|123|
	|vamsinagasarapu|vamsi@1234|London|Hotel Sunshine|Standard|4 - Four|24/08/2020|25/08/2020|2 - Two|1 - One|ram|kumar|chennai|1234567891478526|VISA|March|2020|123|
	|vamsinagasarapu|vamsi@1234|London|Hotel Sunshine|Standard|5 - Five|24/08/2020|25/08/2020|2 - Two|1 - One|ram|kumar|chennai|1234567891478526|VISA|March|2020|123|
	|vamsinagasarapu|vamsi@1234|London|Hotel Sunshine|Standard|6 - Six|24/08/2020|25/08/2020|2 - Two|1 - One|ram|kumar|chennai|1234567891478526|VISA|March|2020|123|
	|vamsinagasarapu|vamsi@1234|London|Hotel Sunshine|Standard|7 - Seven|24/08/2020|25/08/2020|2 - Two|1 - One|ram|kumar|chennai|1234567891478526|VISA|March|2020|123|
	|vamsinagasarapu|vamsi@1234|London|Hotel Sunshine|Standard|8 - Eight|24/08/2020|25/08/2020|2 - Two|1 - One|ram|kumar|chennai|1234567891478526|VISA|March|2020|123|
	|vamsinagasarapu|vamsi@1234|London|Hotel Sunshine|Standard|9 - Nine|24/08/2020|25/08/2020|2 - Two|1 - One|ram|kumar|chennai|1234567891478526|VISA|March|2020|123|
	|vamsinagasarapu|vamsi@1234|London|Hotel Sunshine|Standard|10 - Ten|24/08/2020|25/08/2020|2 - Two|1 - One|ram|kumar|chennai|1234567891478526|VISA|March|2020|123|


Scenario Outline: verify booking with different room types

Given user is on the login page , "<username>" And "<password>" and click the login button
When user is logged in , selects the "<location>","<hotel>","<roomType>","<no_of_rooms>","<check_In>" And "<check_out>" And "<adults>" And "<children>" fields and click on the search button
When user is navigated to the hotel selection page , select the hotel and click on continue
And user should enter the "<first_name>","<last_name>" , "<address>","<credit_card>","<card_type>","<exp_mth>","<exp_year>","<cvv>"
Then user should be able to click on the submit button
And when user click on the show Itinerary button, the selected hotel should be displayed 


Examples: 
  |username|password|location|hotel|roomType|no_of_rooms|check_In|check_out|adults|children|first_name|last_name|address|credit_card|card_type|exp_mth|exp_year|cvv|
	|vamsinagasarapu|vamsi@1234|London|Hotel Sunshine|Standard|1 - One|24/08/2020|25/08/2020|2 - Two|1 - One|ram|kumar|chennai|1234567891478526|VISA|March|2020|123|
	|vamsinagasarapu|vamsi@1234|London|Hotel Sunshine|Double|1 - One|24/08/2020|25/08/2020|2 - Two|1 - One|ram|kumar|chennai|1234567891478526|VISA|March|2020|123|
	|vamsinagasarapu|vamsi@1234|London|Hotel Sunshine|Deluxe|1 - One|24/08/2020|25/08/2020|2 - Two|1 - One|ram|kumar|chennai|1234567891478526|VISA|March|2020|123|
	|vamsinagasarapu|vamsi@1234|London|Hotel Sunshine|Super Deluxe|1 - One|24/08/2020|25/08/2020|2 - Two|1 - One|ram|kumar|chennai|1234567891478526|VISA|March|2020|123|


Scenario Outline: verify booking with different card types

Given user is on the login page , "<username>" And "<password>" and click the login button
When user is logged in , selects the "<location>","<hotel>","<roomType>","<no_of_rooms>","<check_In>" And "<check_out>" And "<adults>" And "<children>" fields and click on the search button
When user is navigated to the hotel selection page , select the hotel and click on continue
And user should enter the "<first_name>","<last_name>" , "<address>","<credit_card>","<card_type>","<exp_mth>","<exp_year>","<cvv>"
Then user should be able to click on the submit button
And when user click on the show Itinerary button, the selected hotel should be displayed 


Examples: 
  |username|password|location|hotel|roomType|no_of_rooms|check_In|check_out|adults|children|first_name|last_name|address|credit_card|card_type|exp_mth|exp_year|cvv|
	|vamsinagasarapu|vamsi@1234|London|Hotel Sunshine|Standard|1 - One|24/08/2020|25/08/2020|1 - One|1 - One|ram|kumar|chennai|1234567891478526|VISA|March|2020|123|
	|vamsinagasarapu|vamsi@1234|London|Hotel Sunshine|Standard|1 - One|24/08/2020|25/08/2020|1 - One|1 - One|ram|kumar|chennai|1234567891478526|American Express|March|2020|123|
	|vamsinagasarapu|vamsi@1234|London|Hotel Sunshine|Standard|1 - One|24/08/2020|25/08/2020|1 - One|1 - One|ram|kumar|chennai|1234567891478526|Master Card|March|2020|123|
	|vamsinagasarapu|vamsi@1234|London|Hotel Sunshine|Standard|1 - One|24/08/2020|25/08/2020|1 - One|1 - One|ram|kumar|chennai|1234567891478526|Other|March|2020|123|


























	