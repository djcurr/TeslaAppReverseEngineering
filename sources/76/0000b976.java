package v6;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.core.exception.CheckoutException;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v6.t;

/* loaded from: classes.dex */
public final class q implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR;

    /* renamed from: a  reason: collision with root package name */
    private final t.c f54208a;

    /* renamed from: b  reason: collision with root package name */
    private final List<t.a> f54209b;

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<q> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public q createFromParcel(Parcel source) {
            kotlin.jvm.internal.s.g(source, "source");
            return new q(source, (DefaultConstructorMarker) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public q[] newArray(int i11) {
            return new q[i11];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public q() {
        this(null, null, 3, null);
    }

    public /* synthetic */ q(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    public q(t.c cVar, List<t.a> cardBasedOptions) {
        kotlin.jvm.internal.s.g(cardBasedOptions, "cardBasedOptions");
        this.f54208a = cVar;
        this.f54209b = cardBasedOptions;
        b7.f fVar = b7.f.f7525a;
        if (fVar.b(cardBasedOptions)) {
            if (!fVar.a(this)) {
                throw new CheckoutException("Installment Configuration contains invalid values for options. Values must be greater than 1.");
            }
            return;
        }
        throw new CheckoutException("Installment Configuration has multiple rules for same card type.");
    }

    public final List<t.a> a() {
        return this.f54209b;
    }

    public final t.c b() {
        return this.f54208a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            return kotlin.jvm.internal.s.c(this.f54208a, qVar.f54208a) && kotlin.jvm.internal.s.c(this.f54209b, qVar.f54209b);
        }
        return false;
    }

    public int hashCode() {
        t.c cVar = this.f54208a;
        return ((cVar == null ? 0 : cVar.hashCode()) * 31) + this.f54209b.hashCode();
    }

    public String toString() {
        return "InstallmentConfiguration(defaultOptions=" + this.f54208a + ", cardBasedOptions=" + this.f54209b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i11) {
        kotlin.jvm.internal.s.g(dest, "dest");
        dest.writeParcelable(this.f54208a, i11);
        dest.writeList(this.f54209b);
    }

    public /* synthetic */ q(t.c cVar, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : cVar, (i11 & 2) != 0 ? wz.w.i() : list);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private q(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.Class<v6.t$c> r0 = v6.t.c.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r3.readParcelable(r0)
            v6.t$c r0 = (v6.t.c) r0
            java.lang.Class<v6.t$a> r1 = v6.t.a.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.util.ArrayList r3 = r3.readArrayList(r1)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.List<com.adyen.checkout.card.InstallmentOptions.CardBasedInstallmentOptions>"
            java.util.Objects.requireNonNull(r3, r1)
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.q.<init>(android.os.Parcel):void");
    }
}