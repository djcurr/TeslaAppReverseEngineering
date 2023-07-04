package kotlin.reflect.jvm.internal.impl.renderer;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.s;
import w00.a0;
import w00.s0;
import wz.c0;

/* loaded from: classes5.dex */
public interface b {

    /* loaded from: classes5.dex */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f35076a = new a();

        private a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.b
        public String a(w00.e classifier, kotlin.reflect.jvm.internal.impl.renderer.c renderer) {
            s.g(classifier, "classifier");
            s.g(renderer, "renderer");
            if (classifier instanceof s0) {
                u10.f name = ((s0) classifier).getName();
                s.f(name, "classifier.name");
                return renderer.v(name, false);
            }
            u10.d m11 = w10.d.m(classifier);
            s.f(m11, "getFqName(classifier)");
            return renderer.u(m11);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0655b implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final C0655b f35077a = new C0655b();

        private C0655b() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.b
        public String a(w00.e classifier, kotlin.reflect.jvm.internal.impl.renderer.c renderer) {
            boolean z11;
            List M;
            s.g(classifier, "classifier");
            s.g(renderer, "renderer");
            if (classifier instanceof s0) {
                u10.f name = ((s0) classifier).getName();
                s.f(name, "classifier.name");
                return renderer.v(name, false);
            }
            ArrayList arrayList = new ArrayList();
            w00.e eVar = classifier;
            do {
                arrayList.add(eVar.getName());
                w00.i b11 = eVar.b();
                z11 = b11 instanceof w00.c;
                eVar = b11;
            } while (z11);
            M = c0.M(arrayList);
            return n.c(M);
        }
    }

    /* loaded from: classes5.dex */
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final c f35078a = new c();

        private c() {
        }

        private final String b(w00.e eVar) {
            u10.f name = eVar.getName();
            s.f(name, "descriptor.name");
            String b11 = n.b(name);
            if (eVar instanceof s0) {
                return b11;
            }
            w00.i b12 = eVar.b();
            s.f(b12, "descriptor.containingDeclaration");
            String c11 = c(b12);
            if (c11 == null || s.c(c11, "")) {
                return b11;
            }
            return ((Object) c11) + CoreConstants.DOT + b11;
        }

        private final String c(w00.i iVar) {
            if (iVar instanceof w00.c) {
                return b((w00.e) iVar);
            }
            if (iVar instanceof a0) {
                u10.d j11 = ((a0) iVar).e().j();
                s.f(j11, "descriptor.fqName.toUnsafe()");
                return n.a(j11);
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.b
        public String a(w00.e classifier, kotlin.reflect.jvm.internal.impl.renderer.c renderer) {
            s.g(classifier, "classifier");
            s.g(renderer, "renderer");
            return b(classifier);
        }
    }

    String a(w00.e eVar, kotlin.reflect.jvm.internal.impl.renderer.c cVar);
}