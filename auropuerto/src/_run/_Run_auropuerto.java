package _run;

import org.openxava.util.*;

/**
 * Ejecuta esta clase para arrancar la aplicación.
 *
 * Con Eclipse: Botón derecho del ratón > Run As > Java Application
 */

public class _Run_auropuerto {

	public static void main(String[] args) throws Exception {
		DBServer.start("auropuertoDB"); // Para usar tu propia base de datos comenta esta línea y configura web/META-INF/context.xml
		AppServer.run("auropuerto"); // Usa AppServer.run("") para funcionar en el contexto raíz
	}

}
