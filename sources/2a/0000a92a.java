package p00;

import g20.v;
import h00.p;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import n00.g;
import p10.i;
import p10.t;
import q00.l;
import q00.l0;
import t10.e;
import t10.f;

/* loaded from: classes5.dex */
public final class d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final /* synthetic */ class a extends o implements p<v, i, h> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f45450a = new a();

        a() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: d */
        public final h mo160invoke(v p12, i p22) {
            s.g(p12, "p1");
            s.g(p22, "p2");
            return p12.n(p22);
        }

        @Override // kotlin.jvm.internal.f, n00.c
        public final String getName() {
            return "loadFunction";
        }

        @Override // kotlin.jvm.internal.f
        public final g getOwner() {
            return m0.b(v.class);
        }

        @Override // kotlin.jvm.internal.f
        public final String getSignature() {
            return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
        }
    }

    public static final <R> n00.h<R> a(vz.g<? extends R> reflect) {
        s.g(reflect, "$this$reflect");
        Metadata metadata = (Metadata) reflect.getClass().getAnnotation(Metadata.class);
        if (metadata != null) {
            String[] d12 = metadata.d1();
            if (d12.length == 0) {
                d12 = null;
            }
            if (d12 != null) {
                vz.p<f, i> j11 = t10.g.j(d12, metadata.d2());
                f a11 = j11.a();
                i b11 = j11.b();
                e eVar = new e(metadata.mv(), (metadata.xi() & 8) != 0);
                Class<?> cls = reflect.getClass();
                t Z = b11.Z();
                s.f(Z, "proto.typeTable");
                h hVar = (h) l0.h(cls, b11, a11, new r10.g(Z), eVar, a.f45450a);
                if (hVar != null) {
                    return new l(q00.b.f47086d, hVar);
                }
            }
        }
        return null;
    }
}