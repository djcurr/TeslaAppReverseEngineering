package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.g4;
import kotlin.jvm.internal.s;
import nn.c;

/* loaded from: classes2.dex */
public final class LinkInstitution implements Parcelable {
    public static final Parcelable.Creator<LinkInstitution> CREATOR = new Creator();
    @c("institution_id")

    /* renamed from: id  reason: collision with root package name */
    private final String f19993id;
    @c("institution_name")
    private final String name;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<LinkInstitution> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkInstitution createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new LinkInstitution(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkInstitution[] newArray(int i11) {
            return new LinkInstitution[i11];
        }
    }

    public LinkInstitution(String id2, String name) {
        s.g(id2, "id");
        s.g(name, "name");
        this.f19993id = id2;
        this.name = name;
    }

    public static /* synthetic */ LinkInstitution copy$default(LinkInstitution linkInstitution, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = linkInstitution.f19993id;
        }
        if ((i11 & 2) != 0) {
            str2 = linkInstitution.name;
        }
        return linkInstitution.copy(str, str2);
    }

    public final String component1() {
        return this.f19993id;
    }

    public final String component2() {
        return this.name;
    }

    public final LinkInstitution copy(String id2, String name) {
        s.g(id2, "id");
        s.g(name, "name");
        return new LinkInstitution(id2, name);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LinkInstitution) {
            LinkInstitution linkInstitution = (LinkInstitution) obj;
            return s.c(this.f19993id, linkInstitution.f19993id) && s.c(this.name, linkInstitution.name);
        }
        return false;
    }

    public final String getId() {
        return this.f19993id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode() + (this.f19993id.hashCode() * 31);
    }

    public String toString() {
        StringBuilder a11 = g4.a("LinkInstitution(id=");
        a11.append(this.f19993id);
        a11.append(", name=");
        a11.append(this.name);
        a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return a11.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.f19993id);
        out.writeString(this.name);
    }
}