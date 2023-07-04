package com.google.android.libraries.places.internal;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import ch.qos.logback.core.joran.action.Action;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzew {
    private final String zza;
    private final String zzb;
    private Locale zzc = null;
    private Map zzd = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzew(String str, String str2) {
        this.zza = str;
        zzig.zze(!TextUtils.isEmpty(str2), "API key cannot be empty.");
        this.zzb = str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzew zza(Locale locale) {
        this.zzc = locale;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzew zzb(Map map) {
        this.zzd = new HashMap(map);
        return this;
    }

    public final String zzc() {
        String languageTag;
        Uri.Builder buildUpon = Uri.parse("https://maps.googleapis.com/").buildUpon();
        buildUpon.appendEncodedPath("maps/api/place/");
        buildUpon.appendEncodedPath(this.zza);
        buildUpon.appendQueryParameter(Action.KEY_ATTRIBUTE, this.zzb);
        Locale locale = this.zzc;
        if (locale != null) {
            if (Build.VERSION.SDK_INT < 21) {
                StringBuilder sb2 = new StringBuilder();
                String language = locale.getLanguage();
                if (!TextUtils.isEmpty(language)) {
                    sb2.append(language);
                    String country = locale.getCountry();
                    if (!TextUtils.isEmpty(country)) {
                        sb2.append("-");
                        sb2.append(country);
                    }
                }
                languageTag = sb2.toString();
            } else {
                languageTag = locale.toLanguageTag();
            }
            if (!TextUtils.isEmpty(languageTag)) {
                buildUpon.appendQueryParameter("language", languageTag);
            }
        }
        Map map = this.zzd;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return buildUpon.build().toString();
    }
}