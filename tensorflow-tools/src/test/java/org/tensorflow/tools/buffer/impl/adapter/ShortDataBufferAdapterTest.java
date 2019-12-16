package org.tensorflow.tools.buffer.impl.adapter;

import org.tensorflow.tools.buffer.ByteDataBuffer;
import org.tensorflow.tools.buffer.DataBuffers;
import org.tensorflow.tools.buffer.ShortDataBuffer;
import org.tensorflow.tools.buffer.ShortDataBufferTestBase;
import org.tensorflow.tools.buffer.layout.ShortDataLayout;

public class ShortDataBufferAdapterTest extends ShortDataBufferTestBase {

  private static class TestShort8Layout implements ShortDataLayout {

    @Override
    public void writeShort(ByteDataBuffer buffer, short value, long index) {
      buffer.setObject((byte)(((value & 0x8000) >> 8) | (value & 0x7F)), index);
    }

    @Override
    public short readShort(ByteDataBuffer buffer, long index) {
      int b = buffer.getObject(index);
      return (short)(((b & 0x80) << 8) | (b & 0x7F));
    }

    @Override
    public int sizeInBytes() {
      return 1;
    }
  }

  public ShortDataBuffer allocate(long size) {
    return DataBuffers.ofShorts(size, new TestShort8Layout());
  }
}