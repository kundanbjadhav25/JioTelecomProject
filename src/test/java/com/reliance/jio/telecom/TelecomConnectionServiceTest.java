package com.reliance.jio.telecom;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.reliance.jio.telecom.model.Connection;
import com.reliance.jio.telecom.repository.ConnectionRepository;
import com.reliance.jio.telecom.serviceimpl.ConnectionServiceImpl;

@RunWith(MockitoJUnitRunner.StrictStubs.class)
@SpringBootTest
class TelecomConnectionServiceTest {


	@InjectMocks
	ConnectionServiceImpl connectionService;

	@Mock
	ConnectionRepository connectionRepository;
	@Test
	public void saveConnectionTest() {
		Connection connection = new Connection(4, "1112", "virat@gmail.com", "prepaid", "virat", "active", "data");
		when(connectionRepository.save(connection)).thenReturn(connection);
		assertEquals(connection, connectionService.saveConnection(connection));
	}

	@Test
	public void getAllConnectionTest() {
		List<Connection> list = new ArrayList<>();
		Connection connection1 = new Connection(5, "1113","hardik@gmail.com", "prepaid", "hardik", "active","fiber");
		Connection connection2 = new Connection(6, "1114","suryakumar@gmail.com", "postpaid", "suryakumar", "inactive","fiber");
		Connection connection3 = new Connection(7, "1115","axar@gmail.com", "prepaid", "axar", "active","data");

		list.add(connection1);
		list.add(connection2);
		list.add(connection3);

		when(connectionRepository.findAll()).thenReturn(list);

		Iterable<Connection> connectionList = connectionService.getAllConnection();
		assertEquals(list, connectionList);

	}

}
