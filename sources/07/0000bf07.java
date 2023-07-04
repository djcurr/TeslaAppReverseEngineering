package x6;

import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.card.api.model.Brand;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final a f57124a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f57125b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f57126c;

    /* renamed from: d  reason: collision with root package name */
    private final Brand.c f57127d;

    /* renamed from: e  reason: collision with root package name */
    private final Brand.c f57128e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f57129f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f57130g;

    public b(a cardType, boolean z11, boolean z12, Brand.c cvcPolicy, Brand.c expiryDatePolicy, boolean z13, boolean z14) {
        s.g(cardType, "cardType");
        s.g(cvcPolicy, "cvcPolicy");
        s.g(expiryDatePolicy, "expiryDatePolicy");
        this.f57124a = cardType;
        this.f57125b = z11;
        this.f57126c = z12;
        this.f57127d = cvcPolicy;
        this.f57128e = expiryDatePolicy;
        this.f57129f = z13;
        this.f57130g = z14;
    }

    public static /* synthetic */ b b(b bVar, a aVar, boolean z11, boolean z12, Brand.c cVar, Brand.c cVar2, boolean z13, boolean z14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = bVar.f57124a;
        }
        if ((i11 & 2) != 0) {
            z11 = bVar.f57125b;
        }
        boolean z15 = z11;
        if ((i11 & 4) != 0) {
            z12 = bVar.f57126c;
        }
        boolean z16 = z12;
        if ((i11 & 8) != 0) {
            cVar = bVar.f57127d;
        }
        Brand.c cVar3 = cVar;
        if ((i11 & 16) != 0) {
            cVar2 = bVar.f57128e;
        }
        Brand.c cVar4 = cVar2;
        if ((i11 & 32) != 0) {
            z13 = bVar.f57129f;
        }
        boolean z17 = z13;
        if ((i11 & 64) != 0) {
            z14 = bVar.f57130g;
        }
        return bVar.a(aVar, z15, z16, cVar3, cVar4, z17, z14);
    }

    public final b a(a cardType, boolean z11, boolean z12, Brand.c cvcPolicy, Brand.c expiryDatePolicy, boolean z13, boolean z14) {
        s.g(cardType, "cardType");
        s.g(cvcPolicy, "cvcPolicy");
        s.g(expiryDatePolicy, "expiryDatePolicy");
        return new b(cardType, z11, z12, cvcPolicy, expiryDatePolicy, z13, z14);
    }

    public final a c() {
        return this.f57124a;
    }

    public final Brand.c d() {
        return this.f57127d;
    }

    public final boolean e() {
        return this.f57126c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f57124a == bVar.f57124a && this.f57125b == bVar.f57125b && this.f57126c == bVar.f57126c && this.f57127d == bVar.f57127d && this.f57128e == bVar.f57128e && this.f57129f == bVar.f57129f && this.f57130g == bVar.f57130g;
        }
        return false;
    }

    public final Brand.c f() {
        return this.f57128e;
    }

    public final boolean g() {
        return this.f57125b;
    }

    public final boolean h() {
        return this.f57130g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f57124a.hashCode() * 31;
        boolean z11 = this.f57125b;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode + i11) * 31;
        boolean z12 = this.f57126c;
        int i13 = z12;
        if (z12 != 0) {
            i13 = 1;
        }
        int hashCode2 = (((((i12 + i13) * 31) + this.f57127d.hashCode()) * 31) + this.f57128e.hashCode()) * 31;
        boolean z13 = this.f57129f;
        int i14 = z13;
        if (z13 != 0) {
            i14 = 1;
        }
        int i15 = (hashCode2 + i14) * 31;
        boolean z14 = this.f57130g;
        return i15 + (z14 ? 1 : z14 ? 1 : 0);
    }

    public final boolean i() {
        return this.f57129f;
    }

    public String toString() {
        return "DetectedCardType(cardType=" + this.f57124a + ", isReliable=" + this.f57125b + ", enableLuhnCheck=" + this.f57126c + ", cvcPolicy=" + this.f57127d + ", expiryDatePolicy=" + this.f57128e + ", isSupported=" + this.f57129f + ", isSelected=" + this.f57130g + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ b(a aVar, boolean z11, boolean z12, Brand.c cVar, Brand.c cVar2, boolean z13, boolean z14, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, z11, z12, cVar, cVar2, z13, (i11 & 64) != 0 ? false : z14);
    }
}