package com.google.android.gms.internal.vision;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzin extends RuntimeException {
    private final List<String> zzaar;

    public zzin(zzhf zzhfVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.zzaar = null;
    }

    public final zzgf zzhc() {
        return new zzgf(getMessage());
    }
}