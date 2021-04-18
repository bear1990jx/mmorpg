package org.forfun.mmorpg.game.scene.director;

import java.util.HashSet;
import java.util.Set;

/**
 * 副本默认场景管理器
 *
 */
public abstract class BaseDungeonDirector extends SceneDirector {

	protected Set<Long> historyPlayerIds = new HashSet<>();

	protected Set<Long> alivePlayerIds = new HashSet<>();

	public abstract void init();

	public abstract void prepare();

	public abstract void start();

	public abstract void tryFinish();

	public void end() {
		settlement();
	}

	public abstract void settlement();

}
