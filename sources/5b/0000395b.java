package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.firebase.messaging.TopicOperation;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
final class x0 {

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f16881d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a  reason: collision with root package name */
    private final String f16882a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16883b;

    /* renamed from: c  reason: collision with root package name */
    private final String f16884c;

    private x0(@TopicOperation.TopicOperations String str, String str2) {
        this.f16882a = d(str2, str);
        this.f16883b = str;
        this.f16884c = str + "!" + str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static x0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new x0(split[0], split[1]);
    }

    private static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f16881d.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    public String b() {
        return this.f16883b;
    }

    public String c() {
        return this.f16882a;
    }

    public String e() {
        return this.f16884c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof x0) {
            x0 x0Var = (x0) obj;
            return this.f16882a.equals(x0Var.f16882a) && this.f16883b.equals(x0Var.f16883b);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f16883b, this.f16882a);
    }
}