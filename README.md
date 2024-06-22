This repository contains a collection of QA automation projects. The projects focus on automating tests for various web functionalities, including:

- Google Search Tests:
Automated tests for verifying the search functionality on Google.
- Yahoo Search Tests:
Automated tests for verifying the search functionality on Yahoo.
- Login Form Tests:
Automated tests for validating login forms, including successful logins, incorrect credentials handling, and form validations.
- Web Elements List Tests:
Automated tests for verifying the presence and correctness of list elements on different web pages.




# javaSelenium
Default Java Selenium project

Create new java class in tests package which extends BaseTest. (as in ProbnaKlasaTest)
BaseTest will start Chrome before each test and close it after.
Create JUnit @Test annotation and create a method bellow.
You have run test button next to method signature.
You can use variable driver (as WebDriver) and wdWait (as WebDriverWait)
which are inherited from BaseHelper.
Each page/helper class should extends BaseHelper.

Chromedriver (https://chromedriver.chromium.org/downloads) for appropriate version 
for your chrome should be downloaded and extracted to root (next to pom.xml).
