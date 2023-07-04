package q00;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import q00.d;
import s10.a;
import t10.d;

/* loaded from: classes5.dex */
public abstract class e {

    /* loaded from: classes5.dex */
    public static final class a extends e {

        /* renamed from: a  reason: collision with root package name */
        private final Field f47103a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Field field) {
            super(null);
            kotlin.jvm.internal.s.g(field, "field");
            this.f47103a = field;
        }

        @Override // q00.e
        public String a() {
            StringBuilder sb2 = new StringBuilder();
            String name = this.f47103a.getName();
            kotlin.jvm.internal.s.f(name, "field.name");
            sb2.append(e10.y.a(name));
            sb2.append("()");
            Class<?> type = this.f47103a.getType();
            kotlin.jvm.internal.s.f(type, "field.type");
            sb2.append(b10.b.b(type));
            return sb2.toString();
        }

        public final Field b() {
            return this.f47103a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends e {

        /* renamed from: a  reason: collision with root package name */
        private final Method f47104a;

        /* renamed from: b  reason: collision with root package name */
        private final Method f47105b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Method getterMethod, Method method) {
            super(null);
            kotlin.jvm.internal.s.g(getterMethod, "getterMethod");
            this.f47104a = getterMethod;
            this.f47105b = method;
        }

        @Override // q00.e
        public String a() {
            String b11;
            b11 = i0.b(this.f47104a);
            return b11;
        }

        public final Method b() {
            return this.f47104a;
        }

        public final Method c() {
            return this.f47105b;
        }
    }

    /* loaded from: classes5.dex */
    public static final class c extends e {

        /* renamed from: a  reason: collision with root package name */
        private final String f47106a;

        /* renamed from: b  reason: collision with root package name */
        private final w00.i0 f47107b;

        /* renamed from: c  reason: collision with root package name */
        private final p10.n f47108c;

        /* renamed from: d  reason: collision with root package name */
        private final a.d f47109d;

        /* renamed from: e  reason: collision with root package name */
        private final r10.c f47110e;

        /* renamed from: f  reason: collision with root package name */
        private final r10.g f47111f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w00.i0 descriptor, p10.n proto, a.d signature, r10.c nameResolver, r10.g typeTable) {
            super(null);
            String str;
            kotlin.jvm.internal.s.g(descriptor, "descriptor");
            kotlin.jvm.internal.s.g(proto, "proto");
            kotlin.jvm.internal.s.g(signature, "signature");
            kotlin.jvm.internal.s.g(nameResolver, "nameResolver");
            kotlin.jvm.internal.s.g(typeTable, "typeTable");
            this.f47107b = descriptor;
            this.f47108c = proto;
            this.f47109d = signature;
            this.f47110e = nameResolver;
            this.f47111f = typeTable;
            if (signature.x()) {
                StringBuilder sb2 = new StringBuilder();
                a.c t11 = signature.t();
                kotlin.jvm.internal.s.f(t11, "signature.getter");
                sb2.append(nameResolver.getString(t11.r()));
                a.c t12 = signature.t();
                kotlin.jvm.internal.s.f(t12, "signature.getter");
                sb2.append(nameResolver.getString(t12.q()));
                str = sb2.toString();
            } else {
                d.a d11 = t10.g.d(t10.g.f51558a, proto, nameResolver, typeTable, false, 8, null);
                if (d11 != null) {
                    String d12 = d11.d();
                    str = e10.y.a(d12) + c() + "()" + d11.e();
                } else {
                    throw new b0("No field signature for property: " + descriptor);
                }
            }
            this.f47106a = str;
        }

        private final String c() {
            w00.i mo223b = this.f47107b.mo223b();
            kotlin.jvm.internal.s.f(mo223b, "descriptor.containingDeclaration");
            if (kotlin.jvm.internal.s.c(this.f47107b.getVisibility(), w00.p.f55308d) && (mo223b instanceof i20.d)) {
                p10.c V0 = ((i20.d) mo223b).V0();
                h.f<p10.c, Integer> fVar = s10.a.f49981i;
                kotlin.jvm.internal.s.f(fVar, "JvmProtoBuf.classModuleName");
                Integer num = (Integer) r10.e.a(V0, fVar);
                String str = (num == null || (str = this.f47110e.getString(num.intValue())) == null) ? "main" : "main";
                return "$" + u10.g.a(str);
            } else if (kotlin.jvm.internal.s.c(this.f47107b.getVisibility(), w00.p.f55305a) && (mo223b instanceof w00.a0)) {
                w00.i0 i0Var = this.f47107b;
                Objects.requireNonNull(i0Var, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
                i20.f H = ((i20.j) i0Var).H();
                if (H instanceof n10.i) {
                    n10.i iVar = (n10.i) H;
                    if (iVar.e() != null) {
                        return "$" + iVar.g().b();
                    }
                    return "";
                }
                return "";
            } else {
                return "";
            }
        }

        @Override // q00.e
        public String a() {
            return this.f47106a;
        }

        public final w00.i0 b() {
            return this.f47107b;
        }

        public final r10.c d() {
            return this.f47110e;
        }

        public final p10.n e() {
            return this.f47108c;
        }

        public final a.d f() {
            return this.f47109d;
        }

        public final r10.g g() {
            return this.f47111f;
        }
    }

    /* loaded from: classes5.dex */
    public static final class d extends e {

        /* renamed from: a  reason: collision with root package name */
        private final d.e f47112a;

        /* renamed from: b  reason: collision with root package name */
        private final d.e f47113b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(d.e getterSignature, d.e eVar) {
            super(null);
            kotlin.jvm.internal.s.g(getterSignature, "getterSignature");
            this.f47112a = getterSignature;
            this.f47113b = eVar;
        }

        @Override // q00.e
        public String a() {
            return this.f47112a.a();
        }

        public final d.e b() {
            return this.f47112a;
        }

        public final d.e c() {
            return this.f47113b;
        }
    }

    private e() {
    }

    public abstract String a();

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}