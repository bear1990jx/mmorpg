package com.kingston.mmorpg.game.player.message;

import com.kingston.mmorpg.framework.net.socket.annotation.MessageMeta;
import com.kingston.mmorpg.framework.net.socket.message.Message;
import com.kingston.mmorpg.game.player.service.PlayerService;
import lombok.Getter;
import lombok.Setter;

@MessageMeta(cmd = PlayerService.CMD_REQ_PLAYER_LOGIN)
@Getter
@Setter
public class ReqPlayerLogin implements Message {

	private long playerId;

}
