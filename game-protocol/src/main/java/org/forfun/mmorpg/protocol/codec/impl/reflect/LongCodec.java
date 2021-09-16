package org.forfun.mmorpg.protocol.codec.impl.reflect;

import java.nio.ByteBuffer;

public class LongCodec extends Codec {

	@Override
	public Long decode(ByteBuffer in, Class<?> type, Class<?> wrapper) {
		return ByteBuffUtil.readLong(in);
	}

	@Override
	public void encode(ByteBuffer out, Object value, Class<?> wrapper) {
		ByteBuffUtil.writeLong(out, (long)value);
	}
}
