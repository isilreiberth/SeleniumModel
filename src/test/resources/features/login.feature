#language: es

  Característica: login
    Para acceder a mi información de blogs, como blogger quiero iniciar sesion en Wordpress
  Escenario: Inicio se sesion satistactoria
    Dado que me encuentro en la pagina de inicio de sesion
    Cuando ingres el usuario "user"
    Y ingrese el password "Password123"
    Y active la opcion Login
    Entonces deberia acceder al Dashboard de Wordpress