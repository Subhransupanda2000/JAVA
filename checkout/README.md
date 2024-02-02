# On checkout we should give response of cart items whose status is buy_now. 
* Class-CartItemServiceImpl
  We will create a method as checkoutItem which will return cartitems.
* sql query:
  select catalog_item_id from cart_item where state=BUY_NOW;
