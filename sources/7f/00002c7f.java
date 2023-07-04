package com.google.android.gms.internal.vision;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class zzhz<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int zzaae;
    private List<zzig> zzaaf;
    private Map<K, V> zzaag;
    private volatile zzii zzaah;
    private Map<K, V> zzaai;
    private volatile zzic zzaaj;
    private boolean zztn;

    private zzhz(int i11) {
        this.zzaae = i11;
        this.zzaaf = Collections.emptyList();
        this.zzaag = Collections.emptyMap();
        this.zzaai = Collections.emptyMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <FieldDescriptorType extends zzfr<FieldDescriptorType>> zzhz<FieldDescriptorType, Object> zzbo(int i11) {
        return new zzia(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzbq(int i11) {
        zzgx();
        V v11 = (V) this.zzaaf.remove(i11).getValue();
        if (!this.zzaag.isEmpty()) {
            Iterator<Map.Entry<K, V>> it2 = zzgy().entrySet().iterator();
            this.zzaaf.add(new zzig(this, it2.next()));
            it2.remove();
        }
        return v11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzgx() {
        if (this.zztn) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> zzgy() {
        zzgx();
        if (this.zzaag.isEmpty() && !(this.zzaag instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzaag = treeMap;
            this.zzaai = treeMap.descendingMap();
        }
        return (SortedMap) this.zzaag;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzgx();
        if (!this.zzaaf.isEmpty()) {
            this.zzaaf.clear();
        }
        if (this.zzaag.isEmpty()) {
            return;
        }
        this.zzaag.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza((zzhz<K, V>) comparable) >= 0 || this.zzaag.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zzaah == null) {
            this.zzaah = new zzii(this, null);
        }
        return this.zzaah;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhz)) {
            return super.equals(obj);
        }
        zzhz zzhzVar = (zzhz) obj;
        int size = size();
        if (size != zzhzVar.size()) {
            return false;
        }
        int zzgu = zzgu();
        if (zzgu != zzhzVar.zzgu()) {
            return entrySet().equals(zzhzVar.entrySet());
        }
        for (int i11 = 0; i11 < zzgu; i11++) {
            if (!zzbp(i11).equals(zzhzVar.zzbp(i11))) {
                return false;
            }
        }
        if (zzgu != size) {
            return this.zzaag.equals(zzhzVar.zzaag);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzhz<K, V>) comparable);
        if (zza >= 0) {
            return (V) this.zzaaf.get(zza).getValue();
        }
        return this.zzaag.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int zzgu = zzgu();
        int i11 = 0;
        for (int i12 = 0; i12 < zzgu; i12++) {
            i11 += this.zzaaf.get(i12).hashCode();
        }
        return this.zzaag.size() > 0 ? i11 + this.zzaag.hashCode() : i11;
    }

    public final boolean isImmutable() {
        return this.zztn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return zza((zzhz<K, V>) ((Comparable) obj), (Comparable) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        zzgx();
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzhz<K, V>) comparable);
        if (zza >= 0) {
            return (V) zzbq(zza);
        }
        if (this.zzaag.isEmpty()) {
            return null;
        }
        return this.zzaag.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzaaf.size() + this.zzaag.size();
    }

    public final V zza(K k11, V v11) {
        zzgx();
        int zza = zza((zzhz<K, V>) k11);
        if (zza >= 0) {
            return (V) this.zzaaf.get(zza).setValue(v11);
        }
        zzgx();
        if (this.zzaaf.isEmpty() && !(this.zzaaf instanceof ArrayList)) {
            this.zzaaf = new ArrayList(this.zzaae);
        }
        int i11 = -(zza + 1);
        if (i11 >= this.zzaae) {
            return zzgy().put(k11, v11);
        }
        int size = this.zzaaf.size();
        int i12 = this.zzaae;
        if (size == i12) {
            zzig remove = this.zzaaf.remove(i12 - 1);
            zzgy().put((K) remove.getKey(), (V) remove.getValue());
        }
        this.zzaaf.add(i11, new zzig(this, k11, v11));
        return null;
    }

    public final Map.Entry<K, V> zzbp(int i11) {
        return this.zzaaf.get(i11);
    }

    public void zzci() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (this.zztn) {
            return;
        }
        if (this.zzaag.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(this.zzaag);
        }
        this.zzaag = unmodifiableMap;
        if (this.zzaai.isEmpty()) {
            unmodifiableMap2 = Collections.emptyMap();
        } else {
            unmodifiableMap2 = Collections.unmodifiableMap(this.zzaai);
        }
        this.zzaai = unmodifiableMap2;
        this.zztn = true;
    }

    public final int zzgu() {
        return this.zzaaf.size();
    }

    public final Iterable<Map.Entry<K, V>> zzgv() {
        if (this.zzaag.isEmpty()) {
            return zzid.zzha();
        }
        return this.zzaag.entrySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> zzgw() {
        if (this.zzaaj == null) {
            this.zzaaj = new zzic(this, null);
        }
        return this.zzaaj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzhz(int i11, zzia zziaVar) {
        this(i11);
    }

    private final int zza(K k11) {
        int size = this.zzaaf.size() - 1;
        if (size >= 0) {
            int compareTo = k11.compareTo((Comparable) this.zzaaf.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) / 2;
            int compareTo2 = k11.compareTo((Comparable) this.zzaaf.get(i12).getKey());
            if (compareTo2 < 0) {
                size = i12 - 1;
            } else if (compareTo2 <= 0) {
                return i12;
            } else {
                i11 = i12 + 1;
            }
        }
        return -(i11 + 1);
    }
}