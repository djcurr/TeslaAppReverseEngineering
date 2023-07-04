package com.stripe.android.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class StripeFile implements StripeModel {
    public static final Parcelable.Creator<StripeFile> CREATOR = new Creator();
    private final Long created;
    private final String filename;

    /* renamed from: id  reason: collision with root package name */
    private final String f20900id;
    private final StripeFilePurpose purpose;
    private final Integer size;
    private final String title;
    private final String type;
    private final String url;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<StripeFile> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StripeFile createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new StripeFile(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : StripeFilePurpose.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StripeFile[] newArray(int i11) {
            return new StripeFile[i11];
        }
    }

    public StripeFile() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public StripeFile(String str, Long l11, String str2, StripeFilePurpose stripeFilePurpose, Integer num, String str3, String str4, String str5) {
        this.f20900id = str;
        this.created = l11;
        this.filename = str2;
        this.purpose = stripeFilePurpose;
        this.size = num;
        this.title = str3;
        this.type = str4;
        this.url = str5;
    }

    public final String component1() {
        return this.f20900id;
    }

    public final Long component2() {
        return this.created;
    }

    public final String component3() {
        return this.filename;
    }

    public final StripeFilePurpose component4() {
        return this.purpose;
    }

    public final Integer component5() {
        return this.size;
    }

    public final String component6() {
        return this.title;
    }

    public final String component7() {
        return this.type;
    }

    public final String component8() {
        return this.url;
    }

    public final StripeFile copy(String str, Long l11, String str2, StripeFilePurpose stripeFilePurpose, Integer num, String str3, String str4, String str5) {
        return new StripeFile(str, l11, str2, stripeFilePurpose, num, str3, str4, str5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StripeFile) {
            StripeFile stripeFile = (StripeFile) obj;
            return s.c(this.f20900id, stripeFile.f20900id) && s.c(this.created, stripeFile.created) && s.c(this.filename, stripeFile.filename) && this.purpose == stripeFile.purpose && s.c(this.size, stripeFile.size) && s.c(this.title, stripeFile.title) && s.c(this.type, stripeFile.type) && s.c(this.url, stripeFile.url);
        }
        return false;
    }

    public final Long getCreated() {
        return this.created;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final String getId() {
        return this.f20900id;
    }

    public final StripeFilePurpose getPurpose() {
        return this.purpose;
    }

    public final Integer getSize() {
        return this.size;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        String str = this.f20900id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l11 = this.created;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str2 = this.filename;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        StripeFilePurpose stripeFilePurpose = this.purpose;
        int hashCode4 = (hashCode3 + (stripeFilePurpose == null ? 0 : stripeFilePurpose.hashCode())) * 31;
        Integer num = this.size;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.title;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.type;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.url;
        return hashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "StripeFile(id=" + ((Object) this.f20900id) + ", created=" + this.created + ", filename=" + ((Object) this.filename) + ", purpose=" + this.purpose + ", size=" + this.size + ", title=" + ((Object) this.title) + ", type=" + ((Object) this.type) + ", url=" + ((Object) this.url) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.f20900id);
        Long l11 = this.created;
        if (l11 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l11.longValue());
        }
        out.writeString(this.filename);
        StripeFilePurpose stripeFilePurpose = this.purpose;
        if (stripeFilePurpose == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(stripeFilePurpose.name());
        }
        Integer num = this.size;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeString(this.title);
        out.writeString(this.type);
        out.writeString(this.url);
    }

    public /* synthetic */ StripeFile(String str, Long l11, String str2, StripeFilePurpose stripeFilePurpose, Integer num, String str3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : l11, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : stripeFilePurpose, (i11 & 16) != 0 ? null : num, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : str4, (i11 & 128) == 0 ? str5 : null);
    }
}