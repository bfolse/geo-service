package com.ttb.service.geo;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.test.annotation.DirtiesContext;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseOperation;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DatabaseTearDown;
import com.ttb.service.geo.impl.GeoServiceImpl;

@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DirtiesContextTestExecutionListener.class,
	TransactionalTestExecutionListener.class, DbUnitTestExecutionListener.class })
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = GeoServiceImplApplication.class)
@DatabaseSetup(GeoServiceTest.DATASET)
@DatabaseTearDown(type = DatabaseOperation.DELETE_ALL, value = { GeoServiceTest.DATASET })
@DirtiesContext
public class GeoServiceTest {

	protected static final String DATASET = "classpath:datasets/zipcode-test-data.xml";
	
	@Autowired
	private GeoServiceImpl geoService;
	
	@Test
	public void findByPostalcodeTest() {
		assertThat(geoService.findByPostalCode("80543")).hasSize(1).extracting("postalCode").containsOnly("80543");
	}
}
