package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
final class zzagc {
    private static final zzagb zza;
    private static final zzagb zzb;

    static {
        zzagb zzagbVar;
        try {
            zzagbVar = (zzagb) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzagbVar = null;
        }
        zza = zzagbVar;
        zzb = new zzagb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzagb zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzagb zzb() {
        return zzb;
    }
}