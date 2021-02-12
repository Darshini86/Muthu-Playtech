#Author:Muthu#
@login
Feature: Launching the playtech website

Scenario Outline: Legal age validation for the website
Given user on the playtech website "https://www.playtech.com/"
And user Enters <Date> <Month> and <year>
When user clicks  on Enter site
And  user should land on the HomePage and clickson Aboutus
And user should verify the Title of the Page
When user scrolls downto validate
Then validates the count of <NumberofEmployees> <Countriescount> and <globallicensees>

Examples:
|Date|Month|year|NumberofEmployees|Countriescount|globallicensees|
|"10"|"12"|"1986"|5900|19|140|



