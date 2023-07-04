package com.plaid.internal;

import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.i4;
import com.plaid.internal.j4;
import expo.modules.contacts.EXColumns;
import g30.b0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;

@kotlinx.serialization.a
/* loaded from: classes2.dex */
public final class h4 {

    /* renamed from: g  reason: collision with root package name */
    public static final b f18687g = new b();
    @nn.c(EXColumns.ID)

    /* renamed from: a  reason: collision with root package name */
    private final String f18688a;
    @nn.c("meta")

    /* renamed from: b  reason: collision with root package name */
    private final j4 f18689b;
    @nn.c("type")

    /* renamed from: c  reason: collision with root package name */
    private final String f18690c;
    @nn.c("subtype")

    /* renamed from: d  reason: collision with root package name */
    private final String f18691d;
    @nn.c("verification_status")

    /* renamed from: e  reason: collision with root package name */
    private final String f18692e;
    @nn.c("balance")

    /* renamed from: f  reason: collision with root package name */
    private final i4 f18693f;

    /* loaded from: classes2.dex */
    public static final class a implements g30.b0<h4> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f18694a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ e30.f f18695b;

        static {
            a aVar = new a();
            f18694a = aVar;
            g30.g1 g1Var = new g30.g1("com.plaid.internal.url.LinkAccountResponseAccount", aVar, 6);
            g1Var.k(EXColumns.ID, true);
            g1Var.k("meta", true);
            g1Var.k("type", true);
            g1Var.k("subtype", true);
            g1Var.k("verification_status", true);
            g1Var.k("balance", true);
            f18695b = g1Var;
        }

        @Override // g30.b0
        public KSerializer<?>[] childSerializers() {
            g30.u1 u1Var = g30.u1.f27647a;
            return new c30.b[]{u1Var, d30.a.o(j4.a.f18873a), d30.a.o(u1Var), d30.a.o(u1Var), d30.a.o(u1Var), d30.a.o(i4.a.f18744a)};
        }

        @Override // c30.a
        public Object deserialize(f30.e decoder) {
            Object obj;
            Object obj2;
            Object obj3;
            Object obj4;
            Object obj5;
            String str;
            int i11;
            kotlin.jvm.internal.s.g(decoder, "decoder");
            e30.f fVar = f18695b;
            f30.c b11 = decoder.b(fVar);
            Object obj6 = null;
            if (b11.n()) {
                String i12 = b11.i(fVar, 0);
                obj5 = b11.A(fVar, 1, j4.a.f18873a, null);
                g30.u1 u1Var = g30.u1.f27647a;
                obj4 = b11.A(fVar, 2, u1Var, null);
                obj3 = b11.A(fVar, 3, u1Var, null);
                obj2 = b11.A(fVar, 4, u1Var, null);
                obj = b11.A(fVar, 5, i4.a.f18744a, null);
                str = i12;
                i11 = 63;
            } else {
                int i13 = 0;
                boolean z11 = true;
                Object obj7 = null;
                Object obj8 = null;
                Object obj9 = null;
                Object obj10 = null;
                String str2 = null;
                while (z11) {
                    int p11 = b11.p(fVar);
                    switch (p11) {
                        case -1:
                            z11 = false;
                            continue;
                        case 0:
                            str2 = b11.i(fVar, 0);
                            i13 |= 1;
                            continue;
                        case 1:
                            obj10 = b11.A(fVar, 1, j4.a.f18873a, obj10);
                            i13 |= 2;
                            break;
                        case 2:
                            obj9 = b11.A(fVar, 2, g30.u1.f27647a, obj9);
                            i13 |= 4;
                            break;
                        case 3:
                            obj8 = b11.A(fVar, 3, g30.u1.f27647a, obj8);
                            i13 |= 8;
                            break;
                        case 4:
                            obj7 = b11.A(fVar, 4, g30.u1.f27647a, obj7);
                            i13 |= 16;
                            break;
                        case 5:
                            obj6 = b11.A(fVar, 5, i4.a.f18744a, obj6);
                            i13 |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(p11);
                    }
                }
                obj = obj6;
                obj2 = obj7;
                obj3 = obj8;
                obj4 = obj9;
                obj5 = obj10;
                str = str2;
                i11 = i13;
            }
            b11.d(fVar);
            return new h4(i11, str, (j4) obj5, (String) obj4, (String) obj3, (String) obj2, (i4) obj);
        }

        @Override // c30.b, c30.h, c30.a
        public e30.f getDescriptor() {
            return f18695b;
        }

        @Override // c30.h
        public void serialize(f30.f encoder, Object obj) {
            h4 value = (h4) obj;
            kotlin.jvm.internal.s.g(encoder, "encoder");
            kotlin.jvm.internal.s.g(value, "value");
            e30.f fVar = f18695b;
            f30.d b11 = encoder.b(fVar);
            h4.a(value, b11, fVar);
            b11.d(fVar);
        }

