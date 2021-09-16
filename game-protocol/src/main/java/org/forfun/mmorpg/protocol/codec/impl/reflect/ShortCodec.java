package org.forfun.mmorpg.protocol.codec.impl.reflect;

import java.nio.ByteBuffer;

public class ShortCodec extends Codec {

	@Override
	public Short decode(ByteBuffer in, Class<?> type, Class<?> wrapper) {
		return ByteBuffUtil.readShort(in);
	}

	@Override
	public void encode(ByteBuffer out, Object value, Class<?> wrapper) {
		ByteBuffUtil.writeShort(out, (short)value);
	}
}
