package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Map;
import k20.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;
import w00.n0;

/* loaded from: classes5.dex */
public class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f34934a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<u10.f, y10.g<?>> f34935b;

    /* renamed from: c  reason: collision with root package name */
    private final n0 f34936c;

    public d(d0 d0Var, Map<u10.f, y10.g<?>> map, n0 n0Var) {
        if (d0Var == null) {
            a(0);
        }
        if (map == null) {
            a(1);
        }
        if (n0Var == null) {
            a(2);
        }
        this.f34934a = d0Var;
        this.f34935b = map;
        this.f34936c = n0Var;
    }

    private static /* synthetic */ void a(int i11) {
        String str = (i11 == 3 || i11 == 4 || i11 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 3 || i11 == 4 || i11 == 5) ? 2 : 3];
        if (i11 == 1) {
            objArr[0] = "valueArguments";
        } else if (i11 == 2) {
            objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
        } else if (i11 == 3 || i11 == 4 || i11 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i11 == 3) {
            objArr[1] = "getType";
        } else if (i11 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i11 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i11 != 3 && i11 != 4 && i11 != 5) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i11 != 3 && i11 != 4 && i11 != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public u10.c e() {
        return c.a.a(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public n0 f() {
        n0 n0Var = this.f34936c;
        if (n0Var == null) {
            a(5);
        }
        return n0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public Map<u10.f, y10.g<?>> g() {
        Map<u10.f, y10.g<?>> map = this.f34935b;
        if (map == null) {
            a(4);
        }
        return map;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public d0 getType() {
        d0 d0Var = this.f34934a;
        if (d0Var == null) {
            a(3);
        }
        return d0Var;
    }

    public String toString() {
        return kotlin.reflect.jvm.internal.impl.renderer.c.f35080b.r(this, null);
    }
}