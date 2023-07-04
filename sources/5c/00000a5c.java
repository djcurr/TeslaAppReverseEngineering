package atd.d;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g extends k implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Uri f6802a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f6803b;

    /* renamed from: c  reason: collision with root package name */
    private final Uri f6804c;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<g> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public g[] newArray(int i11) {
            return new g[i11];
        }
    }

    g(JSONObject jSONObject) {
        super(jSONObject);
        Uri e11 = e(jSONObject, atd.s0.a.a(-97189478853184L));
        this.f6802a = e11;
        Uri e12 = e(jSONObject, atd.s0.a.a(-97228133558848L));
        this.f6803b = e12;
        Uri e13 = e(jSONObject, atd.s0.a.a(-97241018460736L));
        this.f6804c = e13;
        if (e11 == null && e12 == null && e13 == null) {
            throw new atd.a0.a(atd.s0.a.a(-97301148002880L), atd.e.c.DATA_ELEMENT_INVALID_FORMAT);
        }
    }

    public static g g(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject != null) {
            try {
                return new g(optJSONObject);
            } catch (atd.a0.a e11) {
                throw new atd.a0.a(atd.s0.a.a(-96820111665728L) + str, e11, atd.e.c.DATA_ELEMENT_INVALID_FORMAT);
            }
        }
        return null;
    }

    public Uri a() {
        return this.f6804c;
    }

    public Uri b() {
        return this.f6803b;
    }

    public Uri c() {
        return this.f6802a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        Uri uri = this.f6802a;
        if (uri == null ? gVar.f6802a == null : uri.equals(gVar.f6802a)) {
            Uri uri2 = this.f6803b;
            if (uri2 == null ? gVar.f6803b == null : uri2.equals(gVar.f6803b)) {
                Uri uri3 = this.f6804c;
                Uri uri4 = gVar.f6804c;
                return uri3 != null ? uri3.equals(uri4) : uri4 == null;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Uri uri = this.f6802a;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.f6803b;
        int hashCode2 = (hashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        Uri uri3 = this.f6804c;
        return hashCode2 + (uri3 != null ? uri3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        a(parcel, this.f6802a);
        a(parcel, this.f6803b);
        a(parcel, this.f6804c);
    }

    private Uri a(Parcel parcel) {
        String readString = parcel.readString();
        if (TextUtils.isEmpty(readString)) {
            return null;
        }
        return Uri.parse(readString);
    }

    private void a(Parcel parcel, Uri uri) {
        if (uri != null) {
            parcel.writeString(uri.toString());
        } else {
            parcel.writeString(null);
        }
    }

    protected g(Parcel parcel) {
        super(parcel);
        this.f6802a = a(parcel);
        this.f6803b = a(parcel);
        this.f6804c = a(parcel);
    }
}