package atd.d;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a extends k implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0123a();

    /* renamed from: a  reason: collision with root package name */
    private final atd.e.b f6786a;

    /* renamed from: b  reason: collision with root package name */
    private final atd.e.a f6787b;

    /* renamed from: atd.d.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0123a implements Parcelable.Creator<a> {
        C0123a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a[] newArray(int i11) {
            return new a[i11];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6788a;

        static {
            int[] iArr = new int[atd.e.b.values().length];
            f6788a = iArr;
            try {
                iArr[atd.e.b.SINGLE_TEXT_INPUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6788a[atd.e.b.SINGLE_SELECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6788a[atd.e.b.MULTI_SELECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6788a[atd.e.b.OUT_OF_BAND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6788a[atd.e.b.HTML_UI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(JSONObject jSONObject) {
        super(jSONObject);
        try {
            this.f6786a = atd.e.b.a(jSONObject.getInt(atd.s0.a.a(-99311192697408L)));
            this.f6787b = atd.e.a.a(b(jSONObject, atd.s0.a.a(-99336962501184L)));
        } catch (JSONException e11) {
            throw new atd.a0.a(atd.s0.a.a(-98619702962752L), e11, atd.e.c.DATA_ELEMENT_MISSING);
        }
    }

    public static a a(JSONObject jSONObject) {
        try {
            int i11 = jSONObject.getInt(atd.s0.a.a(-99379912174144L));
            int i12 = b.f6788a[atd.e.b.a(i11).ordinal()];
            if (i12 != 1) {
                if (i12 == 2 || i12 == 3) {
                    return new o(jSONObject);
                }
                if (i12 != 4) {
                    if (i12 == 5) {
                        return new f(jSONObject);
                    }
                    throw new RuntimeException(atd.s0.a.a(-99482991389248L) + i11);
                }
                return new n(jSONObject);
            }
            return new q(jSONObject);
        } catch (JSONException e11) {
            throw new atd.a0.a(atd.s0.a.a(-99405681977920L), e11, atd.e.c.MESSAGE_RECEIVED_INVALID);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6786a == aVar.f6786a && this.f6787b == aVar.f6787b;
    }

    public int hashCode() {
        atd.e.b bVar = this.f6786a;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        atd.e.a aVar = this.f6787b;
        return hashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f6786a.a());
        parcel.writeString(this.f6787b.name());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Parcel parcel) {
        super(parcel);
        try {
            this.f6786a = atd.e.b.a(parcel.readInt());
            this.f6787b = atd.e.a.a(parcel.readString());
        } catch (atd.a0.a e11) {
            throw new RuntimeException(e11.getMessage(), e11);
        }
    }

    public atd.e.b a() {
        return this.f6786a;
    }
}