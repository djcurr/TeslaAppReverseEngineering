package com.google.android.gms.internal.vision;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;
import org.spongycastle.i18n.LocalizedMessage;

/* loaded from: classes3.dex */
public final class zzga {
    public static final byte[] zzxn;
    private static final ByteBuffer zzxo;
    private static final zzez zzxp;
    static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final Charset ISO_8859_1 = Charset.forName(LocalizedMessage.DEFAULT_ENCODING);

    static {
        byte[] bArr = new byte[0];
        zzxn = bArr;
        zzxo = ByteBuffer.wrap(bArr);
        zzxp = zzez.zzf(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T checkNotNull(T t11) {
        Objects.requireNonNull(t11);
        return t11;
    }

    public static int hashCode(byte[] bArr) {
        int length = bArr.length;
        int zza = zza(length, bArr, 0, length);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T zza(T t11, String str) {
        Objects.requireNonNull(t11, str);
        return t11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzf(zzhf zzhfVar) {
        return false;
    }

    public static boolean zzi(byte[] bArr) {
        return zziw.zzi(bArr);
    }

    public static int zzj(boolean z11) {
        return z11 ? 1231 : 1237;
    }

    public static String zzj(byte[] bArr) {
        return new String(bArr, UTF_8);
    }

    public static int zzo(long j11) {
        return (int) (j11 ^ (j11 >>> 32));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i11, byte[] bArr, int i12, int i13) {
        for (int i14 = i12; i14 < i12 + i13; i14++) {
            i11 = (i11 * 31) + bArr[i14];
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zza(Object obj, Object obj2) {
        return ((zzhf) obj).zzez().zza((zzhf) obj2).zzff();
    }
}