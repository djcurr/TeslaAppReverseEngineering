package atd.d;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class m extends l {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: o  reason: collision with root package name */
    private final String f6836o;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<m> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public m[] newArray(int i11) {
            return new m[i11];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(JSONObject jSONObject) {
        super(jSONObject);
        try {
            this.f6836o = b(jSONObject, atd.s0.a.a(-92465014827584L));
        } catch (JSONException e11) {
            throw new atd.a0.a(atd.s0.a.a(-92868741753408L), e11, atd.e.c.DATA_ELEMENT_MISSING);
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
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            m mVar = (m) obj;
            String str = this.f6836o;
            if (str != null) {
                return str.equals(mVar.f6836o);
            }
            return mVar.f6836o == null;
        }
        return false;
    }

    @Override // atd.d.l, atd.d.a
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f6836o;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String n() {
        return this.f6836o;
    }

    @Override // atd.d.l, atd.d.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeString(this.f6836o);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public m(Parcel parcel) {
        super(parcel);
        this.f6836o = parcel.readString();
    }
}