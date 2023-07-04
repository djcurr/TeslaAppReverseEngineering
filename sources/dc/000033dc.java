package com.google.android.libraries.places.internal;

import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class zzmj {
    private static final zzmj zza = new zzmh("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final zzmj zzb = new zzmh("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    private static final zzmj zzc = new zzmi("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
    private static final zzmj zzd = new zzmi("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
    private static final zzmj zze = new zzmg("base16()", "0123456789ABCDEF");

    public static zzmj zzd() {
        return zze;
    }

    abstract void zza(Appendable appendable, byte[] bArr, int i11, int i12);

    abstract int zzb(int i11);

    public final String zze(byte[] bArr, int i11, int i12) {
        zzig.zzg(0, i12, bArr.length);
        StringBuilder sb2 = new StringBuilder(zzb(i12));
        try {
            zza(sb2, bArr, 0, i12);
            return sb2.toString();
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }
}