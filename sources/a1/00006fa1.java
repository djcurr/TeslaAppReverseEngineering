package g30;

import e30.k;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.SerializationException;

/* loaded from: classes5.dex */
public final class b1<T> implements c30.b<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f27557a;

    /* renamed from: b  reason: collision with root package name */
    private List<? extends Annotation> f27558b;

    /* renamed from: c  reason: collision with root package name */
    private final vz.k f27559c;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<e30.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f27560a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b1<T> f27561b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: g30.b1$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0525a extends kotlin.jvm.internal.u implements h00.l<e30.a, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b1<T> f27562a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0525a(b1<T> b1Var) {
                super(1);
                this.f27562a = b1Var;
            }

            public final void a(e30.a buildSerialDescriptor) {
                kotlin.jvm.internal.s.g(buildSerialDescriptor, "$this$buildSerialDescriptor");
                buildSerialDescriptor.h(((b1) this.f27562a).f27558b);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(e30.a aVar) {
                a(aVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, b1<T> b1Var) {
            super(0);
            this.f27560a = str;
            this.f27561b = b1Var;
        }

        @Override // h00.a
        /* renamed from: a */
        public final e30.f invoke() {
            return e30.i.c(this.f27560a, k.d.f24593a, new e30.f[0], new C0525a(this.f27561b));
        }
    }

    public b1(String serialName, T objectInstance) {
        List<? extends Annotation> i11;
        vz.k b11;
        kotlin.jvm.internal.s.g(serialName, "serialName");
        kotlin.jvm.internal.s.g(objectInstance, "objectInstance");
        this.f27557a = objectInstance;
        i11 = wz.w.i();
        this.f27558b = i11;
        b11 = vz.m.b(kotlin.b.PUBLICATION, new a(serialName, this));
        this.f27559c = b11;
    }

    @Override // c30.a
    public T deserialize(f30.e decoder) {
        kotlin.jvm.internal.s.g(decoder, "decoder");
        e30.f descriptor = getDescriptor();
        f30.c b11 = decoder.b(descriptor);
        int p11 = b11.p(getDescriptor());
        if (p11 == -1) {
            vz.b0 b0Var = vz.b0.f54756a;
            b11.d(descriptor);
            return this.f27557a;
        }
        throw new SerializationException("Unexpected index " + p11);
    }

    @Override // c30.b, c30.h, c30.a
    public e30.f getDescriptor() {
        return (e30.f) this.f27559c.getValue();
    }

    @Override // c30.h
    public void serialize(f30.f encoder, T value) {
        kotlin.jvm.internal.s.g(encoder, "encoder");
        kotlin.jvm.internal.s.g(value, "value");
        encoder.b(getDescriptor()).d(getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b1(String serialName, T objectInstance, Annotation[] classAnnotations) {
        this(serialName, objectInstance);
        List<? extends Annotation> e11;
        kotlin.jvm.internal.s.g(serialName, "serialName");
        kotlin.jvm.internal.s.g(objectInstance, "objectInstance");
        kotlin.jvm.internal.s.g(classAnnotations, "classAnnotations");
        e11 = wz.o.e(classAnnotations);
        this.f27558b = e11;
    }
}