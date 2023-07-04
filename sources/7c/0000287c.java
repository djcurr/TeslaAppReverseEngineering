package com.google.android.gms.internal.mlkit_vision_face;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbd extends AbstractMap implements Serializable {
    private static final Object zzd = new Object();
    transient int[] zza;
    transient Object[] zzb;
    transient Object[] zzc;
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;
    private transient Set zzh;
    private transient Set zzi;
    private transient Collection zzj;

    zzbd() {
        zzo(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzA() {
        Object[] objArr = this.zzb;
        objArr.getClass();
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzB() {
        Object[] objArr = this.zzc;
        objArr.getClass();
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int zzb(zzbd zzbdVar) {
        int i11 = zzbdVar.zzg;
        zzbdVar.zzg = i11 - 1;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object zzg(zzbd zzbdVar, int i11) {
        return zzbdVar.zzA()[i11];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object zzj(zzbd zzbdVar, int i11) {
        return zzbdVar.zzB()[i11];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object zzk(zzbd zzbdVar) {
        Object obj = zzbdVar.zze;
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzm(zzbd zzbdVar, int i11, Object obj) {
        zzbdVar.zzB()[i11] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzu() {
        return (1 << (this.zzf & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzv(Object obj) {
        if (zzq()) {
            return -1;
        }
        int zza = zzbf.zza(obj);
        int zzu = zzu();
        Object obj2 = this.zze;
        obj2.getClass();
        int zzc = zzbe.zzc(obj2, zza & zzu);
        if (zzc != 0) {
            int i11 = ~zzu;
            int i12 = zza & i11;
            do {
                int i13 = zzc - 1;
                int i14 = zzz()[i13];
                if ((i14 & i11) == i12 && zzx.zza(obj, zzA()[i13])) {
                    return i13;
                }
                zzc = i14 & zzu;
            } while (zzc != 0);
            return -1;
        }
        return -1;
    }

    private final int zzw(int i11, int i12, int i13, int i14) {
        Object zzd2 = zzbe.zzd(i12);
        int i15 = i12 - 1;
        if (i14 != 0) {
            zzbe.zze(zzd2, i13 & i15, i14 + 1);
        }
        Object obj = this.zze;
        obj.getClass();
        int[] zzz = zzz();
        for (int i16 = 0; i16 <= i11; i16++) {
            int zzc = zzbe.zzc(obj, i16);
            while (zzc != 0) {
                int i17 = zzc - 1;
                int i18 = zzz[i17];
                int i19 = ((~i11) & i18) | i16;
                int i21 = i19 & i15;
                int zzc2 = zzbe.zzc(zzd2, i21);
                zzbe.zze(zzd2, i21, zzc);
                zzz[i17] = ((~i15) & i19) | (zzc2 & i15);
                zzc = i18 & i11;
            }
        }
        this.zze = zzd2;
        zzy(i15);
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzx(Object obj) {
        if (zzq()) {
            return zzd;
        }
        int zzu = zzu();
        Object obj2 = this.zze;
        obj2.getClass();
        int zzb = zzbe.zzb(obj, null, zzu, obj2, zzz(), zzA(), null);
        if (zzb == -1) {
            return zzd;
        }
        Object obj3 = zzB()[zzb];
        zzp(zzb, zzu);
        this.zzg--;
        zzn();
        return obj3;
    }

    private final void zzy(int i11) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i11)) & 31) | (this.zzf & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] zzz() {
        int[] iArr = this.zza;
        iArr.getClass();
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzq()) {
            return;
        }
        zzn();
        Map zzl = zzl();
        if (zzl != null) {
            this.zzf = zzcn.zza(size(), 3, 1073741823);
            zzl.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzA(), 0, this.zzg, (Object) null);
        Arrays.fill(zzB(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzz(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.containsKey(obj);
        }
        return zzv(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map zzl = zzl();
        if (zzl == null) {
            for (int i11 = 0; i11 < this.zzg; i11++) {
                if (zzx.zza(obj, zzB()[i11])) {
                    return true;
                }
            }
            return false;
        }
        return zzl.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzi;
        if (set == null) {
            zzay zzayVar = new zzay(this);
            this.zzi = zzayVar;
            return zzayVar;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.get(obj);
        }
        int zzv = zzv(obj);
        if (zzv == -1) {
            return null;
        }
        return zzB()[zzv];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzh;
        if (set == null) {
            zzba zzbaVar = new zzba(this);
            this.zzh = zzbaVar;
            return zzbaVar;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int min;
        if (zzq()) {
            zzab.zzd(zzq(), "Arrays already allocated");
            int i11 = this.zzf;
            int max = Math.max(i11 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.zze = zzbe.zzd(max2);
            zzy(max2 - 1);
            this.zza = new int[i11];
            this.zzb = new Object[i11];
            this.zzc = new Object[i11];
        }
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.put(obj, obj2);
        }
        int[] zzz = zzz();
        Object[] zzA = zzA();
        Object[] zzB = zzB();
        int i12 = this.zzg;
        int i13 = i12 + 1;
        int zza = zzbf.zza(obj);
        int zzu = zzu();
        int i14 = zza & zzu;
        Object obj3 = this.zze;
        obj3.getClass();
        int zzc = zzbe.zzc(obj3, i14);
        if (zzc != 0) {
            int i15 = ~zzu;
            int i16 = zza & i15;
            int i17 = 0;
            while (true) {
                int i18 = zzc - 1;
                int i19 = zzz[i18];
                int i21 = i19 & i15;
                if (i21 == i16 && zzx.zza(obj, zzA[i18])) {
                    Object obj4 = zzB[i18];
                    zzB[i18] = obj2;
                    return obj4;
                }
                int i22 = i19 & zzu;
                i17++;
                if (i22 != 0) {
                    zzc = i22;
                } else if (i17 >= 9) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(zzu() + 1, 1.0f);
                    int zze = zze();
                    while (zze >= 0) {
                        linkedHashMap.put(zzA()[zze], zzB()[zze]);
                        zze = zzf(zze);
                    }
                    this.zze = linkedHashMap;
                    this.zza = null;
                    this.zzb = null;
                    this.zzc = null;
                    zzn();
                    return linkedHashMap.put(obj, obj2);
                } else if (i13 > zzu) {
                    zzu = zzw(zzu, zzbe.zza(zzu), zza, i12);
                } else {
                    zzz[i18] = (i13 & zzu) | i21;
                }
            }
        } else if (i13 > zzu) {
            zzu = zzw(zzu, zzbe.zza(zzu), zza, i12);
        } else {
            Object obj5 = this.zze;
            obj5.getClass();
            zzbe.zze(obj5, i14, i13);
        }
        int length = zzz().length;
        if (i13 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.zza = Arrays.copyOf(zzz(), min);
            this.zzb = Arrays.copyOf(zzA(), min);
            this.zzc = Arrays.copyOf(zzB(), min);
        }
        zzz()[i12] = (~zzu) & zza;
        zzA()[i12] = obj;
        zzB()[i12] = obj2;
        this.zzg = i13;
        zzn();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.remove(obj);
        }
        Object zzx = zzx(obj);
        if (zzx == zzd) {
            return null;
        }
        return zzx;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map zzl = zzl();
        return zzl != null ? zzl.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection == null) {
            zzbc zzbcVar = new zzbc(this);
            this.zzj = zzbcVar;
            return zzbcVar;
        }
        return collection;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zze() {
        return isEmpty() ? -1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzf(int i11) {
        int i12 = i11 + 1;
        if (i12 < this.zzg) {
            return i12;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map zzl() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzn() {
        this.zzf += 32;
    }

    final void zzo(int i11) {
        this.zzf = zzcn.zza(12, 1, 1073741823);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzp(int i11, int i12) {
        Object obj = this.zze;
        obj.getClass();
        int[] zzz = zzz();
        Object[] zzA = zzA();
        Object[] zzB = zzB();
        int size = size() - 1;
        if (i11 < size) {
            Object obj2 = zzA[size];
            zzA[i11] = obj2;
            zzB[i11] = zzB[size];
            zzA[size] = null;
            zzB[size] = null;
            zzz[i11] = zzz[size];
            zzz[size] = 0;
            int zza = zzbf.zza(obj2) & i12;
            int zzc = zzbe.zzc(obj, zza);
            int i13 = size + 1;
            if (zzc == i13) {
                zzbe.zze(obj, zza, i11 + 1);
                return;
            }
            while (true) {
                int i14 = zzc - 1;
                int i15 = zzz[i14];
                int i16 = i15 & i12;
                if (i16 == i13) {
                    zzz[i14] = ((i11 + 1) & i12) | (i15 & (~i12));
                    return;
                }
                zzc = i16;
            }
        } else {
            zzA[i11] = null;
            zzB[i11] = null;
            zzz[i11] = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzq() {
        return this.zze == null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbd(int i11) {
        zzo(12);
    }
}