        @Override // g30.b0
        public KSerializer<?>[] typeParametersSerializers() {
            return b0.a.a(this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
    }

    public h4() {
        this((String) null, (j4) null, (String) null, (String) null, (String) null, (i4) null, 63);
    }

    public /* synthetic */ h4(int i11, String str, j4 j4Var, String str2, String str3, String str4, i4 i4Var) {
        if ((i11 & 0) != 0) {
            g30.f1.a(i11, 0, a.f18694a.getDescriptor());
        }
        this.f18688a = (i11 & 1) == 0 ? "" : str;
        if ((i11 & 2) == 0) {
            this.f18689b = null;
        } else {
            this.f18689b = j4Var;
        }
        if ((i11 & 4) == 0) {
            this.f18690c = null;
        } else {
            this.f18690c = str2;
        }
        if ((i11 & 8) == 0) {
            this.f18691d = null;
        } else {
            this.f18691d = str3;
        }
        if ((i11 & 16) == 0) {
            this.f18692e = null;
        } else {
            this.f18692e = str4;
        }
        if ((i11 & 32) == 0) {
            this.f18693f = null;
        } else {
            this.f18693f = i4Var;
        }
    }

    public static final void a(h4 self, f30.d output, e30.f serialDesc) {
        kotlin.jvm.internal.s.g(self, "self");
        kotlin.jvm.internal.s.g(output, "output");
        kotlin.jvm.internal.s.g(serialDesc, "serialDesc");
        boolean z11 = false;
        if (output.k(serialDesc, 0) || !kotlin.jvm.internal.s.c(self.f18688a, "")) {
            output.p(serialDesc, 0, self.f18688a);
        }
        if (output.k(serialDesc, 1) || self.f18689b != null) {
            output.D(serialDesc, 1, j4.a.f18873a, self.f18689b);
        }
        if (output.k(serialDesc, 2) || self.f18690c != null) {
            output.D(serialDesc, 2, g30.u1.f27647a, self.f18690c);
        }
        if (output.k(serialDesc, 3) || self.f18691d != null) {
            output.D(serialDesc, 3, g30.u1.f27647a, self.f18691d);
        }
        if (output.k(serialDesc, 4) || self.f18692e != null) {
            output.D(serialDesc, 4, g30.u1.f27647a, self.f18692e);
        }
        if (output.k(serialDesc, 5) || self.f18693f != null) {
            z11 = true;
        }
        if (z11) {
            output.D(serialDesc, 5, i4.a.f18744a, self.f18693f);
        }
    }

    public final j4 b() {
        return this.f18689b;
    }

    public final String c() {
        return this.f18691d;
    }

    public final String d() {
        return this.f18690c;
    }

    public final String e() {
        return this.f18692e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h4) {
            h4 h4Var = (h4) obj;
            return kotlin.jvm.internal.s.c(this.f18688a, h4Var.f18688a) && kotlin.jvm.internal.s.c(this.f18689b, h4Var.f18689b) && kotlin.jvm.internal.s.c(this.f18690c, h4Var.f18690c) && kotlin.jvm.internal.s.c(this.f18691d, h4Var.f18691d) && kotlin.jvm.internal.s.c(this.f18692e, h4Var.f18692e) && kotlin.jvm.internal.s.c(this.f18693f, h4Var.f18693f);
        }
        return false;
    }

    public final String f() {
        return this.f18688a;
    }

    public int hashCode() {
        int hashCode = this.f18688a.hashCode() * 31;
        j4 j4Var = this.f18689b;
        int hashCode2 = (hashCode + (j4Var == null ? 0 : j4Var.hashCode())) * 31;
        String str = this.f18690c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18691d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f18692e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        i4 i4Var = this.f18693f;
        return hashCode5 + (i4Var != null ? i4Var.hashCode() : 0);
    }

    public String toString() {
        StringBuilder a11 = g4.a("LinkAccountResponseAccount(_id=");
        a11.append(this.f18688a);
        a11.append(", meta=");
        a11.append(this.f18689b);
        a11.append(", type=");
        a11.append((Object) this.f18690c);
        a11.append(", subtype=");
        a11.append((Object) this.f18691d);
        a11.append(", verification_status=");
        a11.append((Object) this.f18692e);
        a11.append(", balance=");
        a11.append(this.f18693f);
        a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return a11.toString();
    }

    public h4(String _id, j4 j4Var, String str, String str2, String str3, i4 i4Var) {
        kotlin.jvm.internal.s.g(_id, "_id");
        this.f18688a = _id;
        this.f18689b = j4Var;
        this.f18690c = str;
        this.f18691d = str2;
        this.f18692e = str3;
        this.f18693f = i4Var;
    }

    public final i4 a() {
        return this.f18693f;
    }

    public /* synthetic */ h4(String str, j4 j4Var, String str2, String str3, String str4, i4 i4Var, int i11) {
        this((i11 & 1) != 0 ? "" : null, null, null, null, null, null);
    }
}