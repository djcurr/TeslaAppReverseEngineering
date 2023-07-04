package atd.d;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f extends atd.d.a {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    private final String f6800c;

    /* renamed from: d  reason: collision with root package name */
    private final String f6801d;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<f> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public f[] newArray(int i11) {
            return new f[i11];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(JSONObject jSONObject) {
        super(jSONObject);
        try {
            this.f6800c = b(jSONObject, atd.s0.a.a(-97674810157632L));
            this.f6801d = d(jSONObject, atd.s0.a.a(-97709169896000L));
        } catch (JSONException e11) {
            throw new atd.a0.a(atd.s0.a.a(-96957550619200L), e11, atd.e.c.DATA_ELEMENT_MISSING);
        }
    }

    public String b() {
        return this.f6800c;
    }

    public String c() {
        return this.f6801d;
    }

    @Override // atd.d.a, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // atd.d.a
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f) && super.equals(obj)) {
            f fVar = (f) obj;
            String str = this.f6800c;
            if (str == null ? fVar.f6800c == null : str.equals(fVar.f6800c)) {
                String str2 = this.f6801d;
                String str3 = fVar.f6801d;
                return str2 != null ? str2.equals(str3) : str3 == null;
            }
            return false;
        }
        return false;
    }

    @Override // atd.d.a
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f6800c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6801d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // atd.d.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeString(this.f6800c);
        parcel.writeString(this.f6801d);
    }

    protected f(Parcel parcel) {
        super(parcel);
        this.f6800c = parcel.readString();
        this.f6801d = parcel.readString();
    }
}