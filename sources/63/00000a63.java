package atd.d;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class l extends atd.d.a {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: c */
    private final String f6824c;

    /* renamed from: d */
    private final String f6825d;

    /* renamed from: e */
    private final String f6826e;

    /* renamed from: f */
    private final atd.e.a f6827f;

    /* renamed from: g */
    private final String f6828g;

    /* renamed from: h */
    private final String f6829h;

    /* renamed from: i */
    private final String f6830i;

    /* renamed from: j */
    private final String f6831j;

    /* renamed from: k */
    private final String f6832k;

    /* renamed from: l */
    private final g f6833l;

    /* renamed from: m */
    private final g f6834m;

    /* renamed from: n */
    private final String f6835n;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<l> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public l[] newArray(int i11) {
            return new l[i11];
        }
    }

    public l(JSONObject jSONObject) {
        super(jSONObject);
        try {
            String b11 = b(jSONObject, atd.s0.a.a(-94329030634048L));
            this.f6824c = b(jSONObject, atd.s0.a.a(-94402045078080L));
            this.f6825d = b(jSONObject, atd.s0.a.a(-93663310703168L));
            if (b11.equals(com.adyen.threeds2.internal.d.V2_1_0.c())) {
                this.f6826e = d(jSONObject, atd.s0.a.a(-93723440245312L));
            } else if (a() == atd.e.b.OUT_OF_BAND) {
                this.f6826e = d(jSONObject, atd.s0.a.a(-93538756651584L));
            } else {
                this.f6826e = b(jSONObject, atd.s0.a.a(-93903828871744L));
            }
            this.f6827f = atd.e.a.a(d(jSONObject, atd.s0.a.a(-93959663446592L)));
            this.f6828g = d(jSONObject, atd.s0.a.a(-93809339591232L));
            this.f6829h = d(jSONObject, atd.s0.a.a(-93092080052800L));
            this.f6830i = d(jSONObject, atd.s0.a.a(-93139324693056L));
            this.f6831j = d(jSONObject, atd.s0.a.a(-92915986393664L));
            this.f6832k = d(jSONObject, atd.s0.a.a(-92984705870400L));
            this.f6833l = g.g(jSONObject, atd.s0.a.a(-93332598221376L));
            this.f6834m = g.g(jSONObject, atd.s0.a.a(-93384137828928L));
            String d11 = d(jSONObject, atd.s0.a.a(-93418497567296L));
            this.f6835n = d11;
            if (d11 != null && d11.length() > 64) {
                throw new atd.a0.a(atd.s0.a.a(-93225224038976L), atd.e.c.DATA_ELEMENT_INVALID_FORMAT);
            }
        } catch (JSONException e11) {
            throw new atd.a0.a(atd.s0.a.a(-92611043715648L), e11, atd.e.c.DATA_ELEMENT_MISSING);
        }
    }

    public String b() {
        return this.f6824c;
    }

    public String c() {
        return this.f6826e;
    }

    public String d() {
        return this.f6825d;
    }

    @Override // atd.d.a, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f6831j;
    }

    @Override // atd.d.a
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            l lVar = (l) obj;
            if (atd.r0.d.a(this.f6824c, lVar.f6824c) && atd.r0.d.a(this.f6825d, lVar.f6825d) && atd.r0.d.a(this.f6826e, lVar.f6826e) && this.f6827f == lVar.f6827f) {
                return atd.r0.d.a(this.f6828g, lVar.f6828g);
            }
            return false;
        }
        return false;
    }

    public String f() {
        return this.f6832k;
    }

    public g g() {
        return this.f6833l;
    }

    public g h() {
        return this.f6834m;
    }

    @Override // atd.d.a
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f6824c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6825d;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6826e;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        atd.e.a aVar = this.f6827f;
        int hashCode5 = (hashCode4 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str4 = this.f6828g;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public String i() {
        return this.f6828g;
    }

    public String j() {
        return this.f6835n;
    }

    public String k() {
        return this.f6829h;
    }

    public String l() {
        return this.f6830i;
    }

    public boolean m() {
        return this.f6827f.b();
    }

    @Override // atd.d.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeString(this.f6824c);
        parcel.writeString(this.f6825d);
        parcel.writeString(this.f6826e);
        parcel.writeString(this.f6827f.name());
        parcel.writeString(this.f6828g);
        parcel.writeString(this.f6829h);
        parcel.writeString(this.f6830i);
        parcel.writeString(this.f6831j);
        parcel.writeString(this.f6832k);
        parcel.writeParcelable(this.f6833l, i11);
        parcel.writeParcelable(this.f6834m, i11);
        parcel.writeString(this.f6835n);
    }

    public l(Parcel parcel) {
        super(parcel);
        this.f6824c = parcel.readString();
        this.f6825d = parcel.readString();
        this.f6826e = parcel.readString();
        try {
            this.f6827f = atd.e.a.a(parcel.readString());
            this.f6828g = parcel.readString();
            this.f6829h = parcel.readString();
            this.f6830i = parcel.readString();
            this.f6831j = parcel.readString();
            this.f6832k = parcel.readString();
            this.f6833l = (g) parcel.readParcelable(g.class.getClassLoader());
            this.f6834m = (g) parcel.readParcelable(g.class.getClassLoader());
            this.f6835n = parcel.readString();
        } catch (atd.a0.a e11) {
            throw new RuntimeException(e11.getMessage(), e11);
        }
    }
}