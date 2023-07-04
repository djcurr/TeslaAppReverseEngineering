package com.withpersona.sdk.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.g;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk/inquiry/governmentid/RawExtraction;", "Landroid/os/Parcelable;", "", "type", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "government-id_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class RawExtraction implements Parcelable {
    public static final Parcelable.Creator<RawExtraction> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f22396a;

    /* renamed from: b  reason: collision with root package name */
    private final String f22397b;

    /* loaded from: classes6.dex */
    public static final class a implements Parcelable.Creator<RawExtraction> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final RawExtraction createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new RawExtraction(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final RawExtraction[] newArray(int i11) {
            return new RawExtraction[i11];
        }
    }

    public RawExtraction(String type, String value) {
        s.g(type, "type");
        s.g(value, "value");
        this.f22396a = type;
        this.f22397b = value;
    }

    public final String a() {
        return this.f22396a;
    }

    public final String b() {
        return this.f22397b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.f22396a);
        out.writeString(this.f22397b);
    }
}