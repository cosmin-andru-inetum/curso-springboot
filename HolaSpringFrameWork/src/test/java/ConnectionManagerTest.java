import org.junit.Test;

import util.ConnectionManager;

public class ConnectionManagerTest {

	@Test
	public void testConectar() {
		try {
			ConnectionManager.conectar();
			ConnectionManager.desconectar();
			assert(true);
		} catch (Exception e) {
			assert(false);
		}
	}
}
