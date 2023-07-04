package atd.d;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class o extends m {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* renamed from: p  reason: collision with root package name */
    private final List<p> f6841p;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<o> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public o createFromParcel(Parcel parcel) {
            return new o(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public o[] newArray(int i11) {
            return new o[i11];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(JSONObject jSONObject) {
        super(jSONObject);
        try {
            List<p> a11 = p.a(jSONObject.getJSONArray(atd.s0.a.a(-92353345677888L)));
            this.f6841p = a11;
            if (a11.isEmpty()) {
                throw new atd.a0.a(atd.s0.a.a(-92164367116864L), atd.e.c.DATA_ELEMENT_MISSING);
            }
        } catch (JSONException e11) {
            throw new atd.a0.a(atd.s0.a.a(-91421337774656L), e11, atd.e.c.DATA_ELEMENT_MISSING);
        }
    }

    @Override // atd.d.m, atd.d.l, atd.d.a, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // atd.d.m, atd.d.l, atd.d.a
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass() && super.equals(obj)) {
            List<p> list = this.f6841p;
            List<p> list2 = ((o) obj).f6841p;
            return list != null ? list.equals(list2) : list2 == null;
        }
        return false;
    }

    @Override // atd.d.m, atd.d.l, atd.d.a
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        List<p> list = this.f6841p;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public List<p> o() {
        return this.f6841p;
    }

    @Override // atd.d.m, atd.d.l, atd.d.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeTypedList(this.f6841p);
    }

    protected o(Parcel parcel) {
        super(parcel);
        this.f6841p = parcel.createTypedArrayList(p.CREATOR);
    }
}