package atd.d;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class p extends k implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f6842a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6843b;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<p> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public p createFromParcel(Parcel parcel) {
            return new p(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public p[] newArray(int i11) {
            return new p[i11];
        }
    }

    p(JSONObject jSONObject) {
        super(jSONObject);
        String next = jSONObject.keys().next();
        this.f6842a = next;
        this.f6843b = jSONObject.getString(next);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<p> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            arrayList.add(new p(jSONArray.getJSONObject(i11)));
        }
        return arrayList;
    }

    public String b() {
        return this.f6843b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        String str = this.f6842a;
        if (str == null ? pVar.f6842a == null : str.equals(pVar.f6842a)) {
            String str2 = this.f6843b;
            String str3 = pVar.f6843b;
            return str2 != null ? str2.equals(str3) : str3 == null;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f6842a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f6843b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f6842a);
        parcel.writeString(this.f6843b);
    }

    protected p(Parcel parcel) {
        super(parcel);
        this.f6842a = parcel.readString();
        this.f6843b = parcel.readString();
    }

    public String a() {
        return this.f6842a;
    }
}