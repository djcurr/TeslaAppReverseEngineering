package com.google.android.gms.internal.clearcut;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX WARN: Incorrect field signature: TK; */
/* loaded from: classes3.dex */
public final class zzep<K, V> implements Comparable<zzep>, Map.Entry<K, V> {
    private V value;
    private final /* synthetic */ zzei zzos;
    private final Comparable zzov;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public zzep(zzei zzeiVar, K k11, V v11) {
        this.zzos = zzeiVar;
        this.zzov = k11;
        this.value = v11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzep(zzei zzeiVar, Map.Entry<K, V> entry) {
        this(zzeiVar, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean equals(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zzep zzepVar) {
        return ((Comparable) getKey()).compareTo((Comparable) zzepVar.getKey());
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return equals(this.zzov, entry.getKey()) && equals(this.value, entry.getValue());
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.zzov;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.zzov;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        V v11 = this.value;
        return hashCode ^ (v11 != null ? v11.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v11) {
        this.zzos.zzdu();
        V v12 = this.value;
        this.value = v11;
        return v12;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzov);
        String valueOf2 = String.valueOf(this.value);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb2.append(valueOf);
        sb2.append("=");
        sb2.append(valueOf2);
        return sb2.toString();
    }
}