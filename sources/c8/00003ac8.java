package com.google.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.WireFormat;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
abstract class BinaryReader implements Reader {
    private static final int FIXED32_MULTIPLE_MASK = 3;
    private static final int FIXED64_MULTIPLE_MASK = 7;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.protobuf.BinaryReader$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* synthetic */ BinaryReader(AnonymousClass1 anonymousClass1) {
        this();
    }

    public static BinaryReader newInstance(ByteBuffer byteBuffer, boolean z11) {
        if (byteBuffer.hasArray()) {
            return new SafeHeapReader(byteBuffer, z11);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    public abstract int getTotalBytesRead();

    @Override // com.google.protobuf.Reader
    public boolean shouldDiscardUnknownFields() {
        return false;
    }

    /* loaded from: classes2.dex */
    private static final class SafeHeapReader extends BinaryReader {
        private final byte[] buffer;
        private final boolean bufferIsImmutable;
        private int endGroupTag;
        private final int initialPos;
        private int limit;
        private int pos;
        private int tag;

        public SafeHeapReader(ByteBuffer byteBuffer, boolean z11) {
            super(null);
            this.bufferIsImmutable = z11;
            this.buffer = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.pos = arrayOffset;
            this.initialPos = arrayOffset;
            this.limit = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        private boolean isAtEnd() {
            return this.pos == this.limit;
        }

        private byte readByte() {
            int i11 = this.pos;
            if (i11 != this.limit) {
                byte[] bArr = this.buffer;
                this.pos = i11 + 1;
                return bArr[i11];
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        private Object readField(WireFormat.FieldType fieldType, Class<?> cls, ExtensionRegistryLite extensionRegistryLite) {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
                case 1:
                    return Boolean.valueOf(readBool());
                case 2:
                    return readBytes();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(readEnum());
                case 5:
                    return Integer.valueOf(readFixed32());
                case 6:
                    return Long.valueOf(readFixed64());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(readInt32());
                case 9:
                    return Long.valueOf(readInt64());
                case 10:
                    return readMessage(cls, extensionRegistryLite);
                case 11:
                    return Integer.valueOf(readSFixed32());
                case 12:
                    return Long.valueOf(readSFixed64());
                case 13:
                    return Integer.valueOf(readSInt32());
                case 14:
                    return Long.valueOf(readSInt64());
                case 15:
                    return readStringRequireUtf8();
                case 16:
                    return Integer.valueOf(readUInt32());
                case 17:
                    return Long.valueOf(readUInt64());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        private int readLittleEndian32() {
            requireBytes(4);
            return readLittleEndian32_NoCheck();
        }

        private int readLittleEndian32_NoCheck() {
            int i11 = this.pos;
            byte[] bArr = this.buffer;
            this.pos = i11 + 4;
            return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
        }

        private long readLittleEndian64() {
            requireBytes(8);
            return readLittleEndian64_NoCheck();
        }

        private long readLittleEndian64_NoCheck() {
            int i11 = this.pos;
            byte[] bArr = this.buffer;
            this.pos = i11 + 8;
            return ((bArr[i11 + 7] & 255) << 56) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((bArr[i11 + 6] & 255) << 48);
        }

        private int readVarint32() {
            int i11;
            int i12 = this.pos;
            int i13 = this.limit;
            if (i13 != i12) {
                byte[] bArr = this.buffer;
                int i14 = i12 + 1;
                byte b11 = bArr[i12];
                if (b11 >= 0) {
                    this.pos = i14;
                    return b11;
                } else if (i13 - i14 < 9) {
                    return (int) readVarint64SlowPath();
                } else {
                    int i15 = i14 + 1;
                    int i16 = b11 ^ (bArr[i14] << 7);
                    if (i16 < 0) {
                        i11 = i16 ^ (-128);
                    } else {
                        int i17 = i15 + 1;
                        int i18 = i16 ^ (bArr[i15] << 14);
                        if (i18 >= 0) {
                            i11 = i18 ^ 16256;
                        } else {
                            i15 = i17 + 1;
                            int i19 = i18 ^ (bArr[i17] << 21);
                            if (i19 < 0) {
                                i11 = i19 ^ (-2080896);
                            } else {
                                i17 = i15 + 1;
                                byte b12 = bArr[i15];
                                i11 = (i19 ^ (b12 << 28)) ^ 266354560;
                                if (b12 < 0) {
                                    i15 = i17 + 1;
                                    if (bArr[i17] < 0) {
                                        i17 = i15 + 1;
                                        if (bArr[i15] < 0) {
                                            i15 = i17 + 1;
                                            if (bArr[i17] < 0) {
                                                i17 = i15 + 1;
                                                if (bArr[i15] < 0) {
                                                    i15 = i17 + 1;
                                                    if (bArr[i17] < 0) {
                                                        throw InvalidProtocolBufferException.malformedVarint();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i15 = i17;
                    }
                    this.pos = i15;
                    return i11;
                }
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        private long readVarint64SlowPath() {
            long j11 = 0;
            for (int i11 = 0; i11 < 64; i11 += 7) {
                byte readByte = readByte();
                j11 |= (readByte & Byte.MAX_VALUE) << i11;
                if ((readByte & 128) == 0) {
                    return j11;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void requireBytes(int i11) {
            if (i11 < 0 || i11 > this.limit - this.pos) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        private void requirePosition(int i11) {
            if (this.pos != i11) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        private void requireWireType(int i11) {
            if (WireFormat.getTagWireType(this.tag) != i11) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        private void skipBytes(int i11) {
            requireBytes(i11);
            this.pos += i11;
        }

        private void skipGroup() {
            int i11 = this.endGroupTag;
            this.endGroupTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(this.tag), 4);
            while (getFieldNumber() != Integer.MAX_VALUE && skipField()) {
            }
            if (this.tag == this.endGroupTag) {
                this.endGroupTag = i11;
                return;
            }
            throw InvalidProtocolBufferException.parseFailure();
        }

        private void skipVarint() {
            int i11 = this.limit;
            int i12 = this.pos;
            if (i11 - i12 >= 10) {
                byte[] bArr = this.buffer;
                int i13 = 0;
                while (i13 < 10) {
                    int i14 = i12 + 1;
                    if (bArr[i12] >= 0) {
                        this.pos = i14;
                        return;
                    } else {
                        i13++;
                        i12 = i14;
                    }
                }
            }
            skipVarintSlowPath();
        }

        private void skipVarintSlowPath() {
            for (int i11 = 0; i11 < 10; i11++) {
                if (readByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void verifyPackedFixed32Length(int i11) {
            requireBytes(i11);
            if ((i11 & 3) != 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        }

        private void verifyPackedFixed64Length(int i11) {
            requireBytes(i11);
            if ((i11 & 7) != 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        }

        @Override // com.google.protobuf.Reader
        public int getFieldNumber() {
            if (isAtEnd()) {
                return Integer.MAX_VALUE;
            }
            int readVarint32 = readVarint32();
            this.tag = readVarint32;
            if (readVarint32 == this.endGroupTag) {
                return Integer.MAX_VALUE;
            }
            return WireFormat.getTagFieldNumber(readVarint32);
        }

        @Override // com.google.protobuf.Reader
        public int getTag() {
            return this.tag;
        }

        @Override // com.google.protobuf.BinaryReader
        public int getTotalBytesRead() {
            return this.pos - this.initialPos;
        }

        @Override // com.google.protobuf.Reader
        public boolean readBool() {
            requireWireType(0);
            return readVarint32() != 0;
        }

        @Override // com.google.protobuf.Reader
        public void readBoolList(List<Boolean> list) {
            int i11;
            int i12;
            if (list instanceof BooleanArrayList) {
                BooleanArrayList booleanArrayList = (BooleanArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int readVarint32 = this.pos + readVarint32();
                        while (this.pos < readVarint32) {
                            booleanArrayList.addBoolean(readVarint32() != 0);
                        }
                        requirePosition(readVarint32);
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    booleanArrayList.addBoolean(readBool());
                    if (isAtEnd()) {
                        return;
                    }
                    i12 = this.pos;
                } while (readVarint32() == this.tag);
                this.pos = i12;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int readVarint322 = this.pos + readVarint32();
                    while (this.pos < readVarint322) {
                        list.add(Boolean.valueOf(readVarint32() != 0));
                    }
                    requirePosition(readVarint322);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Boolean.valueOf(readBool()));
                if (isAtEnd()) {
                    return;
                }
                i11 = this.pos;
            } while (readVarint32() == this.tag);
            this.pos = i11;
        }

        @Override // com.google.protobuf.Reader
        public ByteString readBytes() {
            ByteString copyFrom;
            requireWireType(2);
            int readVarint32 = readVarint32();
            if (readVarint32 == 0) {
                return ByteString.EMPTY;
            }
            requireBytes(readVarint32);
            if (this.bufferIsImmutable) {
                copyFrom = ByteString.wrap(this.buffer, this.pos, readVarint32);
            } else {
                copyFrom = ByteString.copyFrom(this.buffer, this.pos, readVarint32);
            }
            this.pos += readVarint32;
            return copyFrom;
        }

        @Override // com.google.protobuf.Reader
        public void readBytesList(List<ByteString> list) {
            int i11;
            if (WireFormat.getTagWireType(this.tag) == 2) {
                do {
                    list.add(readBytes());
                    if (isAtEnd()) {
                        return;
                    }
                    i11 = this.pos;
                } while (readVarint32() == this.tag);
                this.pos = i11;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.Reader
        public double readDouble() {
            requireWireType(1);
            return Double.longBitsToDouble(readLittleEndian64());
        }

        @Override // com.google.protobuf.Reader
        public void readDoubleList(List<Double> list) {
            int i11;
            int i12;
            if (list instanceof DoubleArrayList) {
                DoubleArrayList doubleArrayList = (DoubleArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType == 1) {
                    do {
                        doubleArrayList.addDouble(readDouble());
                        if (isAtEnd()) {
                            return;
                        }
                        i12 = this.pos;
                    } while (readVarint32() == this.tag);
                    this.pos = i12;
                    return;
                } else if (tagWireType == 2) {
                    int readVarint32 = readVarint32();
                    verifyPackedFixed64Length(readVarint32);
                    int i13 = this.pos + readVarint32;
                    while (this.pos < i13) {
                        doubleArrayList.addDouble(Double.longBitsToDouble(readLittleEndian64_NoCheck()));
                    }
                    return;
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 1) {
                do {
                    list.add(Double.valueOf(readDouble()));
                    if (isAtEnd()) {
                        return;
                    }
                    i11 = this.pos;
                } while (readVarint32() == this.tag);
                this.pos = i11;
            } else if (tagWireType2 == 2) {
                int readVarint322 = readVarint32();
                verifyPackedFixed64Length(readVarint322);
                int i14 = this.pos + readVarint322;
                while (this.pos < i14) {
                    list.add(Double.valueOf(Double.longBitsToDouble(readLittleEndian64_NoCheck())));
                }
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        @Override // com.google.protobuf.Reader
        public int readEnum() {
            requireWireType(0);
            return readVarint32();
        }

        @Override // com.google.protobuf.Reader
        public void readEnumList(List<Integer> list) {
            int i11;
            int i12;
            if (list instanceof IntArrayList) {
                IntArrayList intArrayList = (IntArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int readVarint32 = this.pos + readVarint32();
                        while (this.pos < readVarint32) {
                            intArrayList.addInt(readVarint32());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    intArrayList.addInt(readEnum());
                    if (isAtEnd()) {
                        return;
                    }
                    i12 = this.pos;
                } while (readVarint32() == this.tag);
                this.pos = i12;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int readVarint322 = this.pos + readVarint32();
                    while (this.pos < readVarint322) {
                        list.add(Integer.valueOf(readVarint32()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(readEnum()));
                if (isAtEnd()) {
                    return;
                }
                i11 = this.pos;
            } while (readVarint32() == this.tag);
            this.pos = i11;
        }

        @Override // com.google.protobuf.Reader
        public int readFixed32() {
            requireWireType(5);
            return readLittleEndian32();
        }

        @Override // com.google.protobuf.Reader
        public void readFixed32List(List<Integer> list) {
            int i11;
            int i12;
            if (list instanceof IntArrayList) {
                IntArrayList intArrayList = (IntArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType == 2) {
                    int readVarint32 = readVarint32();
                    verifyPackedFixed32Length(readVarint32);
                    int i13 = this.pos + readVarint32;
                    while (this.pos < i13) {
                        intArrayList.addInt(readLittleEndian32_NoCheck());
                    }
                    return;
                } else if (tagWireType == 5) {
                    do {
                        intArrayList.addInt(readFixed32());
                        if (isAtEnd()) {
                            return;
                        }
                        i12 = this.pos;
                    } while (readVarint32() == this.tag);
                    this.pos = i12;
                    return;
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 2) {
                int readVarint322 = readVarint32();
                verifyPackedFixed32Length(readVarint322);
                int i14 = this.pos + readVarint322;
                while (this.pos < i14) {
                    list.add(Integer.valueOf(readLittleEndian32_NoCheck()));
                }
            } else if (tagWireType2 == 5) {
                do {
                    list.add(Integer.valueOf(readFixed32()));
                    if (isAtEnd()) {
                        return;
                    }
                    i11 = this.pos;
                } while (readVarint32() == this.tag);
                this.pos = i11;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        @Override // com.google.protobuf.Reader
        public long readFixed64() {
            requireWireType(1);
            return readLittleEndian64();
        }

        @Override // com.google.protobuf.Reader
        public void readFixed64List(List<Long> list) {
            int i11;
            int i12;
            if (list instanceof LongArrayList) {
                LongArrayList longArrayList = (LongArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType == 1) {
                    do {
                        longArrayList.addLong(readFixed64());
                        if (isAtEnd()) {
                            return;
                        }
                        i12 = this.pos;
                    } while (readVarint32() == this.tag);
                    this.pos = i12;
                    return;
                } else if (tagWireType == 2) {
                    int readVarint32 = readVarint32();
                    verifyPackedFixed64Length(readVarint32);
                    int i13 = this.pos + readVarint32;
                    while (this.pos < i13) {
                        longArrayList.addLong(readLittleEndian64_NoCheck());
                    }
                    return;
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 1) {
                do {
                    list.add(Long.valueOf(readFixed64()));
                    if (isAtEnd()) {
                        return;
                    }
                    i11 = this.pos;
                } while (readVarint32() == this.tag);
                this.pos = i11;
            } else if (tagWireType2 == 2) {
                int readVarint322 = readVarint32();
                verifyPackedFixed64Length(readVarint322);
                int i14 = this.pos + readVarint322;
                while (this.pos < i14) {
                    list.add(Long.valueOf(readLittleEndian64_NoCheck()));
                }
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        @Override // com.google.protobuf.Reader
        public float readFloat() {
            requireWireType(5);
            return Float.intBitsToFloat(readLittleEndian32());
        }

        @Override // com.google.protobuf.Reader
        public void readFloatList(List<Float> list) {
            int i11;
            int i12;
            if (list instanceof FloatArrayList) {
                FloatArrayList floatArrayList = (FloatArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType == 2) {
                    int readVarint32 = readVarint32();
                    verifyPackedFixed32Length(readVarint32);
                    int i13 = this.pos + readVarint32;
                    while (this.pos < i13) {
                        floatArrayList.addFloat(Float.intBitsToFloat(readLittleEndian32_NoCheck()));
                    }
                    return;
                } else if (tagWireType == 5) {
                    do {
                        floatArrayList.addFloat(readFloat());
                        if (isAtEnd()) {
                            return;
                        }
                        i12 = this.pos;
                    } while (readVarint32() == this.tag);
                    this.pos = i12;
                    return;
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 2) {
                int readVarint322 = readVarint32();
                verifyPackedFixed32Length(readVarint322);
                int i14 = this.pos + readVarint322;
                while (this.pos < i14) {
                    list.add(Float.valueOf(Float.intBitsToFloat(readLittleEndian32_NoCheck())));
                }
            } else if (tagWireType2 == 5) {
                do {
                    list.add(Float.valueOf(readFloat()));
                    if (isAtEnd()) {
                        return;
                    }
                    i11 = this.pos;
                } while (readVarint32() == this.tag);
                this.pos = i11;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        @Override // com.google.protobuf.Reader
        public <T> T readGroup(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) {
            requireWireType(3);
            return (T) readGroup(Protobuf.getInstance().schemaFor((Class) cls), extensionRegistryLite);
        }

        @Override // com.google.protobuf.Reader
        public <T> T readGroupBySchemaWithCheck(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) {
            requireWireType(3);
            return (T) readGroup(schema, extensionRegistryLite);
        }

        @Override // com.google.protobuf.Reader
        public <T> void readGroupList(List<T> list, Class<T> cls, ExtensionRegistryLite extensionRegistryLite) {
            readGroupList(list, Protobuf.getInstance().schemaFor((Class) cls), extensionRegistryLite);
        }

        @Override // com.google.protobuf.Reader
        public int readInt32() {
            requireWireType(0);
            return readVarint32();
        }

        @Override // com.google.protobuf.Reader
        public void readInt32List(List<Integer> list) {
            int i11;
            int i12;
            if (list instanceof IntArrayList) {
                IntArrayList intArrayList = (IntArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType == 0) {
                    do {
                        intArrayList.addInt(readInt32());
                        if (isAtEnd()) {
                            return;
                        }
                        i12 = this.pos;
                    } while (readVarint32() == this.tag);
                    this.pos = i12;
                    return;
                } else if (tagWireType == 2) {
                    int readVarint32 = this.pos + readVarint32();
                    while (this.pos < readVarint32) {
                        intArrayList.addInt(readVarint32());
                    }
                    requirePosition(readVarint32);
                    return;
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 0) {
                do {
                    list.add(Integer.valueOf(readInt32()));
                    if (isAtEnd()) {
                        return;
                    }
                    i11 = this.pos;
                } while (readVarint32() == this.tag);
                this.pos = i11;
            } else if (tagWireType2 == 2) {
                int readVarint322 = this.pos + readVarint32();
                while (this.pos < readVarint322) {
                    list.add(Integer.valueOf(readVarint32()));
                }
                requirePosition(readVarint322);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        @Override // com.google.protobuf.Reader
        public long readInt64() {
            requireWireType(0);
            return readVarint64();
        }

        @Override // com.google.protobuf.Reader
        public void readInt64List(List<Long> list) {
            int i11;
            int i12;
            if (list instanceof LongArrayList) {
                LongArrayList longArrayList = (LongArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType == 0) {
                    do {
                        longArrayList.addLong(readInt64());
                        if (isAtEnd()) {
                            return;
                        }
                        i12 = this.pos;
                    } while (readVarint32() == this.tag);
                    this.pos = i12;
                    return;
                } else if (tagWireType == 2) {
                    int readVarint32 = this.pos + readVarint32();
                    while (this.pos < readVarint32) {
                        longArrayList.addLong(readVarint64());
                    }
                    requirePosition(readVarint32);
                    return;
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 0) {
                do {
                    list.add(Long.valueOf(readInt64()));
                    if (isAtEnd()) {
                        return;
                    }
                    i11 = this.pos;
                } while (readVarint32() == this.tag);
                this.pos = i11;
            } else if (tagWireType2 == 2) {
                int readVarint322 = this.pos + readVarint32();
                while (this.pos < readVarint322) {
                    list.add(Long.valueOf(readVarint64()));
                }
                requirePosition(readVarint322);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.Reader
        public <K, V> void readMap(Map<K, V> map, MapEntryLite.Metadata<K, V> metadata, ExtensionRegistryLite extensionRegistryLite) {
            requireWireType(2);
            int readVarint32 = readVarint32();
            requireBytes(readVarint32);
            int i11 = this.limit;
            this.limit = this.pos + readVarint32;
            try {
                Object obj = metadata.defaultKey;
                Object obj2 = metadata.defaultValue;
                while (true) {
                    int fieldNumber = getFieldNumber();
                    if (fieldNumber == Integer.MAX_VALUE) {
                        map.put(obj, obj2);
                        return;
                    } else if (fieldNumber == 1) {
                        obj = readField(metadata.keyType, null, null);
                    } else if (fieldNumber != 2) {
                        try {
                            if (!skipField()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.");
                                break;
                            }
                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                            if (!skipField()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.");
                            }
                        }
                    } else {
                        obj2 = readField(metadata.valueType, metadata.defaultValue.getClass(), extensionRegistryLite);
                    }
                }
            } finally {
                this.limit = i11;
            }
        }

        @Override // com.google.protobuf.Reader
        public <T> T readMessage(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) {
            requireWireType(2);
            return (T) readMessage(Protobuf.getInstance().schemaFor((Class) cls), extensionRegistryLite);
        }

        @Override // com.google.protobuf.Reader
        public <T> T readMessageBySchemaWithCheck(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) {
            requireWireType(2);
            return (T) readMessage(schema, extensionRegistryLite);
        }

        @Override // com.google.protobuf.Reader
        public <T> void readMessageList(List<T> list, Class<T> cls, ExtensionRegistryLite extensionRegistryLite) {
            readMessageList(list, Protobuf.getInstance().schemaFor((Class) cls), extensionRegistryLite);
        }

        @Override // com.google.protobuf.Reader
        public int readSFixed32() {
            requireWireType(5);
            return readLittleEndian32();
        }

        @Override // com.google.protobuf.Reader
        public void readSFixed32List(List<Integer> list) {
            int i11;
            int i12;
            if (list instanceof IntArrayList) {
                IntArrayList intArrayList = (IntArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType == 2) {
                    int readVarint32 = readVarint32();
                    verifyPackedFixed32Length(readVarint32);
                    int i13 = this.pos + readVarint32;
                    while (this.pos < i13) {
                        intArrayList.addInt(readLittleEndian32_NoCheck());
                    }
                    return;
                } else if (tagWireType == 5) {
                    do {
                        intArrayList.addInt(readSFixed32());
                        if (isAtEnd()) {
                            return;
                        }
                        i12 = this.pos;
                    } while (readVarint32() == this.tag);
                    this.pos = i12;
                    return;
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 2) {
                int readVarint322 = readVarint32();
                verifyPackedFixed32Length(readVarint322);
                int i14 = this.pos + readVarint322;
                while (this.pos < i14) {
                    list.add(Integer.valueOf(readLittleEndian32_NoCheck()));
                }
            } else if (tagWireType2 == 5) {
                do {
                    list.add(Integer.valueOf(readSFixed32()));
                    if (isAtEnd()) {
                        return;
                    }
                    i11 = this.pos;
                } while (readVarint32() == this.tag);
                this.pos = i11;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        @Override // com.google.protobuf.Reader
        public long readSFixed64() {
            requireWireType(1);
            return readLittleEndian64();
        }

        @Override // com.google.protobuf.Reader
        public void readSFixed64List(List<Long> list) {
            int i11;
            int i12;
            if (list instanceof LongArrayList) {
                LongArrayList longArrayList = (LongArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType == 1) {
                    do {
                        longArrayList.addLong(readSFixed64());
                        if (isAtEnd()) {
                            return;
                        }
                        i12 = this.pos;
                    } while (readVarint32() == this.tag);
                    this.pos = i12;
                    return;
                } else if (tagWireType == 2) {
                    int readVarint32 = readVarint32();
                    verifyPackedFixed64Length(readVarint32);
                    int i13 = this.pos + readVarint32;
                    while (this.pos < i13) {
                        longArrayList.addLong(readLittleEndian64_NoCheck());
                    }
                    return;
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 1) {
                do {
                    list.add(Long.valueOf(readSFixed64()));
                    if (isAtEnd()) {
                        return;
                    }
                    i11 = this.pos;
                } while (readVarint32() == this.tag);
                this.pos = i11;
            } else if (tagWireType2 == 2) {
                int readVarint322 = readVarint32();
                verifyPackedFixed64Length(readVarint322);
                int i14 = this.pos + readVarint322;
                while (this.pos < i14) {
                    list.add(Long.valueOf(readLittleEndian64_NoCheck()));
                }
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        @Override // com.google.protobuf.Reader
        public int readSInt32() {
            requireWireType(0);
            return CodedInputStream.decodeZigZag32(readVarint32());
        }

        @Override // com.google.protobuf.Reader
        public void readSInt32List(List<Integer> list) {
            int i11;
            int i12;
            if (list instanceof IntArrayList) {
                IntArrayList intArrayList = (IntArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int readVarint32 = this.pos + readVarint32();
                        while (this.pos < readVarint32) {
                            intArrayList.addInt(CodedInputStream.decodeZigZag32(readVarint32()));
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    intArrayList.addInt(readSInt32());
                    if (isAtEnd()) {
                        return;
                    }
                    i12 = this.pos;
                } while (readVarint32() == this.tag);
                this.pos = i12;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int readVarint322 = this.pos + readVarint32();
                    while (this.pos < readVarint322) {
                        list.add(Integer.valueOf(CodedInputStream.decodeZigZag32(readVarint32())));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(readSInt32()));
                if (isAtEnd()) {
                    return;
                }
                i11 = this.pos;
            } while (readVarint32() == this.tag);
            this.pos = i11;
        }

        @Override // com.google.protobuf.Reader
        public long readSInt64() {
            requireWireType(0);
            return CodedInputStream.decodeZigZag64(readVarint64());
        }

        @Override // com.google.protobuf.Reader
        public void readSInt64List(List<Long> list) {
            int i11;
            int i12;
            if (list instanceof LongArrayList) {
                LongArrayList longArrayList = (LongArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int readVarint32 = this.pos + readVarint32();
                        while (this.pos < readVarint32) {
                            longArrayList.addLong(CodedInputStream.decodeZigZag64(readVarint64()));
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    longArrayList.addLong(readSInt64());
                    if (isAtEnd()) {
                        return;
                    }
                    i12 = this.pos;
                } while (readVarint32() == this.tag);
                this.pos = i12;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int readVarint322 = this.pos + readVarint32();
                    while (this.pos < readVarint322) {
                        list.add(Long.valueOf(CodedInputStream.decodeZigZag64(readVarint64())));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Long.valueOf(readSInt64()));
                if (isAtEnd()) {
                    return;
                }
                i11 = this.pos;
            } while (readVarint32() == this.tag);
            this.pos = i11;
        }

        @Override // com.google.protobuf.Reader
        public String readString() {
            return readStringInternal(false);
        }

        public String readStringInternal(boolean z11) {
            requireWireType(2);
            int readVarint32 = readVarint32();
            if (readVarint32 == 0) {
                return "";
            }
            requireBytes(readVarint32);
            if (z11) {
                byte[] bArr = this.buffer;
                int i11 = this.pos;
                if (!Utf8.isValidUtf8(bArr, i11, i11 + readVarint32)) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
            }
            String str = new String(this.buffer, this.pos, readVarint32, Internal.UTF_8);
            this.pos += readVarint32;
            return str;
        }

        @Override // com.google.protobuf.Reader
        public void readStringList(List<String> list) {
            readStringListInternal(list, false);
        }

        public void readStringListInternal(List<String> list, boolean z11) {
            int i11;
            int i12;
            if (WireFormat.getTagWireType(this.tag) == 2) {
                if ((list instanceof LazyStringList) && !z11) {
                    LazyStringList lazyStringList = (LazyStringList) list;
                    do {
                        lazyStringList.add(readBytes());
                        if (isAtEnd()) {
                            return;
                        }
                        i12 = this.pos;
                    } while (readVarint32() == this.tag);
                    this.pos = i12;
                    return;
                }
                do {
                    list.add(readStringInternal(z11));
                    if (isAtEnd()) {
                        return;
                    }
                    i11 = this.pos;
                } while (readVarint32() == this.tag);
                this.pos = i11;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.Reader
        public void readStringListRequireUtf8(List<String> list) {
            readStringListInternal(list, true);
        }

        @Override // com.google.protobuf.Reader
        public String readStringRequireUtf8() {
            return readStringInternal(true);
        }

        @Override // com.google.protobuf.Reader
        public int readUInt32() {
            requireWireType(0);
            return readVarint32();
        }

        @Override // com.google.protobuf.Reader
        public void readUInt32List(List<Integer> list) {
            int i11;
            int i12;
            if (list instanceof IntArrayList) {
                IntArrayList intArrayList = (IntArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int readVarint32 = this.pos + readVarint32();
                        while (this.pos < readVarint32) {
                            intArrayList.addInt(readVarint32());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    intArrayList.addInt(readUInt32());
                    if (isAtEnd()) {
                        return;
                    }
                    i12 = this.pos;
                } while (readVarint32() == this.tag);
                this.pos = i12;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int readVarint322 = this.pos + readVarint32();
                    while (this.pos < readVarint322) {
                        list.add(Integer.valueOf(readVarint32()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(readUInt32()));
                if (isAtEnd()) {
                    return;
                }
                i11 = this.pos;
            } while (readVarint32() == this.tag);
            this.pos = i11;
        }

        @Override // com.google.protobuf.Reader
        public long readUInt64() {
            requireWireType(0);
            return readVarint64();
        }

        @Override // com.google.protobuf.Reader
        public void readUInt64List(List<Long> list) {
            int i11;
            int i12;
            if (list instanceof LongArrayList) {
                LongArrayList longArrayList = (LongArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType == 0) {
                    do {
                        longArrayList.addLong(readUInt64());
                        if (isAtEnd()) {
                            return;
                        }
                        i12 = this.pos;
                    } while (readVarint32() == this.tag);
                    this.pos = i12;
                    return;
                } else if (tagWireType == 2) {
                    int readVarint32 = this.pos + readVarint32();
                    while (this.pos < readVarint32) {
                        longArrayList.addLong(readVarint64());
                    }
                    requirePosition(readVarint32);
                    return;
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 0) {
                do {
                    list.add(Long.valueOf(readUInt64()));
                    if (isAtEnd()) {
                        return;
                    }
                    i11 = this.pos;
                } while (readVarint32() == this.tag);
                this.pos = i11;
            } else if (tagWireType2 == 2) {
                int readVarint322 = this.pos + readVarint32();
                while (this.pos < readVarint322) {
                    list.add(Long.valueOf(readVarint64()));
                }
                requirePosition(readVarint322);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        public long readVarint64() {
            long j11;
            long j12;
            long j13;
            int i11;
            int i12 = this.pos;
            int i13 = this.limit;
            if (i13 != i12) {
                byte[] bArr = this.buffer;
                int i14 = i12 + 1;
                byte b11 = bArr[i12];
                if (b11 >= 0) {
                    this.pos = i14;
                    return b11;
                } else if (i13 - i14 < 9) {
                    return readVarint64SlowPath();
                } else {
                    int i15 = i14 + 1;
                    int i16 = b11 ^ (bArr[i14] << 7);
                    if (i16 >= 0) {
                        int i17 = i15 + 1;
                        int i18 = i16 ^ (bArr[i15] << 14);
                        if (i18 >= 0) {
                            i15 = i17;
                            j11 = i18 ^ 16256;
                        } else {
                            i15 = i17 + 1;
                            int i19 = i18 ^ (bArr[i17] << 21);
                            if (i19 < 0) {
                                i11 = i19 ^ (-2080896);
                            } else {
                                long j14 = i19;
                                int i21 = i15 + 1;
                                long j15 = j14 ^ (bArr[i15] << 28);
                                if (j15 >= 0) {
                                    j13 = 266354560;
                                } else {
                                    i15 = i21 + 1;
                                    long j16 = j15 ^ (bArr[i21] << 35);
                                    if (j16 < 0) {
                                        j12 = -34093383808L;
                                    } else {
                                        i21 = i15 + 1;
                                        j15 = j16 ^ (bArr[i15] << 42);
                                        if (j15 >= 0) {
                                            j13 = 4363953127296L;
                                        } else {
                                            i15 = i21 + 1;
                                            j16 = j15 ^ (bArr[i21] << 49);
                                            if (j16 < 0) {
                                                j12 = -558586000294016L;
                                            } else {
                                                int i22 = i15 + 1;
                                                long j17 = (j16 ^ (bArr[i15] << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    i15 = i22 + 1;
                                                    if (bArr[i22] < 0) {
                                                        throw InvalidProtocolBufferException.malformedVarint();
                                                    }
                                                } else {
                                                    i15 = i22;
                                                }
                                                j11 = j17;
                                            }
                                        }
                                    }
                                    j11 = j16 ^ j12;
                                }
                                j11 = j15 ^ j13;
                                i15 = i21;
                            }
                        }
                        this.pos = i15;
                        return j11;
                    }
                    i11 = i16 ^ (-128);
                    j11 = i11;
                    this.pos = i15;
                    return j11;
                }
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.Reader
        public boolean skipField() {
            int i11;
            if (isAtEnd() || (i11 = this.tag) == this.endGroupTag) {
                return false;
            }
            int tagWireType = WireFormat.getTagWireType(i11);
            if (tagWireType == 0) {
                skipVarint();
                return true;
            } else if (tagWireType == 1) {
                skipBytes(8);
                return true;
            } else if (tagWireType == 2) {
                skipBytes(readVarint32());
                return true;
            } else if (tagWireType == 3) {
                skipGroup();
                return true;
            } else if (tagWireType == 5) {
                skipBytes(4);
                return true;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        private <T> T readGroup(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) {
            int i11 = this.endGroupTag;
            this.endGroupTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(this.tag), 4);
            try {
                T newInstance = schema.newInstance();
                schema.mergeFrom(newInstance, this, extensionRegistryLite);
                schema.makeImmutable(newInstance);
                if (this.tag == this.endGroupTag) {
                    return newInstance;
                }
                throw InvalidProtocolBufferException.parseFailure();
            } finally {
                this.endGroupTag = i11;
            }
        }

        private <T> T readMessage(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) {
            int readVarint32 = readVarint32();
            requireBytes(readVarint32);
            int i11 = this.limit;
            int i12 = this.pos + readVarint32;
            this.limit = i12;
            try {
                T newInstance = schema.newInstance();
                schema.mergeFrom(newInstance, this, extensionRegistryLite);
                schema.makeImmutable(newInstance);
                if (this.pos == i12) {
                    return newInstance;
                }
                throw InvalidProtocolBufferException.parseFailure();
            } finally {
                this.limit = i11;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.Reader
        public <T> void readGroupList(List<T> list, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) {
            int i11;
            if (WireFormat.getTagWireType(this.tag) == 3) {
                int i12 = this.tag;
                do {
                    list.add(readGroup(schema, extensionRegistryLite));
                    if (isAtEnd()) {
                        return;
                    }
                    i11 = this.pos;
                } while (readVarint32() == i12);
                this.pos = i11;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.Reader
        public <T> void readMessageList(List<T> list, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) {
            int i11;
            if (WireFormat.getTagWireType(this.tag) == 2) {
                int i12 = this.tag;
                do {
                    list.add(readMessage(schema, extensionRegistryLite));
                    if (isAtEnd()) {
                        return;
                    }
                    i11 = this.pos;
                } while (readVarint32() == i12);
                this.pos = i11;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    private BinaryReader() {
    }
}