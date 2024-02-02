# On checkout we should give response of cart items whose status is buy_now. 
```
* class-CartController
  @GetMapping
  public cartalogItem checkout(){
    return cartItemService.checkout();
  }
* Class-CartItemServiceImpl
  We will create a method as checkout which will return cartitems.
  We will use here userSessionServiceImpl to fetch our item only.
* sql query:
  select catalog_item_id from cart_item where state=2 & cartId=*;
```
