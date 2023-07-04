package com.plaid.internal;

import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.y6;
import g30.b0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;

@kotlinx.serialization.a
/* loaded from: classes2.dex */
public final class i4 {
    @nn.c("available")

    /* renamed from: a  reason: collision with root package name */
    private final Double f18740a;
    @nn.c("current")

    /* renamed from: b  reason: collision with root package name */
    private final Double f18741b;
    @nn.c("currency")

    /* renamed from: c  reason: collision with root package name */
    private final String f18742c;
    @nn.c("localized")

    /* renamed from: d  reason: collision with root package name */
    private final y6 f18743d;

    /* loaded from: classes2.dex */
    public static final class a implements g30.b0<i4> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f18744a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ e30.f f18745b;

        static {
            a aVar = new a();
            f18744a = aVar;
            g30.g1 g1Var = new g30.g1("com.plaid.internal.url.LinkAccountResponseBalance", aVar, 4);
            g1Var.k("available", true);
            g1Var.k("current", true);
            g1Var.k("currency", true);
            g1Var.k("localized", true);
            f18745b = g1Var;
        }

        @Override // g30.b0
        public KSerializer<?>[] childSerializers() {
            g30.u uVar = g30.u.f27643a;
            return new c30.b[]{d30.a.o(uVar), d30.a.o(uVar), d30.a.o(g30.u1.f27647a), d30.a.o(y6.a.f19890a)};
        }

        @Override // c30.a
        public Object deserialize(f30.e decoder) {
            Object obj;
            Object obj2;
            Object obj3;
            Object obj4;
            int i11;
            kotlin.jvm.internal.s.g(decoder, "decoder");
            e30.f fVar = f18745b;
            f30.c b11 = decoder.b(fVar);
            Object obj5 = null;
            if (b11.n()) {
                g30.u uVar = g30.u.f27643a;
                Object A = b11.A(fVar, 0, uVar, null);
                obj4 = b11.A(fVar, 1, uVar, null);
                obj2 = b11.A(fVar, 2, g30.u1.f27647a, null);
                obj3 = b11.A(fVar, 3, y6.a.f19890a, null);
                obj = A;
                i11 = 15;
            } else {
                Object obj6 = null;
                Object obj7 = null;
                obj = null;
                int i12 = 0;
                boolean z11 = true;
                while (z11) {
                    int p11 = b11.p(fVar);
                    if (p11 == -1) {
                        z11 = false;
                    } else if (p11 == 0) {
                        obj = b11.A(fVar, 0, g30.u.f27643a, obj);
                        i12 |= 1;
                    } else if (p11 == 1) {
                        obj7 = b11.A(fVar, 1, g30.u.f27643a, obj7);
                        i12 |= 2;
                    } else if (p11 == 2) {
                        obj6 = b11.A(fVar, 2, g30.u1.f27647a, obj6);
                        i12 |= 4;
                    } else if (p11 != 3) {
                        throw new UnknownFieldException(p11);
                    } else {
                        obj5 = b11.A(fVar, 3, y6.a.f19890a, obj5);
                        i12 |= 8;
                    }
                }
                obj2 = obj6;
                obj3 = obj5;
                obj4 = obj7;
                i11 = i12;
            }
            b11.d(fVar);
            return new i4(i11, (Double) obj, (Double) obj4, (String) obj2, (y6) obj3);
        }

        @Override // c30.b, c30.h, c30.a
        public e30.f getDescriptor() {
            return f18745b;
        }

        @Override // c30.h
        public void serialize(f30.f encoder, Object obj) {
            i4 value = (i4) obj;
            kotlin.jvm.internal.s.g(encoder, "encoder");
            kotlin.jvm.internal.s.g(value, "value");
            e30.f fVar = f18745b;
            f30.d b11 = encoder.b(fVar);
            i4.a(value, b11, fVar);
            b11.d(fVar);
        }

        @Override // g30.b0
        public KSerializer<?>[] typeParametersSerializers() {
            return b0.a.a(this);
        }
    }

    public i4() {
        this((Double) null, (Double) null, (String) null, (y6) null, 15);
    }

    public /* synthetic */ i4(int i11, Double d11, Double d12, String str, y6 y6Var) {
        if ((i11 & 0) != 0) {
            g30.f1.a(i11, 0, a.f18744a.getDescriptor());
        }
        if ((i11 & 1) == 0) {
            this.f18740a = null;
        } else {
            this.f18740a = d11;
        }
        if ((i11 & 2) == 0) {
            this.f18741b = null;
        } else {
            this.f18741b = d12;
        }
        if ((i11 & 4) == 0) {
            this.f18742c = null;
        } else {
            this.f18742c = str;
        }
        if ((i11 & 8) == 0) {
            this.f18743d = null;
        } else {
            this.f18743d = y6Var;
        }
    }

    public static final void a(i4 self, f30.d output, e30.f serialDesc) {
        kotlin.jvm.internal.s.g(self, "self");
        kotlin.jvm.internal.s.g(output, "output");
        kotlin.jvm.internal.s.g(serialDesc, "serialDesc");
        boolean z11 = false;
        if (output.k(serialDesc, 0) || self.f18740a != null) {
            output.D(serialDesc, 0, g30.u.f27643a, self.f18740a);
        }
        if (output.k(serialDesc, 1) || self.f18741b != null) {
            output.D(serialDesc, 1, g30.u.f27643a, self.f18741b);
        }
        if (output.k(serialDesc, 2) || self.f18742c != null) {
            output.D(serialDesc, 2, g30.u1.f27647a, self.f18742c);
        }
        if (output.k(serialDesc, 3) || self.f18743d != null) {
            z11 = true;
        }
        if (z11) {
            output.D(serialDesc, 3, y6.a.f19890a, self.f18743d);
        }
    }

    public final String b() {
        return this.f18742c;
    }

    public final Double c() {
        return this.f18741b;
    }

    public final y6 d() {
        return this.f18743d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i4) {
            i4 i4Var = (i4) obj;
            return kotlin.jvm.internal.s.c(this.f18740a, i4Var.f18740a) && kotlin.jvm.internal.s.c(this.f18741b, i4Var.f18741b) && kotlin.jvm.internal.s.c(this.f18742c, i4Var.f18742c) && kotlin.jvm.internal.s.c(this.f18743d, i4Var.f18743d);
        }
        return false;
    }

    public int hashCode() {
        Double d11 = this.f18740a;
        int hashCode = (d11 == null ? 0 : d11.hashCode()) * 31;
        Double d12 = this.f18741b;
        int hashCode2 = (hashCode + (d12 == null ? 0 : d12.hashCode())) * 31;
        String str = this.f18742c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        y6 y6Var = this.f18743d;
        return hashCode3 + (y6Var != null ? y6Var.hashCode() : 0);
    }

    public String toString() {
        StringBuilder a11 = g4.a("LinkAccountResponseBalance(available=");
        a11.append(this.f18740a);
        a11.append(", current=");
        a11.append(this.f18741b);
        a11.append(", currency=");
        a11.append((Object) this.f18742c);
        a11.append(", localized=");
        a11.append(this.f18743d);
        a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return a11.toString();
    }

    public i4(Double d11, Double d12, String str, y6 y6Var) {
        this.f18740a = d11;
        this.f18741b = d12;
        this.f18742c = str;
        this.f18743d = y6Var;
    }

    public final Double a() {
        return this.f18740a;
    }

    public /* synthetic */ i4(Double d11, Double d12, String str, y6 y6Var, int i11) {
        this(null, null, null, null);
    }
}