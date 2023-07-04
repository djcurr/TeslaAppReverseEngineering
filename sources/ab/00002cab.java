package com.google.android.gms.internal.vision;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* loaded from: classes3.dex */
public final class zzjl {
    private zzfe zzade;
    private int zzadf;
    private final ByteBuffer zzsw;

    private zzjl(byte[] bArr, int i11, int i12) {
        this(ByteBuffer.wrap(bArr, i11, i12));
    }

    public static int zzav(int i11) {
        return zzbd(i11 << 3);
    }

    public static int zzaw(int i11) {
        if (i11 >= 0) {
            return zzbd(i11);
        }
        return 10;
    }

    public static int zzbd(int i11) {
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

    private final void zzbu(int i11) {
        byte b11 = (byte) i11;
        if (this.zzsw.hasRemaining()) {
            this.zzsw.put(b11);
            return;
        }
        throw new zzjm(this.zzsw.position(), this.zzsw.limit());
    }

    private static void zzd(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i11;
        int i12;
        char charAt;
        if (!byteBuffer.isReadOnly()) {
            int i13 = 0;
            if (byteBuffer.hasArray()) {
                try {
                    byte[] array = byteBuffer.array();
                    int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                    int remaining = byteBuffer.remaining();
                    int length = charSequence.length();
                    int i14 = remaining + arrayOffset;
                    while (i13 < length) {
                        int i15 = i13 + arrayOffset;
                        if (i15 >= i14 || (charAt = charSequence.charAt(i13)) >= 128) {
                            break;
                        }
                        array[i15] = (byte) charAt;
                        i13++;
                    }
                    if (i13 == length) {
                        i11 = arrayOffset + length;
                    } else {
                        i11 = arrayOffset + i13;
                        while (i13 < length) {
                            char charAt2 = charSequence.charAt(i13);
                            if (charAt2 >= 128 || i11 >= i14) {
                                if (charAt2 < 2048 && i11 <= i14 - 2) {
                                    int i16 = i11 + 1;
                                    array[i11] = (byte) ((charAt2 >>> 6) | 960);
                                    i11 = i16 + 1;
                                    array[i16] = (byte) ((charAt2 & '?') | 128);
                                } else if ((charAt2 >= 55296 && 57343 >= charAt2) || i11 > i14 - 3) {
                                    if (i11 <= i14 - 4) {
                                        int i17 = i13 + 1;
                                        if (i17 != charSequence.length()) {
                                            char charAt3 = charSequence.charAt(i17);
                                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                                int i18 = i11 + 1;
                                                array[i11] = (byte) ((codePoint >>> 18) | 240);
                                                int i19 = i18 + 1;
                                                array[i18] = (byte) (((codePoint >>> 12) & 63) | 128);
                                                int i21 = i19 + 1;
                                                array[i19] = (byte) (((codePoint >>> 6) & 63) | 128);
                                                i11 = i21 + 1;
                                                array[i21] = (byte) ((codePoint & 63) | 128);
                                                i13 = i17;
                                            } else {
                                                i13 = i17;
                                            }
                                        }
                                        StringBuilder sb2 = new StringBuilder(39);
                                        sb2.append("Unpaired surrogate at index ");
                                        sb2.append(i13 - 1);
                                        throw new IllegalArgumentException(sb2.toString());
                                    }
                                    StringBuilder sb3 = new StringBuilder(37);
                                    sb3.append("Failed writing ");
                                    sb3.append(charAt2);
                                    sb3.append(" at index ");
                                    sb3.append(i11);
                                    throw new ArrayIndexOutOfBoundsException(sb3.toString());
                                } else {
                                    int i22 = i11 + 1;
                                    array[i11] = (byte) ((charAt2 >>> '\f') | 480);
                                    int i23 = i22 + 1;
                                    array[i22] = (byte) (((charAt2 >>> 6) & 63) | 128);
                                    i12 = i23 + 1;
                                    array[i23] = (byte) ((charAt2 & '?') | 128);
                                }
                                i13++;
                            } else {
                                i12 = i11 + 1;
                                array[i11] = (byte) charAt2;
                            }
                            i11 = i12;
                            i13++;
                        }
                    }
                    byteBuffer.position(i11 - byteBuffer.arrayOffset());
                    return;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    BufferOverflowException bufferOverflowException = new BufferOverflowException();
                    bufferOverflowException.initCause(e11);
                    throw bufferOverflowException;
                }
            }
            int length2 = charSequence.length();
            while (i13 < length2) {
                char charAt4 = charSequence.charAt(i13);
                if (charAt4 < 128) {
                    byteBuffer.put((byte) charAt4);
                } else if (charAt4 < 2048) {
                    byteBuffer.put((byte) ((charAt4 >>> 6) | 960));
                    byteBuffer.put((byte) ((charAt4 & '?') | 128));
                } else if (charAt4 >= 55296 && 57343 >= charAt4) {
                    int i24 = i13 + 1;
                    if (i24 != charSequence.length()) {
                        char charAt5 = charSequence.charAt(i24);
                        if (Character.isSurrogatePair(charAt4, charAt5)) {
                            int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                            byteBuffer.put((byte) ((codePoint2 >>> 18) | 240));
                            byteBuffer.put((byte) (((codePoint2 >>> 12) & 63) | 128));
                            byteBuffer.put((byte) (((codePoint2 >>> 6) & 63) | 128));
                            byteBuffer.put((byte) ((codePoint2 & 63) | 128));
                            i13 = i24;
                        } else {
                            i13 = i24;
                        }
                    }
                    StringBuilder sb4 = new StringBuilder(39);
                    sb4.append("Unpaired surrogate at index ");
                    sb4.append(i13 - 1);
                    throw new IllegalArgumentException(sb4.toString());
                } else {
                    byteBuffer.put((byte) ((charAt4 >>> '\f') | 480));
                    byteBuffer.put((byte) (((charAt4 >>> 6) & 63) | 128));
                    byteBuffer.put((byte) ((charAt4 & '?') | 128));
                }
                i13++;
            }
            return;
        }
        throw new ReadOnlyBufferException();
    }

