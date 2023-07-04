package com.google.android.libraries.places.internal;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhz extends zzib {
    final /* synthetic */ zzib zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhz(zzib zzibVar, zzib zzibVar2) {
        super(zzibVar2, null);
        this.zza = zzibVar;
    }

    @Override // com.google.android.libraries.places.internal.zzib
    public final Appendable zzb(Appendable appendable, Iterator it2) {
        String str;
        zzig.zzc(it2, "parts");
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (next != null) {
                appendable.append(this.zza.zza(next));
                break;
            }
        }
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (next2 != null) {
                str = this.zza.zza;
                appendable.append(str);
                appendable.append(this.zza.zza(next2));
            }
        }
        return appendable;
    }
}