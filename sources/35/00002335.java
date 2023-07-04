package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjv;
import com.google.android.gms.internal.measurement.zzjz;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public abstract class zzjz<MessageType extends zzjz<MessageType, BuilderType>, BuilderType extends zzjv<MessageType, BuilderType>> extends zzih<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    protected zzmj zzc = zzmj.zzc();
    protected int zzd = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzbC(Method method, Object obj, Object... objArr) {
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
    public static Object zzbD(zzlg zzlgVar, String str, Object[] objArr) {
        return new zzlq(zzlgVar, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void zzbE(Class cls, zzjz zzjzVar) {
        zza.put(cls, zzjzVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzjz zzbu(Class cls) {
        Map map = zza;
        zzjz zzjzVar = (zzjz) map.get(cls);
        if (zzjzVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzjzVar = (zzjz) map.get(cls);
            } catch (ClassNotFoundException e11) {
                throw new IllegalStateException("Class initialization cannot fail.", e11);
            }
        }
        if (zzjzVar == null) {
            zzjzVar = (zzjz) ((zzjz) zzms.zze(cls)).zzl(6, null, null);
            if (zzjzVar != null) {
                map.put(cls, zzjzVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzjzVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzke zzbv() {
        return zzka.zzf();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzkf zzbw() {
        return zzkv.zzf();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzkf zzbx(zzkf zzkfVar) {
        int size = zzkfVar.size();
        return zzkfVar.zze(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzkg zzby() {
        return zzlp.zze();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzkg zzbz(zzkg zzkgVar) {
        int size = zzkgVar.size();
        return zzkgVar.zzd(size == 0 ? 10 : size + size);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzlo.zza().zzb(getClass()).zzi(this, (zzjz) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.zzb;
        if (i11 != 0) {
            return i11;
        }
        int zzb = zzlo.zza().zzb(getClass()).zzb(this);
        this.zzb = zzb;
        return zzb;
    }

    public final String toString() {
        return zzli.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public final /* synthetic */ zzlf zzbA() {
        return (zzjv) zzl(5, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public final /* synthetic */ zzlf zzbB() {
        zzjv zzjvVar = (zzjv) zzl(5, null, null);
        zzjvVar.zzaw(this);
        return zzjvVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public final void zzbF(zzjg zzjgVar) {
        zzlo.zza().zzb(getClass()).zzm(this, zzjh.zza(zzjgVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public final /* synthetic */ zzlg zzbJ() {
        return (zzjz) zzl(6, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzih
    public final int zzbm() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzih
    public final void zzbp(int i11) {
        this.zzd = i11;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public final int zzbr() {
        int i11 = this.zzd;
        if (i11 == -1) {
            int zza2 = zzlo.zza().zzb(getClass()).zza(this);
            this.zzd = zza2;
            return zza2;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzjv zzbs() {
        return (zzjv) zzl(5, null, null);
    }

    public final zzjv zzbt() {
        zzjv zzjvVar = (zzjv) zzl(5, null, null);
        zzjvVar.zzaw(this);
        return zzjvVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object zzl(int i11, Object obj, Object obj2);
}