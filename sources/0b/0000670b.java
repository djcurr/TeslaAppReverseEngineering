package e30;

import e30.k;
import g30.n1;
import h00.l;
import java.util.List;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.text.v;
import kotlinx.serialization.descriptors.SerialDescriptor;
import vz.b0;
import wz.p;

/* loaded from: classes5.dex */
public final class i {

    /* loaded from: classes5.dex */
    public static final class a extends u implements l<e30.a, b0> {

        /* renamed from: a */
        public static final a f24587a = new a();

        a() {
            super(1);
        }

        public final void a(e30.a aVar) {
            s.g(aVar, "$this$null");
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(e30.a aVar) {
            a(aVar);
            return b0.f54756a;
        }
    }

    public static final f a(String serialName, e kind) {
        boolean w11;
        s.g(serialName, "serialName");
        s.g(kind, "kind");
        w11 = v.w(serialName);
        if (!w11) {
            return n1.a(serialName, kind);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    public static final f b(String serialName, SerialDescriptor[] typeParameters, l<? super e30.a, b0> builderAction) {
        boolean w11;
        List s02;
        s.g(serialName, "serialName");
        s.g(typeParameters, "typeParameters");
        s.g(builderAction, "builderAction");
        w11 = v.w(serialName);
        if (!w11) {
            e30.a aVar = new e30.a(serialName);
            builderAction.invoke(aVar);
            k.a aVar2 = k.a.f24590a;
            int size = aVar.f().size();
            s02 = p.s0(typeParameters);
            return new g(serialName, aVar2, size, s02, aVar);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    public static final f c(String serialName, j kind, SerialDescriptor[] typeParameters, l<? super e30.a, b0> builder) {
        boolean w11;
        List s02;
        s.g(serialName, "serialName");
        s.g(kind, "kind");
        s.g(typeParameters, "typeParameters");
        s.g(builder, "builder");
        w11 = v.w(serialName);
        if (!w11) {
            if (!s.c(kind, k.a.f24590a)) {
                e30.a aVar = new e30.a(serialName);
                builder.invoke(aVar);
                int size = aVar.f().size();
                s02 = p.s0(typeParameters);
                return new g(serialName, kind, size, s02, aVar);
            }
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    public static /* synthetic */ f d(String str, j jVar, f[] fVarArr, l lVar, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            lVar = a.f24587a;
        }
        return c(str, jVar, fVarArr, lVar);
    }
}