    public static zzjl zzk(byte[] bArr) {
        return zzl(bArr, 0, bArr.length);
    }

    public static zzjl zzl(byte[] bArr, int i11, int i12) {
        return new zzjl(bArr, 0, i12);
    }

    public static int zzn(String str) {
        int zza = zza(str);
        return zzbd(zza) + zza;
    }

    private final void zzq(long j11) {
        while (((-128) & j11) != 0) {
            zzbu((((int) j11) & 127) | 128);
            j11 >>>= 7;
        }
        zzbu((int) j11);
    }

    public final void zza(int i11, float f11) {
        zzd(i11, 5);
        int floatToIntBits = Float.floatToIntBits(f11);
        if (this.zzsw.remaining() >= 4) {
            this.zzsw.putInt(floatToIntBits);
            return;
        }
        throw new zzjm(this.zzsw.position(), this.zzsw.limit());
    }

    public final void zzb(int i11, boolean z11) {
        zzd(i11, 0);
        byte b11 = z11 ? (byte) 1 : (byte) 0;
        if (this.zzsw.hasRemaining()) {
            this.zzsw.put(b11);
            return;
        }
        throw new zzjm(this.zzsw.position(), this.zzsw.limit());
    }

    public final void zzbv(int i11) {
        while ((i11 & (-128)) != 0) {
            zzbu((i11 & 127) | 128);
            i11 >>>= 7;
        }
        zzbu(i11);
    }

    public final void zze(int i11, int i12) {
        zzd(i11, 0);
        if (i12 >= 0) {
            zzbv(i12);
        } else {
            zzq(i12);
        }
    }

    public final void zzea() {
        if (this.zzsw.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", Integer.valueOf(this.zzsw.remaining())));
        }
    }

    public final void zzi(int i11, long j11) {
        zzd(i11, 0);
        zzq(j11);
    }

