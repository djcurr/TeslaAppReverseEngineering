package c30;

import ch.qos.logback.core.CoreConstants;
import e30.d;
import e30.j;
import h00.l;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import vz.b0;
import vz.m;
import wz.j0;
import wz.o;
import wz.p;
import wz.r0;
import wz.s0;
import wz.w;

/* loaded from: classes5.dex */
public final class f<T> extends g30.b<T> {

    /* renamed from: a  reason: collision with root package name */
    private final n00.d<T> f8860a;

    /* renamed from: b  reason: collision with root package name */
    private List<? extends Annotation> f8861b;

    /* renamed from: c  reason: collision with root package name */
    private final vz.k f8862c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<n00.d<? extends T>, c30.b<? extends T>> f8863d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, c30.b<? extends T>> f8864e;

    /* loaded from: classes5.dex */
    static final class a extends u implements h00.a<e30.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f8865a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f<T> f8866b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ KSerializer<? extends T>[] f8867c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c30.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0172a extends u implements l<e30.a, b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f<T> f8868a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ KSerializer<? extends T>[] f8869b;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: c30.f$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0173a extends u implements l<e30.a, b0> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ KSerializer<? extends T>[] f8870a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0173a(KSerializer<? extends T>[] kSerializerArr) {
                    super(1);
                    this.f8870a = kSerializerArr;
                }

                public final void a(e30.a buildSerialDescriptor) {
                    s.g(buildSerialDescriptor, "$this$buildSerialDescriptor");
                    for (c30.b bVar : this.f8870a) {
                        e30.f descriptor = bVar.getDescriptor();
                        e30.a.b(buildSerialDescriptor, descriptor.h(), descriptor, null, false, 12, null);
                    }
                }

                @Override // h00.l
                public /* bridge */ /* synthetic */ b0 invoke(e30.a aVar) {
                    a(aVar);
                    return b0.f54756a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0172a(f<T> fVar, KSerializer<? extends T>[] kSerializerArr) {
                super(1);
                this.f8868a = fVar;
                this.f8869b = kSerializerArr;
            }

            public final void a(e30.a buildSerialDescriptor) {
                s.g(buildSerialDescriptor, "$this$buildSerialDescriptor");
                e30.a.b(buildSerialDescriptor, "type", d30.a.x(q0.f34921a).getDescriptor(), null, false, 12, null);
                e30.a.b(buildSerialDescriptor, "value", e30.i.c("kotlinx.serialization.Sealed<" + this.f8868a.e().o() + '>', j.a.f24588a, new e30.f[0], new C0173a(this.f8869b)), null, false, 12, null);
                buildSerialDescriptor.h(((f) this.f8868a).f8861b);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(e30.a aVar) {
                a(aVar);
                return b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, f<T> fVar, KSerializer<? extends T>[] kSerializerArr) {
            super(0);
            this.f8865a = str;
            this.f8866b = fVar;
            this.f8867c = kSerializerArr;
        }

        @Override // h00.a
        /* renamed from: a */
        public final e30.f invoke() {
            return e30.i.c(this.f8865a, d.b.f24557a, new e30.f[0], new C0172a(this.f8866b, this.f8867c));
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements j0<Map.Entry<? extends n00.d<? extends T>, ? extends c30.b<? extends T>>, String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterable f8871a;

        public b(Iterable iterable) {
            this.f8871a = iterable;
        }

        @Override // wz.j0
        public String a(Map.Entry<? extends n00.d<? extends T>, ? extends c30.b<? extends T>> entry) {
            return entry.getValue().getDescriptor().h();
        }

        @Override // wz.j0
        public Iterator<Map.Entry<? extends n00.d<? extends T>, ? extends c30.b<? extends T>>> b() {
            return this.f8871a.iterator();
        }
    }

    public f(String serialName, n00.d<T> baseClass, KClass<? extends T>[] subclasses, KSerializer<? extends T>[] subclassSerializers) {
        List<? extends Annotation> i11;
        vz.k b11;
        List H0;
        Map<n00.d<? extends T>, c30.b<? extends T>> t11;
        int e11;
        s.g(serialName, "serialName");
        s.g(baseClass, "baseClass");
        s.g(subclasses, "subclasses");
        s.g(subclassSerializers, "subclassSerializers");
        this.f8860a = baseClass;
        i11 = w.i();
        this.f8861b = i11;
        b11 = m.b(kotlin.b.PUBLICATION, new a(serialName, this, subclassSerializers));
        this.f8862c = b11;
        if (subclasses.length == subclassSerializers.length) {
            H0 = p.H0(subclasses, subclassSerializers);
            t11 = s0.t(H0);
            this.f8863d = t11;
            j0 bVar = new b(t11.entrySet());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<T> b12 = bVar.b();
            while (b12.hasNext()) {
                T next = b12.next();
                Object a11 = bVar.a(next);
                Object obj = linkedHashMap.get(a11);
                if (obj == null) {
                    linkedHashMap.containsKey(a11);
                }
                Map.Entry entry = (Map.Entry) next;
                Map.Entry entry2 = (Map.Entry) obj;
                String str = (String) a11;
                if (entry2 == null) {
                    linkedHashMap.put(a11, entry);
                } else {
                    throw new IllegalStateException(("Multiple sealed subclasses of '" + e() + "' have the same serial name '" + str + "': '" + entry2.getKey() + "', '" + entry.getKey() + CoreConstants.SINGLE_QUOTE_CHAR).toString());
                }
            }
            e11 = r0.e(linkedHashMap.size());
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(e11);
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry3.getKey(), (c30.b) ((Map.Entry) entry3.getValue()).getValue());
            }
            this.f8864e = linkedHashMap2;
            return;
        }
        throw new IllegalArgumentException("All subclasses of sealed class " + e().o() + " should be marked @Serializable");
    }

    @Override // g30.b
    public c30.a<? extends T> c(f30.c decoder, String str) {
        s.g(decoder, "decoder");
        c30.b<? extends T> bVar = this.f8864e.get(str);
        return bVar != null ? bVar : super.c(decoder, str);
    }

    @Override // g30.b
    public h<T> d(f30.f encoder, T value) {
        s.g(encoder, "encoder");
        s.g(value, "value");
        c30.b<? extends T> bVar = this.f8863d.get(m0.b(value.getClass()));
        if (bVar == null) {
            bVar = super.d(encoder, value);
        }
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    @Override // g30.b
    public n00.d<T> e() {
        return this.f8860a;
    }

    @Override // c30.b, c30.h, c30.a
    public e30.f getDescriptor() {
        return (e30.f) this.f8862c.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(String serialName, n00.d<T> baseClass, KClass<? extends T>[] subclasses, KSerializer<? extends T>[] subclassSerializers, Annotation[] classAnnotations) {
        this(serialName, baseClass, subclasses, subclassSerializers);
        List<? extends Annotation> e11;
        s.g(serialName, "serialName");
        s.g(baseClass, "baseClass");
        s.g(subclasses, "subclasses");
        s.g(subclassSerializers, "subclassSerializers");
        s.g(classAnnotations, "classAnnotations");
        e11 = o.e(classAnnotations);
        this.f8861b = e11;
    }
}