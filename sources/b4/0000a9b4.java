package p20;

import k20.d0;
import k20.k0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import p20.b;

/* loaded from: classes5.dex */
public abstract class k implements p20.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f45948a;

    /* renamed from: b  reason: collision with root package name */
    private final h00.l<t00.h, d0> f45949b;

    /* renamed from: c  reason: collision with root package name */
    private final String f45950c;

    /* loaded from: classes5.dex */
    public static final class a extends k {

        /* renamed from: d  reason: collision with root package name */
        public static final a f45951d = new a();

        /* renamed from: p20.k$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C0978a extends u implements h00.l<t00.h, d0> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0978a f45952a = new C0978a();

            C0978a() {
                super(1);
            }

            @Override // h00.l
            /* renamed from: a */
            public final d0 invoke(t00.h hVar) {
                s.g(hVar, "$this$null");
                k0 booleanType = hVar.n();
                s.f(booleanType, "booleanType");
                return booleanType;
            }
        }

        private a() {
            super("Boolean", C0978a.f45952a, null);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends k {

        /* renamed from: d  reason: collision with root package name */
        public static final b f45953d = new b();

        /* loaded from: classes5.dex */
        static final class a extends u implements h00.l<t00.h, d0> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f45954a = new a();

            a() {
                super(1);
            }

            @Override // h00.l
            /* renamed from: a */
            public final d0 invoke(t00.h hVar) {
                s.g(hVar, "$this$null");
                k0 intType = hVar.D();
                s.f(intType, "intType");
                return intType;
            }
        }

        private b() {
            super("Int", a.f45954a, null);
        }
    }

    /* loaded from: classes5.dex */
    public static final class c extends k {

        /* renamed from: d  reason: collision with root package name */
        public static final c f45955d = new c();

        /* loaded from: classes5.dex */
        static final class a extends u implements h00.l<t00.h, d0> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f45956a = new a();

            a() {
                super(1);
            }

            @Override // h00.l
            /* renamed from: a */
            public final d0 invoke(t00.h hVar) {
                s.g(hVar, "$this$null");
                k0 unitType = hVar.Z();
                s.f(unitType, "unitType");
                return unitType;
            }
        }

        private c() {
            super("Unit", a.f45956a, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private k(String str, h00.l<? super t00.h, ? extends d0> lVar) {
        this.f45948a = str;
        this.f45949b = lVar;
        this.f45950c = s.p("must return ", str);
    }

    public /* synthetic */ k(String str, h00.l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, lVar);
    }

    @Override // p20.b
    public String a(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        return b.a.a(this, eVar);
    }

    @Override // p20.b
    public boolean b(kotlin.reflect.jvm.internal.impl.descriptors.e functionDescriptor) {
        s.g(functionDescriptor, "functionDescriptor");
        return s.c(functionDescriptor.getReturnType(), this.f45949b.invoke(a20.a.g(functionDescriptor)));
    }

    @Override // p20.b
    public String getDescription() {
        return this.f45950c;
    }
}