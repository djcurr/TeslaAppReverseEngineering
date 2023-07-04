package com.google.android.gms.internal.clearcut;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* loaded from: classes3.dex */
public final class zzfs {
    private final ByteBuffer zzgd;
    private zzbn zzrh;
    private int zzri;

    private zzfs(ByteBuffer byteBuffer) {
        this.zzgd = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    private zzfs(byte[] bArr, int i11, int i12) {
        this(ByteBuffer.wrap(bArr, i11, i12));
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

    private final void zzao(int i11) {
        byte b11 = (byte) i11;
        if (!this.zzgd.hasRemaining()) {
            throw new zzft(this.zzgd.position(), this.zzgd.limit());
        }
        this.zzgd.put(b11);
    }

    private final void zzap(int i11) {
        while ((i11 & (-128)) != 0) {
            zzao((i11 & 127) | 128);
            i11 >>>= 7;
        }
        zzao(i11);
    }

    public static int zzb(int i11, zzfz zzfzVar) {
        int zzr = zzr(i11);
        int zzas = zzfzVar.zzas();
        return zzr + zzz(zzas) + zzas;
    }

    public static int zzb(int i11, String str) {
        return zzr(i11) + zzh(str);
    }

    public static int zzb(int i11, byte[] bArr) {
        return zzr(i11) + zzh(bArr);
    }

    public static int zzd(int i11, long j11) {
        return zzr(i11) + zzo(j11);
    }

    private static void zzd(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i11;
        int i12;
        char charAt;
        int i13;
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        int i14 = 0;
        if (!byteBuffer.hasArray()) {
            int length = charSequence.length();
            while (i14 < length) {
                char charAt2 = charSequence.charAt(i14);
                char c11 = charAt2;
                if (charAt2 >= 128) {
                    if (charAt2 < 2048) {
                        i13 = (charAt2 >>> 6) | 960;
                    } else if (charAt2 >= 55296 && 57343 >= charAt2) {
                        int i15 = i14 + 1;
                        if (i15 != charSequence.length()) {
                            char charAt3 = charSequence.charAt(i15);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                                byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                                byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                                byteBuffer.put((byte) ((codePoint & 63) | 128));
                                i14 = i15;
                                i14++;
                            } else {
                                i14 = i15;
                            }
                        }
                        StringBuilder sb2 = new StringBuilder(39);
                        sb2.append("Unpaired surrogate at index ");
                        sb2.append(i14 - 1);
                        throw new IllegalArgumentException(sb2.toString());
                    } else {
                        byteBuffer.put((byte) ((charAt2 >>> '\f') | 480));
                        i13 = ((charAt2 >>> 6) & 63) | 128;
                    }
                    byteBuffer.put((byte) i13);
                    c11 = (charAt2 & '?') | 128;
                }
                byteBuffer.put((byte) c11);
                i14++;
            }
            return;
        }
        try {
            byte[] array = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            int remaining = byteBuffer.remaining();
            int length2 = charSequence.length();
            int i16 = remaining + arrayOffset;
            while (i14 < length2) {
                int i17 = i14 + arrayOffset;
                if (i17 >= i16 || (charAt = charSequence.charAt(i14)) >= 128) {
                    break;
                }
                array[i17] = (byte) charAt;
                i14++;
            }
            if (i14 == length2) {
                i11 = arrayOffset + length2;
            } else {
                i11 = arrayOffset + i14;
                while (i14 < length2) {
                    char charAt4 = charSequence.charAt(i14);
                    if (charAt4 >= 128 || i11 >= i16) {
                        if (charAt4 < 2048 && i11 <= i16 - 2) {
                            int i18 = i11 + 1;
                            array[i11] = (byte) ((charAt4 >>> 6) | 960);
                            i11 = i18 + 1;
                            array[i18] = (byte) ((charAt4 & '?') | 128);
                        } else if ((charAt4 >= 55296 && 57343 >= charAt4) || i11 > i16 - 3) {
                            if (i11 > i16 - 4) {
                                StringBuilder sb3 = new StringBuilder(37);
                                sb3.append("Failed writing ");
                                sb3.append(charAt4);
                                sb3.append(" at index ");
                                sb3.append(i11);
                                throw new ArrayIndexOutOfBoundsException(sb3.toString());
                            }
                            int i19 = i14 + 1;
                            if (i19 != charSequence.length()) {
                                char charAt5 = charSequence.charAt(i19);
                                if (Character.isSurrogatePair(charAt4, charAt5)) {
                                    int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                    int i21 = i11 + 1;
                                    array[i11] = (byte) ((codePoint2 >>> 18) | 240);
                                    int i22 = i21 + 1;
                                    array[i21] = (byte) (((codePoint2 >>> 12) & 63) | 128);
                                    int i23 = i22 + 1;
                                    array[i22] = (byte) (((codePoint2 >>> 6) & 63) | 128);
                                    i11 = i23 + 1;
                                    array[i23] = (byte) ((codePoint2 & 63) | 128);
                                    i14 = i19;
                                } else {
                                    i14 = i19;
                                }
                            }
                            StringBuilder sb4 = new StringBuilder(39);
                            sb4.append("Unpaired surrogate at index ");
                            sb4.append(i14 - 1);
                            throw new IllegalArgumentException(sb4.toString());
                        } else {
                            int i24 = i11 + 1;
                            array[i11] = (byte) ((charAt4 >>> '\f') | 480);
                            int i25 = i24 + 1;
                            array[i24] = (byte) (((charAt4 >>> 6) & 63) | 128);
                            i12 = i25 + 1;
                            array[i25] = (byte) ((charAt4 & '?') | 128);
                        }
                        i14++;
                    } else {
                        i12 = i11 + 1;
                        array[i11] = (byte) charAt4;
                    }
                    i11 = i12;
                    i14++;
                }
            }
            byteBuffer.position(i11 - byteBuffer.arrayOffset());
        } catch (ArrayIndexOutOfBoundsException e11) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e11);
            throw bufferOverflowException;
        }
    }

    public static zzfs zzg(byte[] bArr) {
        return zzh(bArr, 0, bArr.length);
    }

    public static int zzh(String str) {
        int zza = zza(str);
        return zzz(zza) + zza;
    }

    public static int zzh(byte[] bArr) {
        return zzz(bArr.length) + bArr.length;
    }

    public static zzfs zzh(byte[] bArr, int i11, int i12) {
        return new zzfs(bArr, 0, i12);
    }

    public static long zzj(long j11) {
        return (j11 >> 63) ^ (j11 << 1);
    }

    public static int zzo(long j11) {
        if (((-128) & j11) == 0) {
            return 1;
        }
        if (((-16384) & j11) == 0) {
            return 2;
        }
        if (((-2097152) & j11) == 0) {
            return 3;
        }
        if (((-268435456) & j11) == 0) {
            return 4;
        }
        if (((-34359738368L) & j11) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j11) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j11) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j11) == 0) {
            return 8;
        }
        return (j11 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int zzr(int i11) {
        return zzz(i11 << 3);
    }

    public static int zzs(int i11) {
        if (i11 >= 0) {
            return zzz(i11);
        }
        return 10;
    }

    private static int zzz(int i11) {
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

    public final void zza(int i11, zzfz zzfzVar) {
        zzb(i11, 2);
        if (zzfzVar.zzrs < 0) {
            zzfzVar.zzas();
        }
        zzap(zzfzVar.zzrs);
        zzfzVar.zza(this);
    }

    public final void zza(int i11, String str) {
        zzb(i11, 2);
        try {
            int zzz = zzz(str.length());
            if (zzz != zzz(str.length() * 3)) {
                zzap(zza(str));
                zzd(str, this.zzgd);
                return;
            }
            int position = this.zzgd.position();
            if (this.zzgd.remaining() < zzz) {
                throw new zzft(position + zzz, this.zzgd.limit());
            }
            this.zzgd.position(position + zzz);
            zzd(str, this.zzgd);
            int position2 = this.zzgd.position();
            this.zzgd.position(position);
            zzap((position2 - position) - zzz);
            this.zzgd.position(position2);
        } catch (BufferOverflowException e11) {
            zzft zzftVar = new zzft(this.zzgd.position(), this.zzgd.limit());
            zzftVar.initCause(e11);
            throw zzftVar;
        }
    }

    public final void zza(int i11, byte[] bArr) {
        zzb(i11, 2);
        zzap(bArr.length);
        int length = bArr.length;
        if (this.zzgd.remaining() < length) {
            throw new zzft(this.zzgd.position(), this.zzgd.limit());
        }
        this.zzgd.put(bArr, 0, length);
    }

    public final void zzb(int i11, int i12) {
        zzap((i11 << 3) | i12);
    }

    public final void zzb(int i11, boolean z11) {
        zzb(25, 0);
        byte b11 = z11 ? (byte) 1 : (byte) 0;
        if (!this.zzgd.hasRemaining()) {
            throw new zzft(this.zzgd.position(), this.zzgd.limit());
        }
        this.zzgd.put(b11);
    }

    public final void zzc(int i11, int i12) {
        zzb(i11, 0);
        if (i12 >= 0) {
            zzap(i12);
        } else {
            zzn(i12);
        }
    }

    public final void zze(int i11, zzdo zzdoVar) {
        if (this.zzrh != null) {
            if (this.zzri != this.zzgd.position()) {
                this.zzrh.write(this.zzgd.array(), this.zzri, this.zzgd.position() - this.zzri);
            }
            zzbn zzbnVar = this.zzrh;
            zzbnVar.zza(i11, zzdoVar);
            zzbnVar.flush();
            this.zzri = this.zzgd.position();
        }
        this.zzrh = zzbn.zza(this.zzgd);
        this.zzri = this.zzgd.position();
        zzbn zzbnVar2 = this.zzrh;
        zzbnVar2.zza(i11, zzdoVar);
        zzbnVar2.flush();
        this.zzri = this.zzgd.position();
    }

    public final void zzem() {
        if (this.zzgd.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", Integer.valueOf(this.zzgd.remaining())));
        }
    }

    public final void zzi(int i11, long j11) {
        zzb(i11, 0);
        zzn(j11);
    }

    public final void zzn(long j11) {
        while (((-128) & j11) != 0) {
            zzao((((int) j11) & 127) | 128);
            j11 >>>= 7;
        }
        zzao((int) j11);
    }
}