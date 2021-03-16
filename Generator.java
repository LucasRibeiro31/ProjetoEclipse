package suporte;

import java.text.SimpleDateFormat;

public class Generator {
	public static String dataHoraparaArquivo() {
		java.sql.Timestamp ts = new java.sql.Timestamp(System.currentTimeMillis());
		return new SimpleDateFormat("yyyyMMddhhmmss").format(ts);
	}

}
