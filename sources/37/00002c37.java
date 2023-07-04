package com.google.android.gms.internal.vision;

/* loaded from: classes3.dex */
final class zzfo {
    private static final zzfl<?> zztk = new zzfm();
    private static final zzfl<?> zztl = zzem();

    private static zzfl<?> zzem() {
        try {
            return (zzfl) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfl<?> zzen() {
        return zztk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfl<?> zzeo() {
        zzfl<?> zzflVar = zztl;
        if (zzflVar != null) {
            return zzflVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}