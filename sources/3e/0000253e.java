package com.google.android.gms.internal.mlkit_common;

import android.util.Log;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzn {
    private static final Method zza;
    private static final Method zzb;
    private static final Method zzc;
    private static final Field zzd;
    private static final Field zze;
    private static final Field zzf;
    private static final Object zzg;
    private static final Throwable zzh;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Throwable th2;
        Object obj;
        Field field;
        Method method;
        Method method2;
        Method method3;
        Field field2;
        Field field3;
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        try {
            cls = Class.forName("libcore.io.Libcore");
            cls2 = Class.forName("libcore.io.StructStat");
            Class<?> cls4 = Class.forName("libcore.io.OsConstants");
            cls3 = Class.forName("libcore.io.ForwardingOs");
            method = cls4.getDeclaredMethod("S_ISLNK", Integer.TYPE);
        } catch (Throwable th3) {
            th2 = th3;
            obj = null;
            field = null;
            method = null;
            method2 = null;
        }
        try {
            method.setAccessible(true);
            method3 = cls3.getDeclaredMethod("lstat", String.class);
            try {
                method2 = cls3.getDeclaredMethod("fstat", FileDescriptor.class);
                try {
                    Field declaredField = cls.getDeclaredField("os");
                    declaredField.setAccessible(true);
                    obj = declaredField.get(cls);
                } catch (Throwable th4) {
                    th2 = th4;
                    obj = null;
                    field = null;
                }
                try {
                    field2 = cls2.getField("st_dev");
                    try {
                        field3 = cls2.getField("st_ino");
                        try {
                            field = cls2.getField("st_mode");
                        } catch (Throwable th5) {
                            th2 = th5;
                            field = null;
                        }
                        try {
                            field2.setAccessible(true);
                            field3.setAccessible(true);
                            field.setAccessible(true);
                        } catch (Throwable th6) {
                            th2 = th6;
                            try {
                                Log.d("StructStatHelper", "Reflection failed", th2);
                                zza = method;
                                zzb = method3;
                                zzc = method2;
                                zzd = field2;
                                zze = field3;
                                zzf = field;
                                zzg = obj;
                                zzh = th2;
                            } finally {
                                zza = method;
                                zzb = method3;
                                zzc = method2;
                                zzd = field2;
                                zze = field3;
                                zzf = field;
                                zzg = obj;
                                zzh = null;
                            }
                        }
                    } catch (Throwable th7) {
                        th2 = th7;
                        field = null;
                        field3 = null;
                    }
                } catch (Throwable th8) {
                    th2 = th8;
                    field = null;
                    field2 = field;
                    field3 = field2;
                    Log.d("StructStatHelper", "Reflection failed", th2);
                    zza = method;
                    zzb = method3;
                    zzc = method2;
                    zzd = field2;
                    zze = field3;
                    zzf = field;
                    zzg = obj;
                    zzh = th2;
                }
            } catch (Throwable th9) {
                th2 = th9;
                obj = null;
                field = null;
                method2 = null;
                field2 = 0;
            }
        } catch (Throwable th10) {
            th2 = th10;
            obj = null;
            field = null;
            method2 = null;
            method3 = method2;
            field2 = method3;
            field3 = field2;
            Log.d("StructStatHelper", "Reflection failed", th2);
            zza = method;
            zzb = method3;
            zzc = method2;
            zzd = field2;
            zze = field3;
            zzf = field;
            zzg = obj;
            zzh = th2;
        }
    }

    public static zzp zza(final FileDescriptor fileDescriptor) {
        return (zzp) zzf(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzn.zzb(fileDescriptor);
            }
        });
    }

    public static /* synthetic */ zzp zzb(FileDescriptor fileDescriptor) {
        return zze(zzc.invoke(zzg, fileDescriptor));
    }

    public static /* synthetic */ zzp zzc(String str) {
        return zze(zzb.invoke(zzg, str));
    }

    public static zzp zzd(final String str) {
        return (zzp) zzf(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzn.zzc(str);
            }
        });
    }

    public static zzp zze(Object obj) {
        return new zzp(((Long) zzd.get(obj)).longValue(), ((Long) zze.get(obj)).longValue(), ((Boolean) zza.invoke(null, Integer.valueOf(((Integer) zzf.get(obj)).intValue()))).booleanValue());
    }

    private static Object zzf(Callable callable) {
        try {
            Throwable th2 = zzh;
            if (th2 == null) {
                return callable.call();
            }
            throw new IOException(th2);
        } catch (Throwable th3) {
            throw new IOException(th3);
        }
    }
}