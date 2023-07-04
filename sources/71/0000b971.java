package v6;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public final class m implements e7.i {

    /* renamed from: a  reason: collision with root package name */
    private String f54176a;

    /* renamed from: b  reason: collision with root package name */
    private x6.c f54177b;

    /* renamed from: c  reason: collision with root package name */
    private String f54178c;

    /* renamed from: d  reason: collision with root package name */
    private String f54179d;

    /* renamed from: e  reason: collision with root package name */
    private String f54180e;

    /* renamed from: f  reason: collision with root package name */
    private String f54181f;

    /* renamed from: g  reason: collision with root package name */
    private String f54182g;

    /* renamed from: h  reason: collision with root package name */
    private String f54183h;

    /* renamed from: i  reason: collision with root package name */
    private d f54184i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f54185j;

    /* renamed from: k  reason: collision with root package name */
    private int f54186k;

    /* renamed from: l  reason: collision with root package name */
    private r f54187l;

    public m() {
        this(null, null, null, null, null, null, null, null, null, false, 0, null, 4095, null);
    }

    public m(String cardNumber, x6.c expiryDate, String securityCode, String holderName, String socialSecurityNumber, String kcpBirthDateOrTaxNumber, String kcpCardPassword, String postalCode, d address, boolean z11, int i11, r rVar) {
        kotlin.jvm.internal.s.g(cardNumber, "cardNumber");
        kotlin.jvm.internal.s.g(expiryDate, "expiryDate");
        kotlin.jvm.internal.s.g(securityCode, "securityCode");
        kotlin.jvm.internal.s.g(holderName, "holderName");
        kotlin.jvm.internal.s.g(socialSecurityNumber, "socialSecurityNumber");
        kotlin.jvm.internal.s.g(kcpBirthDateOrTaxNumber, "kcpBirthDateOrTaxNumber");
        kotlin.jvm.internal.s.g(kcpCardPassword, "kcpCardPassword");
        kotlin.jvm.internal.s.g(postalCode, "postalCode");
        kotlin.jvm.internal.s.g(address, "address");
        this.f54176a = cardNumber;
        this.f54177b = expiryDate;
        this.f54178c = securityCode;
        this.f54179d = holderName;
        this.f54180e = socialSecurityNumber;
        this.f54181f = kcpBirthDateOrTaxNumber;
        this.f54182g = kcpCardPassword;
        this.f54183h = postalCode;
        this.f54184i = address;
        this.f54185j = z11;
        this.f54186k = i11;
        this.f54187l = rVar;
    }

    public final d a() {
        return this.f54184i;
    }

    public final String b() {
        return this.f54176a;
    }

    public final x6.c c() {
        return this.f54177b;
    }

    public final String d() {
        return this.f54179d;
    }

    public final r e() {
        return this.f54187l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return kotlin.jvm.internal.s.c(this.f54176a, mVar.f54176a) && kotlin.jvm.internal.s.c(this.f54177b, mVar.f54177b) && kotlin.jvm.internal.s.c(this.f54178c, mVar.f54178c) && kotlin.jvm.internal.s.c(this.f54179d, mVar.f54179d) && kotlin.jvm.internal.s.c(this.f54180e, mVar.f54180e) && kotlin.jvm.internal.s.c(this.f54181f, mVar.f54181f) && kotlin.jvm.internal.s.c(this.f54182g, mVar.f54182g) && kotlin.jvm.internal.s.c(this.f54183h, mVar.f54183h) && kotlin.jvm.internal.s.c(this.f54184i, mVar.f54184i) && this.f54185j == mVar.f54185j && this.f54186k == mVar.f54186k && kotlin.jvm.internal.s.c(this.f54187l, mVar.f54187l);
        }
        return false;
    }

    public final String f() {
        return this.f54181f;
    }

    public final String g() {
        return this.f54182g;
    }

    public final String h() {
        return this.f54178c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((this.f54176a.hashCode() * 31) + this.f54177b.hashCode()) * 31) + this.f54178c.hashCode()) * 31) + this.f54179d.hashCode()) * 31) + this.f54180e.hashCode()) * 31) + this.f54181f.hashCode()) * 31) + this.f54182g.hashCode()) * 31) + this.f54183h.hashCode()) * 31) + this.f54184i.hashCode()) * 31;
        boolean z11 = this.f54185j;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int hashCode2 = (((hashCode + i11) * 31) + Integer.hashCode(this.f54186k)) * 31;
        r rVar = this.f54187l;
        return hashCode2 + (rVar == null ? 0 : rVar.hashCode());
    }

    public final int i() {
        return this.f54186k;
    }

    public final String j() {
        return this.f54180e;
    }

    public final boolean k() {
        return this.f54185j;
    }

    public final void l(String str) {
        kotlin.jvm.internal.s.g(str, "<set-?>");
        this.f54176a = str;
    }

    public final void m(x6.c cVar) {
        kotlin.jvm.internal.s.g(cVar, "<set-?>");
        this.f54177b = cVar;
    }

    public String toString() {
        return "CardInputData(cardNumber=" + this.f54176a + ", expiryDate=" + this.f54177b + ", securityCode=" + this.f54178c + ", holderName=" + this.f54179d + ", socialSecurityNumber=" + this.f54180e + ", kcpBirthDateOrTaxNumber=" + this.f54181f + ", kcpCardPassword=" + this.f54182g + ", postalCode=" + this.f54183h + ", address=" + this.f54184i + ", isStorePaymentSelected=" + this.f54185j + ", selectedCardIndex=" + this.f54186k + ", installmentOption=" + this.f54187l + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ m(java.lang.String r21, x6.c r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, v6.d r29, boolean r30, int r31, v6.r r32, int r33, kotlin.jvm.internal.DefaultConstructorMarker r34) {
        /*
            r20 = this;
            r0 = r33
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto La
            r1 = r2
            goto Lc
        La:
            r1 = r21
        Lc:
            r3 = r0 & 2
            if (r3 == 0) goto L18
            x6.c r3 = x6.c.f57131c
            java.lang.String r4 = "EMPTY_DATE"
            kotlin.jvm.internal.s.f(r3, r4)
            goto L1a
        L18:
            r3 = r22
        L1a:
            r4 = r0 & 4
            if (r4 == 0) goto L20
            r4 = r2
            goto L22
        L20:
            r4 = r23
        L22:
            r5 = r0 & 8
            if (r5 == 0) goto L28
            r5 = r2
            goto L2a
        L28:
            r5 = r24
        L2a:
            r6 = r0 & 16
            if (r6 == 0) goto L30
            r6 = r2
            goto L32
        L30:
            r6 = r25
        L32:
            r7 = r0 & 32
            if (r7 == 0) goto L38
            r7 = r2
            goto L3a
        L38:
            r7 = r26
        L3a:
            r8 = r0 & 64
            if (r8 == 0) goto L40
            r8 = r2
            goto L42
        L40:
            r8 = r27
        L42:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L47
            goto L49
        L47:
            r2 = r28
        L49:
            r9 = r0 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L61
            v6.d r9 = new v6.d
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 127(0x7f, float:1.78E-43)
            r19 = 0
            r10 = r9
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L63
        L61:
            r9 = r29
        L63:
            r10 = r0 & 512(0x200, float:7.175E-43)
            r11 = 0
            if (r10 == 0) goto L6a
            r10 = r11
            goto L6c
        L6a:
            r10 = r30
        L6c:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L71
            goto L73
        L71:
            r11 = r31
        L73:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L79
            r0 = 0
            goto L7b
        L79:
            r0 = r32
        L7b:
            r21 = r20
            r22 = r1
            r23 = r3
            r24 = r4
            r25 = r5
            r26 = r6
            r27 = r7
            r28 = r8
            r29 = r2
            r30 = r9
            r31 = r10
            r32 = r11
            r33 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.m.<init>(java.lang.String, x6.c, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, v6.d, boolean, int, v6.r, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}