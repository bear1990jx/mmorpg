package com.kingston.mmorpg.framework.net.socket.codec.impl.reflect;

import com.kingston.mmorpg.framework.net.socket.MessageFactory;
import com.kingston.mmorpg.framework.net.socket.codec.IMessageDecoder;
import com.kingston.mmorpg.framework.net.socket.message.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.ByteBuffer;

public class ReflectDecoder implements IMessageDecoder {

    private static Logger logger = LoggerFactory.getLogger(ReflectDecoder.class);

    @Override
    public Message readMessage(short cmd, byte[] body) {
        // 消息序列化这里的buff已经是一个完整的包体
        ByteBuffer in = ByteBuffer.allocate(body.length);
        in.put(body);
        in.flip();

        Class<?> msgClazz = MessageFactory.getInstance().getMessageMeta(cmd);
        try {
            Codec messageCodec = Codec.getSerializer(msgClazz);
            Message message = (Message) messageCodec.decode(in, msgClazz, null);
            return message;
        } catch (Exception e) {
            logger.error("读取消息出错,模块号{}，异常{}", new Object[]{cmd ,e});
        }
        return null;
    }

}