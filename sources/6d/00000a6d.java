package atd.d;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q extends m {
    public static final Parcelable.Creator<q> CREATOR = new a();

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<q> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public q createFromParcel(Parcel parcel) {
            return new q(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public q[] newArray(int i11) {
            return new q[i11];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(JSONObject jSONObject) {
        super(jSONObject);
    }

    protected q(Parcel parcel) {
        super(parcel);
    }
}