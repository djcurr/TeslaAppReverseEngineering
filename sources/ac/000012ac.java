package com.adyen.checkout.components.analytics;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.URLUtil;
import com.adyen.checkout.core.exception.CheckoutException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;

/* loaded from: classes.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0184a();

    /* renamed from: a  reason: collision with root package name */
    private final String f9553a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9554b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9555c;

    /* renamed from: d  reason: collision with root package name */
    private final String f9556d;

    /* renamed from: e  reason: collision with root package name */
    private final String f9557e = Build.BRAND;

    /* renamed from: f  reason: collision with root package name */
    private final String f9558f = Build.MODEL;

    /* renamed from: g  reason: collision with root package name */
    private final String f9559g = String.valueOf(Build.VERSION.SDK_INT);

    /* renamed from: com.adyen.checkout.components.analytics.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0184a implements Parcelable.Creator<a> {
        C0184a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public a[] newArray(int i11) {
            return new a[i11];
        }
    }

    /* loaded from: classes.dex */
    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9560a;

        static {
            int[] iArr = new int[c.values().length];
            f9560a = iArr;
            try {
                iArr[c.DROPIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9560a[c.COMPONENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        DROPIN,
        COMPONENT
    }

    a(Parcel parcel) {
        this.f9553a = parcel.readString();
        this.f9554b = parcel.readString();
        this.f9555c = parcel.readString();
        this.f9556d = parcel.readString();
    }

    public static a a(Context context, c cVar, String str, Locale locale) {
        String str2;
        int i11 = b.f9560a[cVar.ordinal()];
        if (i11 == 1) {
            str2 = "dropin";
        } else if (i11 != 2) {
            throw new CheckoutException("Unexpected flavor - " + cVar.name());
        } else {
            str2 = "components";
        }
        return new a(context.getPackageName(), str2, str, locale.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public URL b(String str) {
        if (URLUtil.isValidUrl(str)) {
            Uri parse = Uri.parse(str);
            return new URL(new Uri.Builder().scheme(parse.getScheme()).authority(parse.getAuthority()).path(parse.getPath()).appendQueryParameter("payload_version", "1").appendQueryParameter("version", "4.7.1").appendQueryParameter("flavor", this.f9553a).appendQueryParameter("component", this.f9554b).appendQueryParameter("locale", this.f9555c).appendQueryParameter("platform", "android").appendQueryParameter("referer", this.f9556d).appendQueryParameter("device_brand", this.f9557e).appendQueryParameter("device_model", this.f9558f).appendQueryParameter("system_version", this.f9559g).build().toString());
        }
        throw new MalformedURLException("Invalid URL format - " + str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f9553a);
        parcel.writeString(this.f9554b);
        parcel.writeString(this.f9555c);
        parcel.writeString(this.f9556d);
    }

    private a(String str, String str2, String str3, String str4) {
        this.f9556d = str;
        this.f9555c = str4;
        this.f9553a = str2;
        this.f9554b = str3;
    }
}