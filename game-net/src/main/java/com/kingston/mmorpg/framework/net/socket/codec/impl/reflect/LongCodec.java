package com.kingston.mmorpg.framework.net.socket.codec.impl.reflect;

import java.nio.ByteBuffer;

public class LongCodec extends Codec {

	@Override
	public Long decode(ByteBuffer in, Class<?> type, Class<?> wrapper) {
		return ArrayCodec.ByteBuffUtil.readLong(in);
	}

	@Override
	public void encode(ByteBuffer out, Object value, Class<?> wrapper) {
		ArrayCodec.ByteBuffUtil.writeLong(out, (long)value);
	}
}
