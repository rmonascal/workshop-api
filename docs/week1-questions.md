# API Training - Week 1

The following document presents my answers to the proposed questions of the first week's workshop.

## Question 1

*Explain the use of 1XX, 2XX, 3XX, 4XX and 5XX HTTP response codes.*

The different HTTP response codes allow the receiver to know the state of the request sent to a resource.

* **1XX** codes are used for supplying information about the connection. The are usually used as provisional responses, while the request is being processed.
 * For instance, the **100** code (**Continue**) establishes that a header was received and accepted, and thus the request body can be sent to the resource.
* **2XX** codes establish that the action requested was received, understood and executed successfully.
 * For instance, the **200** code (**OK**) establishes that the action was successfully performed and the body of the response contains the result of the action.
* **3XX** codes indicates that the client must do an additional action, usually a URL redirection.
 * For instance, the **301** code (**Moved Permanently**) establishes that the current request, as well as any future requests, should be directed to the given URI.
* **4XX** codes are returned when an error occurs on the client side of the interaction.
 * For instance, the **404** code (**Not Found**) establishes that the required resource could not be found.
* **5XX** codes are delivered when and error occurs on the server side of the interaction.
 * For instance, the **502** code (**Bad Gateway**) establishes that the server, acting as a proxy for another resource, received an invalid response.