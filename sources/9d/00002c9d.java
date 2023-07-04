package com.google.android.gms.internal.vision;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
abstract class zziy {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzc(CharSequence charSequence, ByteBuffer byteBuffer) {
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
                char charAt2 = charSequence.charAt(i11);
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Failed writing ");
                sb2.append(charAt2);
                sb2.append(" at index ");
                sb2.append(byteBuffer.position() + Math.max(i11, (position - byteBuffer.position()) + 1));
                throw new ArrayIndexOutOfBoundsException(sb2.toString());
            }
        }
        if (i11 == length) {
            byteBuffer.position(position + i11);
            return;
        }
        position += i11;
        while (i11 < length) {
            char charAt3 = charSequence.charAt(i11);
            if (charAt3 < 128) {
                byteBuffer.put(position, (byte) charAt3);
            } else if (charAt3 < 2048) {
                int i12 = position + 1;
                try {
                    byteBuffer.put(position, (byte) ((charAt3 >>> 6) | 192));
                    byteBuffer.put(i12, (byte) ((charAt3 & '?') | 128));
                    position = i12;
                } catch (IndexOutOfBoundsException unused2) {
                    position = i12;
                    char charAt22 = charSequence.charAt(i11);
                    StringBuilder sb22 = new StringBuilder(37);
                    sb22.append("Failed writing ");
                    sb22.append(charAt22);
                    sb22.append(" at index ");
                    sb22.append(byteBuffer.position() + Math.max(i11, (position - byteBuffer.position()) + 1));
                    throw new ArrayIndexOutOfBoundsException(sb22.toString());
                }
            } else if (charAt3 >= 55296 && 57343 >= charAt3) {
                int i13 = i11 + 1;
                if (i13 != length) {
                    try {
                        char charAt4 = charSequence.charAt(i13);
                        if (Character.isSurrogatePair(charAt3, charAt4)) {
                            int codePoint = Character.toCodePoint(charAt3, charAt4);
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
                                char charAt222 = charSequence.charAt(i11);
                                StringBuilder sb222 = new StringBuilder(37);
                                sb222.append("Failed writing ");
                                sb222.append(charAt222);
                                sb222.append(" at index ");
                                sb222.append(byteBuffer.position() + Math.max(i11, (position - byteBuffer.position()) + 1));
                                throw new ArrayIndexOutOfBoundsException(sb222.toString());
                            }
                        } else {
                            i11 = i13;
                        }
                    } catch (IndexOutOfBoundsException unused4) {
                    }
                }
                throw new zzja(i11, length);
            } else {
                int i17 = position + 1;
                byteBuffer.put(position, (byte) ((charAt3 >>> '\f') | 224));
                position = i17 + 1;
                byteBuffer.put(i17, (byte) (((charAt3 >>> 6) & 63) | 128));
                byteBuffer.put(position, (byte) ((charAt3 & '?') | 128));
            }
            i11++;
            position++;
        }
        byteBuffer.position(position);
    }

    abstract int zzb(int i11, byte[] bArr, int i12, int i13);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzb(CharSequence charSequence, byte[] bArr, int i11, int i12);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(CharSequence charSequence, ByteBuffer byteBuffer);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzg(byte[] bArr, int i11, int i12) {
        return zzb(0, bArr, i11, i12) == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String zzi(byte[] bArr, int i11, int i12);
}