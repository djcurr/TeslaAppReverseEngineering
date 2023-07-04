package i30;

import c30.h;
import h00.l;
import java.util.List;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes5.dex */
public interface d {

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: i30.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C0579a extends u implements l<List<? extends c30.b<?>>, c30.b<?>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c30.b<T> f29831a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0579a(c30.b<T> bVar) {
                super(1);
                this.f29831a = bVar;
            }

            @Override // h00.l
            /* renamed from: a */
            public final c30.b<?> invoke(List<? extends c30.b<?>> it2) {
                s.g(it2, "it");
                return this.f29831a;
            }
        }

        public static <T> void a(d dVar, n00.d<T> kClass, c30.b<T> serializer) {
            s.g(kClass, "kClass");
            s.g(serializer, "serializer");
            dVar.b(kClass, new C0579a(serializer));
        }
    }

    <Base, Sub extends Base> void a(n00.d<Base> dVar, n00.d<Sub> dVar2, c30.b<Sub> bVar);

    <T> void b(n00.d<T> dVar, l<? super List<? extends c30.b<?>>, ? extends c30.b<?>> lVar);

    <Base> void c(n00.d<Base> dVar, l<? super Base, ? extends h<? super Base>> lVar);

    <T> void d(n00.d<T> dVar, c30.b<T> bVar);

    <Base> void e(n00.d<Base> dVar, l<? super String, ? extends c30.a<? extends Base>> lVar);
}