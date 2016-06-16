package com.ttb.service.geo;

import static org.junit.Assert.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import com.ttb.service.geo.entities.ZipCode;
import com.ttb.service.geo.repositories.ZipCodeRepository;
import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseOperation;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DatabaseTearDown;

@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class, DbUnitTestExecutionListener.class })
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = GeoServiceImplApplication.class)
@DatabaseSetup(ZipCodeRepositoryTest.DATASET)
@DatabaseTearDown(type = DatabaseOperation.DELETE_ALL, value = { ZipCodeRepositoryTest.DATASET })
@DirtiesContext
// TODO (Spring Boot 1.4)  @DataJpaTest
public class ZipCodeRepositoryTest {

	protected static final String DATASET = "classpath:datasets/zipcode-test-data.xml";
	
	@Autowired
	private ZipCodeRepository repository;
	
	private Date now = new Date();
	private ZipCode zipCodeOne = new ZipCode("30306", "Atlanta", "Georgia", "GA", "Dekalb", "089", "", "", (double)33.786, (double)-84.3514, 1);
	
	@Test
	public void findAllTest() {
		assertThat(repository.findAll()).hasSize(10).extracting("postalCode").containsOnly("80543","80546","80550","80551","80610","80611","80612","80615","80620","80621");
	}

	@Test
	public void countTest() {
		assertEquals(10, repository.count());
	}
	
	@Test
	public void saveTest() {
		ZipCode savedZipCode = repository.save(zipCodeOne);
		System.out.println("savedZipCode: " + savedZipCode);
	}
	
	@Test
	public void findByPostalcodeTest() {
		assertThat(repository.findByPostalCode("80543")).hasSize(1).extracting("postalCode").containsOnly("80543");
	}
}