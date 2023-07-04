package com.google.android.gms.internal.clearcut;

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
public class zzei<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private boolean zzgu;
    private final int zzol;
    private List<zzep> zzom;
    private Map<K, V> zzon;
    private volatile zzer zzoo;
    private Map<K, V> zzop;
    private volatile zzel zzoq;

    private zzei(int i11) {
        this.zzol = i11;
        this.zzom = Collections.emptyList();
        this.zzon = Collections.emptyMap();
        this.zzop = Collections.emptyMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzei(int i11, zzej zzejVar) {
        this(i11);
    }

    private final int zza(K k11) {
        int size = this.zzom.size() - 1;
        if (size >= 0) {
            int compareTo = k11.compareTo((Comparable) this.zzom.get(size).getKey());
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
            int compareTo2 = k11.compareTo((Comparable) this.zzom.get(i12).getKey());
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <FieldDescriptorType extends zzca<FieldDescriptorType>> zzei<FieldDescriptorType, Object> zzaj(int i11) {
        return new zzej(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzal(int i11) {
        zzdu();
        V v11 = (V) this.zzom.remove(i11).getValue();
        if (!this.zzon.isEmpty()) {
            Iterator<Map.Entry<K, V>> it2 = zzdv().entrySet().iterator();
            this.zzom.add(new zzep(this, it2.next()));
            it2.remove();
        }
        return v11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzdu() {
        if (this.zzgu) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> zzdv() {
        zzdu();
        if (this.zzon.isEmpty() && !(this.zzon instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzon = treeMap;
            this.zzop = treeMap.descendingMap();
        }
        return (SortedMap) this.zzon;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzdu();
        if (!this.zzom.isEmpty()) {
            this.zzom.clear();
        }
        if (this.zzon.isEmpty()) {
            return;
        }
        this.zzon.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza((zzei<K, V>) comparable) >= 0 || this.zzon.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zzoo == null) {
            this.zzoo = new zzer(this, null);
        }
        return this.zzoo;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzei) {
            zzei zzeiVar = (zzei) obj;
            int size = size();
            if (size != zzeiVar.size()) {
                return false;
            }
            int zzdr = zzdr();
            if (zzdr != zzeiVar.zzdr()) {
                return entrySet().equals(zzeiVar.entrySet());
            }
            for (int i11 = 0; i11 < zzdr; i11++) {
                if (!zzak(i11).equals(zzeiVar.zzak(i11))) {
                    return false;
                }
            }
            if (zzdr != size) {
                return this.zzon.equals(zzeiVar.zzon);
            }
            return true;
        }
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzei<K, V>) comparable);
        return zza >= 0 ? (V) this.zzom.get(zza).getValue() : this.zzon.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int zzdr = zzdr();
        int i11 = 0;
        for (int i12 = 0; i12 < zzdr; i12++) {
            i11 += this.zzom.get(i12).hashCode();
        }
        return this.zzon.size() > 0 ? i11 + this.zzon.hashCode() : i11;
    }

    public final boolean isImmutable() {
        return this.zzgu;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return zza((zzei<K, V>) ((Comparable) obj), (Comparable) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        zzdu();
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzei<K, V>) comparable);
        if (zza >= 0) {
            return (V) zzal(zza);
        }
        if (this.zzon.isEmpty()) {
            return null;
        }
        return this.zzon.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzom.size() + this.zzon.size();
    }

    public final V zza(K k11, V v11) {
        zzdu();
        int zza = zza((zzei<K, V>) k11);
        if (zza >= 0) {
            return (V) this.zzom.get(zza).setValue(v11);
        }
        zzdu();
        if (this.zzom.isEmpty() && !(this.zzom instanceof ArrayList)) {
            this.zzom = new ArrayList(this.zzol);
        }
        int i11 = -(zza + 1);
        if (i11 >= this.zzol) {
            return zzdv().put(k11, v11);
        }
        int size = this.zzom.size();
        int i12 = this.zzol;
        if (size == i12) {
            zzep remove = this.zzom.remove(i12 - 1);
            zzdv().put((K) remove.getKey(), (V) remove.getValue());
        }
        this.zzom.add(i11, new zzep(this, k11, v11));
        return null;
    }

    public final Map.Entry<K, V> zzak(int i11) {
        return this.zzom.get(i11);
    }

    public final int zzdr() {
        return this.zzom.size();
    }

    public final Iterable<Map.Entry<K, V>> zzds() {
        return this.zzon.isEmpty() ? zzem.zzdx() : this.zzon.entrySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> zzdt() {
        if (this.zzoq == null) {
            this.zzoq = new zzel(this, null);
        }
        return this.zzoq;
    }

    public void zzv() {
        if (this.zzgu) {
            return;
        }
        this.zzon = this.zzon.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzon);
        this.zzop = this.zzop.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzop);
        this.zzgu = true;
    }
}