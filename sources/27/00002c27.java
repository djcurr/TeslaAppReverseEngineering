package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class zzfe extends zzen {
    private static final Logger logger = Logger.getLogger(zzfe.class.getName());
    private static final boolean zzsr = zziu.zzhh();
    zzfg zzss;

    /* loaded from: classes3.dex */
    public static final class zzb extends zza {
        private final ByteBuffer zzst;
        private int zzsu;

        zzb(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.zzst = byteBuffer;
            this.zzsu = byteBuffer.position();
        }

        @Override // com.google.android.gms.internal.vision.zzfe.zza, com.google.android.gms.internal.vision.zzfe
        public final void flush() {
            this.zzst.position(this.zzsu + zzec());
        }
    }

    /* loaded from: classes3.dex */
    public static class zzc extends IOException {
        zzc() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        zzc(java.lang.String r3) {
            /*
                r2 = this;
                java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r1 = r3.length()
                if (r1 == 0) goto L11
                java.lang.String r3 = r0.concat(r3)
                goto L16
            L11:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r0)
            L16:
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzfe.zzc.<init>(java.lang.String):void");
        }

        zzc(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        zzc(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r1 = r3.length()
                if (r1 == 0) goto L11
                java.lang.String r3 = r0.concat(r3)
                goto L16
            L11:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r0)
            L16:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzfe.zzc.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    private zzfe() {
    }

    public static zzfe zza(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new zzb(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            if (zziu.zzhi()) {
                return new zze(byteBuffer);
            }
            return new zzd(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    public static int zzav(int i11) {
        return zzax(i11 << 3);
    }

    public static int zzaw(int i11) {
        if (i11 >= 0) {
            return zzax(i11);
        }
        return 10;
    }

    public static int zzax(int i11) {
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

    public static int zzay(int i11) {
        return zzax(zzbc(i11));
    }

    public static int zzaz(int i11) {
        return 4;
    }

    public static int zzb(double d11) {
        return 8;
    }

    public static int zzba(int i11) {
        return 4;
    }

    public static int zzbb(int i11) {
        return zzaw(i11);
    }

    private static int zzbc(int i11) {
        return (i11 >> 31) ^ (i11 << 1);
    }

    @Deprecated
    public static int zzbd(int i11) {
        return zzax(i11);
    }

    public static int zzc(int i11, boolean z11) {
        return zzav(i11) + 1;
    }

    public static int zzd(int i11, long j11) {
        return zzav(i11) + zzi(j11);
    }

    public static int zze(int i11, long j11) {
        return zzav(i11) + zzi(j11);
    }

    public static int zzg(float f11) {
        return 4;
    }

    public static zzfe zzg(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public static int zzi(int i11, int i12) {
        return zzav(i11) + zzaw(i12);
    }

    public static int zzi(long j11) {
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

    public static int zzi(boolean z11) {
        return 1;
    }

    public static int zzj(int i11, int i12) {
        return zzav(i11) + zzax(i12);
    }

    public static int zzk(int i11, int i12) {
        return zzav(i11) + zzax(zzbc(i12));
    }

    public static int zzk(long j11) {
        return 8;
    }

    public static int zzl(int i11, int i12) {
        return zzav(i11) + 4;
    }

    public static int zzl(long j11) {
        return 8;
    }

    public static int zzm(int i11, int i12) {
        return zzav(i11) + 4;
    }

    private static long zzm(long j11) {
        return (j11 >> 63) ^ (j11 << 1);
    }

    public static int zzn(int i11, int i12) {
        return zzav(i11) + zzaw(i12);
    }

    public abstract void flush();

    public abstract void write(byte[] bArr, int i11, int i12);

    public abstract void zza(int i11, long j11);

    public abstract void zza(int i11, zzeo zzeoVar);

    public abstract void zza(int i11, zzhf zzhfVar);

    public abstract void zza(int i11, zzhf zzhfVar, zzhw zzhwVar);

    public abstract void zza(int i11, String str);

    public abstract void zza(zzeo zzeoVar);

    abstract void zza(zzhf zzhfVar, zzhw zzhwVar);

    public abstract void zzar(int i11);

    public abstract void zzas(int i11);

    public final void zzat(int i11) {
        zzas(zzbc(i11));
    }

    public abstract void zzau(int i11);

    public final void zzb(int i11, long j11) {
        zza(i11, zzm(j11));
    }

    public abstract void zzb(int i11, zzeo zzeoVar);

    public abstract void zzb(int i11, zzhf zzhfVar);

    public abstract void zzb(int i11, boolean z11);

    public abstract void zzb(zzhf zzhfVar);

    public abstract void zzc(byte b11);

    public abstract void zzc(int i11, long j11);

    public abstract void zzd(int i11, int i12);

    public abstract int zzdz();

    public abstract void zze(int i11, int i12);

    public abstract void zze(long j11);

    public final void zzea() {
        if (zzdz() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void zzf(int i11, int i12);

    public final void zzf(long j11) {
        zze(zzm(j11));
    }

    public abstract void zzf(byte[] bArr, int i11, int i12);

    public abstract void zzg(long j11);

    public abstract void zzh(int i11, int i12);

    public final void zzh(boolean z11) {
        zzc(z11 ? (byte) 1 : (byte) 0);
    }

    public abstract void zzm(String str);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class zza extends zzfe {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        zza(byte[] bArr, int i11, int i12) {
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

        @Override // com.google.android.gms.internal.vision.zzfe
        public void flush() {
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void write(byte[] bArr, int i11, int i12) {
            try {
                System.arraycopy(bArr, i11, this.buffer, this.position, i12);
                this.position += i12;
            } catch (IndexOutOfBoundsException e11) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i12)), e11);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(int i11, long j11) {
            zzd(i11, 0);
            zze(j11);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzar(int i11) {
            if (i11 >= 0) {
                zzas(i11);
            } else {
                zze(i11);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzas(int i11) {
            if (zzfe.zzsr && zzdz() >= 10) {
                while ((i11 & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i12 = this.position;
                    this.position = i12 + 1;
                    zziu.zza(bArr, i12, (byte) ((i11 & 127) | 128));
                    i11 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i13 = this.position;
                this.position = i13 + 1;
                zziu.zza(bArr2, i13, (byte) i11);
                return;
            }
            while ((i11 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.buffer;
                    int i14 = this.position;
                    this.position = i14 + 1;
                    bArr3[i14] = (byte) ((i11 & 127) | 128);
                    i11 >>>= 7;
                } catch (IndexOutOfBoundsException e11) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e11);
                }
            }
            byte[] bArr4 = this.buffer;
            int i15 = this.position;
            this.position = i15 + 1;
            bArr4[i15] = (byte) i11;
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzau(int i11) {
            try {
                byte[] bArr = this.buffer;
                int i12 = this.position;
                int i13 = i12 + 1;
                this.position = i13;
                bArr[i12] = (byte) i11;
                int i14 = i13 + 1;
                this.position = i14;
                bArr[i13] = (byte) (i11 >> 8);
                int i15 = i14 + 1;
                this.position = i15;
                bArr[i14] = (byte) (i11 >> 16);
                this.position = i15 + 1;
                bArr[i15] = i11 >> 24;
            } catch (IndexOutOfBoundsException e11) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e11);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzb(int i11, boolean z11) {
            zzd(i11, 0);
            zzc(z11 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzc(int i11, long j11) {
            zzd(i11, 1);
            zzg(j11);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzd(int i11, int i12) {
            zzas((i11 << 3) | i12);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final int zzdz() {
            return this.limit - this.position;
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zze(int i11, int i12) {
            zzd(i11, 0);
            zzar(i12);
        }

        public final int zzec() {
            return this.position - this.offset;
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzf(int i11, int i12) {
            zzd(i11, 0);
            zzas(i12);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzg(long j11) {
            try {
                byte[] bArr = this.buffer;
                int i11 = this.position;
                int i12 = i11 + 1;
                this.position = i12;
                bArr[i11] = (byte) j11;
                int i13 = i12 + 1;
                this.position = i13;
                bArr[i12] = (byte) (j11 >> 8);
                int i14 = i13 + 1;
                this.position = i14;
                bArr[i13] = (byte) (j11 >> 16);
                int i15 = i14 + 1;
                this.position = i15;
                bArr[i14] = (byte) (j11 >> 24);
                int i16 = i15 + 1;
                this.position = i16;
                bArr[i15] = (byte) (j11 >> 32);
                int i17 = i16 + 1;
                this.position = i17;
                bArr[i16] = (byte) (j11 >> 40);
                int i18 = i17 + 1;
                this.position = i18;
                bArr[i17] = (byte) (j11 >> 48);
                this.position = i18 + 1;
                bArr[i18] = (byte) (j11 >> 56);
            } catch (IndexOutOfBoundsException e11) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e11);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzh(int i11, int i12) {
            zzd(i11, 5);
            zzau(i12);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzm(String str) {
            int i11 = this.position;
            try {
                int zzax = zzfe.zzax(str.length() * 3);
                int zzax2 = zzfe.zzax(str.length());
                if (zzax2 == zzax) {
                    int i12 = i11 + zzax2;
                    this.position = i12;
                    int zza = zziw.zza(str, this.buffer, i12, zzdz());
                    this.position = i11;
                    zzas((zza - i11) - zzax2);
                    this.position = zza;
                    return;
                }
                zzas(zziw.zza(str));
                this.position = zziw.zza(str, this.buffer, this.position, zzdz());
            } catch (zzja e11) {
                this.position = i11;
                zza(str, e11);
            } catch (IndexOutOfBoundsException e12) {
                throw new zzc(e12);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(int i11, String str) {
            zzd(i11, 2);
            zzm(str);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzb(int i11, zzhf zzhfVar) {
            zzd(1, 3);
            zzf(2, i11);
            zza(3, zzhfVar);
            zzd(1, 4);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzc(byte b11) {
            try {
                byte[] bArr = this.buffer;
                int i11 = this.position;
                this.position = i11 + 1;
                bArr[i11] = b11;
            } catch (IndexOutOfBoundsException e11) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e11);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zze(long j11) {
            if (zzfe.zzsr && zzdz() >= 10) {
                while ((j11 & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i11 = this.position;
                    this.position = i11 + 1;
                    zziu.zza(bArr, i11, (byte) ((((int) j11) & 127) | 128));
                    j11 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i12 = this.position;
                this.position = i12 + 1;
                zziu.zza(bArr2, i12, (byte) j11);
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
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e11);
                }
            }
            byte[] bArr4 = this.buffer;
            int i14 = this.position;
            this.position = i14 + 1;
            bArr4[i14] = (byte) j11;
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzf(byte[] bArr, int i11, int i12) {
            zzas(i12);
            write(bArr, 0, i12);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(int i11, zzeo zzeoVar) {
            zzd(i11, 2);
            zza(zzeoVar);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(zzeo zzeoVar) {
            zzas(zzeoVar.size());
            zzeoVar.zza(this);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzb(int i11, zzeo zzeoVar) {
            zzd(1, 3);
            zzf(2, i11);
            zza(3, zzeoVar);
            zzd(1, 4);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(int i11, zzhf zzhfVar) {
            zzd(i11, 2);
            zzb(zzhfVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(int i11, zzhf zzhfVar, zzhw zzhwVar) {
            zzd(i11, 2);
            zzec zzecVar = (zzec) zzhfVar;
            int zzcf = zzecVar.zzcf();
            if (zzcf == -1) {
                zzcf = zzhwVar.zzp(zzecVar);
                zzecVar.zzy(zzcf);
            }
            zzas(zzcf);
            zzhwVar.zza(zzhfVar, this.zzss);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzb(zzhf zzhfVar) {
            zzas(zzhfVar.zzeq());
            zzhfVar.zzb(this);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        final void zza(zzhf zzhfVar, zzhw zzhwVar) {
            zzec zzecVar = (zzec) zzhfVar;
            int zzcf = zzecVar.zzcf();
            if (zzcf == -1) {
                zzcf = zzhwVar.zzp(zzecVar);
                zzecVar.zzy(zzcf);
            }
            zzas(zzcf);
            zzhwVar.zza(zzhfVar, this.zzss);
        }

        @Override // com.google.android.gms.internal.vision.zzen
        public final void zza(byte[] bArr, int i11, int i12) {
            write(bArr, i11, i12);
        }
    }

    /* loaded from: classes3.dex */
    public static final class zzd extends zzfe {
        private final int zzsu;
        private final ByteBuffer zzsv;
        private final ByteBuffer zzsw;

        zzd(ByteBuffer byteBuffer) {
            super();
            this.zzsv = byteBuffer;
            this.zzsw = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.zzsu = byteBuffer.position();
        }

        private final void zzo(String str) {
            try {
                zziw.zza(str, this.zzsw);
            } catch (IndexOutOfBoundsException e11) {
                throw new zzc(e11);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void flush() {
            this.zzsv.position(this.zzsw.position());
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void write(byte[] bArr, int i11, int i12) {
            try {
                this.zzsw.put(bArr, i11, i12);
            } catch (IndexOutOfBoundsException e11) {
                throw new zzc(e11);
            } catch (BufferOverflowException e12) {
                throw new zzc(e12);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(int i11, long j11) {
            zzd(i11, 0);
            zze(j11);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzar(int i11) {
            if (i11 >= 0) {
                zzas(i11);
            } else {
                zze(i11);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzas(int i11) {
            while ((i11 & (-128)) != 0) {
                try {
                    this.zzsw.put((byte) ((i11 & 127) | 128));
                    i11 >>>= 7;
                } catch (BufferOverflowException e11) {
                    throw new zzc(e11);
                }
            }
            this.zzsw.put((byte) i11);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzau(int i11) {
            try {
                this.zzsw.putInt(i11);
            } catch (BufferOverflowException e11) {
                throw new zzc(e11);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzb(int i11, boolean z11) {
            zzd(i11, 0);
            zzc(z11 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzc(int i11, long j11) {
            zzd(i11, 1);
            zzg(j11);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzd(int i11, int i12) {
            zzas((i11 << 3) | i12);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final int zzdz() {
            return this.zzsw.remaining();
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zze(int i11, int i12) {
            zzd(i11, 0);
            zzar(i12);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzf(int i11, int i12) {
            zzd(i11, 0);
            zzas(i12);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzg(long j11) {
            try {
                this.zzsw.putLong(j11);
            } catch (BufferOverflowException e11) {
                throw new zzc(e11);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzh(int i11, int i12) {
            zzd(i11, 5);
            zzau(i12);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzm(String str) {
            int position = this.zzsw.position();
            try {
                int zzax = zzfe.zzax(str.length() * 3);
                int zzax2 = zzfe.zzax(str.length());
                if (zzax2 == zzax) {
                    int position2 = this.zzsw.position() + zzax2;
                    this.zzsw.position(position2);
                    zzo(str);
                    int position3 = this.zzsw.position();
                    this.zzsw.position(position);
                    zzas(position3 - position2);
                    this.zzsw.position(position3);
                    return;
                }
                zzas(zziw.zza(str));
                zzo(str);
            } catch (zzja e11) {
                this.zzsw.position(position);
                zza(str, e11);
            } catch (IllegalArgumentException e12) {
                throw new zzc(e12);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(int i11, String str) {
            zzd(i11, 2);
            zzm(str);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzb(int i11, zzhf zzhfVar) {
            zzd(1, 3);
            zzf(2, i11);
            zza(3, zzhfVar);
            zzd(1, 4);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzc(byte b11) {
            try {
                this.zzsw.put(b11);
            } catch (BufferOverflowException e11) {
                throw new zzc(e11);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zze(long j11) {
            while (((-128) & j11) != 0) {
                try {
                    this.zzsw.put((byte) ((((int) j11) & 127) | 128));
                    j11 >>>= 7;
                } catch (BufferOverflowException e11) {
                    throw new zzc(e11);
                }
            }
            this.zzsw.put((byte) j11);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzf(byte[] bArr, int i11, int i12) {
            zzas(i12);
            write(bArr, 0, i12);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(int i11, zzeo zzeoVar) {
            zzd(i11, 2);
            zza(zzeoVar);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(int i11, zzhf zzhfVar) {
            zzd(i11, 2);
            zzb(zzhfVar);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzb(int i11, zzeo zzeoVar) {
            zzd(1, 3);
            zzf(2, i11);
            zza(3, zzeoVar);
            zzd(1, 4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(int i11, zzhf zzhfVar, zzhw zzhwVar) {
            zzd(i11, 2);
            zza(zzhfVar, zzhwVar);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        final void zza(zzhf zzhfVar, zzhw zzhwVar) {
            zzec zzecVar = (zzec) zzhfVar;
            int zzcf = zzecVar.zzcf();
            if (zzcf == -1) {
                zzcf = zzhwVar.zzp(zzecVar);
                zzecVar.zzy(zzcf);
            }
            zzas(zzcf);
            zzhwVar.zza(zzhfVar, this.zzss);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzb(zzhf zzhfVar) {
            zzas(zzhfVar.zzeq());
            zzhfVar.zzb(this);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(zzeo zzeoVar) {
            zzas(zzeoVar.size());
            zzeoVar.zza(this);
        }

        @Override // com.google.android.gms.internal.vision.zzen
        public final void zza(byte[] bArr, int i11, int i12) {
            write(bArr, i11, i12);
        }
    }

    /* loaded from: classes3.dex */
    public static final class zze extends zzfe {
        private final ByteBuffer zzsv;
        private final ByteBuffer zzsw;
        private final long zzsx;
        private final long zzsy;
        private final long zzsz;
        private final long zzta;
        private long zztb;

        zze(ByteBuffer byteBuffer) {
            super();
            this.zzsv = byteBuffer;
            this.zzsw = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long zzb = zziu.zzb(byteBuffer);
            this.zzsx = zzb;
            long position = byteBuffer.position() + zzb;
            this.zzsy = position;
            long limit = zzb + byteBuffer.limit();
            this.zzsz = limit;
            this.zzta = limit - 10;
            this.zztb = position;
        }

        private final void zzn(long j11) {
            this.zzsw.position((int) (j11 - this.zzsx));
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void flush() {
            this.zzsv.position((int) (this.zztb - this.zzsx));
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void write(byte[] bArr, int i11, int i12) {
            if (bArr != null && i11 >= 0 && i12 >= 0 && bArr.length - i12 >= i11) {
                long j11 = i12;
                long j12 = this.zztb;
                if (this.zzsz - j11 >= j12) {
                    zziu.zza(bArr, i11, j12, j11);
                    this.zztb += j11;
                    return;
                }
            }
            Objects.requireNonNull(bArr, "value");
            throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.zztb), Long.valueOf(this.zzsz), Integer.valueOf(i12)));
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(int i11, long j11) {
            zzd(i11, 0);
            zze(j11);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzar(int i11) {
            if (i11 >= 0) {
                zzas(i11);
            } else {
                zze(i11);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzas(int i11) {
            if (this.zztb <= this.zzta) {
                while ((i11 & (-128)) != 0) {
                    long j11 = this.zztb;
                    this.zztb = j11 + 1;
                    zziu.zza(j11, (byte) ((i11 & 127) | 128));
                    i11 >>>= 7;
                }
                long j12 = this.zztb;
                this.zztb = 1 + j12;
                zziu.zza(j12, (byte) i11);
                return;
            }
            while (true) {
                long j13 = this.zztb;
                if (j13 >= this.zzsz) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.zztb), Long.valueOf(this.zzsz), 1));
                }
                if ((i11 & (-128)) == 0) {
                    this.zztb = 1 + j13;
                    zziu.zza(j13, (byte) i11);
                    return;
                }
                this.zztb = j13 + 1;
                zziu.zza(j13, (byte) ((i11 & 127) | 128));
                i11 >>>= 7;
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzau(int i11) {
            this.zzsw.putInt((int) (this.zztb - this.zzsx), i11);
            this.zztb += 4;
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzb(int i11, boolean z11) {
            zzd(i11, 0);
            zzc(z11 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzc(int i11, long j11) {
            zzd(i11, 1);
            zzg(j11);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzd(int i11, int i12) {
            zzas((i11 << 3) | i12);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final int zzdz() {
            return (int) (this.zzsz - this.zztb);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zze(int i11, int i12) {
            zzd(i11, 0);
            zzar(i12);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzf(int i11, int i12) {
            zzd(i11, 0);
            zzas(i12);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzg(long j11) {
            this.zzsw.putLong((int) (this.zztb - this.zzsx), j11);
            this.zztb += 8;
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzh(int i11, int i12) {
            zzd(i11, 5);
            zzau(i12);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzm(String str) {
            long j11 = this.zztb;
            try {
                int zzax = zzfe.zzax(str.length() * 3);
                int zzax2 = zzfe.zzax(str.length());
                if (zzax2 == zzax) {
                    int i11 = ((int) (this.zztb - this.zzsx)) + zzax2;
                    this.zzsw.position(i11);
                    zziw.zza(str, this.zzsw);
                    int position = this.zzsw.position() - i11;
                    zzas(position);
                    this.zztb += position;
                    return;
                }
                int zza = zziw.zza(str);
                zzas(zza);
                zzn(this.zztb);
                zziw.zza(str, this.zzsw);
                this.zztb += zza;
            } catch (zzja e11) {
                this.zztb = j11;
                zzn(j11);
                zza(str, e11);
            } catch (IllegalArgumentException e12) {
                throw new zzc(e12);
            } catch (IndexOutOfBoundsException e13) {
                throw new zzc(e13);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(int i11, String str) {
            zzd(i11, 2);
            zzm(str);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzb(int i11, zzhf zzhfVar) {
            zzd(1, 3);
            zzf(2, i11);
            zza(3, zzhfVar);
            zzd(1, 4);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzc(byte b11) {
            long j11 = this.zztb;
            if (j11 < this.zzsz) {
                this.zztb = 1 + j11;
                zziu.zza(j11, b11);
                return;
            }
            throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.zztb), Long.valueOf(this.zzsz), 1));
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zze(long j11) {
            if (this.zztb <= this.zzta) {
                while ((j11 & (-128)) != 0) {
                    long j12 = this.zztb;
                    this.zztb = j12 + 1;
                    zziu.zza(j12, (byte) ((((int) j11) & 127) | 128));
                    j11 >>>= 7;
                }
                long j13 = this.zztb;
                this.zztb = 1 + j13;
                zziu.zza(j13, (byte) j11);
                return;
            }
            while (true) {
                long j14 = this.zztb;
                if (j14 >= this.zzsz) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.zztb), Long.valueOf(this.zzsz), 1));
                }
                if ((j11 & (-128)) == 0) {
                    this.zztb = 1 + j14;
                    zziu.zza(j14, (byte) j11);
                    return;
                }
                this.zztb = j14 + 1;
                zziu.zza(j14, (byte) ((((int) j11) & 127) | 128));
                j11 >>>= 7;
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzf(byte[] bArr, int i11, int i12) {
            zzas(i12);
            write(bArr, 0, i12);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(int i11, zzeo zzeoVar) {
            zzd(i11, 2);
            zza(zzeoVar);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(int i11, zzhf zzhfVar) {
            zzd(i11, 2);
            zzb(zzhfVar);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzb(int i11, zzeo zzeoVar) {
            zzd(1, 3);
            zzf(2, i11);
            zza(3, zzeoVar);
            zzd(1, 4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(int i11, zzhf zzhfVar, zzhw zzhwVar) {
            zzd(i11, 2);
            zza(zzhfVar, zzhwVar);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        final void zza(zzhf zzhfVar, zzhw zzhwVar) {
            zzec zzecVar = (zzec) zzhfVar;
            int zzcf = zzecVar.zzcf();
            if (zzcf == -1) {
                zzcf = zzhwVar.zzp(zzecVar);
                zzecVar.zzy(zzcf);
            }
            zzas(zzcf);
            zzhwVar.zza(zzhfVar, this.zzss);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzb(zzhf zzhfVar) {
            zzas(zzhfVar.zzeq());
            zzhfVar.zzb(this);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(zzeo zzeoVar) {
            zzas(zzeoVar.size());
            zzeoVar.zza(this);
        }

        @Override // com.google.android.gms.internal.vision.zzen
        public final void zza(byte[] bArr, int i11, int i12) {
            write(bArr, i11, i12);
        }
    }

    public static int zzb(int i11, float f11) {
        return zzav(i11) + 4;
    }

    public static int zzc(int i11, zzeo zzeoVar) {
        int zzav = zzav(i11);
        int size = zzeoVar.size();
        return zzav + zzax(size) + size;
    }

    public static int zzh(int i11, long j11) {
        return zzav(i11) + 8;
    }

    public static int zzj(long j11) {
        return zzi(zzm(j11));
    }

    public final void zzf(float f11) {
        zzau(Float.floatToRawIntBits(f11));
    }

    public static int zzb(int i11, double d11) {
        return zzav(i11) + 8;
    }

    public static int zzd(int i11, zzhf zzhfVar) {
        return (zzav(1) << 1) + zzj(2, i11) + zzc(3, zzhfVar);
    }

    public static int zzf(int i11, long j11) {
        return zzav(i11) + zzi(zzm(j11));
    }

    public static int zzh(long j11) {
        return zzi(j11);
    }

    public static int zzn(String str) {
        int length;
        try {
            length = zziw.zza(str);
        } catch (zzja unused) {
            length = str.getBytes(zzga.UTF_8).length;
        }
        return zzax(length) + length;
    }

    public final void zzg(int i11, int i12) {
        zzf(i11, zzbc(i12));
    }

    public static int zzb(int i11, String str) {
        return zzav(i11) + zzn(str);
    }

    public static int zzg(int i11, long j11) {
        return zzav(i11) + 8;
    }

    public static int zzh(byte[] bArr) {
        int length = bArr.length;
        return zzax(length) + length;
    }

    public static int zzb(int i11, zzhf zzhfVar, zzhw zzhwVar) {
        return zzav(i11) + zzb(zzhfVar, zzhwVar);
    }

    public static int zzc(int i11, zzhf zzhfVar) {
        return zzav(i11) + zzc(zzhfVar);
    }

    public static int zzb(int i11, zzgm zzgmVar) {
        return (zzav(1) << 1) + zzj(2, i11) + zza(3, zzgmVar);
    }

    public static int zzc(zzhf zzhfVar) {
        int zzeq = zzhfVar.zzeq();
        return zzax(zzeq) + zzeq;
    }

    public static int zzd(int i11, zzeo zzeoVar) {
        return (zzav(1) << 1) + zzj(2, i11) + zzc(3, zzeoVar);
    }

    @Deprecated
    public static int zzc(int i11, zzhf zzhfVar, zzhw zzhwVar) {
        int zzav = zzav(i11) << 1;
        zzec zzecVar = (zzec) zzhfVar;
        int zzcf = zzecVar.zzcf();
        if (zzcf == -1) {
            zzcf = zzhwVar.zzp(zzecVar);
            zzecVar.zzy(zzcf);
        }
        return zzav + zzcf;
    }

    public final void zza(int i11, float f11) {
        zzh(i11, Float.floatToRawIntBits(f11));
    }

    public static int zzb(zzeo zzeoVar) {
        int size = zzeoVar.size();
        return zzax(size) + size;
    }

    @Deprecated
    public static int zzd(zzhf zzhfVar) {
        return zzhfVar.zzeq();
    }

    public final void zza(int i11, double d11) {
        zzc(i11, Double.doubleToRawLongBits(d11));
    }

    public final void zza(double d11) {
        zzg(Double.doubleToRawLongBits(d11));
    }

    public static int zza(int i11, zzgm zzgmVar) {
        int zzav = zzav(i11);
        int zzeq = zzgmVar.zzeq();
        return zzav + zzax(zzeq) + zzeq;
    }

    public static int zzb(zzhf zzhfVar, zzhw zzhwVar) {
        zzec zzecVar = (zzec) zzhfVar;
        int zzcf = zzecVar.zzcf();
        if (zzcf == -1) {
            zzcf = zzhwVar.zzp(zzecVar);
            zzecVar.zzy(zzcf);
        }
        return zzax(zzcf) + zzcf;
    }

    public static int zza(zzgm zzgmVar) {
        int zzeq = zzgmVar.zzeq();
        return zzax(zzeq) + zzeq;
    }

    final void zza(String str, zzja zzjaVar) {
        logger.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzjaVar);
        byte[] bytes = str.getBytes(zzga.UTF_8);
        try {
            zzas(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (zzc e11) {
            throw e11;
        } catch (IndexOutOfBoundsException e12) {
            throw new zzc(e12);
        }
    }
}