package com.google.android.gms.internal.vision;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX WARN: Incorrect field signature: TK; */
/* loaded from: classes3.dex */
public final class zzig<K, V> implements Comparable<zzig>, Map.Entry<K, V> {
    private V value;
    private final /* synthetic */ zzhz zzaal;
    private final Comparable zzaao;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzig(zzhz zzhzVar, Map.Entry<K, V> entry) {
        this(zzhzVar, (Comparable) entry.getKey(), entry.getValue());
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zzig zzigVar) {
        return ((Comparable) getKey()).compareTo((Comparable) zzigVar.getKey());
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return equals(this.zzaao, entry.getKey()) && equals(this.value, entry.getValue());
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.zzaao;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.zzaao;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        V v11 = this.value;
        return hashCode ^ (v11 != null ? v11.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v11) {
        this.zzaal.zzgx();
        V v12 = this.value;
        this.value = v11;
        return v12;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzaao);
        String valueOf2 = String.valueOf(this.value);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb2.append(valueOf);
        sb2.append("=");
        sb2.append(valueOf2);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public zzig(zzhz zzhzVar, K k11, V v11) {
        this.zzaal = zzhzVar;
        this.zzaao = k11;
        this.value = v11;
    }

    private static boolean equals(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }
}