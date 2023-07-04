package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzaev;
import com.google.android.libraries.places.internal.zzaey;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public abstract class zzaey<MessageType extends zzaey<MessageType, BuilderType>, BuilderType extends zzaev<MessageType, BuilderType>> extends zzadq<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzahj zzc = zzahj.zzc();

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzaff zzA() {
        return zzafv.zze();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzafg zzB() {
        return zzagp.zzd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzafg zzC(zzafg zzafgVar) {
        int size = zzafgVar.size();
        return zzafgVar.zzf(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzE(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e11);
        } catch (InvocationTargetException e12) {
            Throwable cause = e12.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object zzF(zzagg zzaggVar, String str, Object[] objArr) {
        return new zzagq(zzaggVar, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void zzI(Class cls, zzaey zzaeyVar) {
        zzaeyVar.zzH();
        zzb.put(cls, zzaeyVar);
    }

    private final int zza(zzagr zzagrVar) {
        if (zzagrVar == null) {
            return zzago.zza().zzb(getClass()).zza(this);
        }
        return zzagrVar.zza(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzaey zzx(Class cls) {
        Map map = zzb;
        zzaey zzaeyVar = (zzaey) map.get(cls);
        if (zzaeyVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzaeyVar = (zzaey) map.get(cls);
            } catch (ClassNotFoundException e11) {
                throw new IllegalStateException("Class initialization cannot fail.", e11);
            }
        }
        if (zzaeyVar == null) {
            zzaeyVar = (zzaey) ((zzaey) zzahs.zze(cls)).zzb(6, null, null);
            if (zzaeyVar != null) {
                map.put(cls, zzaeyVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzaeyVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzafd zzz() {
        return zzaez.zze();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzago.zza().zzb(getClass()).zzg(this, (zzaey) obj);
        }
        return false;
    }

    public final int hashCode() {
        if (zzL()) {
            return zzu();
        }
        int i11 = this.zza;
        if (i11 == 0) {
            int zzu = zzu();
            this.zza = zzu;
            return zzu;
        }
        return i11;
    }

    public final String toString() {
        return zzagi.zza(this, super.toString());
    }

    @Override // com.google.android.libraries.places.internal.zzagg
    public final /* synthetic */ zzagf zzD() {
        return (zzaev) zzb(5, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzG() {
        zzago.zza().zzb(getClass()).zzd(this);
        zzH();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzH() {
        this.zzd &= Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzJ(int i11) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    @Override // com.google.android.libraries.places.internal.zzagg
    public final void zzK(zzael zzaelVar) {
        zzago.zza().zzb(getClass()).zzf(this, zzaem.zza(zzaelVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzL() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object zzb(int i11, Object obj, Object obj2);

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzadq
    public final int zzr(zzagr zzagrVar) {
        if (zzL()) {
            int zza = zza(zzagrVar);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zza);
        }
        int i11 = this.zzd & Integer.MAX_VALUE;
        if (i11 != Integer.MAX_VALUE) {
            return i11;
        }
        int zza2 = zza(zzagrVar);
        if (zza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | zza2;
            return zza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + zza2);
    }

    @Override // com.google.android.libraries.places.internal.zzagh
    public final /* synthetic */ zzagg zzt() {
        return (zzaey) zzb(6, null, null);
    }

    final int zzu() {
        return zzago.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.libraries.places.internal.zzagg
    public final int zzv() {
        int i11;
        if (zzL()) {
            i11 = zza(null);
            if (i11 < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i11);
            }
        } else {
            i11 = this.zzd & Integer.MAX_VALUE;
            if (i11 == Integer.MAX_VALUE) {
                i11 = zza(null);
                if (i11 >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i11;
                } else {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i11);
                }
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzaev zzw() {
        return (zzaev) zzb(5, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzaey zzy() {
        return (zzaey) zzb(4, null, null);
    }
}