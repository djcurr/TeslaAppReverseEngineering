package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class a extends VersionedParcel {

    /* renamed from: d  reason: collision with root package name */
    private final SparseIntArray f6367d;

    /* renamed from: e  reason: collision with root package name */
    private final Parcel f6368e;

    /* renamed from: f  reason: collision with root package name */
    private final int f6369f;

    /* renamed from: g  reason: collision with root package name */
    private final int f6370g;

    /* renamed from: h  reason: collision with root package name */
    private final String f6371h;

    /* renamed from: i  reason: collision with root package name */
    private int f6372i;

    /* renamed from: j  reason: collision with root package name */
    private int f6373j;

    /* renamed from: k  reason: collision with root package name */
    private int f6374k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new androidx.collection.a(), new androidx.collection.a(), new androidx.collection.a());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void A(byte[] bArr) {
        if (bArr != null) {
            this.f6368e.writeInt(bArr.length);
            this.f6368e.writeByteArray(bArr);
            return;
        }
        this.f6368e.writeInt(-1);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f6368e, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void E(int i11) {
        this.f6368e.writeInt(i11);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void G(Parcelable parcelable) {
        this.f6368e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void I(String str) {
        this.f6368e.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void a() {
        int i11 = this.f6372i;
        if (i11 >= 0) {
            int i12 = this.f6367d.get(i11);
            int dataPosition = this.f6368e.dataPosition();
            this.f6368e.setDataPosition(i12);
            this.f6368e.writeInt(dataPosition - i12);
            this.f6368e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected VersionedParcel b() {
        Parcel parcel = this.f6368e;
        int dataPosition = parcel.dataPosition();
        int i11 = this.f6373j;
        if (i11 == this.f6369f) {
            i11 = this.f6370g;
        }
        int i12 = i11;
        return new a(parcel, dataPosition, i12, this.f6371h + "  ", this.f6364a, this.f6365b, this.f6366c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean g() {
        return this.f6368e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] i() {
        int readInt = this.f6368e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f6368e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f6368e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean m(int i11) {
        while (this.f6373j < this.f6370g) {
            int i12 = this.f6374k;
            if (i12 == i11) {
                return true;
            }
            if (String.valueOf(i12).compareTo(String.valueOf(i11)) > 0) {
                return false;
            }
            this.f6368e.setDataPosition(this.f6373j);
            int readInt = this.f6368e.readInt();
            this.f6374k = this.f6368e.readInt();
            this.f6373j += readInt;
        }
        return this.f6374k == i11;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int o() {
        return this.f6368e.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public <T extends Parcelable> T q() {
        return (T) this.f6368e.readParcelable(a.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String s() {
        return this.f6368e.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void w(int i11) {
        a();
        this.f6372i = i11;
        this.f6367d.put(i11, this.f6368e.dataPosition());
        E(0);
        E(i11);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void y(boolean z11) {
        this.f6368e.writeInt(z11 ? 1 : 0);
    }

    private a(Parcel parcel, int i11, int i12, String str, androidx.collection.a<String, Method> aVar, androidx.collection.a<String, Method> aVar2, androidx.collection.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f6367d = new SparseIntArray();
        this.f6372i = -1;
        this.f6373j = 0;
        this.f6374k = -1;
        this.f6368e = parcel;
        this.f6369f = i11;
        this.f6370g = i12;
        this.f6373j = i11;
        this.f6371h = str;
    }
}