# API Training - Week 1

The following document presenta my answers to the research component of the first week's workshop.

## Terminology Research

Some appropriate terms that are necessary as prior knowledge for the workshop.

### REST

REST is an acronym for *Representational State Transfer*. It is an architectural style base on HTTP that allows the use of remote services via stateless textual requests. It serves as a protocol for uniform treatment of web resources and services.

#### REST Resource

A REST Resource is any artifact that is accesible through an URI, accepts HTTP Requests and delivers HTTP Responses.

### HTTP

HTTP is an acronym for *HyperText Transfer Protocol*. It is the protocol for exchanging *HyperText*: a form of structured text that can contain links between different nodes.

#### HTTP Request

An HTTP Request is an action required of a certain resource, sent via HTTP. The principal HTTP Requests available are:

* **GET**: Retrieve data.
* **HEAD**: Identical to **GET**, but without the body.
* **POST**: Adds the attached entity as a subordinate of the resource.
* **PUT**: Sets the attached entity as the resource data.
* **DELETE**: Delete the resource.
* **PATCH**: Applies modifications

#### HTTP Response

An HTTP Response is the reported status of and HTTP Request, after being processed by the corresponding resource. The core of the response is the status code, that allows the receiver of such a response to know more about the state of it's request.

The available status codes are divided in five categories:

* **1XX**: Informational
* **2XX**: Successful
* **3XX**: Redirection
* **4XX**: Client-side errors
* **5XX**: Server-side errors

Each category has several different specific codes that elaborate on the nature of the response.

An HTTP response can also include a body with data retrieved from the resource.

### TCP/IP

TCP/IP is an acronym for *Transmission Control Protocol/Internet Protocol* is a set of protocols for connecting devices on a network. It establishes how data should be broken into packets in order to be later transmitted between network nodes. It also establishes a way of identifying these devices within the network.