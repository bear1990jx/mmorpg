package org.forfun.mmorpg.test;

import org.forfun.mmorpg.game.database.config.dao.ConfigSkillDao;
import org.forfun.mmorpg.game.database.user.dao.PlayerDao;
import org.forfun.mmorpg.game.database.user.entity.PlayerEnt;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Ignore
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMultiDb {

	@Autowired
	private ConfigSkillDao skillRepository;

	@Autowired
	private PlayerDao playerDao;

	@Test
	public void testCrud() {
 		Assert.assertTrue(skillRepository.findAll().size() > 0);

 		PlayerEnt playerEnt = new PlayerEnt();
 		playerEnt.setId(123456L);
 		playerDao.save(playerEnt);

	}

}
