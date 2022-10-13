CLEAN ARCHITECTURE DEMO

PASOS
1-crear estrucutra del clean architecture

-Core
    -person(domain)
        -model
        -port
        -service(use case)
    -exceptions
-Infrastructure
    -app
        -config
        -run
    -delivery
    -repository
-Adapter
    -delivery
    -gateway
    -repository
    -shared

add 
2- Add component Scan para arrancar el proyecto
