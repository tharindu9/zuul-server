# zuul-server 

What is Zuul and Why zull ??
Zuul is the front door for all requests from devices and web sites to the backend. As an edge service application, Zuul is built to enable dynamic routing, monitoring, resiliency and security. It also has the ability to route requests to multiple Amazon Auto Scaling Groups as appropriate.

In the world of Spring, Spring Cloud has a nice integration with an embedded Zuul proxy server.It is very easy to used and maintain with discovery server too.In here all other servers are registered in discovery server and all request can handle by zuul server.
"Zuul-Example" and "zuul-server-example2" are normal resourse services and those has registers in zuul-server.
