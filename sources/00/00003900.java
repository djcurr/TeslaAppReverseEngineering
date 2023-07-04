package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;
import com.stripe.android.financialconnections.di.NamedConstantsKt;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final String f16665a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16666b;

    /* renamed from: c  reason: collision with root package name */
    private final String f16667c;

    /* renamed from: d  reason: collision with root package name */
    private final String f16668d;

    /* renamed from: e  reason: collision with root package name */
    private final String f16669e;

    /* renamed from: f  reason: collision with root package name */
    private final String f16670f;

    /* renamed from: g  reason: collision with root package name */
    private final String f16671g;

    private i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f16666b = str;
        this.f16665a = str2;
        this.f16667c = str3;
        this.f16668d = str4;
        this.f16669e = str5;
        this.f16670f = str6;
        this.f16671g = str7;
    }

    public static i a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new i(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    public String b() {
        return this.f16665a;
    }

    public String c() {
        return this.f16666b;
    }

    public String d() {
        return this.f16669e;
    }

    public String e() {
        return this.f16671g;
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            return Objects.equal(this.f16666b, iVar.f16666b) && Objects.equal(this.f16665a, iVar.f16665a) && Objects.equal(this.f16667c, iVar.f16667c) && Objects.equal(this.f16668d, iVar.f16668d) && Objects.equal(this.f16669e, iVar.f16669e) && Objects.equal(this.f16670f, iVar.f16670f) && Objects.equal(this.f16671g, iVar.f16671g);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f16666b, this.f16665a, this.f16667c, this.f16668d, this.f16669e, this.f16670f, this.f16671g);
    }

    public String toString() {
        return Objects.toStringHelper(this).add(NamedConstantsKt.APPLICATION_ID, this.f16666b).add("apiKey", this.f16665a).add("databaseUrl", this.f16667c).add("gcmSenderId", this.f16669e).add("storageBucket", this.f16670f).add("projectId", this.f16671g).toString();
    }
}