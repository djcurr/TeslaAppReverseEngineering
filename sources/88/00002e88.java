package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import androidx.core.content.b;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.AccountType;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzao extends zzgn {
    private long zza;
    private String zzb;
    private AccountManager zzc;
    private Boolean zzd;
    private long zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzao(zzft zzftVar) {
        super(zzftVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zza() {
        zzg();
        return this.zze;
    }

    public final long zzb() {
        zzu();
        return this.zza;
    }

    public final String zzc() {
        zzu();
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd() {
        zzg();
        this.zzd = null;
        this.zze = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zze() {
        Account[] result;
        zzg();
        long currentTimeMillis = this.zzs.zzav().currentTimeMillis();
        if (currentTimeMillis - this.zze > CoreConstants.MILLIS_IN_ONE_DAY) {
            this.zzd = null;
        }
        Boolean bool = this.zzd;
        if (bool == null) {
            if (b.checkSelfPermission(this.zzs.zzau(), "android.permission.GET_ACCOUNTS") != 0) {
                this.zzs.zzay().zzm().zza("Permission error checking for dasher/unicorn accounts");
                this.zze = currentTimeMillis;
                this.zzd = Boolean.FALSE;
                return false;
            }
            if (this.zzc == null) {
                this.zzc = AccountManager.get(this.zzs.zzau());
            }
            try {
                result = this.zzc.getAccountsByTypeAndFeatures(AccountType.GOOGLE, new String[]{"service_HOSTED"}, null, null).getResult();
            } catch (AuthenticatorException | OperationCanceledException | IOException e11) {
                this.zzs.zzay().zzh().zzb("Exception checking account types", e11);
            }
            if (result != null && result.length > 0) {
                this.zzd = Boolean.TRUE;
                this.zze = currentTimeMillis;
                return true;
            }
            Account[] result2 = this.zzc.getAccountsByTypeAndFeatures(AccountType.GOOGLE, new String[]{"service_uca"}, null, null).getResult();
            if (result2 != null && result2.length > 0) {
                this.zzd = Boolean.TRUE;
                this.zze = currentTimeMillis;
                return true;
            }
            this.zze = currentTimeMillis;
            this.zzd = Boolean.FALSE;
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.zzgn
    protected final boolean zzf() {
        Calendar calendar = Calendar.getInstance();
        this.zza = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb2.append(lowerCase);
        sb2.append("-");
        sb2.append(lowerCase2);
        this.zzb = sb2.toString();
        return false;
    }
}