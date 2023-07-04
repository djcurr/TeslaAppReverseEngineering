package com.google.android.libraries.places.internal;

import ch.qos.logback.core.CoreConstants;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzis extends zzit {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzis(Comparable comparable) {
        super(comparable);
        Objects.requireNonNull(comparable);
    }

    @Override // com.google.android.libraries.places.internal.zzit
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return "\\" + this.zza + "/";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzit
    public final void zzc(StringBuilder sb2) {
        sb2.append('[');
        sb2.append(this.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzit
    public final void zzd(StringBuilder sb2) {
        sb2.append(this.zza);
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzit
    public final boolean zze(Comparable comparable) {
        return zzjk.zza(this.zza, comparable) <= 0;
    }
}