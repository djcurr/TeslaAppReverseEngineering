package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class zzjq implements Cloneable {
    private Object value;
    private zzjo<?, ?> zzadm;
    private List<zzjv> zzadn = new ArrayList();

    private final byte[] toByteArray() {
        byte[] bArr = new byte[zzt()];
        zza(zzjl.zzk(bArr));
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzhs */
    public final zzjq clone() {
        zzjq zzjqVar = new zzjq();
        try {
            zzjqVar.zzadm = this.zzadm;
            List<zzjv> list = this.zzadn;
            if (list == null) {
                zzjqVar.zzadn = null;
            } else {
                zzjqVar.zzadn.addAll(list);
            }
            Object obj = this.value;
            if (obj != null) {
                if (obj instanceof zzjt) {
                    zzjqVar.value = (zzjt) ((zzjt) obj).clone();
                } else if (obj instanceof byte[]) {
                    zzjqVar.value = ((byte[]) obj).clone();
                } else {
                    int i11 = 0;
                    if (obj instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) obj;
                        byte[][] bArr2 = new byte[bArr.length];
                        zzjqVar.value = bArr2;
                        while (i11 < bArr.length) {
                            bArr2[i11] = (byte[]) bArr[i11].clone();
                            i11++;
                        }
                    } else if (obj instanceof boolean[]) {
                        zzjqVar.value = ((boolean[]) obj).clone();
                    } else if (obj instanceof int[]) {
                        zzjqVar.value = ((int[]) obj).clone();
                    } else if (obj instanceof long[]) {
                        zzjqVar.value = ((long[]) obj).clone();
                    } else if (obj instanceof float[]) {
                        zzjqVar.value = ((float[]) obj).clone();
                    } else if (obj instanceof double[]) {
                        zzjqVar.value = ((double[]) obj).clone();
                    } else if (obj instanceof zzjt[]) {
                        zzjt[] zzjtVarArr = (zzjt[]) obj;
                        zzjt[] zzjtVarArr2 = new zzjt[zzjtVarArr.length];
                        zzjqVar.value = zzjtVarArr2;
                        while (i11 < zzjtVarArr.length) {
                            zzjtVarArr2[i11] = (zzjt) zzjtVarArr[i11].clone();
                            i11++;
                        }
                    }
                }
            }
            return zzjqVar;
        } catch (CloneNotSupportedException e11) {
            throw new AssertionError(e11);
        }
    }

    public final boolean equals(Object obj) {
        List<zzjv> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzjq) {
            zzjq zzjqVar = (zzjq) obj;
            if (this.value != null && zzjqVar.value != null) {
                zzjo<?, ?> zzjoVar = this.zzadm;
                if (zzjoVar != zzjqVar.zzadm) {
                    return false;
                }
                if (!zzjoVar.zzadh.isArray()) {
                    return this.value.equals(zzjqVar.value);
                }
                Object obj2 = this.value;
                if (obj2 instanceof byte[]) {
                    return Arrays.equals((byte[]) obj2, (byte[]) zzjqVar.value);
                }
                if (obj2 instanceof int[]) {
                    return Arrays.equals((int[]) obj2, (int[]) zzjqVar.value);
                }
                if (obj2 instanceof long[]) {
                    return Arrays.equals((long[]) obj2, (long[]) zzjqVar.value);
                }
                if (obj2 instanceof float[]) {
                    return Arrays.equals((float[]) obj2, (float[]) zzjqVar.value);
                }
                if (obj2 instanceof double[]) {
                    return Arrays.equals((double[]) obj2, (double[]) zzjqVar.value);
                }
                if (obj2 instanceof boolean[]) {
                    return Arrays.equals((boolean[]) obj2, (boolean[]) zzjqVar.value);
                }
                return Arrays.deepEquals((Object[]) obj2, (Object[]) zzjqVar.value);
            }
            List<zzjv> list2 = this.zzadn;
            if (list2 != null && (list = zzjqVar.zzadn) != null) {
                return list2.equals(list);
            }
            try {
                return Arrays.equals(toByteArray(), zzjqVar.toByteArray());
            } catch (IOException e11) {
                throw new IllegalStateException(e11);
            }
        }
        return false;
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(toByteArray()) + 527;
        } catch (IOException e11) {
            throw new IllegalStateException(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzjv zzjvVar) {
        List<zzjv> list = this.zzadn;
        if (list != null) {
            list.add(zzjvVar);
            return;
        }
        Object obj = this.value;
        if (obj instanceof zzjt) {
            byte[] bArr = zzjvVar.zzse;
            zzjk zzk = zzjk.zzk(bArr, 0, bArr.length);
            int zzdt = zzk.zzdt();
            if (zzdt == bArr.length - zzjl.zzaw(zzdt)) {
                zzjt zza = ((zzjt) this.value).zza(zzk);
                this.zzadm = this.zzadm;
                this.value = zza;
                this.zzadn = null;
                return;
            }
            throw zzjs.zzht();
        } else if (obj instanceof zzjt[]) {
            Collections.singletonList(zzjvVar);
            throw new NoSuchMethodError();
        } else {
            Collections.singletonList(zzjvVar);
            throw new NoSuchMethodError();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzt() {
        if (this.value == null) {
            int i11 = 0;
            for (zzjv zzjvVar : this.zzadn) {
                i11 += zzjl.zzbd(zzjvVar.tag) + 0 + zzjvVar.zzse.length;
            }
            return i11;
        }
        throw new NoSuchMethodError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzjl zzjlVar) {
        if (this.value == null) {
            for (zzjv zzjvVar : this.zzadn) {
                zzjlVar.zzbv(zzjvVar.tag);
                zzjlVar.zzl(zzjvVar.zzse);
            }
            return;
        }
        throw new NoSuchMethodError();
    }
}