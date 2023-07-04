package com.google.android.gms.internal.vision;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* loaded from: classes3.dex */
public final class zzia<FieldDescriptorType> extends zzhz<FieldDescriptorType, Object> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzia(int i11) {
        super(i11, null);
    }

    @Override // com.google.android.gms.internal.vision.zzhz
    public final void zzci() {
        if (!isImmutable()) {
            for (int i11 = 0; i11 < zzgu(); i11++) {
                Map.Entry<FieldDescriptorType, Object> zzbp = zzbp(i11);
                if (((zzfr) zzbp.getKey()).zzeu()) {
                    zzbp.setValue(Collections.unmodifiableList((List) zzbp.getValue()));
                }
            }
            for (Map.Entry<FieldDescriptorType, Object> entry : zzgv()) {
                if (((zzfr) entry.getKey()).zzeu()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzci();
    }
}