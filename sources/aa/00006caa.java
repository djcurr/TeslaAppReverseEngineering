package f10;

import g20.q;
import h00.l;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import vz.b0;
import w00.v0;

/* loaded from: classes5.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f10.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0497a extends w10.h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f25509a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Set f25510b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f25511c;

        /* renamed from: f10.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        class C0498a implements l<kotlin.reflect.jvm.internal.impl.descriptors.b, b0> {
            C0498a() {
            }

            private static /* synthetic */ void a(int i11) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
            }

            @Override // h00.l
            /* renamed from: b */
            public b0 invoke(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
                if (bVar == null) {
                    a(0);
                }
                C0497a.this.f25509a.a(bVar);
                return b0.f54756a;
            }
        }

        C0497a(q qVar, Set set, boolean z11) {
            this.f25509a = qVar;
            this.f25510b = set;
            this.f25511c = z11;
        }

        private static /* synthetic */ void f(int i11) {
            Object[] objArr = new Object[3];
            if (i11 == 1) {
                objArr[0] = "fromSuper";
            } else if (i11 == 2) {
                objArr[0] = "fromCurrent";
            } else if (i11 == 3) {
                objArr[0] = "member";
            } else if (i11 != 4) {
                objArr[0] = "fakeOverride";
            } else {
                objArr[0] = "overridden";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
            if (i11 == 1 || i11 == 2) {
                objArr[2] = "conflict";
            } else if (i11 == 3 || i11 == 4) {
                objArr[2] = "setOverriddenDescriptors";
            } else {
                objArr[2] = "addFakeOverride";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // w10.i
        public void a(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            if (bVar == null) {
                f(0);
            }
            w10.j.L(bVar, new C0498a());
            this.f25510b.add(bVar);
        }

        @Override // w10.i
        public void d(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection) {
            if (bVar == null) {
                f(3);
            }
            if (collection == null) {
                f(4);
            }
            if (!this.f25511c || bVar.getKind() == b.a.FAKE_OVERRIDE) {
                super.d(bVar, collection);
            }
        }

        @Override // w10.h
        public void e(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, kotlin.reflect.jvm.internal.impl.descriptors.b bVar2) {
            if (bVar == null) {
                f(1);
            }
            if (bVar2 == null) {
                f(2);
            }
        }
    }

    private static /* synthetic */ void a(int i11) {
        String str = i11 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i11 != 18 ? 3 : 2];
        switch (i11) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i11 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i11) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String format = String.format(str, objArr);
        if (i11 == 18) {
            throw new IllegalStateException(format);
        }
    }

    public static v0 b(u10.f fVar, w00.c cVar) {
        if (fVar == null) {
            a(19);
        }
        if (cVar == null) {
            a(20);
        }
        Collection<w00.b> g11 = cVar.g();
        if (g11.size() != 1) {
            return null;
        }
        for (v0 v0Var : g11.iterator().next().h()) {
            if (v0Var.getName().equals(fVar)) {
                return v0Var;
            }
        }
        return null;
    }

    private static <D extends kotlin.reflect.jvm.internal.impl.descriptors.b> Collection<D> c(u10.f fVar, Collection<D> collection, Collection<D> collection2, w00.c cVar, q qVar, w10.j jVar, boolean z11) {
        if (fVar == null) {
            a(12);
        }
        if (collection == null) {
            a(13);
        }
        if (collection2 == null) {
            a(14);
        }
        if (cVar == null) {
            a(15);
        }
        if (qVar == null) {
            a(16);
        }
        if (jVar == null) {
            a(17);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        jVar.w(fVar, collection, collection2, cVar, new C0497a(qVar, linkedHashSet, z11));
        return linkedHashSet;
    }

    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.b> Collection<D> d(u10.f fVar, Collection<D> collection, Collection<D> collection2, w00.c cVar, q qVar, w10.j jVar) {
        if (fVar == null) {
            a(0);
        }
        if (collection == null) {
            a(1);
        }
        if (collection2 == null) {
            a(2);
        }
        if (cVar == null) {
            a(3);
        }
        if (qVar == null) {
            a(4);
        }
        if (jVar == null) {
            a(5);
        }
        return c(fVar, collection, collection2, cVar, qVar, jVar, false);
    }

    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.b> Collection<D> e(u10.f fVar, Collection<D> collection, Collection<D> collection2, w00.c cVar, q qVar, w10.j jVar) {
        if (fVar == null) {
            a(6);
        }
        if (collection == null) {
            a(7);
        }
        if (collection2 == null) {
            a(8);
        }
        if (cVar == null) {
            a(9);
        }
        if (qVar == null) {
            a(10);
        }
        if (jVar == null) {
            a(11);
        }
        return c(fVar, collection, collection2, cVar, qVar, jVar, true);
    }
}