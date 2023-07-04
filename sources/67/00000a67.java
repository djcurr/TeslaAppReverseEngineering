package atd.d;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n extends l {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* renamed from: o  reason: collision with root package name */
    private final String f6837o;

    /* renamed from: p  reason: collision with root package name */
    private final String f6838p;

    /* renamed from: q  reason: collision with root package name */
    private final String f6839q;

    /* renamed from: r  reason: collision with root package name */
    private final String f6840r;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<n> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public n createFromParcel(Parcel parcel) {
            return new n(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public n[] newArray(int i11) {
            return new n[i11];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(JSONObject jSONObject) {
        super(jSONObject);
        this.f6837o = d(jSONObject, atd.s0.a.a(-91962503653952L));
        this.f6838p = d(jSONObject, atd.s0.a.a(-92026928163392L));
        this.f6839q = d(jSONObject, atd.s0.a.a(-92078467770944L));
        try {
            this.f6840r = b(jSONObject, atd.s0.a.a(-91829359667776L));
        } catch (JSONException e11) {
            throw new atd.a0.a(atd.s0.a.a(-91928143915584L), e11, atd.e.c.DATA_ELEMENT_MISSING);
        }
    }

    @Override // atd.d.l, atd.d.a, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // atd.d.l, atd.d.a
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass() && super.equals(obj)) {
            n nVar = (n) obj;
            String str = this.f6837o;
            if (str == null ? nVar.f6837o == null : str.equals(nVar.f6837o)) {
                String str2 = this.f6838p;
                if (str2 == null ? nVar.f6838p == null : str2.equals(nVar.f6838p)) {
                    String str3 = this.f6839q;
                    if (str3 == null ? nVar.f6839q == null : str3.equals(nVar.f6839q)) {
                        String str4 = this.f6840r;
                        String str5 = nVar.f6840r;
                        return str4 != null ? str4.equals(str5) : str5 == null;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // atd.d.l, atd.d.a
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f6837o;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6838p;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6839q;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f6840r;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String n() {
        return this.f6837o;
    }

    public String o() {
        return this.f6838p;
    }

    public String p() {
        return this.f6839q;
    }

    public String q() {
        return this.f6840r;
    }

    @Override // atd.d.l, atd.d.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeString(this.f6837o);
        parcel.writeString(this.f6838p);
        parcel.writeString(this.f6839q);
        parcel.writeString(this.f6840r);
    }

    protected n(Parcel parcel) {
        super(parcel);
        this.f6837o = parcel.readString();
        this.f6838p = parcel.readString();
        this.f6839q = parcel.readString();
        this.f6840r = parcel.readString();
    }
}