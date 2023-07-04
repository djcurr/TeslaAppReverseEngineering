package com.google.android.libraries.places.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzir extends zzit {
    private static final zzir zzb = new zzir();

    private zzir() {
        super("");
    }

    @Override // com.google.android.libraries.places.internal.zzit, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return zza((zzit) obj);
    }

    @Override // com.google.android.libraries.places.internal.zzit
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "-∞";
    }

    @Override // com.google.android.libraries.places.internal.zzit
    public final int zza(zzit zzitVar) {
        return zzitVar == this ? 0 : -1;
    }

    @Override // com.google.android.libraries.places.internal.zzit
    final void zzc(StringBuilder sb2) {
        sb2.append("(-∞");
    }

    @Override // com.google.android.libraries.places.internal.zzit
    final void zzd(StringBuilder sb2) {
        throw new AssertionError();
    }

    @Override // com.google.android.libraries.places.internal.zzit
    final boolean zze(Comparable comparable) {
        return true;
    }
}