package com.google.android.gms.flags;

import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
@Deprecated
/* loaded from: classes3.dex */
public abstract class Flag<T> {
    private final String mKey;
    private final int zze;
    private final T zzf;

    @Deprecated
    /* loaded from: classes3.dex */
    public static class BooleanFlag extends Flag<Boolean> {
        public BooleanFlag(int i11, String str, Boolean bool) {
            super(i11, str, bool);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.gms.flags.Flag
        /* renamed from: zzb */
        public final Boolean zza(zzc zzcVar) {
            try {
                return Boolean.valueOf(zzcVar.getBooleanFlagValue(getKey(), zzb().booleanValue(), getSource()));
            } catch (RemoteException unused) {
                return zzb();
            }
        }
    }

    @Deprecated
    @KeepForSdk
    /* loaded from: classes3.dex */
    public static class IntegerFlag extends Flag<Integer> {
        public IntegerFlag(int i11, String str, Integer num) {
            super(i11, str, num);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.gms.flags.Flag
        /* renamed from: zzc */
        public final Integer zza(zzc zzcVar) {
            try {
                return Integer.valueOf(zzcVar.getIntFlagValue(getKey(), zzb().intValue(), getSource()));
            } catch (RemoteException unused) {
                return zzb();
            }
        }
    }

    @Deprecated
    @KeepForSdk
    /* loaded from: classes3.dex */
    public static class LongFlag extends Flag<Long> {
        public LongFlag(int i11, String str, Long l11) {
            super(i11, str, l11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.gms.flags.Flag
        /* renamed from: zzd */
        public final Long zza(zzc zzcVar) {
            try {
                return Long.valueOf(zzcVar.getLongFlagValue(getKey(), zzb().longValue(), getSource()));
            } catch (RemoteException unused) {
                return zzb();
            }
        }
    }

    @Deprecated
    @KeepForSdk
    /* loaded from: classes3.dex */
    public static class StringFlag extends Flag<String> {
        public StringFlag(int i11, String str, String str2) {
            super(i11, str, str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.gms.flags.Flag
        /* renamed from: zze */
        public final String zza(zzc zzcVar) {
            try {
                return zzcVar.getStringFlagValue(getKey(), zzb(), getSource());
            } catch (RemoteException unused) {
                return zzb();
            }
        }
    }

    private Flag(int i11, String str, T t11) {
        this.zze = i11;
        this.mKey = str;
        this.zzf = t11;
        Singletons.flagRegistry().zza(this);
    }

    @KeepForSdk
    @Deprecated
    public static BooleanFlag define(int i11, String str, Boolean bool) {
        return new BooleanFlag(i11, str, bool);
    }

    @KeepForSdk
    public T get() {
        return (T) Singletons.zzd().zzb(this);
    }

    public final String getKey() {
        return this.mKey;
    }

    @Deprecated
    public final int getSource() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract T zza(zzc zzcVar);

    public final T zzb() {
        return this.zzf;
    }

    @KeepForSdk
    @Deprecated
    public static IntegerFlag define(int i11, String str, int i12) {
        return new IntegerFlag(i11, str, Integer.valueOf(i12));
    }

    @KeepForSdk
    @Deprecated
    public static LongFlag define(int i11, String str, long j11) {
        return new LongFlag(i11, str, Long.valueOf(j11));
    }

    @KeepForSdk
    @Deprecated
    public static StringFlag define(int i11, String str, String str2) {
        return new StringFlag(i11, str, str2);
    }
}