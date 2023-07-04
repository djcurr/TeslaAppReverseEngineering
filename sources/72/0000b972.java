package v6;

import ch.qos.logback.core.CoreConstants;
import java.util.List;

/* loaded from: classes.dex */
public final class n implements e7.j {

    /* renamed from: a  reason: collision with root package name */
    private final j7.a<String> f54188a;

    /* renamed from: b  reason: collision with root package name */
    private final j7.a<x6.c> f54189b;

    /* renamed from: c  reason: collision with root package name */
    private final j7.a<String> f54190c;

    /* renamed from: d  reason: collision with root package name */
    private final j7.a<String> f54191d;

    /* renamed from: e  reason: collision with root package name */
    private final j7.a<String> f54192e;

    /* renamed from: f  reason: collision with root package name */
    private final j7.a<String> f54193f;

    /* renamed from: g  reason: collision with root package name */
    private final j7.a<String> f54194g;

    /* renamed from: h  reason: collision with root package name */
    private final e f54195h;

    /* renamed from: i  reason: collision with root package name */
    private final j7.a<r> f54196i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f54197j;

    /* renamed from: k  reason: collision with root package name */
    private final p f54198k;

    /* renamed from: l  reason: collision with root package name */
    private final p f54199l;

    /* renamed from: m  reason: collision with root package name */
    private final List<x6.b> f54200m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f54201n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f54202o;

    /* renamed from: p  reason: collision with root package name */
    private final c f54203p;

    /* renamed from: q  reason: collision with root package name */
    private final List<r> f54204q;

    /* renamed from: r  reason: collision with root package name */
    private final List<a7.a> f54205r;

    /* renamed from: s  reason: collision with root package name */
    private final List<a7.a> f54206s;

    public n(j7.a<String> cardNumberState, j7.a<x6.c> expiryDateState, j7.a<String> securityCodeState, j7.a<String> holderNameState, j7.a<String> socialSecurityNumberState, j7.a<String> kcpBirthDateOrTaxNumberState, j7.a<String> kcpCardPasswordState, e addressState, j7.a<r> installmentState, boolean z11, p cvcUIState, p expiryDateUIState, List<x6.b> detectedCardTypes, boolean z12, boolean z13, c addressUIState, List<r> installmentOptions, List<a7.a> countryOptions, List<a7.a> stateOptions) {
        kotlin.jvm.internal.s.g(cardNumberState, "cardNumberState");
        kotlin.jvm.internal.s.g(expiryDateState, "expiryDateState");
        kotlin.jvm.internal.s.g(securityCodeState, "securityCodeState");
        kotlin.jvm.internal.s.g(holderNameState, "holderNameState");
        kotlin.jvm.internal.s.g(socialSecurityNumberState, "socialSecurityNumberState");
        kotlin.jvm.internal.s.g(kcpBirthDateOrTaxNumberState, "kcpBirthDateOrTaxNumberState");
        kotlin.jvm.internal.s.g(kcpCardPasswordState, "kcpCardPasswordState");
        kotlin.jvm.internal.s.g(addressState, "addressState");
        kotlin.jvm.internal.s.g(installmentState, "installmentState");
        kotlin.jvm.internal.s.g(cvcUIState, "cvcUIState");
        kotlin.jvm.internal.s.g(expiryDateUIState, "expiryDateUIState");
        kotlin.jvm.internal.s.g(detectedCardTypes, "detectedCardTypes");
        kotlin.jvm.internal.s.g(addressUIState, "addressUIState");
        kotlin.jvm.internal.s.g(installmentOptions, "installmentOptions");
        kotlin.jvm.internal.s.g(countryOptions, "countryOptions");
        kotlin.jvm.internal.s.g(stateOptions, "stateOptions");
        this.f54188a = cardNumberState;
        this.f54189b = expiryDateState;
        this.f54190c = securityCodeState;
        this.f54191d = holderNameState;
        this.f54192e = socialSecurityNumberState;
        this.f54193f = kcpBirthDateOrTaxNumberState;
        this.f54194g = kcpCardPasswordState;
        this.f54195h = addressState;
        this.f54196i = installmentState;
        this.f54197j = z11;
        this.f54198k = cvcUIState;
        this.f54199l = expiryDateUIState;
        this.f54200m = detectedCardTypes;
        this.f54201n = z12;
        this.f54202o = z13;
        this.f54203p = addressUIState;
        this.f54204q = installmentOptions;
        this.f54205r = countryOptions;
        this.f54206s = stateOptions;
    }

    public final e a() {
        return this.f54195h;
    }

    public final c b() {
        return this.f54203p;
    }

