package com.kingston.mmorpg.client;

import com.kingston.mmorpg.game.ConfigScanPaths;
import com.kingston.mmorpg.net.socket.MessageFactory;

/**
 * 客户端模拟器启动程序
 * @author kingston
 */
public class ClientStartup {

	public static void main(String[] args) throws Exception {
		MessageFactory.getInstance().init(ConfigScanPaths.MESSAGE_BASE_PATH);
		
		SocketClient client = new SocketClient();
		client.start();
	}

}
