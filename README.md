SeleniumTestAutomation
About the project:
*Handling static Dropdowns
*Handling Dynamic dropdowns with WebDriver API
*ParentChild Relationship locator to identify the objects Uniquely
https://clinic-workflow.web.app/

**Challenges
The challenge experienced was 'ParentChild Relationship' the code structure on the website changed from an <a/> tagName to 'Option' list.
To select from a list using ParentChild xpath after the space you need to use a single slash '/' and not a double slash '//'
ParentChild Syntax: 
//tagName[@attribute='vale'] /tagName[@attribute='value']
//*[@id='ctl00_mainContent_ddl_destinationStation1'] /option[@value='KQH']