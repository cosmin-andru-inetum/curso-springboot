package com.code;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.code.model.Usuario;
import com.code.repo.IUsuarioRepo;

@SpringBootTest
public class IUsuarioRepoTest {

	@Autowired
	private IUsuarioRepo usuRepo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Test
	void testAgregar() {
		Usuario usu = new Usuario("cosmin", encoder.encode("candru"));
		Usuario usuRetorno = usuRepo.save(usu);
		assertEquals(usu.getClave(), usuRetorno.getClave());
	}
}
