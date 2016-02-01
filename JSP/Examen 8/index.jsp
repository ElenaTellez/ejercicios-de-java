<%-- 
    Document   : index
    Created on : 19-mar-2012, 22:52:44
    Author     : Elena Téllez



15. Realiza una aplicación que genere 100 números aleatorios del 1 al 200. Los
    primos deberán aparecer en un color diferente al resto.


--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EJERCICIO 1</title>
        <link href="estilos.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <%!
	public static int volteado(int x) {
	
		int num = 0, volteado = 0;
		
		do {
			num = x % 10;
			volteado = volteado * 10 + num;
			x = x / 10;
			} while (x != 0);
			
			return volteado;
	 }
	 
	//CAPICUA
	
	public static boolean esCapicua(int x) {
	
		/* boolean capicuo = false;
		
		 int num = 0, volteado = 0;
		
		 do {
			num = x % 10;
			volteado = volteado * 10 + num;
			x = x / 10;
			} while (x != 0); 
		
		if (volteado == num) capicuo = true; */
			
			return (x == volteado(x));
		}
        %>
        
        <div id="principal">
        <p>
            Esta aplicación genera 200 números aleatorios del 1 al 1000. Los capicuos aparecen
            en color verde.
        </p>
        <p>
            <%
                int n;
                int max = 1;
                int min = 999;
                for (int i = 0; i < 200; i++) {
                    n = (int)(Math.random()*1000) + 1;
                    if (esCapicua(n))
                            out.print("<span class=\"capicuo\">" + n + "</span> ");
                        else
                            out.print(n + " ");
                    
                    if (n%2 == 0)
				if (n > max) max = n;

			if (!(n%2 == 0))
				if (n < min) min = n;
                }
                
                out.println(" <br><br> Mínimo: " + min + " <br> Máximo: " + max );
            %>
            
        </p>
        <p>
            Pulsa la tecla <b>F5</b> para ejecutar de nuevo la aplicación.
        </p>
        </div>
    </body>
</html>
