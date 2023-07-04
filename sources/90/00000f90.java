package c30;

import ch.qos.logback.core.CoreConstants;
import e30.d;
import e30.j;
import h00.l;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;
import vz.m;
import wz.o;
import wz.w;

/* loaded from: classes5.dex */
public final class d<T> extends g30.b<T> {

    /* renamed from: a  reason: collision with root package name */
    private final n00.d<T> f8855a;

    /* renamed from: b  reason: collision with root package name */
    private List<? extends Annotation> f8856b;

    /* renamed from: c  reason: collision with root package name */
    private final vz.k f8857c;

    /* loaded from: classes5.dex */
    static final class a extends u implements h00.a<e30.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d<T> f8858a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c30.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0171a extends u implements l<e30.a, b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d<T> f8859a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0171a(d<T> dVar) {
                super(1);
                this.f8859a = dVar;
            }

            public final void a(e30.a buildSerialDescriptor) {
                s.g(buildSerialDescriptor, "$this$buildSerialDescriptor");
                e30.a.b(buildSerialDescriptor, "type", d30.a.x(q0.f34921a).getDescriptor(), null, false, 12, null);
                e30.a.b(buildSerialDescriptor, "value", e30.i.d("kotlinx.serialization.Polymorphic<" + this.f8859a.e().o() + '>', j.a.f24588a, new e30.f[0], null, 8, null), null, false, 12, null);
                buildSerialDescriptor.h(((d) this.f8859a).f8856b);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(e30.a aVar) {
                a(aVar);
                return b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d<T> dVar) {
            super(0);
            this.f8858a = dVar;
        }

        @Override // h00.a
        /* renamed from: a */
        public final e30.f invoke() {
            return e30.b.c(e30.i.c("kotlinx.serialization.Polymorphic", d.a.f24556a, new e30.f[0], new C0171a(this.f8858a)), this.f8858a.e());
        }
    }

    public d(n00.d<T> baseClass) {
        List<? extends Annotation> i11;
        vz.k b11;
        s.g(baseClass, "baseClass");
        this.f8855a = baseClass;
        i11 = w.i();
        this.f8856b = i11;
        b11 = m.b(kotlin.b.PUBLICATION, new a(this));
        this.f8857c = b11;
    }

    @Override // g30.b
    public n00.d<T> e() {
        return this.f8855a;
    }

    @Override // c30.b, c30.h, c30.a
    public e30.f getDescriptor() {
        return (e30.f) this.f8857c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + e() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(n00.d<T> baseClass, Annotation[] classAnnotations) {
        this(baseClass);
        List<? extends Annotation> e11;
        s.g(baseClass, "baseClass");
        s.g(classAnnotations, "classAnnotations");
        e11 = o.e(classAnnotations);
        this.f8856b = e11;
    }
}