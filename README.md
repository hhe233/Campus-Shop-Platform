# Campus-Shop-Platform
A web app that connects small businesses to students in the campus.

It is similar to basic version of yelp.com. Students can easily navigate to the local businesses they need and shop owners to showcase their shops. It has a sign up / log in system for customers and shop owners. It also has a point system which adds customer loyalty to the shops.

## Environment
* JDK: 1.8
* IDE: Intellij IDEA
* MySql: 8.0
* Maven: 4.0.0
* HTML: H5
* Spring Boot: 2.1.6
* Deploy: Alibaba Cloud



## A front-end page for customers looks like this:


<img src="images/screenshot1.gif" width="380" height="667">
<img src="images/screenshot2.png" width="380" height="667">



* A headline section which advertises latest/hotest shops in the campus. 
* Section below shows all first-degree shop categories and their description. When cliking, it will fetch shops under that category from the database and jump to the page which will be shown later.
* The 'All Shop' link will fetch and show all shops in the database without any filtering.
* A super admin module can be used to edit the data of this page.
* User can manage their account in the 'Me' section.

<img src="images/screenshot3.png" width="380" height="667">


This page shows the shop list for 'food' category. Users can filter results using the second degree category tags as well as the area drop-down list. Summary of each shop is shown as one shop card. When cliking, the page jumps to show details of the shop as below.

<img src="images/screenshot4.png" width="380" height="660">

Details of the shop. Users can filter products sold in the shop using the product category tags. When cliking on the product, the page jumps to details of the product.

<img src="images/screenshot9.png" width="380" height="660">
Details of a product. It fetches price, images and other info of the product from the database. The number of points the user can collect upon purchase is also shown.

## Shop manangement system for shop owner
Log In page. Any url request to this module without log in will be directed to this page by an interceptor. User info will be added to the session upon successful log in to prevent repeated log in during the session duration.


<img src="images/screenshot5.png" width="380" height="660">


After successful log in, the page will list all shops the user owned. User can either add shops or edit shops that are already verified.


<img src="images/screenshot6.png" width="380" height="660">


When click 'edit' beside the specific product, user will be directed to this page which can edit shop info, products, and product category of the shop.


<img src="images/screenshot7.png" width="380" height="660">


For example, for shop info:


<img src="images/screenshot8.png" width="380" height="660">


The 'add shop' button will also jump to this page. The controller will check if the url has shop id. If it does, it will also fetch the shop details from the database to pre-fill the form.



The project is deployed to Alibaba Cloud server which runs CentOS 7.

Hope you like it!❤️


