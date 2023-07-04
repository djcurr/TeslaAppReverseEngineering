package com.auth0.android.jwt;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.gson.f;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.Map;

/* loaded from: classes.dex */
public class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f10357a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f10358b;

    /* renamed from: c  reason: collision with root package name */
    private e f10359c;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public c[] newArray(int i11) {
            return new c[i11];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends com.google.gson.reflect.a<Map<String, String>> {
        b(c cVar) {
        }
    }

    public c(String str) {
        b(str);
        this.f10357a = str;
    }

    private String a(String str) {
        try {
            return new String(Base64.decode(str, 11), Charset.defaultCharset());
        } catch (IllegalArgumentException e11) {
            throw new DecodeException("Received bytes didn't correspond to a valid Base64 encoded string.", e11);
        }
    }

    private void b(String str) {
        String[] i11 = i(str);
        this.f10358b = (Map) h(a(i11[0]), new b(this).getType());
        this.f10359c = (e) h(a(i11[1]), e.class);
        String str2 = i11[2];
    }

    static com.google.gson.e e() {
        return new f().c(e.class, new d()).b();
    }

    private <T> T h(String str, Type type) {
        try {
            return (T) e().i(str, type);
        } catch (Exception e11) {
            throw new DecodeException("The token's payload had an invalid JSON format.", e11);
        }
    }

    private String[] i(String str) {
        String[] split = str.split("\\.");
        if (split.length == 2 && str.endsWith(".")) {
            split = new String[]{split[0], split[1], ""};
        }
        if (split.length == 3) {
            return split;
        }
        throw new DecodeException(String.format("The token was expected to have 3 parts, but got %s.", Integer.valueOf(split.length)));
    }

    public ba.a c(String str) {
        return this.f10359c.a(str);
    }

    public Date d() {
        return this.f10359c.f10361b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String f() {
        return this.f10359c.f10360a;
    }

    public boolean g(long j11) {
        if (j11 >= 0) {
            long floor = (long) (Math.floor(new Date().getTime() / 1000) * 1000.0d);
            long j12 = j11 * 1000;
            Date date = new Date(floor + j12);
            Date date2 = new Date(floor - j12);
            Date date3 = this.f10359c.f10361b;
            boolean z11 = date3 == null || !date2.after(date3);
            Date date4 = this.f10359c.f10362c;
            return (z11 && (date4 == null || !date.before(date4))) ? false : true;
        }
        throw new IllegalArgumentException("The leeway must be a positive value.");
    }

    public String toString() {
        return this.f10357a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f10357a);
    }
}