    public final j7.a<String> c() {
        return this.f54188a;
    }

    public final List<a7.a> d() {
        return this.f54205r;
    }

    public final List<x6.b> e() {
        return this.f54200m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return kotlin.jvm.internal.s.c(this.f54188a, nVar.f54188a) && kotlin.jvm.internal.s.c(this.f54189b, nVar.f54189b) && kotlin.jvm.internal.s.c(this.f54190c, nVar.f54190c) && kotlin.jvm.internal.s.c(this.f54191d, nVar.f54191d) && kotlin.jvm.internal.s.c(this.f54192e, nVar.f54192e) && kotlin.jvm.internal.s.c(this.f54193f, nVar.f54193f) && kotlin.jvm.internal.s.c(this.f54194g, nVar.f54194g) && kotlin.jvm.internal.s.c(this.f54195h, nVar.f54195h) && kotlin.jvm.internal.s.c(this.f54196i, nVar.f54196i) && this.f54197j == nVar.f54197j && this.f54198k == nVar.f54198k && this.f54199l == nVar.f54199l && kotlin.jvm.internal.s.c(this.f54200m, nVar.f54200m) && this.f54201n == nVar.f54201n && this.f54202o == nVar.f54202o && this.f54203p == nVar.f54203p && kotlin.jvm.internal.s.c(this.f54204q, nVar.f54204q) && kotlin.jvm.internal.s.c(this.f54205r, nVar.f54205r) && kotlin.jvm.internal.s.c(this.f54206s, nVar.f54206s);
        }
        return false;
    }

    public final j7.a<x6.c> f() {
        return this.f54189b;
    }

    public final j7.a<String> g() {
        return this.f54191d;
    }

    public final List<r> h() {
        return this.f54204q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((this.f54188a.hashCode() * 31) + this.f54189b.hashCode()) * 31) + this.f54190c.hashCode()) * 31) + this.f54191d.hashCode()) * 31) + this.f54192e.hashCode()) * 31) + this.f54193f.hashCode()) * 31) + this.f54194g.hashCode()) * 31) + this.f54195h.hashCode()) * 31) + this.f54196i.hashCode()) * 31;
        boolean z11 = this.f54197j;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int hashCode2 = (((((((hashCode + i11) * 31) + this.f54198k.hashCode()) * 31) + this.f54199l.hashCode()) * 31) + this.f54200m.hashCode()) * 31;
        boolean z12 = this.f54201n;
        int i12 = z12;
        if (z12 != 0) {
            i12 = 1;
        }
        int i13 = (hashCode2 + i12) * 31;
        boolean z13 = this.f54202o;
        return ((((((((i13 + (z13 ? 1 : z13 ? 1 : 0)) * 31) + this.f54203p.hashCode()) * 31) + this.f54204q.hashCode()) * 31) + this.f54205r.hashCode()) * 31) + this.f54206s.hashCode();
    }

    public final j7.a<r> i() {
        return this.f54196i;
    }

    public final j7.a<String> j() {
        return this.f54193f;
    }

    public final j7.a<String> k() {
        return this.f54194g;
    }

    public final j7.a<String> l() {
        return this.f54190c;
    }

    public final j7.a<String> m() {
        return this.f54192e;
    }

    public final List<a7.a> n() {
        return this.f54206s;
    }

    public final boolean o() {
        return this.f54197j;
    }

    public boolean p() {
        return this.f54188a.a().a() && this.f54189b.a().a() && this.f54190c.a().a() && this.f54191d.a().a() && this.f54192e.a().a() && this.f54193f.a().a() && this.f54194g.a().a() && this.f54196i.a().a() && this.f54195h.h();
    }

    public String toString() {
        return "CardOutputData(cardNumberState=" + this.f54188a + ", expiryDateState=" + this.f54189b + ", securityCodeState=" + this.f54190c + ", holderNameState=" + this.f54191d + ", socialSecurityNumberState=" + this.f54192e + ", kcpBirthDateOrTaxNumberState=" + this.f54193f + ", kcpCardPasswordState=" + this.f54194g + ", addressState=" + this.f54195h + ", installmentState=" + this.f54196i + ", isStoredPaymentMethodEnable=" + this.f54197j + ", cvcUIState=" + this.f54198k + ", expiryDateUIState=" + this.f54199l + ", detectedCardTypes=" + this.f54200m + ", isSocialSecurityNumberRequired=" + this.f54201n + ", isKCPAuthRequired=" + this.f54202o + ", addressUIState=" + this.f54203p + ", installmentOptions=" + this.f54204q + ", countryOptions=" + this.f54205r + ", stateOptions=" + this.f54206s + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}