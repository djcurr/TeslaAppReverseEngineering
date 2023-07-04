package mr;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.f.a;
import com.squareup.wire.h;
import com.squareup.wire.q;
import java.lang.reflect.Field;
import java.util.Objects;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class i<M extends com.squareup.wire.f<M, B>, B extends f.a<M, B>> extends b<M, B> {

    /* renamed from: b  reason: collision with root package name */
    private final Field f38919b;

    /* renamed from: c  reason: collision with root package name */
    private final Field f38920c;

    /* renamed from: d  reason: collision with root package name */
    private final h.a<?> f38921d;

    public i(Field messageField, Class<B> builderType, h.a<?> key) {
        s.g(messageField, "messageField");
        s.g(builderType, "builderType");
        s.g(key, "key");
        this.f38920c = messageField;
        this.f38921d = key;
        Field declaredField = builderType.getDeclaredField(messageField.getName());
        s.f(declaredField, "builderType.getDeclaredField(messageField.name)");
        this.f38919b = declaredField;
    }

    @Override // mr.b
    public String c() {
        return this.f38921d.b();
    }

    @Override // mr.b
    public /* bridge */ /* synthetic */ ProtoAdapter e() {
        return (ProtoAdapter) r();
    }

    @Override // mr.b
    public q.a f() {
        return q.a.OPTIONAL;
    }

    @Override // mr.b
    public String g() {
        return this.f38921d.b();
    }

    @Override // mr.b
    public boolean h() {
        return this.f38921d.d();
    }

    @Override // mr.b
    public ProtoAdapter<Object> i() {
        ProtoAdapter<?> a11 = this.f38921d.a();
        Objects.requireNonNull(a11, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
        return a11;
    }

    @Override // mr.b
    public int j() {
        return this.f38921d.e();
    }

    @Override // mr.b
    public String k() {
        return this.f38921d.c();
    }

    @Override // mr.b
    public boolean l() {
        return false;
    }

    @Override // mr.b
    public boolean m() {
        n00.d<?> type = i().getType();
        return com.squareup.wire.f.class.isAssignableFrom(type != null ? g00.a.c(type) : null);
    }

    @Override // mr.b
    /* renamed from: p */
    public Object a(M message) {
        s.g(message, "message");
        com.squareup.wire.h hVar = (com.squareup.wire.h) this.f38920c.get(message);
        if (hVar != null) {
            return hVar.a(this.f38921d);
        }
        return null;
    }

    @Override // mr.b
    /* renamed from: q */
    public Object d(B builder) {
        s.g(builder, "builder");
        com.squareup.wire.h hVar = (com.squareup.wire.h) this.f38919b.get(builder);
        if (hVar != null) {
            return hVar.a(this.f38921d);
        }
        return null;
    }

    public Void r() {
        throw new IllegalStateException("not a map".toString());
    }

    @Override // mr.b
    /* renamed from: s */
    public void n(B builder, Object obj) {
        s.g(builder, "builder");
        Field field = this.f38919b;
        h.a<?> aVar = this.f38921d;
        Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.squareup.wire.OneOf.Key<kotlin.Any>");
        s.e(obj);
        field.set(builder, new com.squareup.wire.h(aVar, obj));
    }

    @Override // mr.b
    /* renamed from: t */
    public void o(B builder, Object value) {
        s.g(builder, "builder");
        s.g(value, "value");
        n(builder, value);
    }
}