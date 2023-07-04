package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.k;
import vz.m;

/* loaded from: classes2.dex */
public abstract class LinkAccountType implements Parcelable {
    public static final Companion Companion = new Companion(null);
    private static final k<Map<String, LinkAccountType>> jsonToObject$delegate;
    private final String json;

    /* loaded from: classes2.dex */
    public static final class CREDIT extends LinkAccountType {
        public static final CREDIT INSTANCE = new CREDIT();
        public static final Parcelable.Creator<CREDIT> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<CREDIT> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CREDIT createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return CREDIT.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CREDIT[] newArray(int i11) {
                return new CREDIT[i11];
            }
        }

        private CREDIT() {
            super("credit", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Map<String, LinkAccountType> getJsonToObject() {
            return (Map) LinkAccountType.jsonToObject$delegate.getValue();
        }

        public final LinkAccountType convert(String str) {
            LinkAccountType linkAccountType = getJsonToObject().get(str);
            if (linkAccountType == null) {
                if (str == null) {
                    str = "";
                }
                linkAccountType = new UNKNOWN(str);
            }
            return linkAccountType;
        }
    }

    /* loaded from: classes2.dex */
    public static final class DEPOSITORY extends LinkAccountType {
        public static final DEPOSITORY INSTANCE = new DEPOSITORY();
        public static final Parcelable.Creator<DEPOSITORY> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<DEPOSITORY> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DEPOSITORY createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return DEPOSITORY.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DEPOSITORY[] newArray(int i11) {
                return new DEPOSITORY[i11];
            }
        }

        private DEPOSITORY() {
            super("depository", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes2.dex */
    public static final class INVESTMENT extends LinkAccountType {
        public static final INVESTMENT INSTANCE = new INVESTMENT();
        public static final Parcelable.Creator<INVESTMENT> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<INVESTMENT> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final INVESTMENT createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return INVESTMENT.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final INVESTMENT[] newArray(int i11) {
                return new INVESTMENT[i11];
            }
        }

        private INVESTMENT() {
            super("investment", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes2.dex */
    public static final class LOAN extends LinkAccountType {
        public static final LOAN INSTANCE = new LOAN();
        public static final Parcelable.Creator<LOAN> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<LOAN> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LOAN createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return LOAN.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LOAN[] newArray(int i11) {
                return new LOAN[i11];
            }
        }

        private LOAN() {
            super("loan", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes2.dex */
    public static final class OTHER extends LinkAccountType {
        public static final OTHER INSTANCE = new OTHER();
        public static final Parcelable.Creator<OTHER> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<OTHER> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OTHER createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return OTHER.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OTHER[] newArray(int i11) {
                return new OTHER[i11];
            }
        }

        private OTHER() {
            super("other", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes2.dex */
    public static final class UNKNOWN extends LinkAccountType {
        public static final Parcelable.Creator<UNKNOWN> CREATOR = new Creator();
        private final String name;

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<UNKNOWN> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UNKNOWN createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new UNKNOWN(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UNKNOWN[] newArray(int i11) {
                return new UNKNOWN[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UNKNOWN(String name) {
            super(name, null);
            s.g(name, "name");
            this.name = name;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (s.c(UNKNOWN.class, obj == null ? null : obj.getClass())) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.plaid.link.result.LinkAccountType.UNKNOWN");
                return s.c(this.name, ((UNKNOWN) obj).name);
            }
            return false;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.name);
        }
    }

    static {
        k<Map<String, LinkAccountType>> a11;
        a11 = m.a(LinkAccountType$Companion$jsonToObject$2.INSTANCE);
        jsonToObject$delegate = a11;
    }

    private LinkAccountType(String str) {
        this.json = str;
    }

    public /* synthetic */ LinkAccountType(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String getJson() {
        return this.json;
    }

    public /* synthetic */ LinkAccountType(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, null);
    }
}