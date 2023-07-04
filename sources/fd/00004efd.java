package com.stripe.android.link.account;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.security.crypto.a;
import androidx.security.crypto.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class EncryptedStore {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    public static final String FILE_NAME = "LinkStore";
    private final b masterKey;
    private final SharedPreferences sharedPreferences;

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EncryptedStore(Context context) {
        s.g(context, "context");
        b a11 = new b.C0101b(context).c(b.c.AES256_GCM).a();
        s.f(a11, "Builder(context)\n       …256_GCM)\n        .build()");
        this.masterKey = a11;
        SharedPreferences a12 = a.a(context.getApplicationContext(), FILE_NAME, a11, a.d.AES256_SIV, a.e.AES256_GCM);
        s.f(a12, "create(\n        context.…onScheme.AES256_GCM\n    )");
        this.sharedPreferences = a12;
    }

    public final void delete(String key) {
        s.g(key, "key");
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.remove(key);
        edit.apply();
    }

    public final String read(String key) {
        s.g(key, "key");
        return this.sharedPreferences.getString(key, null);
    }

    public final void write(String key, String value) {
        s.g(key, "key");
        s.g(value, "value");
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putString(key, value);
        edit.apply();
    }
}