package t6;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class d implements e7.i {

    /* renamed from: a  reason: collision with root package name */
    private String f51674a;

    /* renamed from: b  reason: collision with root package name */
    private String f51675b;

    /* renamed from: c  reason: collision with root package name */
    private String f51676c;

    /* renamed from: d  reason: collision with root package name */
    private String f51677d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f51678e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f51679f;

    /* renamed from: g  reason: collision with root package name */
    private com.adyen.checkout.bacs.a f51680g;

    public d() {
        this(null, null, null, null, false, false, null, 127, null);
    }

    public d(String holderName, String bankAccountNumber, String sortCode, String shopperEmail, boolean z11, boolean z12, com.adyen.checkout.bacs.a mode) {
        kotlin.jvm.internal.s.g(holderName, "holderName");
        kotlin.jvm.internal.s.g(bankAccountNumber, "bankAccountNumber");
        kotlin.jvm.internal.s.g(sortCode, "sortCode");
        kotlin.jvm.internal.s.g(shopperEmail, "shopperEmail");
        kotlin.jvm.internal.s.g(mode, "mode");
        this.f51674a = holderName;
        this.f51675b = bankAccountNumber;
        this.f51676c = sortCode;
        this.f51677d = shopperEmail;
        this.f51678e = z11;
        this.f51679f = z12;
        this.f51680g = mode;
    }

    public final String a() {
        return this.f51675b;
    }

    public final String b() {
        return this.f51674a;
    }

    public final com.adyen.checkout.bacs.a c() {
        return this.f51680g;
    }

    public final String d() {
        return this.f51677d;
    }

    public final String e() {
        return this.f51676c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return kotlin.jvm.internal.s.c(this.f51674a, dVar.f51674a) && kotlin.jvm.internal.s.c(this.f51675b, dVar.f51675b) && kotlin.jvm.internal.s.c(this.f51676c, dVar.f51676c) && kotlin.jvm.internal.s.c(this.f51677d, dVar.f51677d) && this.f51678e == dVar.f51678e && this.f51679f == dVar.f51679f && this.f51680g == dVar.f51680g;
        }
        return false;
    }

    public final boolean f() {
        return this.f51679f;
    }

    public final boolean g() {
        return this.f51678e;
    }

    public final void h(boolean z11) {
        this.f51679f = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f51674a.hashCode() * 31) + this.f51675b.hashCode()) * 31) + this.f51676c.hashCode()) * 31) + this.f51677d.hashCode()) * 31;
        boolean z11 = this.f51678e;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode + i11) * 31;
        boolean z12 = this.f51679f;
        return ((i12 + (z12 ? 1 : z12 ? 1 : 0)) * 31) + this.f51680g.hashCode();
    }

    public final void i(boolean z11) {
        this.f51678e = z11;
    }

    public final void j(String str) {
        kotlin.jvm.internal.s.g(str, "<set-?>");
        this.f51675b = str;
    }

    public final void k(String str) {
        kotlin.jvm.internal.s.g(str, "<set-?>");
        this.f51674a = str;
    }

    public final void l(com.adyen.checkout.bacs.a aVar) {
        kotlin.jvm.internal.s.g(aVar, "<set-?>");
        this.f51680g = aVar;
    }

    public final void m(String str) {
        kotlin.jvm.internal.s.g(str, "<set-?>");
        this.f51677d = str;
    }

    public final void n(String str) {
        kotlin.jvm.internal.s.g(str, "<set-?>");
        this.f51676c = str;
    }

    public String toString() {
        return "BacsDirectDebitInputData(holderName=" + this.f51674a + ", bankAccountNumber=" + this.f51675b + ", sortCode=" + this.f51676c + ", shopperEmail=" + this.f51677d + ", isAmountConsentChecked=" + this.f51678e + ", isAccountConsentChecked=" + this.f51679f + ", mode=" + this.f51680g + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ d(String str, String str2, String str3, String str4, boolean z11, boolean z12, com.adyen.checkout.bacs.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) == 0 ? str4 : "", (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? false : z12, (i11 & 64) != 0 ? com.adyen.checkout.bacs.a.INPUT : aVar);
    }
}