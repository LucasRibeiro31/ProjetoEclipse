package MVP;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ abrir_agentesb3.class, abrir_dashboard.class, abrir_envio_de_contratos.class,
		dashboard_baixar_dados_pdf.class, dashboard_baixar_dados_xls.class, Teste_Logins.class })

public class AllTests {

}
