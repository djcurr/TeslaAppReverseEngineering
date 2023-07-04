package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* loaded from: classes3.dex */
public final class zzej extends zzgn {
    private char zza;
    private long zzb;
    private String zzc;
    private final zzeh zzd;
    private final zzeh zze;
    private final zzeh zzf;
    private final zzeh zzg;
    private final zzeh zzh;
    private final zzeh zzi;
    private final zzeh zzj;
    private final zzeh zzk;
    private final zzeh zzl;

    public zzej(zzft zzftVar) {
        super(zzftVar);
        this.zza = (char) 0;
        this.zzb = -1L;
        this.zzd = new zzeh(this, 6, false, false);
        this.zze = new zzeh(this, 6, true, false);
        this.zzf = new zzeh(this, 6, false, true);
        this.zzg = new zzeh(this, 5, false, false);
        this.zzh = new zzeh(this, 5, true, false);
        this.zzi = new zzeh(this, 5, false, true);
        this.zzj = new zzeh(this, 4, false, false);
        this.zzk = new zzeh(this, 3, false, false);
        this.zzl = new zzeh(this, 2, false, false);
    }

    public static Object zzn(String str) {
        if (str == null) {
            return null;
        }
        return new zzei(str);
    }

    public static String zzo(boolean z11, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String zzp = zzp(z11, obj);
        String zzp2 = zzp(z11, obj2);
        String zzp3 = zzp(z11, obj3);
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(zzp)) {
            sb2.append(str2);
            sb2.append(zzp);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(zzp2)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(zzp2);
        }
        if (!TextUtils.isEmpty(zzp3)) {
            sb2.append(str3);
            sb2.append(zzp3);
        }
        return sb2.toString();
    }

    @VisibleForTesting
    static String zzp(boolean z11, Object obj) {
        String str;
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i11 = 0;
        if (obj instanceof Long) {
            if (!z11) {
                return obj.toString();
            }
            Long l11 = (Long) obj;
            if (Math.abs(l11.longValue()) < 100) {
                return obj.toString();
            }
            String str2 = obj.toString().charAt(0) == '-' ? "-" : "";
            String valueOf = String.valueOf(Math.abs(l11.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            StringBuilder sb2 = new StringBuilder(str2.length() + 43 + str2.length());
            sb2.append(str2);
            sb2.append(round);
            sb2.append("...");
            sb2.append(str2);
            sb2.append(round2);
            return sb2.toString();
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else {
            if (obj instanceof Throwable) {
                Throwable th2 = (Throwable) obj;
                StringBuilder sb3 = new StringBuilder(z11 ? th2.getClass().getName() : th2.toString());
                String zzy = zzy(zzft.class.getCanonicalName());
                StackTraceElement[] stackTrace = th2.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i11 >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i11];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && zzy(className).equals(zzy)) {
                        sb3.append(": ");
                        sb3.append(stackTraceElement);
                        break;
                    }
                    i11++;
                }
                return sb3.toString();
            } else if (!(obj instanceof zzei)) {
                return z11 ? "-" : obj.toString();
            } else {
                str = ((zzei) obj).zza;
                return str;
            }
        }
    }

    private static String zzy(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    public final zzeh zzc() {
        return this.zzk;
    }

    public final zzeh zzd() {
        return this.zzd;
    }

    public final zzeh zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.measurement.internal.zzgn
    protected final boolean zzf() {
        return false;
    }

    public final zzeh zzh() {
        return this.zze;
    }

    public final zzeh zzi() {
        return this.zzj;
    }

    public final zzeh zzj() {
        return this.zzl;
    }

    public final zzeh zzk() {
        return this.zzg;
    }

    public final zzeh zzl() {
        return this.zzi;
    }

    public final zzeh zzm() {
        return this.zzh;
    }

    @VisibleForTesting
    public final String zzq() {
        String str;
        synchronized (this) {
            if (this.zzc == null) {
                if (this.zzs.zzy() != null) {
                    this.zzc = this.zzs.zzy();
                } else {
                    this.zzc = this.zzs.zzf().zzn();
                }
            }
            Preconditions.checkNotNull(this.zzc);
            str = this.zzc;
        }
        return str;
    }

    public final void zzt(int i11, boolean z11, boolean z12, String str, Object obj, Object obj2, Object obj3) {
        if (!z11 && Log.isLoggable(zzq(), i11)) {
            Log.println(i11, zzq(), zzo(false, str, obj, obj2, obj3));
        }
        if (z12 || i11 < 5) {
            return;
        }
        Preconditions.checkNotNull(str);
        zzfq zzo = this.zzs.zzo();
        if (zzo == null) {
            Log.println(6, zzq(), "Scheduler not set. Not logging error/warn");
        } else if (!zzo.zzx()) {
            Log.println(6, zzq(), "Scheduler not initialized. Not logging error/warn");
        } else {
            if (i11 >= 9) {
                i11 = 8;
            }
            zzo.zzp(new zzeg(this, i11, str, obj, obj2, obj3));
        }
    }
}