package s20;

import h00.l;
import h00.p;
import h00.q;
import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final l<Object, Boolean> f50173a;

    /* renamed from: b  reason: collision with root package name */
    private static final q<Object, Object, Object, b0> f50174b;

    /* loaded from: classes5.dex */
    static final class a extends u implements l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f50175a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Void invoke(Object obj) {
            return null;
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends u implements l<Object, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f50176a = new b();

        b() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends u implements l<Object, b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f50177a = new c();

        c() {
            super(1);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(Object obj) {
            invoke2(obj);
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Object obj) {
        }
    }

    /* renamed from: s20.d$d  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C1110d extends u implements p<Object, Object, b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1110d f50178a = new C1110d();

        C1110d() {
            super(2);
        }

        public final void a(Object obj, Object obj2) {
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ b0 invoke(Object obj, Object obj2) {
            a(obj, obj2);
            return b0.f54756a;
        }
    }

    /* loaded from: classes5.dex */
    static final class e extends u implements q<Object, Object, Object, b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f50179a = new e();

        e() {
            super(3);
        }

        public final void a(Object obj, Object obj2, Object obj3) {
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ b0 invoke(Object obj, Object obj2, Object obj3) {
            a(obj, obj2, obj3);
            return b0.f54756a;
        }
    }

    /* loaded from: classes5.dex */
    static final class f extends u implements l<Object, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f50180a = new f();

        f() {
            super(1);
        }

        @Override // h00.l
        public final Object invoke(Object obj) {
            return obj;
        }
    }

    static {
        f fVar = f.f50180a;
        f50173a = b.f50176a;
        a aVar = a.f50175a;
        c cVar = c.f50177a;
        C1110d c1110d = C1110d.f50178a;
        f50174b = e.f50179a;
    }

    public static final <T> l<T, Boolean> a() {
        return (l<T, Boolean>) f50173a;
    }

    public static final q<Object, Object, Object, b0> b() {
        return f50174b;
    }
}