    private zzjl(ByteBuffer byteBuffer) {
        this.zzsw = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void zzl(byte[] bArr) {
        int length = bArr.length;
        if (this.zzsw.remaining() >= length) {
            this.zzsw.put(bArr, 0, length);
            return;
        }
        throw new zzjm(this.zzsw.position(), this.zzsw.limit());
    }

    public static int zzi(int i11, int i12) {
        return zzav(i11) + zzaw(i12);
    }

    public final void zze(int i11, zzhf zzhfVar) {
        if (this.zzade == null) {
            this.zzade = zzfe.zza(this.zzsw);
            this.zzadf = this.zzsw.position();
        } else if (this.zzadf != this.zzsw.position()) {
            this.zzade.write(this.zzsw.array(), this.zzadf, this.zzsw.position() - this.zzadf);
            this.zzadf = this.zzsw.position();
        }
        zzfe zzfeVar = this.zzade;
        zzfeVar.zza(2, zzhfVar);
        zzfeVar.flush();
        this.zzadf = this.zzsw.position();
    }

    public static int zzb(int i11, String str) {
        return zzav(i11) + zzn(str);
    }

    public static int zzb(int i11, zzjt zzjtVar) {
        int zzav = zzav(i11);
        int zzeq = zzjtVar.zzeq();
        return zzav + zzbd(zzeq) + zzeq;
    }

    public final void zza(int i11, String str) {
        zzd(i11, 2);
        try {
            int zzbd = zzbd(str.length());
            if (zzbd == zzbd(str.length() * 3)) {
                int position = this.zzsw.position();
                if (this.zzsw.remaining() >= zzbd) {
                    this.zzsw.position(position + zzbd);
                    zzd(str, this.zzsw);
                    int position2 = this.zzsw.position();
                    this.zzsw.position(position);
                    zzbv((position2 - position) - zzbd);
                    this.zzsw.position(position2);
                    return;
                }
                throw new zzjm(position + zzbd, this.zzsw.limit());
            }
            zzbv(zza(str));
            zzd(str, this.zzsw);
        } catch (BufferOverflowException e11) {
            zzjm zzjmVar = new zzjm(this.zzsw.position(), this.zzsw.limit());
            zzjmVar.initCause(e11);
            throw zzjmVar;
        }
    }

    public final void zza(int i11, zzjt zzjtVar) {
        zzd(i11, 2);
        if (zzjtVar.zzadp < 0) {
            zzjtVar.zzeq();
        }
        zzbv(zzjtVar.zzadp);
        zzjtVar.zza(this);
    }

    private static int zza(CharSequence charSequence) {
        int length = charSequence.length();
        int i11 = 0;
        int i12 = 0;
        while (i12 < length && charSequence.charAt(i12) < 128) {
            i12++;
        }
        int i13 = length;
        while (true) {
            if (i12 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i12);
            if (charAt < 2048) {
                i13 += (127 - charAt) >>> 31;
                i12++;
            } else {
                int length2 = charSequence.length();
                while (i12 < length2) {
                    char charAt2 = charSequence.charAt(i12);
                    if (charAt2 < 2048) {
                        i11 += (127 - charAt2) >>> 31;
                    } else {
                        i11 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i12) < 65536) {
                                StringBuilder sb2 = new StringBuilder(39);
                                sb2.append("Unpaired surrogate at index ");
                                sb2.append(i12);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                            i12++;
                        }
                    }
                    i12++;
                }
                i13 += i11;
            }
        }
        if (i13 >= length) {
            return i13;
        }
        StringBuilder sb3 = new StringBuilder(54);
        sb3.append("UTF-8 length does not fit in int: ");
        sb3.append(i13 + 4294967296L);
        throw new IllegalArgumentException(sb3.toString());
    }

    public static int zzd(int i11, long j11) {
        return zzav(i11) + (((-128) & j11) == 0 ? 1 : ((-16384) & j11) == 0 ? 2 : ((-2097152) & j11) == 0 ? 3 : ((-268435456) & j11) == 0 ? 4 : ((-34359738368L) & j11) == 0 ? 5 : ((-4398046511104L) & j11) == 0 ? 6 : ((-562949953421312L) & j11) == 0 ? 7 : ((-72057594037927936L) & j11) == 0 ? 8 : (j11 & Long.MIN_VALUE) == 0 ? 9 : 10);
    }

    private final void zzd(int i11, int i12) {
        zzbv((i11 << 3) | i12);
    }
}