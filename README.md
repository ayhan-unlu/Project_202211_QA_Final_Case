# Project_202211_QA_Final_Case

# Getting Started

### Prepared for the Fullfillment of " ebebek Java & QA & SAP Spartacus Practicum " with Patika.Dev and Kodluyoruz.org in November 2022



Functional, working Java File :
[SingleClassSingleMethodFinalCaseQATest.java](https://github.com/ayhan-unlu/Project_202211_QA_Final_Case/blob/master/ebebek_qa_finalcase/src/test/java/patika/practicum/SingleClassSingleMethodFinalCaseQATest.java)
<br>

Functional, working pom.xml File :
[pom.xml](https://github.com/ayhan-unlu/Project_202211_QA_Final_Case/blob/master/ebebek_qa_finalcase/pomJupiter.xml)
<br>

## Project Summary

The following items must be performed with Selenium Webdriver.
<br>

1. https://www.e-bebek.com/ website should be opened. **+DONE**
![01-ebebekHomePage](https://user-images.githubusercontent.com/103220953/206009133-e8296ecb-1c42-407d-854e-b250dd5c44ee.jpg)

2. Enter "kaşık mama"-"spoon baby food" in the search bar and the last product should be clicked from the results of the search, it should be verified that the opened product and the product clicked in the search result are the same. **+DONE**
<br>

![02-kasikMamasiSearchPage](https://user-images.githubusercontent.com/103220953/206009539-0a2ac07c-e897-44b6-af63-2168fcf85a7e.jpg)

![03-lastProductClickedOnSearchPage](https://user-images.githubusercontent.com/103220953/206009848-7163c834-173c-4f77-989b-0ba751cd38cb.jpg)

3. The product should be added to the cart. **+DONE**
<br>

![04-lastProductDetailPage](https://user-images.githubusercontent.com/103220953/206011318-0ea0d8d5-a724-4412-b410-69c03c435ca9.jpg)


4. Click the view cart button from the right-handed mode-window. **+DONE**
<br>

![05-lastProductAddedToCart](https://user-images.githubusercontent.com/103220953/206011349-8a26da9a-b2e4-42d0-b298-48e3fabfd51e.jpg)


5. Click the Complete Shopping button. **+DONE**
<br>

![06-cartPage](https://user-images.githubusercontent.com/103220953/206011412-9cbbe17b-7ad2-4943-8957-3dbf00443e1a.jpg)


6. It should be verified that the member login screen is on. **+DONE**
<br>

![07-forcedLoginPage](https://user-images.githubusercontent.com/103220953/206011449-efd7e509-3af5-45b0-84f1-a44d22e15989.jpg)


<br>
<br>The project must be written in the Java programming language. Maven repo should be used.
<br>
1. Codes must be shared via github. **COMPLETED**
<br>
2. Selenium and JUnit/Testng should be used for the script to be written. **COMPLETED**
<br>
3. The correct functioning of the script should be checked using Assertions.(Incomplete)
<br>
4. Log should be used.(Incomplete)
<br>
5. Page object model should be implemented. (Incomplete)
<br>
6. It should be developed in accordance with OOP principles. (Incomplete)

<br>
<br>

![POM_Project_Design_Pic_1](https://user-images.githubusercontent.com/103220953/206008003-1476e0d6-64fa-4242-96ef-7304d6514a4a.JPG)


<br>

Source : https://www.youtube.com/watch?v=2naKQHbFQpY


## Test Steps BY PAGE (Designed but not functionally completed)
0. [BasePage](https://github.com/ayhan-unlu/Project_202211_QA_Final_Case/blob/master/ebebek_qa_finalcase/src/main/java/patika/practicum/BasePage.java) **(Completed)** 

1. [ebebek Home Page](https://github.com/ayhan-unlu/Project_202211_QA_Final_Case/blob/master/ebebek_qa_finalcase/src/main/java/patika/practicum/HomePage.java) **(Completed)**

2. ["kaşık maması" search result page](https://github.com/ayhan-unlu/Project_202211_QA_Final_Case/blob/master/ebebek_qa_finalcase/src/main/java/patika/practicum/SearchResultPage.java) **(Completed)**

3. [Product Detail Page](https://github.com/ayhan-unlu/Project_202211_QA_Final_Case/blob/master/ebebek_qa_finalcase/src/main/java/patika/practicum/ProductDetailPage.java)

4. [Shopping Cart](https://github.com/ayhan-unlu/Project_202211_QA_Final_Case/blob/master/ebebek_qa_finalcase/src/main/java/patika/practicum/CartPage.java)

5. [Forced Login Page](https://github.com/ayhan-unlu/Project_202211_QA_Final_Case/blob/master/ebebek_qa_finalcase/src/main/java/patika/practicum/ForcedLoginPage.java)

<br>


## Thanks to   <a href="https://e-bebek.com" target="blank"><img align="center" src="https://user-images.githubusercontent.com/103220953/203633014-5f4cd869-ecc9-43ee-98d8-f93f6100e07a.svg" alt="https://e-bebek.com" height="100" width="100" /></a> , <a href="https://app.patika.dev" target="blank"><img align="center" src="https://raw.githubusercontent.com/ayhan-unlu/ayhan-unlu/main/patikaLogoSVG.svg" alt="https://app.patika.dev/" height="100" width="100" /></a> and <a href="https://kodluyoruz.org/tr/kodluyoruz/" target="blank"><img align="center" src="https://raw.githubusercontent.com/ayhan-unlu/ayhan-unlu/main/KodluyoruzLogoSVG.svg" alt="https://kodluyoruz.org/tr/kodluyoruz/" height="100" width="100" /></a> 
