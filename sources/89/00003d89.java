package com.google.protobuf;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Utf8 {
    private static final long ASCII_MASK_LONG = -9187201950435737472L;
    public static final int COMPLETE = 0;
    public static final int MALFORMED = -1;
    static final int MAX_BYTES_PER_CHAR = 3;
    private static final int UNSAFE_COUNT_ASCII_THRESHOLD = 16;
    private static final Processor processor;

    /* loaded from: classes2.dex */
    public static class DecodeUtil {
        private DecodeUtil() {
        }

        public static void handleFourBytes(byte b11, byte b12, byte b13, byte b14, char[] cArr, int i11) {
            if (!isNotTrailingByte(b12) && (((b11 << 28) + (b12 + 112)) >> 30) == 0 && !isNotTrailingByte(b13) && !isNotTrailingByte(b14)) {
                int trailingByteValue = ((b11 & 7) << 18) | (trailingByteValue(b12) << 12) | (trailingByteValue(b13) << 6) | trailingByteValue(b14);
                cArr[i11] = highSurrogate(trailingByteValue);
                cArr[i11 + 1] = lowSurrogate(trailingByteValue);
                return;
            }
            throw InvalidProtocolBufferException.invalidUtf8();
        }

        public static void handleOneByte(byte b11, char[] cArr, int i11) {
            cArr[i11] = (char) b11;
        }

        public static void handleThreeBytes(byte b11, byte b12, byte b13, char[] cArr, int i11) {
            if (!isNotTrailingByte(b12) && ((b11 != -32 || b12 >= -96) && ((b11 != -19 || b12 < -96) && !isNotTrailingByte(b13)))) {
                cArr[i11] = (char) (((b11 & 15) << 12) | (trailingByteValue(b12) << 6) | trailingByteValue(b13));
                return;
            }
            throw InvalidProtocolBufferException.invalidUtf8();
        }

        public static void handleTwoBytes(byte b11, byte b12, char[] cArr, int i11) {
            if (b11 >= -62 && !isNotTrailingByte(b12)) {
                cArr[i11] = (char) (((b11 & 31) << 6) | trailingByteValue(b12));
                return;
            }
            throw InvalidProtocolBufferException.invalidUtf8();
        }

        private static char highSurrogate(int i11) {
            return (char) ((i11 >>> 10) + 55232);
        }

        private static boolean isNotTrailingByte(byte b11) {
            return b11 > -65;
        }

        public static boolean isOneByte(byte b11) {
            return b11 >= 0;
        }

        public static boolean isThreeBytes(byte b11) {
            return b11 < -16;
        }

        public static boolean isTwoBytes(byte b11) {
            return b11 < -32;
        }

        private static char lowSurrogate(int i11) {
            return (char) ((i11 & 1023) + 56320);
        }

        private static int trailingByteValue(byte b11) {
            return b11 & 63;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class Processor {
        Processor() {
        }

        final String decodeUtf8(ByteBuffer byteBuffer, int i11, int i12) {
            if (byteBuffer.hasArray()) {
                return decodeUtf8(byteBuffer.array(), byteBuffer.arrayOffset() + i11, i12);
            } else if (byteBuffer.isDirect()) {
                return decodeUtf8Direct(byteBuffer, i11, i12);
            } else {
                return decodeUtf8Default(byteBuffer, i11, i12);
            }
        }

        abstract String decodeUtf8(byte[] bArr, int i11, int i12);

        final String decodeUtf8Default(ByteBuffer byteBuffer, int i11, int i12) {
            if ((i11 | i12 | ((byteBuffer.limit() - i11) - i12)) >= 0) {
                int i13 = i11 + i12;
                char[] cArr = new char[i12];
                int i14 = 0;
                while (i11 < i13) {
                    byte b11 = byteBuffer.get(i11);
                    if (!DecodeUtil.isOneByte(b11)) {
                        break;
                    }
                    i11++;
                    DecodeUtil.handleOneByte(b11, cArr, i14);
                    i14++;
                }
                int i15 = i14;
                while (i11 < i13) {
                    int i16 = i11 + 1;
                    byte b12 = byteBuffer.get(i11);
                    if (DecodeUtil.isOneByte(b12)) {
                        int i17 = i15 + 1;
                        DecodeUtil.handleOneByte(b12, cArr, i15);
                        while (i16 < i13) {
                            byte b13 = byteBuffer.get(i16);
                            if (!DecodeUtil.isOneByte(b13)) {
                                break;
                            }
                            i16++;
                            DecodeUtil.handleOneByte(b13, cArr, i17);
                            i17++;
                        }
                        i11 = i16;
                        i15 = i17;
                    } else if (DecodeUtil.isTwoBytes(b12)) {
                        if (i16 < i13) {
                            DecodeUtil.handleTwoBytes(b12, byteBuffer.get(i16), cArr, i15);
                            i11 = i16 + 1;
                            i15++;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    } else if (DecodeUtil.isThreeBytes(b12)) {
                        if (i16 < i13 - 1) {
                            int i18 = i16 + 1;
                            DecodeUtil.handleThreeBytes(b12, byteBuffer.get(i16), byteBuffer.get(i18), cArr, i15);
                            i11 = i18 + 1;
                            i15++;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    } else if (i16 < i13 - 2) {
                        int i19 = i16 + 1;
                        byte b14 = byteBuffer.get(i16);
                        int i21 = i19 + 1;
                        DecodeUtil.handleFourBytes(b12, b14, byteBuffer.get(i19), byteBuffer.get(i21), cArr, i15);
                        i11 = i21 + 1;
                        i15 = i15 + 1 + 1;
                    } else {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                }
                return new String(cArr, 0, i15);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i11), Integer.valueOf(i12)));
        }

        abstract String decodeUtf8Direct(ByteBuffer byteBuffer, int i11, int i12);

        abstract int encodeUtf8(CharSequence charSequence, byte[] bArr, int i11, int i12);

        final void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                int arrayOffset = byteBuffer.arrayOffset();
                byteBuffer.position(Utf8.encode(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
            } else if (byteBuffer.isDirect()) {
                encodeUtf8Direct(charSequence, byteBuffer);
            } else {
                encodeUtf8Default(charSequence, byteBuffer);
            }
        }

        final void encodeUtf8Default(CharSequence charSequence, ByteBuffer byteBuffer) {
            int length = charSequence.length();
            int position = byteBuffer.position();
            int i11 = 0;
            while (i11 < length) {
                try {
                    char charAt = charSequence.charAt(i11);
                    if (charAt >= 128) {
                        break;
                    }
                    byteBuffer.put(position + i11, (byte) charAt);
                    i11++;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i11) + " at index " + (byteBuffer.position() + Math.max(i11, (position - byteBuffer.position()) + 1)));
                }
            }
            if (i11 == length) {
                byteBuffer.position(position + i11);
                return;
            }
            position += i11;
            while (i11 < length) {
                char charAt2 = charSequence.charAt(i11);
                if (charAt2 < 128) {
                    byteBuffer.put(position, (byte) charAt2);
                } else if (charAt2 < 2048) {
                    int i12 = position + 1;
                    try {
                        byteBuffer.put(position, (byte) ((charAt2 >>> 6) | 192));
                        byteBuffer.put(i12, (byte) ((charAt2 & '?') | 128));
                        position = i12;
                    } catch (IndexOutOfBoundsException unused2) {
                        position = i12;
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i11) + " at index " + (byteBuffer.position() + Math.max(i11, (position - byteBuffer.position()) + 1)));
                    }
                } else if (charAt2 >= 55296 && 57343 >= charAt2) {
                    int i13 = i11 + 1;
                    if (i13 != length) {
                        try {
                            char charAt3 = charSequence.charAt(i13);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                int i14 = position + 1;
                                try {
                                    byteBuffer.put(position, (byte) ((codePoint >>> 18) | 240));
                                    int i15 = i14 + 1;
                                    byteBuffer.put(i14, (byte) (((codePoint >>> 12) & 63) | 128));
                                    int i16 = i15 + 1;
                                    byteBuffer.put(i15, (byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put(i16, (byte) ((codePoint & 63) | 128));
                                    position = i16;
                                    i11 = i13;
                                } catch (IndexOutOfBoundsException unused3) {
                                    position = i14;
                                    i11 = i13;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i11) + " at index " + (byteBuffer.position() + Math.max(i11, (position - byteBuffer.position()) + 1)));
                                }
                            } else {
                                i11 = i13;
                            }
                        } catch (IndexOutOfBoundsException unused4) {
                        }
                    }
                    throw new UnpairedSurrogateException(i11, length);
                } else {
                    int i17 = position + 1;
                    byteBuffer.put(position, (byte) ((charAt2 >>> '\f') | 224));
                    position = i17 + 1;
                    byteBuffer.put(i17, (byte) (((charAt2 >>> 6) & 63) | 128));
                    byteBuffer.put(position, (byte) ((charAt2 & '?') | 128));
                }
                i11++;
                position++;
            }
            byteBuffer.position(position);
        }

        abstract void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer);

        final boolean isValidUtf8(byte[] bArr, int i11, int i12) {
            return partialIsValidUtf8(0, bArr, i11, i12) == 0;
        }

        final int partialIsValidUtf8(int i11, ByteBuffer byteBuffer, int i12, int i13) {
            if (byteBuffer.hasArray()) {
                int arrayOffset = byteBuffer.arrayOffset();
                return partialIsValidUtf8(i11, byteBuffer.array(), i12 + arrayOffset, arrayOffset + i13);
            } else if (byteBuffer.isDirect()) {
                return partialIsValidUtf8Direct(i11, byteBuffer, i12, i13);
            } else {
                return partialIsValidUtf8Default(i11, byteBuffer, i12, i13);
            }
        }

        abstract int partialIsValidUtf8(int i11, byte[] bArr, int i12, int i13);

        /* JADX WARN: Code restructure failed: missing block: B:108:0x008b, code lost:
            if (r8.get(r9) > (-65)) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x0017, code lost:
            if (r8.get(r9) > (-65)) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x004c, code lost:
            if (r8.get(r9) > (-65)) goto L31;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        final int partialIsValidUtf8Default(int r7, java.nio.ByteBuffer r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L8e
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1e
                r7 = -62
                if (r0 < r7) goto L1d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
                goto L1d
            L1a:
                r9 = r7
                goto L8e
            L1d:
                return r2
            L1e:
                r4 = -16
                if (r0 >= r4) goto L4f
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L38
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r7 < r10) goto L35
                int r7 = com.google.protobuf.Utf8.access$000(r0, r9)
                return r7
            L35:
                r5 = r9
                r9 = r7
                r7 = r5
            L38:
                if (r7 > r3) goto L4e
                r4 = -96
                if (r0 != r1) goto L40
                if (r7 < r4) goto L4e
            L40:
                r1 = -19
                if (r0 != r1) goto L46
                if (r7 >= r4) goto L4e
            L46:
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
            L4e:
                return r2
            L4f:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                r4 = 0
                if (r1 != 0) goto L65
                int r7 = r9 + 1
                byte r1 = r8.get(r9)
                if (r7 < r10) goto L63
                int r7 = com.google.protobuf.Utf8.access$000(r0, r1)
                return r7
            L63:
                r9 = r7
                goto L68
            L65:
                int r7 = r7 >> 16
                byte r4 = (byte) r7
            L68:
                if (r4 != 0) goto L78
                int r7 = r9 + 1
                byte r4 = r8.get(r9)
                if (r7 < r10) goto L77
                int r7 = com.google.protobuf.Utf8.access$100(r0, r1, r4)
                return r7
            L77:
                r9 = r7
            L78:
                if (r1 > r3) goto L8d
                int r7 = r0 << 28
                int r1 = r1 + 112
                int r7 = r7 + r1
                int r7 = r7 >> 30
                if (r7 != 0) goto L8d
                if (r4 > r3) goto L8d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
            L8d:
                return r2
            L8e:
                int r7 = partialIsValidUtf8(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.Processor.partialIsValidUtf8Default(int, java.nio.ByteBuffer, int, int):int");
        }

        abstract int partialIsValidUtf8Direct(int i11, ByteBuffer byteBuffer, int i12, int i13);

        final boolean isValidUtf8(ByteBuffer byteBuffer, int i11, int i12) {
            return partialIsValidUtf8(0, byteBuffer, i11, i12) == 0;
        }

        private static int partialIsValidUtf8(ByteBuffer byteBuffer, int i11, int i12) {
            int estimateConsecutiveAscii = i11 + Utf8.estimateConsecutiveAscii(byteBuffer, i11, i12);
            while (estimateConsecutiveAscii < i12) {
                int i13 = estimateConsecutiveAscii + 1;
                byte b11 = byteBuffer.get(estimateConsecutiveAscii);
                if (b11 < 0) {
                    if (b11 < -32) {
                        if (i13 >= i12) {
                            return b11;
                        }
                        if (b11 < -62 || byteBuffer.get(i13) > -65) {
                            return -1;
                        }
                        i13++;
                    } else if (b11 >= -16) {
                        if (i13 >= i12 - 2) {
                            return Utf8.incompleteStateFor(byteBuffer, b11, i13, i12 - i13);
                        }
                        int i14 = i13 + 1;
                        byte b12 = byteBuffer.get(i13);
                        if (b12 <= -65 && (((b11 << 28) + (b12 + 112)) >> 30) == 0) {
                            int i15 = i14 + 1;
                            if (byteBuffer.get(i14) <= -65) {
                                i13 = i15 + 1;
                                if (byteBuffer.get(i15) > -65) {
                                }
                            }
                        }
                        return -1;
                    } else if (i13 >= i12 - 1) {
                        return Utf8.incompleteStateFor(byteBuffer, b11, i13, i12 - i13);
                    } else {
                        int i16 = i13 + 1;
                        byte b13 = byteBuffer.get(i13);
                        if (b13 > -65 || ((b11 == -32 && b13 < -96) || ((b11 == -19 && b13 >= -96) || byteBuffer.get(i16) > -65))) {
                            return -1;
                        }
                        estimateConsecutiveAscii = i16 + 1;
                    }
                }
                estimateConsecutiveAscii = i13;
            }
            return 0;
        }
    }

    /* loaded from: classes2.dex */
    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i11, int i12) {
            super("Unpaired surrogate at index " + i11 + " of " + i12);
        }
    }

    static {
        processor = (!UnsafeProcessor.isAvailable() || Android.isOnAndroidDevice()) ? new SafeProcessor() : new UnsafeProcessor();
    }

    private Utf8() {
    }

    public static String decodeUtf8(ByteBuffer byteBuffer, int i11, int i12) {
        return processor.decodeUtf8(byteBuffer, i11, i12);
    }

    public static int encode(CharSequence charSequence, byte[] bArr, int i11, int i12) {
        return processor.encodeUtf8(charSequence, bArr, i11, i12);
    }

    public static void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        processor.encodeUtf8(charSequence, byteBuffer);
    }

    public static int encodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 < length) {
                char charAt = charSequence.charAt(i11);
                if (charAt >= 2048) {
                    i12 += encodedLengthGeneral(charSequence, i11);
                    break;
                }
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                break;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i12 + 4294967296L));
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i11) {
        int length = charSequence.length();
        int i12 = 0;
        while (i11 < length) {
            char charAt = charSequence.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
            } else {
                i12 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i11) < 65536) {
                        throw new UnpairedSurrogateException(i11, length);
                    }
                    i11++;
                }
            }
            i11++;
        }
        return i12;
    }

    public static int estimateConsecutiveAscii(ByteBuffer byteBuffer, int i11, int i12) {
        int i13 = i12 - 7;
        int i14 = i11;
        while (i14 < i13 && (byteBuffer.getLong(i14) & ASCII_MASK_LONG) == 0) {
            i14 += 8;
        }
        return i14 - i11;
    }

    public static int incompleteStateFor(int i11) {
        if (i11 > -12) {
            return -1;
        }
        return i11;
    }

    public static int incompleteStateFor(int i11, int i12) {
        if (i11 > -12 || i12 > -65) {
            return -1;
        }
        return i11 ^ (i12 << 8);
    }

    public static int incompleteStateFor(int i11, int i12, int i13) {
        if (i11 > -12 || i12 > -65 || i13 > -65) {
            return -1;
        }
        return (i11 ^ (i12 << 8)) ^ (i13 << 16);
    }

    public static int incompleteStateFor(byte[] bArr, int i11, int i12) {
        byte b11 = bArr[i11 - 1];
        int i13 = i12 - i11;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    return incompleteStateFor(b11, bArr[i11], bArr[i11 + 1]);
                }
                throw new AssertionError();
            }
            return incompleteStateFor(b11, bArr[i11]);
        }
        return incompleteStateFor(b11);
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return processor.isValidUtf8(bArr, 0, bArr.length);
    }

    public static int partialIsValidUtf8(int i11, byte[] bArr, int i12, int i13) {
        return processor.partialIsValidUtf8(i11, bArr, i12, i13);
    }

    /* loaded from: classes2.dex */
    static final class UnsafeProcessor extends Processor {
        UnsafeProcessor() {
        }

        static boolean isAvailable() {
            return UnsafeUtil.hasUnsafeArrayOperations() && UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private static int unsafeEstimateConsecutiveAscii(byte[] bArr, long j11, int i11) {
            int i12 = 0;
            if (i11 < 16) {
                return 0;
            }
            while (true) {
                int i13 = i12 + 8;
                if (i13 > i11 || (UnsafeUtil.getLong((Object) bArr, UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + j11) & Utf8.ASCII_MASK_LONG) != 0) {
                    break;
                }
                j11 += 8;
                i12 = i13;
            }
            while (i12 < i11) {
                long j12 = 1 + j11;
                if (UnsafeUtil.getByte(bArr, j11) < 0) {
                    return i12;
                }
                i12++;
                j11 = j12;
            }
            return i11;
        }

        private static int unsafeIncompleteStateFor(byte[] bArr, int i11, long j11, int i12) {
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        return Utf8.incompleteStateFor(i11, UnsafeUtil.getByte(bArr, j11), UnsafeUtil.getByte(bArr, j11 + 1));
                    }
                    throw new AssertionError();
                }
                return Utf8.incompleteStateFor(i11, UnsafeUtil.getByte(bArr, j11));
            }
            return Utf8.incompleteStateFor(i11);
        }

        @Override // com.google.protobuf.Utf8.Processor
        String decodeUtf8(byte[] bArr, int i11, int i12) {
            if ((i11 | i12 | ((bArr.length - i11) - i12)) >= 0) {
                int unsafeEstimateConsecutiveAscii = unsafeEstimateConsecutiveAscii(bArr, i11, i12) + i11;
                int i13 = i11 + i12;
                while (unsafeEstimateConsecutiveAscii < i13 && UnsafeUtil.getByte(bArr, unsafeEstimateConsecutiveAscii) >= 0) {
                    unsafeEstimateConsecutiveAscii++;
                }
                if (unsafeEstimateConsecutiveAscii == i13) {
                    return new String(bArr, i11, i12, Internal.US_ASCII);
                }
                char[] cArr = new char[i12];
                int i14 = 0;
                while (i11 < unsafeEstimateConsecutiveAscii) {
                    DecodeUtil.handleOneByte(UnsafeUtil.getByte(bArr, i11), cArr, i14);
                    i11++;
                    i14++;
                }
                int i15 = i14;
                while (unsafeEstimateConsecutiveAscii < i13) {
                    int i16 = unsafeEstimateConsecutiveAscii + 1;
                    byte b11 = UnsafeUtil.getByte(bArr, unsafeEstimateConsecutiveAscii);
                    if (DecodeUtil.isOneByte(b11)) {
                        int i17 = i15 + 1;
                        DecodeUtil.handleOneByte(b11, cArr, i15);
                        while (i16 < i13) {
                            byte b12 = UnsafeUtil.getByte(bArr, i16);
                            if (!DecodeUtil.isOneByte(b12)) {
                                break;
                            }
                            i16++;
                            DecodeUtil.handleOneByte(b12, cArr, i17);
                            i17++;
                        }
                        i15 = i17;
                        unsafeEstimateConsecutiveAscii = i16;
                    } else if (DecodeUtil.isTwoBytes(b11)) {
                        if (i16 < i13) {
                            unsafeEstimateConsecutiveAscii = i16 + 1;
                            DecodeUtil.handleTwoBytes(b11, UnsafeUtil.getByte(bArr, i16), cArr, i15);
                            i15++;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    } else if (DecodeUtil.isThreeBytes(b11)) {
                        if (i16 < i13 - 1) {
                            int i18 = i16 + 1;
                            DecodeUtil.handleThreeBytes(b11, UnsafeUtil.getByte(bArr, i16), UnsafeUtil.getByte(bArr, i18), cArr, i15);
                            unsafeEstimateConsecutiveAscii = i18 + 1;
                            i15++;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    } else if (i16 < i13 - 2) {
                        int i19 = i16 + 1;
                        int i21 = i19 + 1;
                        unsafeEstimateConsecutiveAscii = i21 + 1;
                        DecodeUtil.handleFourBytes(b11, UnsafeUtil.getByte(bArr, i16), UnsafeUtil.getByte(bArr, i19), UnsafeUtil.getByte(bArr, i21), cArr, i15);
                        i15 = i15 + 1 + 1;
                    } else {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                }
                return new String(cArr, 0, i15);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)));
        }

        @Override // com.google.protobuf.Utf8.Processor
        String decodeUtf8Direct(ByteBuffer byteBuffer, int i11, int i12) {
            if ((i11 | i12 | ((byteBuffer.limit() - i11) - i12)) >= 0) {
                long addressOffset = UnsafeUtil.addressOffset(byteBuffer) + i11;
                long j11 = i12 + addressOffset;
                char[] cArr = new char[i12];
                int i13 = 0;
                while (addressOffset < j11) {
                    byte b11 = UnsafeUtil.getByte(addressOffset);
                    if (!DecodeUtil.isOneByte(b11)) {
                        break;
                    }
                    addressOffset++;
                    DecodeUtil.handleOneByte(b11, cArr, i13);
                    i13++;
                }
                while (true) {
                    int i14 = i13;
                    while (addressOffset < j11) {
                        long j12 = addressOffset + 1;
                        byte b12 = UnsafeUtil.getByte(addressOffset);
                        if (DecodeUtil.isOneByte(b12)) {
                            int i15 = i14 + 1;
                            DecodeUtil.handleOneByte(b12, cArr, i14);
                            while (j12 < j11) {
                                byte b13 = UnsafeUtil.getByte(j12);
                                if (!DecodeUtil.isOneByte(b13)) {
                                    break;
                                }
                                j12++;
                                DecodeUtil.handleOneByte(b13, cArr, i15);
                                i15++;
                            }
                            i14 = i15;
                            addressOffset = j12;
                        } else if (DecodeUtil.isTwoBytes(b12)) {
                            if (j12 < j11) {
                                addressOffset = j12 + 1;
                                DecodeUtil.handleTwoBytes(b12, UnsafeUtil.getByte(j12), cArr, i14);
                                i14++;
                            } else {
                                throw InvalidProtocolBufferException.invalidUtf8();
                            }
                        } else if (DecodeUtil.isThreeBytes(b12)) {
                            if (j12 < j11 - 1) {
                                long j13 = j12 + 1;
                                DecodeUtil.handleThreeBytes(b12, UnsafeUtil.getByte(j12), UnsafeUtil.getByte(j13), cArr, i14);
                                i14++;
                                addressOffset = j13 + 1;
                            } else {
                                throw InvalidProtocolBufferException.invalidUtf8();
                            }
                        } else if (j12 < j11 - 2) {
                            long j14 = j12 + 1;
                            byte b14 = UnsafeUtil.getByte(j12);
                            long j15 = j14 + 1;
                            byte b15 = UnsafeUtil.getByte(j14);
                            addressOffset = j15 + 1;
                            DecodeUtil.handleFourBytes(b12, b14, b15, UnsafeUtil.getByte(j15), cArr, i14);
                            i13 = i14 + 1 + 1;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    }
                    return new String(cArr, 0, i14);
                }
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i11), Integer.valueOf(i12)));
        }

        @Override // com.google.protobuf.Utf8.Processor
        int encodeUtf8(CharSequence charSequence, byte[] bArr, int i11, int i12) {
            char c11;
            long j11;
            long j12;
            long j13;
            char c12;
            int i13;
            char charAt;
            long j14 = i11;
            long j15 = i12 + j14;
            int length = charSequence.length();
            if (length > i12 || bArr.length - i12 < i11) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i11 + i12));
            }
            int i14 = 0;
            while (true) {
                c11 = 128;
                j11 = 1;
                if (i14 >= length || (charAt = charSequence.charAt(i14)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(bArr, j14, (byte) charAt);
                i14++;
                j14 = 1 + j14;
            }
            if (i14 == length) {
                return (int) j14;
            }
            while (i14 < length) {
                char charAt2 = charSequence.charAt(i14);
                if (charAt2 < c11 && j14 < j15) {
                    long j16 = j14 + j11;
                    UnsafeUtil.putByte(bArr, j14, (byte) charAt2);
                    j13 = j11;
                    j12 = j16;
                    c12 = c11;
                } else if (charAt2 < 2048 && j14 <= j15 - 2) {
                    long j17 = j14 + j11;
                    UnsafeUtil.putByte(bArr, j14, (byte) ((charAt2 >>> 6) | 960));
                    long j18 = j17 + j11;
                    UnsafeUtil.putByte(bArr, j17, (byte) ((charAt2 & '?') | 128));
                    long j19 = j11;
                    c12 = 128;
                    j12 = j18;
                    j13 = j19;
                } else if ((charAt2 >= 55296 && 57343 >= charAt2) || j14 > j15 - 3) {
                    if (j14 <= j15 - 4) {
                        int i15 = i14 + 1;
                        if (i15 != length) {
                            char charAt3 = charSequence.charAt(i15);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                long j21 = j14 + 1;
                                UnsafeUtil.putByte(bArr, j14, (byte) ((codePoint >>> 18) | 240));
                                long j22 = j21 + 1;
                                c12 = 128;
                                UnsafeUtil.putByte(bArr, j21, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j23 = j22 + 1;
                                UnsafeUtil.putByte(bArr, j22, (byte) (((codePoint >>> 6) & 63) | 128));
                                j13 = 1;
                                j12 = j23 + 1;
                                UnsafeUtil.putByte(bArr, j23, (byte) ((codePoint & 63) | 128));
                                i14 = i15;
                            } else {
                                i14 = i15;
                            }
                        }
                        throw new UnpairedSurrogateException(i14 - 1, length);
                    } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i13 = i14 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i13)))) {
                        throw new UnpairedSurrogateException(i14, length);
                    } else {
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j14);
                    }
                } else {
                    long j24 = j14 + j11;
                    UnsafeUtil.putByte(bArr, j14, (byte) ((charAt2 >>> '\f') | 480));
                    long j25 = j24 + j11;
                    UnsafeUtil.putByte(bArr, j24, (byte) (((charAt2 >>> 6) & 63) | 128));
                    UnsafeUtil.putByte(bArr, j25, (byte) ((charAt2 & '?') | 128));
                    j12 = j25 + 1;
                    j13 = 1;
                    c12 = 128;
                }
                i14++;
                c11 = c12;
                long j26 = j13;
                j14 = j12;
                j11 = j26;
            }
            return (int) j14;
        }

        @Override // com.google.protobuf.Utf8.Processor
        void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
            char c11;
            long j11;
            int i11;
            int i12;
            long j12;
            char c12;
            char charAt;
            long addressOffset = UnsafeUtil.addressOffset(byteBuffer);
            long position = byteBuffer.position() + addressOffset;
            long limit = byteBuffer.limit() + addressOffset;
            int length = charSequence.length();
            if (length > limit - position) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + byteBuffer.limit());
            }
            int i13 = 0;
            while (true) {
                c11 = 128;
                if (i13 >= length || (charAt = charSequence.charAt(i13)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(position, (byte) charAt);
                i13++;
                position++;
            }
            if (i13 == length) {
                byteBuffer.position((int) (position - addressOffset));
                return;
            }
            while (i13 < length) {
                char charAt2 = charSequence.charAt(i13);
                if (charAt2 >= c11 || position >= limit) {
                    if (charAt2 >= 2048 || position > limit - 2) {
                        j11 = addressOffset;
                        if ((charAt2 >= 55296 && 57343 >= charAt2) || position > limit - 3) {
                            if (position <= limit - 4) {
                                i12 = i13 + 1;
                                if (i12 != length) {
                                    char charAt3 = charSequence.charAt(i12);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        j12 = limit;
                                        long j13 = position + 1;
                                        UnsafeUtil.putByte(position, (byte) ((codePoint >>> 18) | 240));
                                        long j14 = j13 + 1;
                                        c12 = 128;
                                        UnsafeUtil.putByte(j13, (byte) (((codePoint >>> 12) & 63) | 128));
                                        long j15 = j14 + 1;
                                        UnsafeUtil.putByte(j14, (byte) (((codePoint >>> 6) & 63) | 128));
                                        UnsafeUtil.putByte(j15, (byte) ((codePoint & 63) | 128));
                                        position = j15 + 1;
                                    } else {
                                        i13 = i12;
                                    }
                                }
                                throw new UnpairedSurrogateException(i13 - 1, length);
                            } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i11 = i13 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i11)))) {
                                throw new UnpairedSurrogateException(i13, length);
                            } else {
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + position);
                            }
                        }
                        long j16 = position + 1;
                        UnsafeUtil.putByte(position, (byte) ((charAt2 >>> '\f') | 480));
                        long j17 = j16 + 1;
                        UnsafeUtil.putByte(j16, (byte) (((charAt2 >>> 6) & 63) | 128));
                        UnsafeUtil.putByte(j17, (byte) ((charAt2 & '?') | 128));
                        position = j17 + 1;
                    } else {
                        j11 = addressOffset;
                        long j18 = position + 1;
                        UnsafeUtil.putByte(position, (byte) ((charAt2 >>> 6) | 960));
                        UnsafeUtil.putByte(j18, (byte) ((charAt2 & '?') | 128));
                        position = j18 + 1;
                    }
                    j12 = limit;
                    i12 = i13;
                    c12 = 128;
                } else {
                    UnsafeUtil.putByte(position, (byte) charAt2);
                    j12 = limit;
                    i12 = i13;
                    c12 = c11;
                    position++;
                    j11 = addressOffset;
                }
                c11 = c12;
                addressOffset = j11;
                limit = j12;
                i13 = i12 + 1;
            }
            byteBuffer.position((int) (position - addressOffset));
        }

        /* JADX WARN: Code restructure failed: missing block: B:122:0x009e, code lost:
            if (com.google.protobuf.UnsafeUtil.getByte(r13, r2) > (-65)) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x0059, code lost:
            if (com.google.protobuf.UnsafeUtil.getByte(r13, r2) > (-65)) goto L36;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int partialIsValidUtf8(int r12, byte[] r13, int r14, int r15) {
            /*
                Method dump skipped, instructions count: 204
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:122:0x00a8, code lost:
            if (com.google.protobuf.UnsafeUtil.getByte(r2) > (-65)) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x0063, code lost:
            if (com.google.protobuf.UnsafeUtil.getByte(r2) > (-65)) goto L36;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int partialIsValidUtf8Direct(int r11, java.nio.ByteBuffer r12, int r13, int r14) {
            /*
                Method dump skipped, instructions count: 217
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8Direct(int, java.nio.ByteBuffer, int, int):int");
        }

        private static int unsafeEstimateConsecutiveAscii(long j11, int i11) {
            if (i11 < 16) {
                return 0;
            }
            int i12 = (int) ((-j11) & 7);
            int i13 = i12;
            while (i13 > 0) {
                long j12 = 1 + j11;
                if (UnsafeUtil.getByte(j11) < 0) {
                    return i12 - i13;
                }
                i13--;
                j11 = j12;
            }
            int i14 = i11 - i12;
            while (i14 >= 8 && (UnsafeUtil.getLong(j11) & Utf8.ASCII_MASK_LONG) == 0) {
                j11 += 8;
                i14 -= 8;
            }
            return i11 - i14;
        }

        private static int unsafeIncompleteStateFor(long j11, int i11, int i12) {
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        return Utf8.incompleteStateFor(i11, UnsafeUtil.getByte(j11), UnsafeUtil.getByte(j11 + 1));
                    }
                    throw new AssertionError();
                }
                return Utf8.incompleteStateFor(i11, UnsafeUtil.getByte(j11));
            }
            return Utf8.incompleteStateFor(i11);
        }

        /* JADX WARN: Code restructure failed: missing block: B:124:0x008e, code lost:
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x0039, code lost:
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static int partialIsValidUtf8(byte[] r8, long r9, int r11) {
            /*
                int r0 = unsafeEstimateConsecutiveAscii(r8, r9, r11)
                int r11 = r11 - r0
                long r0 = (long) r0
                long r9 = r9 + r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r11 <= 0) goto L1a
                long r4 = r9 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.getByte(r8, r9)
                if (r1 < 0) goto L19
                int r11 = r11 + (-1)
                r9 = r4
                goto L9
            L19:
                r9 = r4
            L1a:
                if (r11 != 0) goto L1d
                return r0
            L1d:
                int r11 = r11 + (-1)
                r0 = -32
                r4 = -65
                r5 = -1
                if (r1 >= r0) goto L3a
                if (r11 != 0) goto L29
                return r1
            L29:
                int r11 = r11 + (-1)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r9
                byte r9 = com.google.protobuf.UnsafeUtil.getByte(r8, r9)
                if (r9 <= r4) goto L37
                goto L39
            L37:
                r9 = r2
                goto L7
            L39:
                return r5
            L3a:
                r6 = -16
                if (r1 >= r6) goto L64
                r6 = 2
                if (r11 >= r6) goto L46
                int r8 = unsafeIncompleteStateFor(r8, r1, r9, r11)
                return r8
            L46:
                int r11 = r11 + (-2)
                long r6 = r9 + r2
                byte r9 = com.google.protobuf.UnsafeUtil.getByte(r8, r9)
                if (r9 > r4) goto L63
                r10 = -96
                if (r1 != r0) goto L56
                if (r9 < r10) goto L63
            L56:
                r0 = -19
                if (r1 != r0) goto L5c
                if (r9 >= r10) goto L63
            L5c:
                long r2 = r2 + r6
                byte r9 = com.google.protobuf.UnsafeUtil.getByte(r8, r6)
                if (r9 <= r4) goto L37
            L63:
                return r5
            L64:
                r0 = 3
                if (r11 >= r0) goto L6c
                int r8 = unsafeIncompleteStateFor(r8, r1, r9, r11)
                return r8
            L6c:
                int r11 = r11 + (-3)
                long r6 = r9 + r2
                byte r9 = com.google.protobuf.UnsafeUtil.getByte(r8, r9)
                if (r9 > r4) goto L8e
                int r10 = r1 << 28
                int r9 = r9 + 112
                int r10 = r10 + r9
                int r9 = r10 >> 30
                if (r9 != 0) goto L8e
                long r9 = r6 + r2
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r8, r6)
                if (r0 > r4) goto L8e
                long r2 = r2 + r9
                byte r9 = com.google.protobuf.UnsafeUtil.getByte(r8, r9)
                if (r9 <= r4) goto L37
            L8e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(byte[], long, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:124:0x008e, code lost:
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x0039, code lost:
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static int partialIsValidUtf8(long r8, int r10) {
            /*
                int r0 = unsafeEstimateConsecutiveAscii(r8, r10)
                long r1 = (long) r0
                long r8 = r8 + r1
                int r10 = r10 - r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r10 <= 0) goto L1a
                long r4 = r8 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.getByte(r8)
                if (r1 < 0) goto L19
                int r10 = r10 + (-1)
                r8 = r4
                goto L9
            L19:
                r8 = r4
            L1a:
                if (r10 != 0) goto L1d
                return r0
            L1d:
                int r10 = r10 + (-1)
                r0 = -32
                r4 = -65
                r5 = -1
                if (r1 >= r0) goto L3a
                if (r10 != 0) goto L29
                return r1
            L29:
                int r10 = r10 + (-1)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r8
                byte r8 = com.google.protobuf.UnsafeUtil.getByte(r8)
                if (r8 <= r4) goto L37
                goto L39
            L37:
                r8 = r2
                goto L7
            L39:
                return r5
            L3a:
                r6 = -16
                if (r1 >= r6) goto L64
                r6 = 2
                if (r10 >= r6) goto L46
                int r8 = unsafeIncompleteStateFor(r8, r1, r10)
                return r8
            L46:
                int r10 = r10 + (-2)
                long r6 = r8 + r2
                byte r8 = com.google.protobuf.UnsafeUtil.getByte(r8)
                if (r8 > r4) goto L63
                r9 = -96
                if (r1 != r0) goto L56
                if (r8 < r9) goto L63
            L56:
                r0 = -19
                if (r1 != r0) goto L5c
                if (r8 >= r9) goto L63
            L5c:
                long r2 = r2 + r6
                byte r8 = com.google.protobuf.UnsafeUtil.getByte(r6)
                if (r8 <= r4) goto L37
            L63:
                return r5
            L64:
                r0 = 3
                if (r10 >= r0) goto L6c
                int r8 = unsafeIncompleteStateFor(r8, r1, r10)
                return r8
            L6c:
                int r10 = r10 + (-3)
                long r6 = r8 + r2
                byte r8 = com.google.protobuf.UnsafeUtil.getByte(r8)
                if (r8 > r4) goto L8e
                int r9 = r1 << 28
                int r8 = r8 + 112
                int r9 = r9 + r8
                int r8 = r9 >> 30
                if (r8 != 0) goto L8e
                long r8 = r6 + r2
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r6)
                if (r0 > r4) goto L8e
                long r2 = r2 + r8
                byte r8 = com.google.protobuf.UnsafeUtil.getByte(r8)
                if (r8 <= r4) goto L37
            L8e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(long, int):int");
        }
    }

    public static String decodeUtf8(byte[] bArr, int i11, int i12) {
        return processor.decodeUtf8(bArr, i11, i12);
    }

    public static boolean isValidUtf8(byte[] bArr, int i11, int i12) {
        return processor.isValidUtf8(bArr, i11, i12);
    }

    public static int partialIsValidUtf8(int i11, ByteBuffer byteBuffer, int i12, int i13) {
        return processor.partialIsValidUtf8(i11, byteBuffer, i12, i13);
    }

    public static boolean isValidUtf8(ByteBuffer byteBuffer) {
        return processor.isValidUtf8(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    public static int incompleteStateFor(ByteBuffer byteBuffer, int i11, int i12, int i13) {
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    return incompleteStateFor(i11, byteBuffer.get(i12), byteBuffer.get(i12 + 1));
                }
                throw new AssertionError();
            }
            return incompleteStateFor(i11, byteBuffer.get(i12));
        }
        return incompleteStateFor(i11);
    }

    /* loaded from: classes2.dex */
    static final class SafeProcessor extends Processor {
        SafeProcessor() {
        }

        private static int partialIsValidUtf8NonAscii(byte[] bArr, int i11, int i12) {
            while (i11 < i12) {
                int i13 = i11 + 1;
                byte b11 = bArr[i11];
                if (b11 < 0) {
                    if (b11 < -32) {
                        if (i13 >= i12) {
                            return b11;
                        }
                        if (b11 >= -62) {
                            i11 = i13 + 1;
                            if (bArr[i13] > -65) {
                            }
                        }
                        return -1;
                    } else if (b11 >= -16) {
                        if (i13 >= i12 - 2) {
                            return Utf8.incompleteStateFor(bArr, i13, i12);
                        }
                        int i14 = i13 + 1;
                        byte b12 = bArr[i13];
                        if (b12 <= -65 && (((b11 << 28) + (b12 + 112)) >> 30) == 0) {
                            int i15 = i14 + 1;
                            if (bArr[i14] <= -65) {
                                i13 = i15 + 1;
                                if (bArr[i15] > -65) {
                                }
                            }
                        }
                        return -1;
                    } else if (i13 >= i12 - 1) {
                        return Utf8.incompleteStateFor(bArr, i13, i12);
                    } else {
                        int i16 = i13 + 1;
                        byte b13 = bArr[i13];
                        if (b13 <= -65 && ((b11 != -32 || b13 >= -96) && (b11 != -19 || b13 < -96))) {
                            i11 = i16 + 1;
                            if (bArr[i16] > -65) {
                            }
                        }
                        return -1;
                    }
                }
                i11 = i13;
            }
            return 0;
        }

        @Override // com.google.protobuf.Utf8.Processor
        String decodeUtf8(byte[] bArr, int i11, int i12) {
            if ((i11 | i12 | ((bArr.length - i11) - i12)) >= 0) {
                int i13 = i11 + i12;
                char[] cArr = new char[i12];
                int i14 = 0;
                while (i11 < i13) {
                    byte b11 = bArr[i11];
                    if (!DecodeUtil.isOneByte(b11)) {
                        break;
                    }
                    i11++;
                    DecodeUtil.handleOneByte(b11, cArr, i14);
                    i14++;
                }
                int i15 = i14;
                while (i11 < i13) {
                    int i16 = i11 + 1;
                    byte b12 = bArr[i11];
                    if (DecodeUtil.isOneByte(b12)) {
                        int i17 = i15 + 1;
                        DecodeUtil.handleOneByte(b12, cArr, i15);
                        while (i16 < i13) {
                            byte b13 = bArr[i16];
                            if (!DecodeUtil.isOneByte(b13)) {
                                break;
                            }
                            i16++;
                            DecodeUtil.handleOneByte(b13, cArr, i17);
                            i17++;
                        }
                        i11 = i16;
                        i15 = i17;
                    } else if (DecodeUtil.isTwoBytes(b12)) {
                        if (i16 < i13) {
                            DecodeUtil.handleTwoBytes(b12, bArr[i16], cArr, i15);
                            i11 = i16 + 1;
                            i15++;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    } else if (DecodeUtil.isThreeBytes(b12)) {
                        if (i16 < i13 - 1) {
                            int i18 = i16 + 1;
                            DecodeUtil.handleThreeBytes(b12, bArr[i16], bArr[i18], cArr, i15);
                            i11 = i18 + 1;
                            i15++;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    } else if (i16 < i13 - 2) {
                        int i19 = i16 + 1;
                        byte b14 = bArr[i16];
                        int i21 = i19 + 1;
                        DecodeUtil.handleFourBytes(b12, b14, bArr[i19], bArr[i21], cArr, i15);
                        i11 = i21 + 1;
                        i15 = i15 + 1 + 1;
                    } else {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                }
                return new String(cArr, 0, i15);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)));
        }

        @Override // com.google.protobuf.Utf8.Processor
        String decodeUtf8Direct(ByteBuffer byteBuffer, int i11, int i12) {
            return decodeUtf8Default(byteBuffer, i11, i12);
        }

        /* JADX WARN: Code restructure failed: missing block: B:75:0x001d, code lost:
            return r10 + r0;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int encodeUtf8(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 254
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.SafeProcessor.encodeUtf8(java.lang.CharSequence, byte[], int, int):int");
        }

        @Override // com.google.protobuf.Utf8.Processor
        void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
            encodeUtf8Default(charSequence, byteBuffer);
        }

        /* JADX WARN: Code restructure failed: missing block: B:108:0x007f, code lost:
            if (r8[r9] > (-65)) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x0015, code lost:
            if (r8[r9] > (-65)) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x0046, code lost:
            if (r8[r9] > (-65)) goto L31;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int partialIsValidUtf8(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L82
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L82
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = com.google.protobuf.Utf8.access$000(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                r4 = 0
                if (r1 != 0) goto L5d
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5b
                int r7 = com.google.protobuf.Utf8.access$000(r0, r1)
                return r7
            L5b:
                r9 = r7
                goto L60
            L5d:
                int r7 = r7 >> 16
                byte r4 = (byte) r7
            L60:
                if (r4 != 0) goto L6e
                int r7 = r9 + 1
                r4 = r8[r9]
                if (r7 < r10) goto L6d
                int r7 = com.google.protobuf.Utf8.access$100(r0, r1, r4)
                return r7
            L6d:
                r9 = r7
            L6e:
                if (r1 > r3) goto L81
                int r7 = r0 << 28
                int r1 = r1 + 112
                int r7 = r7 + r1
                int r7 = r7 >> 30
                if (r7 != 0) goto L81
                if (r4 > r3) goto L81
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L81:
                return r2
            L82:
                int r7 = partialIsValidUtf8(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.SafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        @Override // com.google.protobuf.Utf8.Processor
        int partialIsValidUtf8Direct(int i11, ByteBuffer byteBuffer, int i12, int i13) {
            return partialIsValidUtf8Default(i11, byteBuffer, i12, i13);
        }

        private static int partialIsValidUtf8(byte[] bArr, int i11, int i12) {
            while (i11 < i12 && bArr[i11] >= 0) {
                i11++;
            }
            if (i11 >= i12) {
                return 0;
            }
            return partialIsValidUtf8NonAscii(bArr, i11, i12);
        }
    }
}