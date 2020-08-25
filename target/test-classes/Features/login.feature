Feature: search for hotels

Scenario Outline: searching for the available hotels

  Given Adactin page is opened
	When I entered the username and password
	Then i should click the login button
	Given user is logged into the application.
	When user selects the "<location>","<hotel>","<roomType>","<no_of_rooms>","<check_In>" And "<check_out>" fields
	And selected the "<adults>" And "<children>"
	And clicked on the search button.
	And select the hotel
	And click on the continue button
	And enter the "<first_name>","<last_name>","<address>"
	And enter the credit card number "<credit_card>"
	And select the credit card type "<card_type>"
	And select expiry month "<exp_mth>"
	And select expiry year "<exp_year>"
	And enter CVV "<cvv>"
	And click on submit button
	And click on the show itinerary button

Examples:
	|location|hotel|roomType|no_of_rooms|check_In|check_out|adults|children|first_name|last_name|address|credit_card|card_type|exp_mth|exp_year|cvv|
	|London|Hotel Sunshine|Standard|1 - One|24/08/2020|25/08/2020|2 - Two|1 - One|ram|kumar|chennai|1234567891478526|VISA|March|2020|123|
	|Sydney|Hotel Creek|Double|2 - Two|25/08/2020|26/08/2020|2 - Two|1 - One|aaa|bbb|Hyderabad|8521479634569515|VISA|March|2020|369|
	|Melbourne|Hotel Hervey|Standard|1 - One|24/08/2020|27/08/2020|2 - Two|1 - One|hari|kumaran|Banglore|1234567891478526|VISA|March|2020|963|
	|London|Hotel Sunshine|Deluxe|1 - One|24/08/2020|25/08/2020|2 - Two|1 - One|ram|kumar|noida|1234567891478526|VISA|March|2020|123|
	|New York|Hotel Sunshine|Standard|1 - One|25/08/2020|27/08/2020|2 - Two|1 - One|ram|kumar|Mumbai|1234567891478526|VISA|March|2020|782|
	|London|Hotel Sunshine|Double|1 - One|24/08/2020|25/08/2020|2 - Two|1 - One|Dave|richard|Kolkata|1234567891478526|VISA|March|2020|918|
	|Paris|Hotel Sunshine|Standard|1 - One|26/08/2020|29/08/2020|2 - Two|1 - One|sam|kumar|Visakhapatnam|1234852891478526|VISA|March|2020|555|
	|London|Hotel Sunshine|Standard|1 - One|24/08/2020|25/08/2020|2 - Two|1 - One|Mano|kumar|Amaravathi|1234567753478526|VISA|March|2020|985|
	|Brisbane|Hotel Sunshine|Standard|1 - One|24/08/2020|25/08/2020|2 - Two|1 - One|ram|vijay|Trivandram|1234456852478526|VISA|March|2020|753|
	|London|Hotel Sunshine|Standard|1 - One|24/08/2020|25/08/2020|2 - Two|1 - One|ram|kumar|Manglore|1234562489648526|VISA|March|2020|123|
	

