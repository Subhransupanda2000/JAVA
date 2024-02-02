# Q.Define response of cart items whose status is buy_now.
* First make sure you have a  entiti related to the ccheckout process .which is cartitemstate in our project.
* Add  fields for the state.
* Define a controller of it.
* make a service interface called checkoutservoce.
* Define a method findByState method in checkoutserviceimpl.
* make a repository layer of checkoutrepository and use findbystatus method to fectch item which state is buy now from database.
