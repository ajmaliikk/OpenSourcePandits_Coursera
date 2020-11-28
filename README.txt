Problem Statement : Identify Courses

Search and display all web development courses 
1. Should be for beginners level.
2. Courses offered in English language
3. Display first two courses with name, total learning hours and rating.
(Suggested Site: coursera.org however  you are free to choose any other legitimate  site) 

Detailed Description: HackathIdeas

1. Search for web development courses for Beginners level & English Language and extract the course names, total learning hours & rating for first 2 courses
2. Look for Language Learning; Extract all the languages and different levels with its total count & display them
3. In Home page, go to "For Enterprise"; Look into Courses for Campus under Product; Fill the  "Ready to transform" form with any one input invalid (example: email); Capture the error message & display

Pre-requisites:
(1) Java version used: jdk1.8.0.261
(2) Selenium version used: 3.141.59.jar
(3) Testng version used: 7.0.0
(4) Maven version used: 3.6.3
(5) Commons-io version used: 2.6
(6) Apache poi version used: 4.1.2
(7) JSON version used : 1.1.1
(8) Extend report version used : 3.1.5
(9) Jenkins version : 2.249.3
(10) Selenium grid version: selenium-server-standalone-3.141.59
(9) Chrome browser version: 72.0.3626.121
(10) Firefox browser version: 83.0.3

solution:

1.Navigate to 'https://www.coursera.org/'

2.Read the Course type 'Web Development' from json file and search

3.Read the Language type 'English' from json file and select that

4.Read the Level type 'Beginner' from json file and select that

5.Get the first two course Name and rating

6.Click on first course and get the duration detail from new tab

7.Close the new tab and Store 'courseName', 'courseRating', 'duration' of selected course to first sheet of excel

8.Click on second course and get the duration detail from new tab

9.Close the new tab and Store 'courseName', 'courseRating', 'duration' of selected course to first sheet of excel

10.Navigate to home page and Read 'Langauge Learning' from json file and search

11.Get the details of 'Language name','individual course count' and store it in second sheet of excel

12.Get the details of 'Level name','individual level course' and store it in third sheet of excel

13.Navigate to Ready to transform form and fill it with valid details

14.Close the browser

15.Open the browser and  navigate to Ready to transform form and fill with invalid details

16.Close the browser

----------------------------------------------------------------------------------------------------------------
#To Run the test with specified browser only use:
----------------------------------------------------------------------------------------------------------------

1. firefox.xml
2. chrome.xml

----------------------------------------------------------------------------------------------------------------
#test-output :
----------------------------------------------------------------------------------------------------------------

Browser selected: firefox
1. Web Design for Everybody: Basics of Web Development & Coding
   Rating: 4.7
   Approx. 6 months to complete

2. Introduction to Web Development
   Rating: 4.7
   Approx. 22 hours to complete
File created successfully
************************************************************
Langugaes are Displayed
Languages and their course count
{English=1193, Spanish=503, Russian=436, French=408, Portuguese=330, Arabic=184, Korean=148, Chinese (China)=147, Vietnamese=132, German=128, Turkish=90, Portuguese (Brazil)=81, Japanese=65, Italian=60, Chinese=46, Persian=37, Chinese (Traditional)=34, Ukrainian=24, Greek=23, Hindi=19, Romanian=15, Dutch=13, Catalan=12, Hebrew=12, Thai=11, Indonesian=8, Polish=8, Urdu=8, Afrikaans=7, Serbian=7, Mongolian=6, Portuguese (Portugal)=6, Tamil=6, Slovak=5, Bengali=4, Czech=4, Hungarian=4, Telugu=4, Lithuanian=3, Albanian=2, Bulgarian=2, Burmese=2, Estonian=2, Georgian=2, Kazakh=2, Uzbek=2, Croatian=1, Javanese=1, Marathi=1, Swedish=1}
Total Courses: 4249
Language sheet created successfully


