package kotlinx.serialization.json;

import h30.d0;
import h30.e0;
import h30.g0;
import h30.i0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class a implements c30.k {

    /* renamed from: d  reason: collision with root package name */
    public static final C0677a f35616d = new C0677a(null);

    /* renamed from: a  reason: collision with root package name */
    private final e f35617a;

    /* renamed from: b  reason: collision with root package name */
    private final i30.c f35618b;

    /* renamed from: c  reason: collision with root package name */
    private final h30.l f35619c;

    /* renamed from: kotlinx.serialization.json.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0677a extends a {
        private C0677a() {
            super(new e(false, false, false, false, false, false, null, false, false, null, false, false, 4095, null), i30.e.a(), null);
        }

        public /* synthetic */ C0677a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private a(e eVar, i30.c cVar) {
        this.f35617a = eVar;
        this.f35618b = cVar;
        this.f35619c = new h30.l();
    }

    public /* synthetic */ a(e eVar, i30.c cVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, cVar);
    }

    @Override // c30.g
    public i30.c a() {
        return this.f35618b;
    }

    @Override // c30.k
    public final <T> T b(c30.a<T> deserializer, String string) {
        kotlin.jvm.internal.s.g(deserializer, "deserializer");
        kotlin.jvm.internal.s.g(string, "string");
        g0 g0Var = new g0(string);
        T t11 = (T) new d0(this, kotlinx.serialization.json.internal.a.OBJ, g0Var, deserializer.getDescriptor()).m(deserializer);
        g0Var.v();
        return t11;
    }

    @Override // c30.k
    public final <T> String c(c30.h<? super T> serializer, T t11) {
        kotlin.jvm.internal.s.g(serializer, "serializer");
        h30.t tVar = new h30.t();
        try {
            new e0(tVar, this, kotlinx.serialization.json.internal.a.OBJ, new k[kotlinx.serialization.json.internal.a.values().length]).F(serializer, t11);
            return tVar.toString();
        } finally {
            tVar.h();
        }
    }

    public final <T> T d(c30.a<T> deserializer, JsonElement element) {
        kotlin.jvm.internal.s.g(deserializer, "deserializer");
        kotlin.jvm.internal.s.g(element, "element");
        return (T) i0.a(this, element, deserializer);
    }

    public final e e() {
        return this.f35617a;
    }

    public final h30.l f() {
        return this.f35619c;
    }
}