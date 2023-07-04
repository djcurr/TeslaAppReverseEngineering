package com.plaid.internal;

import ch.qos.logback.core.CoreConstants;
import g30.b0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;

@kotlinx.serialization.a
/* loaded from: classes2.dex */
public final class j4 {

    /* renamed from: c  reason: collision with root package name */
    public static final b f18870c = new b();
    @nn.c("name")

    /* renamed from: a  reason: collision with root package name */
    private final String f18871a;
    @nn.c("number")

    /* renamed from: b  reason: collision with root package name */
    private final String f18872b;

    /* loaded from: classes2.dex */
    public static final class a implements g30.b0<j4> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f18873a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ e30.f f18874b;

        static {
            a aVar = new a();
            f18873a = aVar;
            g30.g1 g1Var = new g30.g1("com.plaid.internal.url.LinkAccountResponseMeta", aVar, 2);
            g1Var.k("name", true);
            g1Var.k("number", true);
            f18874b = g1Var;
        }

        @Override // g30.b0
        public KSerializer<?>[] childSerializers() {
            g30.u1 u1Var = g30.u1.f27647a;
            return new c30.b[]{d30.a.o(u1Var), d30.a.o(u1Var)};
        }

        @Override // c30.a
        public Object deserialize(f30.e decoder) {
            Object obj;
            Object obj2;
            int i11;
            kotlin.jvm.internal.s.g(decoder, "decoder");
            e30.f fVar = f18874b;
            f30.c b11 = decoder.b(fVar);
            Object obj3 = null;
            if (b11.n()) {
                g30.u1 u1Var = g30.u1.f27647a;
                obj = b11.A(fVar, 0, u1Var, null);
                obj2 = b11.A(fVar, 1, u1Var, null);
                i11 = 3;
            } else {
                Object obj4 = null;
                int i12 = 0;
                boolean z11 = true;
                while (z11) {
                    int p11 = b11.p(fVar);
                    if (p11 == -1) {
                        z11 = false;
                    } else if (p11 == 0) {
                        obj4 = b11.A(fVar, 0, g30.u1.f27647a, obj4);
                        i12 |= 1;
                    } else if (p11 != 1) {
                        throw new UnknownFieldException(p11);
                    } else {
                        obj3 = b11.A(fVar, 1, g30.u1.f27647a, obj3);
                        i12 |= 2;
                    }
                }
                obj = obj4;
                obj2 = obj3;
                i11 = i12;
            }
            b11.d(fVar);
            return new j4(i11, (String) obj, (String) obj2);
        }

        @Override // c30.b, c30.h, c30.a
        public e30.f getDescriptor() {
            return f18874b;
        }

        @Override // c30.h
        public void serialize(f30.f encoder, Object obj) {
            j4 value = (j4) obj;
            kotlin.jvm.internal.s.g(encoder, "encoder");
            kotlin.jvm.internal.s.g(value, "value");
            e30.f fVar = f18874b;
            f30.d b11 = encoder.b(fVar);
            j4.a(value, b11, fVar);
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

    public j4() {
        this((String) null, (String) null, 3);
    }

    public /* synthetic */ j4(int i11, String str, String str2) {
        if ((i11 & 0) != 0) {
            g30.f1.a(i11, 0, a.f18873a.getDescriptor());
        }
        if ((i11 & 1) == 0) {
            this.f18871a = null;
        } else {
            this.f18871a = str;
        }
        if ((i11 & 2) == 0) {
            this.f18872b = null;
        } else {
            this.f18872b = str2;
        }
    }

    public static final void a(j4 self, f30.d output, e30.f serialDesc) {
        kotlin.jvm.internal.s.g(self, "self");
        kotlin.jvm.internal.s.g(output, "output");
        kotlin.jvm.internal.s.g(serialDesc, "serialDesc");
        boolean z11 = false;
        if (output.k(serialDesc, 0) || self.f18871a != null) {
            output.D(serialDesc, 0, g30.u1.f27647a, self.f18871a);
        }
        if (output.k(serialDesc, 1) || self.f18872b != null) {
            z11 = true;
        }
        if (z11) {
            output.D(serialDesc, 1, g30.u1.f27647a, self.f18872b);
        }
    }

    public final String b() {
        return this.f18872b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j4) {
            j4 j4Var = (j4) obj;
            return kotlin.jvm.internal.s.c(this.f18871a, j4Var.f18871a) && kotlin.jvm.internal.s.c(this.f18872b, j4Var.f18872b);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f18871a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f18872b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder a11 = g4.a("LinkAccountResponseMeta(name=");
        a11.append((Object) this.f18871a);
        a11.append(", number=");
        a11.append((Object) this.f18872b);
        a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return a11.toString();
    }

    public j4(String str, String str2) {
        this.f18871a = str;
        this.f18872b = str2;
    }

    public final String a() {
        return this.f18871a;
    }

    public /* synthetic */ j4(String str, String str2, int i11) {
        this(null, null);
    }
}