Levels are Displayed
Levels and their course count
{Intermediate=519, Beginner=488, Mixed=239, Advanced=73}
Total Courses: 1319
Level sheet created successfully


Valid Form Fill-up Started
Valid Form Fill-up completed

Form Fill-up initiated
Form filled with invalid details
Form Fill-up initiated
Form filled with invalid details
Form Fill-up initiated
Form filled with invalid details
Form Fill-up initiated
Form filled with invalid details
Form Fill-up initiated
Form filled with invalid details
Form Fill-up initiated
Form filled with invalid details
Form Fill-up initiated
Form filled with invalid details
Form Fill-up initiated
Form filled with invalid details

Browser selected: chrome

1. Web Design for Everybody: Basics of Web Development & Coding
   Rating: 4.7
   Approx. 6 months to complete

2. Introduction to Web Development
   Rating: 4.7
   Approx. 22 hours to complete
File created successfully
************************************************************
Langugaes are Displayed
Languages and their course count
{English=1193, Spanish=503, Russian=436, French=408, Portuguese=330, Arabic=184, Korean=148, Chinese (China)=147, Vietnamese=132, German=128, Turkish=90, Portuguese (Brazil)=81, Japanese=65, Italian=60, Chinese=46, Persian=37, Chinese (Traditional)=34, Ukrainian=24, Greek=23, Hindi=19, Romanian=15, Dutch=13, Catalan=12, Hebrew=12, Thai=11, Indonesian=8, Polish=8, Urdu=8, Afrikaans=7, Serbian=7, Mongolian=6, Portuguese (Portugal)=6, Tamil=6, Slovak=5, Bengali=4, Czech=4, Hungarian=4, Telugu=4, Lithuanian=3, Albanian=2, Bulgarian=2, Burmese=2, Estonian=2, Georgian=2, Kazakh=2, Uzbek=2, Croatian=1, Javanese=1, Marathi=1, Swedish=1}
Total Courses: 4249
Language sheet created successfully


Levels are Displayed
Levels and their course count
{Intermediate=519, Beginner=488, Mixed=239, Advanced=73}
Total Courses: 1319
Level sheet created successfully


Valid Form Fill-up Started
Valid Form Fill-up completed

Form Fill-up initiated
Form filled with invalid details
Form Fill-up initiated
Form filled with invalid details
Form Fill-up initiated
Form filled with invalid details
Form Fill-up initiated
Form filled with invalid details
Form Fill-up initiated
Form filled with invalid details
Form Fill-up initiated
Form filled with invalid details
Form Fill-up initiated
Form filled with invalid details
Form Fill-up initiated
Form filled with invalid details

-----------------------------------------------------------------------------------------------------------
#Testing on Selenium Grid
-----------------------------------------------------------------------------------------------------------

1.Create a Selenium Grid Hub
  java -jar selenium-server-standalone-3.141.59.jar -role hub

2.Create Two nodes in the Grid
  java -jar selenium-server-standalone-3.141.59.jar -role webdriver -hub http://192.168.1.102:4444/grid/register -port 5556
  java -jar selenium-server-standalone-3.141.59.jar -role webdriver -hub http://192.168.1.102:4444/grid/register -port 4446

3.Change the code by uncommenting the GridDriver() method in utilities class
4.Run the test


-----------------------------------------------------------------------------------------------------------
#Hackathon Suites
-----------------------------------------------------------------------------------------------------------

1.Firefox_Suite
2.Chrome_Suite
3.Smoke Suite
4.Regression Suite





------------------------------------------------------------------------------------------------------------------------------
# Tech Used:
------------------------------------------------------------------------------------------------------------------------------

1.Java
2.Eclipse IDE
3.Selenium Framework
4.TestNG Framework
5.Maven Tool
6.Apache POI
7.JSON
8.POM
9.Extent HTML Report
10.Git
11.Jenkins
12.Selenium Grid




