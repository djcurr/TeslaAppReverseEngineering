package com.google.protobuf;

import com.google.protobuf.Utf8;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class CodedOutputStream extends ByteOutput {
    public static final int DEFAULT_BUFFER_SIZE = 4096;
    @Deprecated
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    private boolean serializationDeterministic;
    CodedOutputStreamWriter wrapper;
    private static final Logger logger = Logger.getLogger(CodedOutputStream.class.getName());
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = UnsafeUtil.hasUnsafeArrayOperations();

    /* loaded from: classes2.dex */
    public static abstract class AbstractBufferedEncoder extends CodedOutputStream {
        final byte[] buffer;
        final int limit;
        int position;
        int totalBytesWritten;

        AbstractBufferedEncoder(int i11) {
            super();
            if (i11 >= 0) {
                byte[] bArr = new byte[Math.max(i11, 20)];
                this.buffer = bArr;
                this.limit = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        final void buffer(byte b11) {
            byte[] bArr = this.buffer;
            int i11 = this.position;
            this.position = i11 + 1;
            bArr[i11] = b11;
            this.totalBytesWritten++;
        }

        final void bufferFixed32NoTag(int i11) {
            byte[] bArr = this.buffer;
            int i12 = this.position;
            int i13 = i12 + 1;
            this.position = i13;
            bArr[i12] = (byte) (i11 & 255);
            int i14 = i13 + 1;
            this.position = i14;
            bArr[i13] = (byte) ((i11 >> 8) & 255);
            int i15 = i14 + 1;
            this.position = i15;
            bArr[i14] = (byte) ((i11 >> 16) & 255);
            this.position = i15 + 1;
            bArr[i15] = (byte) ((i11 >> 24) & 255);
            this.totalBytesWritten += 4;
        }

        final void bufferFixed64NoTag(long j11) {
            byte[] bArr = this.buffer;
            int i11 = this.position;
            int i12 = i11 + 1;
            this.position = i12;
            bArr[i11] = (byte) (j11 & 255);
            int i13 = i12 + 1;
            this.position = i13;
            bArr[i12] = (byte) ((j11 >> 8) & 255);
            int i14 = i13 + 1;
            this.position = i14;
            bArr[i13] = (byte) ((j11 >> 16) & 255);
            int i15 = i14 + 1;
            this.position = i15;
            bArr[i14] = (byte) (255 & (j11 >> 24));
            int i16 = i15 + 1;
            this.position = i16;
            bArr[i15] = (byte) (((int) (j11 >> 32)) & 255);
            int i17 = i16 + 1;
            this.position = i17;
            bArr[i16] = (byte) (((int) (j11 >> 40)) & 255);
            int i18 = i17 + 1;
            this.position = i18;
            bArr[i17] = (byte) (((int) (j11 >> 48)) & 255);
            this.position = i18 + 1;
            bArr[i18] = (byte) (((int) (j11 >> 56)) & 255);
            this.totalBytesWritten += 8;
        }

        final void bufferInt32NoTag(int i11) {
            if (i11 >= 0) {
                bufferUInt32NoTag(i11);
            } else {
                bufferUInt64NoTag(i11);
            }
        }

        final void bufferTag(int i11, int i12) {
            bufferUInt32NoTag(WireFormat.makeTag(i11, i12));
        }

        final void bufferUInt32NoTag(int i11) {
            if (CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                long j11 = this.position;
                while ((i11 & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i12 = this.position;
                    this.position = i12 + 1;
                    UnsafeUtil.putByte(bArr, i12, (byte) ((i11 & 127) | 128));
                    i11 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i13 = this.position;
                this.position = i13 + 1;
                UnsafeUtil.putByte(bArr2, i13, (byte) i11);
                this.totalBytesWritten += (int) (this.position - j11);
                return;
            }
            while ((i11 & (-128)) != 0) {
                byte[] bArr3 = this.buffer;
                int i14 = this.position;
                this.position = i14 + 1;
                bArr3[i14] = (byte) ((i11 & 127) | 128);
                this.totalBytesWritten++;
                i11 >>>= 7;
            }
            byte[] bArr4 = this.buffer;
            int i15 = this.position;
            this.position = i15 + 1;
            bArr4[i15] = (byte) i11;
            this.totalBytesWritten++;
        }

        final void bufferUInt64NoTag(long j11) {
            if (CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                long j12 = this.position;
                while ((j11 & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i11 = this.position;
                    this.position = i11 + 1;
                    UnsafeUtil.putByte(bArr, i11, (byte) ((((int) j11) & 127) | 128));
                    j11 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i12 = this.position;
                this.position = i12 + 1;
                UnsafeUtil.putByte(bArr2, i12, (byte) j11);
                this.totalBytesWritten += (int) (this.position - j12);
                return;
            }
            while ((j11 & (-128)) != 0) {
                byte[] bArr3 = this.buffer;
                int i13 = this.position;
                this.position = i13 + 1;
                bArr3[i13] = (byte) ((((int) j11) & 127) | 128);
                this.totalBytesWritten++;
                j11 >>>= 7;
            }
            byte[] bArr4 = this.buffer;
            int i14 = this.position;
            this.position = i14 + 1;
            bArr4[i14] = (byte) j11;
            this.totalBytesWritten++;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.totalBytesWritten;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int spaceLeft() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* loaded from: classes2.dex */
    public static class ArrayEncoder extends CodedOutputStream {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        ArrayEncoder(byte[] bArr, int i11, int i12) {
            super();
            Objects.requireNonNull(bArr, "buffer");
            int i13 = i11 + i12;
            if ((i11 | i12 | (bArr.length - i13)) >= 0) {
                this.buffer = bArr;
                this.offset = i11;
                this.position = i11;
                this.limit = i13;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() {
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.position - this.offset;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int spaceLeft() {
            return this.limit - this.position;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public final void write(byte b11) {
            try {
                byte[] bArr = this.buffer;
                int i11 = this.position;
                this.position = i11 + 1;
                bArr[i11] = b11;
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeBool(int i11, boolean z11) {
            writeTag(i11, 0);
            write(z11 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeByteArray(int i11, byte[] bArr) {
            writeByteArray(i11, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeByteArrayNoTag(byte[] bArr, int i11, int i12) {
            writeUInt32NoTag(i12);
            write(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeByteBuffer(int i11, ByteBuffer byteBuffer) {
            writeTag(i11, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeBytes(int i11, ByteString byteString) {
            writeTag(i11, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeBytesNoTag(ByteString byteString) {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed32(int i11, int i12) {
            writeTag(i11, 5);
            writeFixed32NoTag(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed32NoTag(int i11) {
            try {
                byte[] bArr = this.buffer;
                int i12 = this.position;
                int i13 = i12 + 1;
                this.position = i13;
                bArr[i12] = (byte) (i11 & 255);
                int i14 = i13 + 1;
                this.position = i14;
                bArr[i13] = (byte) ((i11 >> 8) & 255);
                int i15 = i14 + 1;
                this.position = i15;
                bArr[i14] = (byte) ((i11 >> 16) & 255);
                this.position = i15 + 1;
                bArr[i15] = (byte) ((i11 >> 24) & 255);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed64(int i11, long j11) {
            writeTag(i11, 1);
            writeFixed64NoTag(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed64NoTag(long j11) {
            try {
                byte[] bArr = this.buffer;
                int i11 = this.position;
                int i12 = i11 + 1;
                this.position = i12;
                bArr[i11] = (byte) (((int) j11) & 255);
                int i13 = i12 + 1;
                this.position = i13;
                bArr[i12] = (byte) (((int) (j11 >> 8)) & 255);
                int i14 = i13 + 1;
                this.position = i14;
                bArr[i13] = (byte) (((int) (j11 >> 16)) & 255);
                int i15 = i14 + 1;
                this.position = i15;
                bArr[i14] = (byte) (((int) (j11 >> 24)) & 255);
                int i16 = i15 + 1;
                this.position = i16;
                bArr[i15] = (byte) (((int) (j11 >> 32)) & 255);
                int i17 = i16 + 1;
                this.position = i17;
                bArr[i16] = (byte) (((int) (j11 >> 40)) & 255);
                int i18 = i17 + 1;
                this.position = i18;
                bArr[i17] = (byte) (((int) (j11 >> 48)) & 255);
                this.position = i18 + 1;
                bArr[i18] = (byte) (((int) (j11 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeInt32(int i11, int i12) {
            writeTag(i11, 0);
            writeInt32NoTag(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeInt32NoTag(int i11) {
            if (i11 >= 0) {
                writeUInt32NoTag(i11);
            } else {
                writeUInt64NoTag(i11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public final void writeLazy(byte[] bArr, int i11, int i12) {
            write(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeMessage(int i11, MessageLite messageLite) {
            writeTag(i11, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeMessageNoTag(MessageLite messageLite) {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeMessageSetExtension(int i11, MessageLite messageLite) {
            writeTag(1, 3);
            writeUInt32(2, i11);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeRawBytes(ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            write(duplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeRawMessageSetExtension(int i11, ByteString byteString) {
            writeTag(1, 3);
            writeUInt32(2, i11);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeString(int i11, String str) {
            writeTag(i11, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeStringNoTag(String str) {
            int i11 = this.position;
            try {
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                    int i12 = i11 + computeUInt32SizeNoTag2;
                    this.position = i12;
                    int encode = Utf8.encode(str, this.buffer, i12, spaceLeft());
                    this.position = i11;
                    writeUInt32NoTag((encode - i11) - computeUInt32SizeNoTag2);
                    this.position = encode;
                } else {
                    writeUInt32NoTag(Utf8.encodedLength(str));
                    this.position = Utf8.encode(str, this.buffer, this.position, spaceLeft());
                }
            } catch (Utf8.UnpairedSurrogateException e11) {
                this.position = i11;
                inefficientWriteStringNoTag(str, e11);
            } catch (IndexOutOfBoundsException e12) {
                throw new OutOfSpaceException(e12);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeTag(int i11, int i12) {
            writeUInt32NoTag(WireFormat.makeTag(i11, i12));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt32(int i11, int i12) {
            writeTag(i11, 0);
            writeUInt32NoTag(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt32NoTag(int i11) {
            if (!CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS || Android.isOnAndroidDevice() || spaceLeft() < 5) {
                while ((i11 & (-128)) != 0) {
                    try {
                        byte[] bArr = this.buffer;
                        int i12 = this.position;
                        this.position = i12 + 1;
                        bArr[i12] = (byte) ((i11 & 127) | 128);
                        i11 >>>= 7;
                    } catch (IndexOutOfBoundsException e11) {
                        throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e11);
                    }
                }
                byte[] bArr2 = this.buffer;
                int i13 = this.position;
                this.position = i13 + 1;
                bArr2[i13] = (byte) i11;
            } else if ((i11 & (-128)) == 0) {
                byte[] bArr3 = this.buffer;
                int i14 = this.position;
                this.position = i14 + 1;
                UnsafeUtil.putByte(bArr3, i14, (byte) i11);
            } else {
                byte[] bArr4 = this.buffer;
                int i15 = this.position;
                this.position = i15 + 1;
                UnsafeUtil.putByte(bArr4, i15, (byte) (i11 | 128));
                int i16 = i11 >>> 7;
                if ((i16 & (-128)) == 0) {
                    byte[] bArr5 = this.buffer;
                    int i17 = this.position;
                    this.position = i17 + 1;
                    UnsafeUtil.putByte(bArr5, i17, (byte) i16);
                    return;
                }
                byte[] bArr6 = this.buffer;
                int i18 = this.position;
                this.position = i18 + 1;
                UnsafeUtil.putByte(bArr6, i18, (byte) (i16 | 128));
                int i19 = i16 >>> 7;
                if ((i19 & (-128)) == 0) {
                    byte[] bArr7 = this.buffer;
                    int i21 = this.position;
                    this.position = i21 + 1;
                    UnsafeUtil.putByte(bArr7, i21, (byte) i19);
                    return;
                }
                byte[] bArr8 = this.buffer;
                int i22 = this.position;
                this.position = i22 + 1;
                UnsafeUtil.putByte(bArr8, i22, (byte) (i19 | 128));
                int i23 = i19 >>> 7;
                if ((i23 & (-128)) == 0) {
                    byte[] bArr9 = this.buffer;
                    int i24 = this.position;
                    this.position = i24 + 1;
                    UnsafeUtil.putByte(bArr9, i24, (byte) i23);
                    return;
                }
                byte[] bArr10 = this.buffer;
                int i25 = this.position;
                this.position = i25 + 1;
                UnsafeUtil.putByte(bArr10, i25, (byte) (i23 | 128));
                byte[] bArr11 = this.buffer;
                int i26 = this.position;
                this.position = i26 + 1;
                UnsafeUtil.putByte(bArr11, i26, (byte) (i23 >>> 7));
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt64(int i11, long j11) {
            writeTag(i11, 0);
            writeUInt64NoTag(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt64NoTag(long j11) {
            if (CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS && spaceLeft() >= 10) {
                while ((j11 & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i11 = this.position;
                    this.position = i11 + 1;
                    UnsafeUtil.putByte(bArr, i11, (byte) ((((int) j11) & 127) | 128));
                    j11 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i12 = this.position;
                this.position = i12 + 1;
                UnsafeUtil.putByte(bArr2, i12, (byte) j11);
                return;
            }
            while ((j11 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.buffer;
                    int i13 = this.position;
                    this.position = i13 + 1;
                    bArr3[i13] = (byte) ((((int) j11) & 127) | 128);
                    j11 >>>= 7;
                } catch (IndexOutOfBoundsException e11) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e11);
                }
            }
            byte[] bArr4 = this.buffer;
            int i14 = this.position;
            this.position = i14 + 1;
            bArr4[i14] = (byte) j11;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeByteArray(int i11, byte[] bArr, int i12, int i13) {
            writeTag(i11, 2);
            writeByteArrayNoTag(bArr, i12, i13);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public final void writeLazy(ByteBuffer byteBuffer) {
            write(byteBuffer);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.protobuf.CodedOutputStream
        public final void writeMessage(int i11, MessageLite messageLite, Schema schema) {
            writeTag(i11, 2);
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream
        final void writeMessageNoTag(MessageLite messageLite, Schema schema) {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public final void write(byte[] bArr, int i11, int i12) {
            try {
                System.arraycopy(bArr, i11, this.buffer, this.position, i12);
                this.position += i12;
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i12)), e11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public final void write(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.buffer, this.position, remaining);
                this.position += remaining;
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(remaining)), e11);
            }
        }
    }

    /* loaded from: classes2.dex */
    private static final class ByteOutputEncoder extends AbstractBufferedEncoder {
        private final ByteOutput out;

        ByteOutputEncoder(ByteOutput byteOutput, int i11) {
            super(i11);
            Objects.requireNonNull(byteOutput, "out");
            this.out = byteOutput;
        }

        private void doFlush() {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }

        private void flushIfNotAvailable(int i11) {
            if (this.limit - this.position < i11) {
                doFlush();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() {
            if (this.position > 0) {
                doFlush();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte b11) {
            if (this.position == this.limit) {
                doFlush();
            }
            buffer(b11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBool(int i11, boolean z11) {
            flushIfNotAvailable(11);
            bufferTag(i11, 0);
            buffer(z11 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i11, byte[] bArr) {
            writeByteArray(i11, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i11, int i12) {
            writeUInt32NoTag(i12);
            write(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteBuffer(int i11, ByteBuffer byteBuffer) {
            writeTag(i11, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytes(int i11, ByteString byteString) {
            writeTag(i11, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32(int i11, int i12) {
            flushIfNotAvailable(14);
            bufferTag(i11, 5);
            bufferFixed32NoTag(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i11) {
            flushIfNotAvailable(4);
            bufferFixed32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64(int i11, long j11) {
            flushIfNotAvailable(18);
            bufferTag(i11, 1);
            bufferFixed64NoTag(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j11) {
            flushIfNotAvailable(8);
            bufferFixed64NoTag(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32(int i11, int i12) {
            flushIfNotAvailable(20);
            bufferTag(i11, 0);
            bufferInt32NoTag(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i11) {
            if (i11 >= 0) {
                writeUInt32NoTag(i11);
            } else {
                writeUInt64NoTag(i11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i11, int i12) {
            flush();
            this.out.writeLazy(bArr, i11, i12);
            this.totalBytesWritten += i12;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i11, MessageLite messageLite) {
            writeTag(i11, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i11, MessageLite messageLite) {
            writeTag(1, 3);
            writeUInt32(2, i11);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            write(duplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i11, ByteString byteString) {
            writeTag(1, 3);
            writeUInt32(2, i11);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeString(int i11, String str) {
            writeTag(i11, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) {
            int length = str.length() * 3;
            int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
            int i11 = computeUInt32SizeNoTag + length;
            int i12 = this.limit;
            if (i11 > i12) {
                byte[] bArr = new byte[length];
                int encode = Utf8.encode(str, bArr, 0, length);
                writeUInt32NoTag(encode);
                writeLazy(bArr, 0, encode);
                return;
            }
            if (i11 > i12 - this.position) {
                doFlush();
            }
            int i13 = this.position;
            try {
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                    int i14 = i13 + computeUInt32SizeNoTag2;
                    this.position = i14;
                    int encode2 = Utf8.encode(str, this.buffer, i14, this.limit - i14);
                    this.position = i13;
                    int i15 = (encode2 - i13) - computeUInt32SizeNoTag2;
                    bufferUInt32NoTag(i15);
                    this.position = encode2;
                    this.totalBytesWritten += i15;
                } else {
                    int encodedLength = Utf8.encodedLength(str);
                    bufferUInt32NoTag(encodedLength);
                    this.position = Utf8.encode(str, this.buffer, this.position, encodedLength);
                    this.totalBytesWritten += encodedLength;
                }
            } catch (Utf8.UnpairedSurrogateException e11) {
                this.totalBytesWritten -= this.position - i13;
                this.position = i13;
                inefficientWriteStringNoTag(str, e11);
            } catch (IndexOutOfBoundsException e12) {
                throw new OutOfSpaceException(e12);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i11, int i12) {
            writeUInt32NoTag(WireFormat.makeTag(i11, i12));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32(int i11, int i12) {
            flushIfNotAvailable(20);
            bufferTag(i11, 0);
            bufferUInt32NoTag(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i11) {
            flushIfNotAvailable(5);
            bufferUInt32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64(int i11, long j11) {
            flushIfNotAvailable(20);
            bufferTag(i11, 0);
            bufferUInt64NoTag(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j11) {
            flushIfNotAvailable(10);
            bufferUInt64NoTag(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i11, byte[] bArr, int i12, int i13) {
            writeTag(i11, 2);
            writeByteArrayNoTag(bArr, i12, i13);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i11, MessageLite messageLite, Schema schema) {
            writeTag(i11, 2);
            writeMessageNoTag(messageLite, schema);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessageNoTag(MessageLite messageLite, Schema schema) {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i11, int i12) {
            flush();
            this.out.write(bArr, i11, i12);
            this.totalBytesWritten += i12;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            flush();
            int remaining = byteBuffer.remaining();
            this.out.writeLazy(byteBuffer);
            this.totalBytesWritten += remaining;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            flush();
            int remaining = byteBuffer.remaining();
            this.out.write(byteBuffer);
            this.totalBytesWritten += remaining;
        }
    }

    /* loaded from: classes2.dex */
    public static final class HeapNioEncoder extends ArrayEncoder {
        private final ByteBuffer byteBuffer;
        private int initialPosition;

        HeapNioEncoder(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.byteBuffer = byteBuffer;
            this.initialPosition = byteBuffer.position();
        }

        @Override // com.google.protobuf.CodedOutputStream.ArrayEncoder, com.google.protobuf.CodedOutputStream
        public void flush() {
            this.byteBuffer.position(this.initialPosition + getTotalBytesWritten());
        }
    }

    /* loaded from: classes2.dex */
    public static class OutOfSpaceException extends IOException {
        private static final String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException() {
            super(MESSAGE);
        }

        OutOfSpaceException(String str) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str);
        }

        OutOfSpaceException(Throwable th2) {
            super(MESSAGE, th2);
        }

        OutOfSpaceException(String str, Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class OutputStreamEncoder extends AbstractBufferedEncoder {
        private final OutputStream out;

        OutputStreamEncoder(OutputStream outputStream, int i11) {
            super(i11);
            Objects.requireNonNull(outputStream, "out");
            this.out = outputStream;
        }

        private void doFlush() {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }

        private void flushIfNotAvailable(int i11) {
            if (this.limit - this.position < i11) {
                doFlush();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() {
            if (this.position > 0) {
                doFlush();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte b11) {
            if (this.position == this.limit) {
                doFlush();
            }
            buffer(b11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBool(int i11, boolean z11) {
            flushIfNotAvailable(11);
            bufferTag(i11, 0);
            buffer(z11 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i11, byte[] bArr) {
            writeByteArray(i11, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i11, int i12) {
            writeUInt32NoTag(i12);
            write(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteBuffer(int i11, ByteBuffer byteBuffer) {
            writeTag(i11, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytes(int i11, ByteString byteString) {
            writeTag(i11, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32(int i11, int i12) {
            flushIfNotAvailable(14);
            bufferTag(i11, 5);
            bufferFixed32NoTag(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i11) {
            flushIfNotAvailable(4);
            bufferFixed32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64(int i11, long j11) {
            flushIfNotAvailable(18);
            bufferTag(i11, 1);
            bufferFixed64NoTag(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j11) {
            flushIfNotAvailable(8);
            bufferFixed64NoTag(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32(int i11, int i12) {
            flushIfNotAvailable(20);
            bufferTag(i11, 0);
            bufferInt32NoTag(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i11) {
            if (i11 >= 0) {
                writeUInt32NoTag(i11);
            } else {
                writeUInt64NoTag(i11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i11, int i12) {
            write(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i11, MessageLite messageLite) {
            writeTag(i11, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i11, MessageLite messageLite) {
            writeTag(1, 3);
            writeUInt32(2, i11);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            write(duplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i11, ByteString byteString) {
            writeTag(1, 3);
            writeUInt32(2, i11);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeString(int i11, String str) {
            writeTag(i11, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) {
            int encodedLength;
            try {
                int length = str.length() * 3;
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
                int i11 = computeUInt32SizeNoTag + length;
                int i12 = this.limit;
                if (i11 > i12) {
                    byte[] bArr = new byte[length];
                    int encode = Utf8.encode(str, bArr, 0, length);
                    writeUInt32NoTag(encode);
                    writeLazy(bArr, 0, encode);
                    return;
                }
                if (i11 > i12 - this.position) {
                    doFlush();
                }
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                int i13 = this.position;
                try {
                    if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                        int i14 = i13 + computeUInt32SizeNoTag2;
                        this.position = i14;
                        int encode2 = Utf8.encode(str, this.buffer, i14, this.limit - i14);
                        this.position = i13;
                        encodedLength = (encode2 - i13) - computeUInt32SizeNoTag2;
                        bufferUInt32NoTag(encodedLength);
                        this.position = encode2;
                    } else {
                        encodedLength = Utf8.encodedLength(str);
                        bufferUInt32NoTag(encodedLength);
                        this.position = Utf8.encode(str, this.buffer, this.position, encodedLength);
                    }
                    this.totalBytesWritten += encodedLength;
                } catch (Utf8.UnpairedSurrogateException e11) {
                    this.totalBytesWritten -= this.position - i13;
                    this.position = i13;
                    throw e11;
                } catch (ArrayIndexOutOfBoundsException e12) {
                    throw new OutOfSpaceException(e12);
                }
            } catch (Utf8.UnpairedSurrogateException e13) {
                inefficientWriteStringNoTag(str, e13);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i11, int i12) {
            writeUInt32NoTag(WireFormat.makeTag(i11, i12));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32(int i11, int i12) {
            flushIfNotAvailable(20);
            bufferTag(i11, 0);
            bufferUInt32NoTag(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i11) {
            flushIfNotAvailable(5);
            bufferUInt32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64(int i11, long j11) {
            flushIfNotAvailable(20);
            bufferTag(i11, 0);
            bufferUInt64NoTag(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j11) {
            flushIfNotAvailable(10);
            bufferUInt64NoTag(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i11, byte[] bArr, int i12, int i13) {
            writeTag(i11, 2);
            writeByteArrayNoTag(bArr, i12, i13);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            write(byteBuffer);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i11, MessageLite messageLite, Schema schema) {
            writeTag(i11, 2);
            writeMessageNoTag(messageLite, schema);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessageNoTag(MessageLite messageLite, Schema schema) {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i11, int i12) {
            int i13 = this.limit;
            int i14 = this.position;
            if (i13 - i14 >= i12) {
                System.arraycopy(bArr, i11, this.buffer, i14, i12);
                this.position += i12;
                this.totalBytesWritten += i12;
                return;
            }
            int i15 = i13 - i14;
            System.arraycopy(bArr, i11, this.buffer, i14, i15);
            int i16 = i11 + i15;
            int i17 = i12 - i15;
            this.position = this.limit;
            this.totalBytesWritten += i15;
            doFlush();
            if (i17 <= this.limit) {
                System.arraycopy(bArr, i16, this.buffer, 0, i17);
                this.position = i17;
            } else {
                this.out.write(bArr, i16, i17);
            }
            this.totalBytesWritten += i17;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            int i11 = this.limit;
            int i12 = this.position;
            if (i11 - i12 >= remaining) {
                byteBuffer.get(this.buffer, i12, remaining);
                this.position += remaining;
                this.totalBytesWritten += remaining;
                return;
            }
            int i13 = i11 - i12;
            byteBuffer.get(this.buffer, i12, i13);
            int i14 = remaining - i13;
            this.position = this.limit;
            this.totalBytesWritten += i13;
            doFlush();
            while (true) {
                int i15 = this.limit;
                if (i14 > i15) {
                    byteBuffer.get(this.buffer, 0, i15);
                    this.out.write(this.buffer, 0, this.limit);
                    int i16 = this.limit;
                    i14 -= i16;
                    this.totalBytesWritten += i16;
                } else {
                    byteBuffer.get(this.buffer, 0, i14);
                    this.position = i14;
                    this.totalBytesWritten += i14;
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class SafeDirectNioEncoder extends CodedOutputStream {
        private final ByteBuffer buffer;
        private final int initialPosition;
        private final ByteBuffer originalBuffer;

        SafeDirectNioEncoder(ByteBuffer byteBuffer) {
            super();
            this.originalBuffer = byteBuffer;
            this.buffer = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.initialPosition = byteBuffer.position();
        }

        private void encode(String str) {
            try {
                Utf8.encodeUtf8(str, this.buffer);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() {
            this.originalBuffer.position(this.buffer.position());
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
            return this.buffer.position() - this.initialPosition;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int spaceLeft() {
            return this.buffer.remaining();
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte b11) {
            try {
                this.buffer.put(b11);
            } catch (BufferOverflowException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBool(int i11, boolean z11) {
            writeTag(i11, 0);
            write(z11 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i11, byte[] bArr) {
            writeByteArray(i11, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i11, int i12) {
            writeUInt32NoTag(i12);
            write(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteBuffer(int i11, ByteBuffer byteBuffer) {
            writeTag(i11, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytes(int i11, ByteString byteString) {
            writeTag(i11, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32(int i11, int i12) {
            writeTag(i11, 5);
            writeFixed32NoTag(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i11) {
            try {
                this.buffer.putInt(i11);
            } catch (BufferOverflowException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64(int i11, long j11) {
            writeTag(i11, 1);
            writeFixed64NoTag(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j11) {
            try {
                this.buffer.putLong(j11);
            } catch (BufferOverflowException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32(int i11, int i12) {
            writeTag(i11, 0);
            writeInt32NoTag(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i11) {
            if (i11 >= 0) {
                writeUInt32NoTag(i11);
            } else {
                writeUInt64NoTag(i11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i11, int i12) {
            write(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i11, MessageLite messageLite) {
            writeTag(i11, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i11, MessageLite messageLite) {
            writeTag(1, 3);
            writeUInt32(2, i11);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            write(duplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i11, ByteString byteString) {
            writeTag(1, 3);
            writeUInt32(2, i11);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeString(int i11, String str) {
            writeTag(i11, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) {
            int position = this.buffer.position();
            try {
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                    int position2 = this.buffer.position() + computeUInt32SizeNoTag2;
                    this.buffer.position(position2);
                    encode(str);
                    int position3 = this.buffer.position();
                    this.buffer.position(position);
                    writeUInt32NoTag(position3 - position2);
                    this.buffer.position(position3);
                } else {
                    writeUInt32NoTag(Utf8.encodedLength(str));
                    encode(str);
                }
            } catch (Utf8.UnpairedSurrogateException e11) {
                this.buffer.position(position);
                inefficientWriteStringNoTag(str, e11);
            } catch (IllegalArgumentException e12) {
                throw new OutOfSpaceException(e12);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i11, int i12) {
            writeUInt32NoTag(WireFormat.makeTag(i11, i12));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32(int i11, int i12) {
            writeTag(i11, 0);
            writeUInt32NoTag(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i11) {
            while ((i11 & (-128)) != 0) {
                try {
                    this.buffer.put((byte) ((i11 & 127) | 128));
                    i11 >>>= 7;
                } catch (BufferOverflowException e11) {
                    throw new OutOfSpaceException(e11);
                }
            }
            this.buffer.put((byte) i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64(int i11, long j11) {
            writeTag(i11, 0);
            writeUInt64NoTag(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j11) {
            while (((-128) & j11) != 0) {
                try {
                    this.buffer.put((byte) ((((int) j11) & 127) | 128));
                    j11 >>>= 7;
                } catch (BufferOverflowException e11) {
                    throw new OutOfSpaceException(e11);
                }
            }
            this.buffer.put((byte) j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i11, byte[] bArr, int i12, int i13) {
            writeTag(i11, 2);
            writeByteArrayNoTag(bArr, i12, i13);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i11, int i12) {
            try {
                this.buffer.put(bArr, i11, i12);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(e11);
            } catch (BufferOverflowException e12) {
                throw new OutOfSpaceException(e12);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i11, MessageLite messageLite, Schema schema) {
            writeTag(i11, 2);
            writeMessageNoTag(messageLite, schema);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessageNoTag(MessageLite messageLite, Schema schema) {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            try {
                this.buffer.put(byteBuffer);
            } catch (BufferOverflowException e11) {
                throw new OutOfSpaceException(e11);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class UnsafeDirectNioEncoder extends CodedOutputStream {
        private final long address;
        private final ByteBuffer buffer;
        private final long initialPosition;
        private final long limit;
        private final long oneVarintLimit;
        private final ByteBuffer originalBuffer;
        private long position;

        UnsafeDirectNioEncoder(ByteBuffer byteBuffer) {
            super();
            this.originalBuffer = byteBuffer;
            this.buffer = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long addressOffset = UnsafeUtil.addressOffset(byteBuffer);
            this.address = addressOffset;
            long position = byteBuffer.position() + addressOffset;
            this.initialPosition = position;
            long limit = addressOffset + byteBuffer.limit();
            this.limit = limit;
            this.oneVarintLimit = limit - 10;
            this.position = position;
        }

        private int bufferPos(long j11) {
            return (int) (j11 - this.address);
        }

        static boolean isSupported() {
            return UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private void repositionBuffer(long j11) {
            this.buffer.position(bufferPos(j11));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() {
            this.originalBuffer.position(bufferPos(this.position));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
            return (int) (this.position - this.initialPosition);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int spaceLeft() {
            return (int) (this.limit - this.position);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte b11) {
            long j11 = this.position;
            if (j11 < this.limit) {
                this.position = 1 + j11;
                UnsafeUtil.putByte(j11, b11);
                return;
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBool(int i11, boolean z11) {
            writeTag(i11, 0);
            write(z11 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i11, byte[] bArr) {
            writeByteArray(i11, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i11, int i12) {
            writeUInt32NoTag(i12);
            write(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteBuffer(int i11, ByteBuffer byteBuffer) {
            writeTag(i11, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytes(int i11, ByteString byteString) {
            writeTag(i11, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32(int i11, int i12) {
            writeTag(i11, 5);
            writeFixed32NoTag(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i11) {
            this.buffer.putInt(bufferPos(this.position), i11);
            this.position += 4;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64(int i11, long j11) {
            writeTag(i11, 1);
            writeFixed64NoTag(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j11) {
            this.buffer.putLong(bufferPos(this.position), j11);
            this.position += 8;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32(int i11, int i12) {
            writeTag(i11, 0);
            writeInt32NoTag(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i11) {
            if (i11 >= 0) {
                writeUInt32NoTag(i11);
            } else {
                writeUInt64NoTag(i11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i11, int i12) {
            write(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i11, MessageLite messageLite) {
            writeTag(i11, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i11, MessageLite messageLite) {
            writeTag(1, 3);
            writeUInt32(2, i11);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            write(duplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i11, ByteString byteString) {
            writeTag(1, 3);
            writeUInt32(2, i11);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeString(int i11, String str) {
            writeTag(i11, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) {
            long j11 = this.position;
            try {
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                    int bufferPos = bufferPos(this.position) + computeUInt32SizeNoTag2;
                    this.buffer.position(bufferPos);
                    Utf8.encodeUtf8(str, this.buffer);
                    int position = this.buffer.position() - bufferPos;
                    writeUInt32NoTag(position);
                    this.position += position;
                } else {
                    int encodedLength = Utf8.encodedLength(str);
                    writeUInt32NoTag(encodedLength);
                    repositionBuffer(this.position);
                    Utf8.encodeUtf8(str, this.buffer);
                    this.position += encodedLength;
                }
            } catch (Utf8.UnpairedSurrogateException e11) {
                this.position = j11;
                repositionBuffer(j11);
                inefficientWriteStringNoTag(str, e11);
            } catch (IllegalArgumentException e12) {
                throw new OutOfSpaceException(e12);
            } catch (IndexOutOfBoundsException e13) {
                throw new OutOfSpaceException(e13);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i11, int i12) {
            writeUInt32NoTag(WireFormat.makeTag(i11, i12));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32(int i11, int i12) {
            writeTag(i11, 0);
            writeUInt32NoTag(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i11) {
            if (this.position <= this.oneVarintLimit) {
                while ((i11 & (-128)) != 0) {
                    long j11 = this.position;
                    this.position = j11 + 1;
                    UnsafeUtil.putByte(j11, (byte) ((i11 & 127) | 128));
                    i11 >>>= 7;
                }
                long j12 = this.position;
                this.position = 1 + j12;
                UnsafeUtil.putByte(j12, (byte) i11);
                return;
            }
            while (true) {
                long j13 = this.position;
                if (j13 >= this.limit) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
                }
                if ((i11 & (-128)) == 0) {
                    this.position = 1 + j13;
                    UnsafeUtil.putByte(j13, (byte) i11);
                    return;
                }
                this.position = j13 + 1;
                UnsafeUtil.putByte(j13, (byte) ((i11 & 127) | 128));
                i11 >>>= 7;
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64(int i11, long j11) {
            writeTag(i11, 0);
            writeUInt64NoTag(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j11) {
            if (this.position <= this.oneVarintLimit) {
                while ((j11 & (-128)) != 0) {
                    long j12 = this.position;
                    this.position = j12 + 1;
                    UnsafeUtil.putByte(j12, (byte) ((((int) j11) & 127) | 128));
                    j11 >>>= 7;
                }
                long j13 = this.position;
                this.position = 1 + j13;
                UnsafeUtil.putByte(j13, (byte) j11);
                return;
            }
            while (true) {
                long j14 = this.position;
                if (j14 >= this.limit) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
                }
                if ((j11 & (-128)) == 0) {
                    this.position = 1 + j14;
                    UnsafeUtil.putByte(j14, (byte) j11);
                    return;
                }
                this.position = j14 + 1;
                UnsafeUtil.putByte(j14, (byte) ((((int) j11) & 127) | 128));
                j11 >>>= 7;
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i11, byte[] bArr, int i12, int i13) {
            writeTag(i11, 2);
            writeByteArrayNoTag(bArr, i12, i13);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            write(byteBuffer);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i11, MessageLite messageLite, Schema schema) {
            writeTag(i11, 2);
            writeMessageNoTag(messageLite, schema);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessageNoTag(MessageLite messageLite, Schema schema) {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i11, int i12) {
            if (bArr != null && i11 >= 0 && i12 >= 0 && bArr.length - i12 >= i11) {
                long j11 = i12;
                long j12 = this.position;
                if (this.limit - j11 >= j12) {
                    UnsafeUtil.copyMemory(bArr, i11, j12, j11);
                    this.position += j11;
                    return;
                }
            }
            Objects.requireNonNull(bArr, "value");
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), Integer.valueOf(i12)));
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            try {
                int remaining = byteBuffer.remaining();
                repositionBuffer(this.position);
                this.buffer.put(byteBuffer);
                this.position += remaining;
            } catch (BufferOverflowException e11) {
                throw new OutOfSpaceException(e11);
            }
        }
    }

    public static int computeBoolSize(int i11, boolean z11) {
        return computeTagSize(i11) + computeBoolSizeNoTag(z11);
    }

    public static int computeBoolSizeNoTag(boolean z11) {
        return 1;
    }

    public static int computeByteArraySize(int i11, byte[] bArr) {
        return computeTagSize(i11) + computeByteArraySizeNoTag(bArr);
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return computeLengthDelimitedFieldSize(bArr.length);
    }

    public static int computeByteBufferSize(int i11, ByteBuffer byteBuffer) {
        return computeTagSize(i11) + computeByteBufferSizeNoTag(byteBuffer);
    }

    public static int computeByteBufferSizeNoTag(ByteBuffer byteBuffer) {
        return computeLengthDelimitedFieldSize(byteBuffer.capacity());
    }

    public static int computeBytesSize(int i11, ByteString byteString) {
        return computeTagSize(i11) + computeBytesSizeNoTag(byteString);
    }

    public static int computeBytesSizeNoTag(ByteString byteString) {
        return computeLengthDelimitedFieldSize(byteString.size());
    }

    public static int computeDoubleSize(int i11, double d11) {
        return computeTagSize(i11) + computeDoubleSizeNoTag(d11);
    }

    public static int computeDoubleSizeNoTag(double d11) {
        return 8;
    }

    public static int computeEnumSize(int i11, int i12) {
        return computeTagSize(i11) + computeEnumSizeNoTag(i12);
    }

    public static int computeEnumSizeNoTag(int i11) {
        return computeInt32SizeNoTag(i11);
    }

    public static int computeFixed32Size(int i11, int i12) {
        return computeTagSize(i11) + computeFixed32SizeNoTag(i12);
    }

    public static int computeFixed32SizeNoTag(int i11) {
        return 4;
    }

    public static int computeFixed64Size(int i11, long j11) {
        return computeTagSize(i11) + computeFixed64SizeNoTag(j11);
    }

    public static int computeFixed64SizeNoTag(long j11) {
        return 8;
    }

    public static int computeFloatSize(int i11, float f11) {
        return computeTagSize(i11) + computeFloatSizeNoTag(f11);
    }

    public static int computeFloatSizeNoTag(float f11) {
        return 4;
    }

    @Deprecated
    public static int computeGroupSize(int i11, MessageLite messageLite) {
        return (computeTagSize(i11) * 2) + computeGroupSizeNoTag(messageLite);
    }

    @Deprecated
    public static int computeGroupSizeNoTag(MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    public static int computeInt32Size(int i11, int i12) {
        return computeTagSize(i11) + computeInt32SizeNoTag(i12);
    }

    public static int computeInt32SizeNoTag(int i11) {
        if (i11 >= 0) {
            return computeUInt32SizeNoTag(i11);
        }
        return 10;
    }

    public static int computeInt64Size(int i11, long j11) {
        return computeTagSize(i11) + computeInt64SizeNoTag(j11);
    }

    public static int computeInt64SizeNoTag(long j11) {
        return computeUInt64SizeNoTag(j11);
    }

    public static int computeLazyFieldMessageSetExtensionSize(int i11, LazyFieldLite lazyFieldLite) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i11) + computeLazyFieldSize(3, lazyFieldLite);
    }

    public static int computeLazyFieldSize(int i11, LazyFieldLite lazyFieldLite) {
        return computeTagSize(i11) + computeLazyFieldSizeNoTag(lazyFieldLite);
    }

    public static int computeLazyFieldSizeNoTag(LazyFieldLite lazyFieldLite) {
        return computeLengthDelimitedFieldSize(lazyFieldLite.getSerializedSize());
    }

    public static int computeLengthDelimitedFieldSize(int i11) {
        return computeUInt32SizeNoTag(i11) + i11;
    }

    public static int computeMessageSetExtensionSize(int i11, MessageLite messageLite) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i11) + computeMessageSize(3, messageLite);
    }

    public static int computeMessageSize(int i11, MessageLite messageLite) {
        return computeTagSize(i11) + computeMessageSizeNoTag(messageLite);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite) {
        return computeLengthDelimitedFieldSize(messageLite.getSerializedSize());
    }

    public static int computePreferredBufferSize(int i11) {
        if (i11 > 4096) {
            return 4096;
        }
        return i11;
    }

    public static int computeRawMessageSetExtensionSize(int i11, ByteString byteString) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i11) + computeBytesSize(3, byteString);
    }

    @Deprecated
    public static int computeRawVarint32Size(int i11) {
        return computeUInt32SizeNoTag(i11);
    }

    @Deprecated
    public static int computeRawVarint64Size(long j11) {
        return computeUInt64SizeNoTag(j11);
    }

    public static int computeSFixed32Size(int i11, int i12) {
        return computeTagSize(i11) + computeSFixed32SizeNoTag(i12);
    }

    public static int computeSFixed32SizeNoTag(int i11) {
        return 4;
    }

    public static int computeSFixed64Size(int i11, long j11) {
        return computeTagSize(i11) + computeSFixed64SizeNoTag(j11);
    }

    public static int computeSFixed64SizeNoTag(long j11) {
        return 8;
    }

    public static int computeSInt32Size(int i11, int i12) {
        return computeTagSize(i11) + computeSInt32SizeNoTag(i12);
    }

    public static int computeSInt32SizeNoTag(int i11) {
        return computeUInt32SizeNoTag(encodeZigZag32(i11));
    }

    public static int computeSInt64Size(int i11, long j11) {
        return computeTagSize(i11) + computeSInt64SizeNoTag(j11);
    }

    public static int computeSInt64SizeNoTag(long j11) {
        return computeUInt64SizeNoTag(encodeZigZag64(j11));
    }

    public static int computeStringSize(int i11, String str) {
        return computeTagSize(i11) + computeStringSizeNoTag(str);
    }

    public static int computeStringSizeNoTag(String str) {
        int length;
        try {
            length = Utf8.encodedLength(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            length = str.getBytes(Internal.UTF_8).length;
        }
        return computeLengthDelimitedFieldSize(length);
    }

    public static int computeTagSize(int i11) {
        return computeUInt32SizeNoTag(WireFormat.makeTag(i11, 0));
    }

    public static int computeUInt32Size(int i11, int i12) {
        return computeTagSize(i11) + computeUInt32SizeNoTag(i12);
    }

    public static int computeUInt32SizeNoTag(int i11) {
        if ((i11 & (-128)) == 0) {
            return 1;
        }
        if ((i11 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i11) == 0) {
            return 3;
        }
        return (i11 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeUInt64Size(int i11, long j11) {
        return computeTagSize(i11) + computeUInt64SizeNoTag(j11);
    }

    public static int computeUInt64SizeNoTag(long j11) {
        int i11;
        if (((-128) & j11) == 0) {
            return 1;
        }
        if (j11 < 0) {
            return 10;
        }
        if (((-34359738368L) & j11) != 0) {
            i11 = 6;
            j11 >>>= 28;
        } else {
            i11 = 2;
        }
        if (((-2097152) & j11) != 0) {
            i11 += 2;
            j11 >>>= 14;
        }
        return (j11 & (-16384)) != 0 ? i11 + 1 : i11;
    }

    public static int encodeZigZag32(int i11) {
        return (i11 >> 31) ^ (i11 << 1);
    }

    public static long encodeZigZag64(long j11) {
        return (j11 >> 63) ^ (j11 << 1);
    }

    public static CodedOutputStream newInstance(OutputStream outputStream) {
        return newInstance(outputStream, 4096);
    }

    static CodedOutputStream newSafeInstance(ByteBuffer byteBuffer) {
        return new SafeDirectNioEncoder(byteBuffer);
    }

    static CodedOutputStream newUnsafeInstance(ByteBuffer byteBuffer) {
        return new UnsafeDirectNioEncoder(byteBuffer);
    }

    public final void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void flush();

    public abstract int getTotalBytesWritten();

    final void inefficientWriteStringNoTag(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) {
        logger.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) unpairedSurrogateException);
        byte[] bytes = str.getBytes(Internal.UTF_8);
        try {
            writeUInt32NoTag(bytes.length);
            writeLazy(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e11) {
            throw e11;
        } catch (IndexOutOfBoundsException e12) {
            throw new OutOfSpaceException(e12);
        }
    }

    public boolean isSerializationDeterministic() {
        return this.serializationDeterministic;
    }

    public abstract int spaceLeft();

    public void useDeterministicSerialization() {
        this.serializationDeterministic = true;
    }

    @Override // com.google.protobuf.ByteOutput
    public abstract void write(byte b11);

    @Override // com.google.protobuf.ByteOutput
    public abstract void write(ByteBuffer byteBuffer);

    @Override // com.google.protobuf.ByteOutput
    public abstract void write(byte[] bArr, int i11, int i12);

    public abstract void writeBool(int i11, boolean z11);

    public final void writeBoolNoTag(boolean z11) {
        write(z11 ? (byte) 1 : (byte) 0);
    }

    public abstract void writeByteArray(int i11, byte[] bArr);

    public abstract void writeByteArray(int i11, byte[] bArr, int i12, int i13);

    public final void writeByteArrayNoTag(byte[] bArr) {
        writeByteArrayNoTag(bArr, 0, bArr.length);
    }

    abstract void writeByteArrayNoTag(byte[] bArr, int i11, int i12);

    public abstract void writeByteBuffer(int i11, ByteBuffer byteBuffer);

    public abstract void writeBytes(int i11, ByteString byteString);

    public abstract void writeBytesNoTag(ByteString byteString);

    public final void writeDouble(int i11, double d11) {
        writeFixed64(i11, Double.doubleToRawLongBits(d11));
    }

    public final void writeDoubleNoTag(double d11) {
        writeFixed64NoTag(Double.doubleToRawLongBits(d11));
    }

    public final void writeEnum(int i11, int i12) {
        writeInt32(i11, i12);
    }

    public final void writeEnumNoTag(int i11) {
        writeInt32NoTag(i11);
    }

    public abstract void writeFixed32(int i11, int i12);

    public abstract void writeFixed32NoTag(int i11);

    public abstract void writeFixed64(int i11, long j11);

    public abstract void writeFixed64NoTag(long j11);

    public final void writeFloat(int i11, float f11) {
        writeFixed32(i11, Float.floatToRawIntBits(f11));
    }

    public final void writeFloatNoTag(float f11) {
        writeFixed32NoTag(Float.floatToRawIntBits(f11));
    }

    @Deprecated
    public final void writeGroup(int i11, MessageLite messageLite) {
        writeTag(i11, 3);
        writeGroupNoTag(messageLite);
        writeTag(i11, 4);
    }

    @Deprecated
    public final void writeGroupNoTag(MessageLite messageLite) {
        messageLite.writeTo(this);
    }

    public abstract void writeInt32(int i11, int i12);

    public abstract void writeInt32NoTag(int i11);

    public final void writeInt64(int i11, long j11) {
        writeUInt64(i11, j11);
    }

    public final void writeInt64NoTag(long j11) {
        writeUInt64NoTag(j11);
    }

    @Override // com.google.protobuf.ByteOutput
    public abstract void writeLazy(ByteBuffer byteBuffer);

    @Override // com.google.protobuf.ByteOutput
    public abstract void writeLazy(byte[] bArr, int i11, int i12);

    public abstract void writeMessage(int i11, MessageLite messageLite);

    public abstract void writeMessage(int i11, MessageLite messageLite, Schema schema);

    public abstract void writeMessageNoTag(MessageLite messageLite);

    abstract void writeMessageNoTag(MessageLite messageLite, Schema schema);

    public abstract void writeMessageSetExtension(int i11, MessageLite messageLite);

    public final void writeRawByte(byte b11) {
        write(b11);
    }

    public abstract void writeRawBytes(ByteBuffer byteBuffer);

    public final void writeRawBytes(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Deprecated
    public final void writeRawLittleEndian32(int i11) {
        writeFixed32NoTag(i11);
    }

    @Deprecated
    public final void writeRawLittleEndian64(long j11) {
        writeFixed64NoTag(j11);
    }

    public abstract void writeRawMessageSetExtension(int i11, ByteString byteString);

    @Deprecated
    public final void writeRawVarint32(int i11) {
        writeUInt32NoTag(i11);
    }

    @Deprecated
    public final void writeRawVarint64(long j11) {
        writeUInt64NoTag(j11);
    }

    public final void writeSFixed32(int i11, int i12) {
        writeFixed32(i11, i12);
    }

    public final void writeSFixed32NoTag(int i11) {
        writeFixed32NoTag(i11);
    }

    public final void writeSFixed64(int i11, long j11) {
        writeFixed64(i11, j11);
    }

    public final void writeSFixed64NoTag(long j11) {
        writeFixed64NoTag(j11);
    }

    public final void writeSInt32(int i11, int i12) {
        writeUInt32(i11, encodeZigZag32(i12));
    }

    public final void writeSInt32NoTag(int i11) {
        writeUInt32NoTag(encodeZigZag32(i11));
    }

    public final void writeSInt64(int i11, long j11) {
        writeUInt64(i11, encodeZigZag64(j11));
    }

    public final void writeSInt64NoTag(long j11) {
        writeUInt64NoTag(encodeZigZag64(j11));
    }

    public abstract void writeString(int i11, String str);

    public abstract void writeStringNoTag(String str);

    public abstract void writeTag(int i11, int i12);

    public abstract void writeUInt32(int i11, int i12);

    public abstract void writeUInt32NoTag(int i11);

    public abstract void writeUInt64(int i11, long j11);

    public abstract void writeUInt64NoTag(long j11);

    private CodedOutputStream() {
    }

    @Deprecated
    public static int computeGroupSize(int i11, MessageLite messageLite, Schema schema) {
        return (computeTagSize(i11) * 2) + computeGroupSizeNoTag(messageLite, schema);
    }

    @Deprecated
    static int computeGroupSizeNoTag(MessageLite messageLite, Schema schema) {
        return ((AbstractMessageLite) messageLite).getSerializedSize(schema);
    }

    public static int computeMessageSize(int i11, MessageLite messageLite, Schema schema) {
        return computeTagSize(i11) + computeMessageSizeNoTag(messageLite, schema);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite, Schema schema) {
        return computeLengthDelimitedFieldSize(((AbstractMessageLite) messageLite).getSerializedSize(schema));
    }

    public static CodedOutputStream newInstance(OutputStream outputStream, int i11) {
        return new OutputStreamEncoder(outputStream, i11);
    }

    @Deprecated
    final void writeGroupNoTag(MessageLite messageLite, Schema schema) {
        schema.writeTo(messageLite, this.wrapper);
    }

    public final void writeRawByte(int i11) {
        write((byte) i11);
    }

    public final void writeRawBytes(byte[] bArr, int i11, int i12) {
        write(bArr, i11, i12);
    }

    public static CodedOutputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public final void writeRawBytes(ByteString byteString) {
        byteString.writeTo(this);
    }

    public static CodedOutputStream newInstance(byte[] bArr, int i11, int i12) {
        return new ArrayEncoder(bArr, i11, i12);
    }

    @Deprecated
    public final void writeGroup(int i11, MessageLite messageLite, Schema schema) {
        writeTag(i11, 3);
        writeGroupNoTag(messageLite, schema);
        writeTag(i11, 4);
    }

    public static CodedOutputStream newInstance(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new HeapNioEncoder(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            if (UnsafeDirectNioEncoder.isSupported()) {
                return newUnsafeInstance(byteBuffer);
            }
            return newSafeInstance(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    @Deprecated
    public static CodedOutputStream newInstance(ByteBuffer byteBuffer, int i11) {
        return newInstance(byteBuffer);
    }

    static CodedOutputStream newInstance(ByteOutput byteOutput, int i11) {
        if (i11 >= 0) {
            return new ByteOutputEncoder(byteOutput, i11);
        }
        throw new IllegalArgumentException("bufferSize must be positive");
    }
}