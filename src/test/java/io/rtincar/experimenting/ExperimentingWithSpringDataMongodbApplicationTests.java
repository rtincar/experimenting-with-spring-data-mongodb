package io.rtincar.experimenting;

import io.rtincar.experimenting.model.Account;
import io.rtincar.experimenting.repository.AccountRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.core.publisher.Mono;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExperimentingWithSpringDataMongodbApplicationTests {

	@Autowired
	AccountRepository accountRepository;

	@Test
	public void contextLoads() {

		Account account = new Account();
		account.setEmail("account@domain.com");
		account.setFirstName("John");
		account.setLastName("Doe");
		account.setPassword("08d70as9d8");
		account.setCreatedAt(new Date());

		Account created = accountRepository.save(account).block();

		Assert.assertNotNull("Should return created account", created);
		Assert.assertNotNull("Account.id shouldn't be null", created.getId());
		System.out.println(created);
	}

}
