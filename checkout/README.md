# Q.Define response of cart items whose status is buy_now.
* First add a field as cartItemState in cartItem.
* set the state to BUY_NOW in CartItemServiceImpl while adding to cart(addItem).
*   public Cart getCartSummary(Long cartId)
    In this method using stream api we can get the state in same class (CartItemServiceImpl).
* sql query: alter table catalog_item add column item_state varchar (50); 
             select state from catalogItem where cartId=?;
