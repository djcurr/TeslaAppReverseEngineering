package mr;

import ch.qos.logback.core.CoreConstants;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.f.a;
import com.squareup.wire.q;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.r0;
import kotlin.jvm.internal.s;
import wz.e0;
import wz.s0;

/* loaded from: classes2.dex */
public final class a<M extends com.squareup.wire.f<M, B>, B extends f.a<M, B>> extends b<M, B> {

    /* renamed from: b  reason: collision with root package name */
    private final q.a f38902b;

    /* renamed from: c  reason: collision with root package name */
    private final String f38903c;

    /* renamed from: d  reason: collision with root package name */
    private final String f38904d;

    /* renamed from: e  reason: collision with root package name */
    private final String f38905e;

    /* renamed from: f  reason: collision with root package name */
    private final int f38906f;

    /* renamed from: g  reason: collision with root package name */
    private final String f38907g;

    /* renamed from: h  reason: collision with root package name */
    private final String f38908h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f38909i;

    /* renamed from: j  reason: collision with root package name */
    private final Field f38910j;

    /* renamed from: k  reason: collision with root package name */
    private final Method f38911k;

    /* renamed from: l  reason: collision with root package name */
    private final Field f38912l;

    public a(q wireField, Field messageField, Class<B> builderType) {
        String declaredName;
        s.g(wireField, "wireField");
        s.g(messageField, "messageField");
        s.g(builderType, "builderType");
        this.f38912l = messageField;
        this.f38902b = wireField.label();
        String name = messageField.getName();
        s.f(name, "messageField.name");
        this.f38903c = name;
        this.f38904d = wireField.jsonName();
        if (wireField.declaredName().length() == 0) {
            declaredName = messageField.getName();
            s.f(declaredName, "messageField.name");
        } else {
            declaredName = wireField.declaredName();
        }
        this.f38905e = declaredName;
        this.f38906f = wireField.tag();
        this.f38907g = wireField.keyAdapter();
        this.f38908h = wireField.adapter();
        this.f38909i = wireField.redacted();
        this.f38910j = q(builderType, g());
        String g11 = g();
        Class<?> type = messageField.getType();
        s.f(type, "messageField.type");
        this.f38911k = r(builderType, g11, type);
    }

    private final Field q(Class<?> cls, String str) {
        try {
            Field field = cls.getField(str);
            s.f(field, "builderType.getField(name)");
            return field;
        } catch (NoSuchFieldException unused) {
            throw new AssertionError("No builder field " + cls.getName() + CoreConstants.DOT + str);
        }
    }

    private final Method r(Class<?> cls, String str, Class<?> cls2) {
        try {
            Method method = cls.getMethod(str, cls2);
            s.f(method, "builderType.getMethod(name, type)");
            return method;
        } catch (NoSuchMethodException unused) {
            throw new AssertionError("No builder method " + cls.getName() + CoreConstants.DOT + str + CoreConstants.LEFT_PARENTHESIS_CHAR + cls2.getName() + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Override // mr.b
    public String c() {
        return this.f38905e;
    }

    @Override // mr.b
    public ProtoAdapter<?> e() {
        return ProtoAdapter.Companion.c(this.f38907g);
    }

    @Override // mr.b
    public q.a f() {
        return this.f38902b;
    }

    @Override // mr.b
    public String g() {
        return this.f38903c;
    }

    @Override // mr.b
    public boolean h() {
        return this.f38909i;
    }

    @Override // mr.b
    public ProtoAdapter<?> i() {
        return ProtoAdapter.Companion.c(this.f38908h);
    }

    @Override // mr.b
    public int j() {
        return this.f38906f;
    }

    @Override // mr.b
    public String k() {
        return this.f38904d;
    }

    @Override // mr.b
    public boolean l() {
        return this.f38907g.length() > 0;
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
        return this.f38912l.get(message);
    }

    @Override // mr.b
    /* renamed from: s */
    public Object d(B builder) {
        s.g(builder, "builder");
        return this.f38910j.get(builder);
    }

    @Override // mr.b
    /* renamed from: t */
    public void n(B builder, Object obj) {
        s.g(builder, "builder");
        if (f().isOneOf()) {
            this.f38911k.invoke(builder, obj);
        } else {
            this.f38910j.set(builder, obj);
        }
    }

    @Override // mr.b
    /* renamed from: u */
    public void o(B builder, Object value) {
        Class<?> cls;
        Map y11;
        List Q0;
        s.g(builder, "builder");
        s.g(value, "value");
        if (f().isRepeated()) {
            Object d11 = d(builder);
            if (r0.n(d11)) {
                Objects.requireNonNull(d11, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Any>");
                r0.c(d11).add(value);
                return;
            } else if (d11 instanceof List) {
                Q0 = e0.Q0((Collection) d11);
                Q0.add(value);
                n(builder, Q0);
                return;
            } else {
                cls = d11 != null ? d11.getClass() : null;
                throw new ClassCastException("Expected a list type, got " + cls + CoreConstants.DOT);
            }
        }
        if (this.f38907g.length() > 0) {
            Object d12 = d(builder);
            if (r0.o(d12)) {
                ((Map) d12).putAll((Map) value);
                return;
            } else if (d12 instanceof Map) {
                y11 = s0.y((Map) d12);
                y11.putAll((Map) value);
                n(builder, y11);
                return;
            } else {
                cls = d12 != null ? d12.getClass() : null;
                throw new ClassCastException("Expected a map type, got " + cls + CoreConstants.DOT);
            }
        }
        n(builder, value);
    }
}