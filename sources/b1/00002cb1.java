package com.google.android.gms.internal.vision;

import java.nio.charset.Charset;
import org.spongycastle.i18n.LocalizedMessage;

/* loaded from: classes3.dex */
public final class zzjr {
    protected static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final Charset ISO_8859_1 = Charset.forName(LocalizedMessage.DEFAULT_ENCODING);
    public static final Object zzado = new Object();

    public static void zza(zzjn zzjnVar, zzjn zzjnVar2) {
        zzjp zzjpVar = zzjnVar.zzadg;
        if (zzjpVar != null) {
            zzjnVar2.zzadg = (zzjp) zzjpVar.clone();
        }
    }
}