package com.plaid.internal;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;

@kotlinx.serialization.a
/* loaded from: classes2.dex */
public final class s8 implements Parcelable {
    public static final Parcelable.Creator<s8> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f19432a;

    /* renamed from: b  reason: collision with root package name */
    public final String f19433b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f19434c;

    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<s8> {
        @Override // android.os.Parcelable.Creator
        public s8 createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.s.g(parcel, "parcel");
            return new s8(parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public s8[] newArray(int i11) {
            return new s8[i11];
        }
    }

    public s8() {
        this(false, null, false, 7);
    }

    public s8(boolean z11, String str, boolean z12) {
        this.f19432a = z11;
        this.f19433b = str;
        this.f19434c = z12;
    }

    public static s8 a(s8 s8Var, boolean z11, String str, boolean z12, int i11) {
        if ((i11 & 1) != 0) {
            z11 = s8Var.f19432a;
        }
        if ((i11 & 2) != 0) {
            str = s8Var.f19433b;
        }
        if ((i11 & 4) != 0) {
            z12 = s8Var.f19434c;
        }
        return new s8(z11, str, z12);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s8) {
            s8 s8Var = (s8) obj;
            return this.f19432a == s8Var.f19432a && kotlin.jvm.internal.s.c(this.f19433b, s8Var.f19433b) && this.f19434c == s8Var.f19434c;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z11 = this.f19432a;
        ?? r02 = z11;
        if (z11) {
            r02 = 1;
        }
        int i11 = r02 * 31;
        String str = this.f19433b;
        int hashCode = (i11 + (str == null ? 0 : str.hashCode())) * 31;
        boolean z12 = this.f19434c;
        return hashCode + (z12 ? 1 : z12 ? 1 : 0);
    }

    public String toString() {
        StringBuilder a11 = g4.a("PlaidClientSideOnlyConfiguration(noLoadingUi=");
        a11.append(this.f19432a);
        a11.append(", statusBarColor=");
        a11.append((Object) this.f19433b);
        a11.append(", flagSecureOn=");
        a11.append(this.f19434c);
        a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return a11.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        kotlin.jvm.internal.s.g(out, "out");
        out.writeInt(this.f19432a ? 1 : 0);
        out.writeString(this.f19433b);
        out.writeInt(this.f19434c ? 1 : 0);
    }

    public /* synthetic */ s8(boolean z11, String str, boolean z12, int i11) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? false : z12);
    }
}