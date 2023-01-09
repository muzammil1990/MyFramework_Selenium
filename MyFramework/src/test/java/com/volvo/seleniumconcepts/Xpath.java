
package com.volvo.seleniumconcepts;

public class Xpath {

Wordpress logo:
//a[@title='Powered by WordPress']

username label
//label[@for='user_login']

username editbox
//input[@type='text'][@name='log']
//input[@id='user_login']


remember me checkbox
//input[@id='rememberme'][@value='forever']

remember me label
//label[@for='rememberme']

login label
//input[@id='wp-submit'][@value='Log In']



//tagname[@attribute='value']

Facebook

email label
//label[@for='email']
//label[text()='Email or Phone']

email textbox
//input[@id='email']


//label[text()='Password']
//label[@for='pass']


//input[@type='password'][@id='pass']
//input[@id='pass']



//input[@id='u_0_b']
//input[@id='u_0_b'][@value='Log In']
//input[@value='Log In']



//a[text()='Forgotten account?']


//div[text()='Create a new account']
//div[@class='_8e63 _ihd _3ma mbs _6n _6s _6v']

//div[text()='Create a new account']/following-sibling::div

parent
//select[@id='day']

parent to child
//select[@id='day']/option[@value='1']

//option[@value='1']

parent
//select[@id='month']

parent to child
//select[@id='month']/option[@value='9']


//select[@class='_5dba _8esg'][@title='Year']
or
//select[@id='year']

parent to child
//select[@id='year']/option[@value='1990']




//input[@type='radio'][@name='sex'][@value='1']
//input[@value='1']
//input[@id='u_0_9']


?
//div[@id='reg_form_box']/div[7]/a/i[@class='img sp_DsFT2tc46le sx_00ef12']

//a[@id='gender-help']/i

(//i[@class='img sp_DsFT2tc46le sx_00ef12'])[2]    indexing





Prism



<span ref="eText" class="ag-header-cell-text" role="columnheader" unselectable="on">LISA FG</span>

<span ref="eText" class="ag-header-cell-text" role="columnheader" unselectable="on">LISA FG</span>

//span[text()='LISA FG']


infoheader
<span ref="eText" class="ag-header-cell-text" role="columnheader" unselectable="on">Info Header</span>

//span[text()='Info Header']


<span ref="eText" class="ag-header-cell-text" role="columnheader" unselectable="on">KITS</span>

//span[text()='KITS']


next button
//form[@class='ng-untouched ng-pristine ng-valid']/div[3]/div/spia-navigation-buttons/div/button[text()=' Next '][1]

//spia-ag-grid-check-box-column[@class='ng-star-inserted']/span




//div[@role='rowgroup']/div[9]



Underrun guard (rear)

//div[contains(text(),'Underrun guard (rear)')]  

Shock absorbers (rear axle)                                                                                                                                                      


Underrun guard (rear)


(//div[contains(text(),'Underrun guard (rear)')]/preceding-sibling::div)[1]//span

//span[text()='Sel.']/preceding-sibling::span


//span[text()='Sel.']/preceding-sibling::span

//span[text()='Sel.']/preceding-sibling::span

 Get Count 
//button[@type='button' and contains(text(),' Get Count ')]




<div tabindex="-1" unselectable="on" role="gridcell" comp-id="762" col-id="familyId" class="ag-cell ag-cell-not-inline-editing ag-cell-with-height ag-cell-value ag-cell-focus" style="width: 169px; left: 102px;">7IX</div>


<div tabindex="-1" unselectable="on" role="gridcell" comp-id="768" col-id="familyId" class="ag-cell ag-cell-not-inline-editing ag-cell-with-height ag-cell-value" style="width: 169px; left: 102px;">GSX</div>


<div tabindex="-1" unselectable="on" role="gridcell" comp-id="774" col-id="familyId" class="ag-cell ag-cell-not-inline-editing ag-cell-with-height ag-cell-value" style="width: 169px; left: 102px;">YEX</div>

xpath:
//div[@tabindex='-1' and @unselectable='on' and @role='gridcell' and @col-id='familyId']



<button _ngcontent-c12="" class="btn-primary btn-sm float-right" type="button"> Part list </button>

//button[@type='button' and contains(text(),' Part list ')]


<a href="http://kola.volvo.se/httpconnect/connect.html?M=IM?PartNo=21107989" target="_blank">21107989</a>

<a href="http://kola.volvo.se/httpconnect/connect.html?M=IM?PartNo=20722349" target="_blank">20722349</a>

<a href="http://kola.volvo.se/httpconnect/connect.html?M=IM?PartNo=20722345" target="_blank">20722345</a>

<a href="http://kola.volvo.se/httpconnect/connect.html?M=IM?PartNo=82419061" target="_blank">82419061</a>



<a href="http://kola.volvo.se/httpconnect/connect.html?M=IM?PartNo=82419059" target="_blank">82419059</a>

<div tabindex="-1" unselectable="on" role="gridcell" comp-id="2428" col-id="partDescription" class="ag-cell ag-cell-not-inline-editing ag-cell-with-height ag-cell-value ag-cell-focus" style="width: 83px; left: 231px;  ">UNDERRUN GUARD</div>


<div tabindex="-1" unselectable="on" role="gridcell" comp-id="2378" col-id="partDescription" class="ag-cell ag-cell-not-inline-editing ag-cell-with-height ag-cell-value ag-column-hover ag-cell-focus" style="width: 83px; left: 231px;  ">PLATE</div>



<div tabindex="-1" unselectable="on" role="gridcell" comp-id="2584" col-id="partDescription" class="ag-cell ag-cell-not-inline-editing ag-cell-with-height ag-cell-value ag-column-hover ag-cell-focus" style="width: 83px; left: 231px;  ">SUPPORT</div>

<div tabindex="-1" unselectable="on" role="gridcell" comp-id="3035" col-id="partDescription" class="ag-cell ag-cell-not-inline-editing ag-cell-with-height ag-cell-value ag-cell-focus" style="width: 83px; left: 231px;  ">BRACKET</div>

//div[@tabindex='-1' and @unselectable='on' and @role='gridcell' and @col-id='partDescription' and @style=]

//h4[text()='Part List Dialog']/following-sibling::button

//button[@type='button' and text()='×']

svg element=  

//*[name()='svg']//*[local-name()='rect']
}
