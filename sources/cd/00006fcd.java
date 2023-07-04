package g30;

import ch.qos.logback.core.CoreConstants;
import e30.f;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* loaded from: classes5.dex */
public final class m1 implements e30.f {

    /* renamed from: a  reason: collision with root package name */
    private final String f27614a;

    /* renamed from: b  reason: collision with root package name */
    private final e30.e f27615b;

    public m1(String serialName, e30.e kind) {
        kotlin.jvm.internal.s.g(serialName, "serialName");
        kotlin.jvm.internal.s.g(kind, "kind");
        this.f27614a = serialName;
        this.f27615b = kind;
    }

    private final Void a() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // e30.f
    public boolean b() {
        return f.a.c(this);
    }

    @Override // e30.f
    public int c(String name) {
        kotlin.jvm.internal.s.g(name, "name");
        a();
        throw new KotlinNothingValueException();
    }

    @Override // e30.f
    public int d() {
        return 0;
    }

    @Override // e30.f
    public String e(int i11) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // e30.f
    public List<Annotation> f(int i11) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // e30.f
    public e30.f g(int i11) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // e30.f
    public List<Annotation> getAnnotations() {
        return f.a.a(this);
    }

    @Override // e30.f
    public String h() {
        return this.f27614a;
    }

    @Override // e30.f
    public boolean i(int i11) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // e30.f
    public boolean isInline() {
        return f.a.b(this);
    }

    @Override // e30.f
    /* renamed from: j */
    public e30.e getKind() {
        return this.f27615b;
    }

    public String toString() {
        return "PrimitiveDescriptor(" + h() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}