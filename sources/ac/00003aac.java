package com.google.protobuf;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
abstract class AllocatedBuffer {
    AllocatedBuffer() {
    }

    public static AllocatedBuffer wrap(byte[] bArr) {
        return wrapNoCheck(bArr, 0, bArr.length);
    }

    private static AllocatedBuffer wrapNoCheck(final byte[] bArr, final int i11, final int i12) {
        return new AllocatedBuffer() { // from class: com.google.protobuf.AllocatedBuffer.2
            private int position;

            @Override // com.google.protobuf.AllocatedBuffer
            public byte[] array() {
                return bArr;
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public int arrayOffset() {
                return i11;
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public boolean hasArray() {
                return true;
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public boolean hasNioBuffer() {
                return false;
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public int limit() {
                return i12;
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public ByteBuffer nioBuffer() {
                throw new UnsupportedOperationException();
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public int position() {
                return this.position;
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public int remaining() {
                return i12 - this.position;
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public AllocatedBuffer position(int i13) {
                if (i13 >= 0 && i13 <= i12) {
                    this.position = i13;
                    return this;
                }
                throw new IllegalArgumentException("Invalid position: " + i13);
            }
        };
    }

    public abstract byte[] array();

    public abstract int arrayOffset();

    public abstract boolean hasArray();

    public abstract boolean hasNioBuffer();

    public abstract int limit();

    public abstract ByteBuffer nioBuffer();

    public abstract int position();

    public abstract AllocatedBuffer position(int i11);

    public abstract int remaining();

    public static AllocatedBuffer wrap(byte[] bArr, int i11, int i12) {
        if (i11 >= 0 && i12 >= 0 && i11 + i12 <= bArr.length) {
            return wrapNoCheck(bArr, i11, i12);
        }
        throw new IndexOutOfBoundsException(String.format("bytes.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)));
    }

    public static AllocatedBuffer wrap(final ByteBuffer byteBuffer) {
        Internal.checkNotNull(byteBuffer, "buffer");
        return new AllocatedBuffer() { // from class: com.google.protobuf.AllocatedBuffer.1
            @Override // com.google.protobuf.AllocatedBuffer
            public byte[] array() {
                return byteBuffer.array();
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public int arrayOffset() {
                return byteBuffer.arrayOffset();
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public boolean hasArray() {
                return byteBuffer.hasArray();
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public boolean hasNioBuffer() {
                return true;
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public int limit() {
                return byteBuffer.limit();
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public ByteBuffer nioBuffer() {
                return byteBuffer;
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public int position() {
                return byteBuffer.position();
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public int remaining() {
                return byteBuffer.remaining();
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public AllocatedBuffer position(int i11) {
                byteBuffer.position(i11);
                return this;
            }
        };
    }
}