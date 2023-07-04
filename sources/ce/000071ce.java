package h10;

import i10.m;
import java.util.Map;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import l10.y;
import l10.z;
import w00.s0;

/* loaded from: classes5.dex */
public final class i implements l {

    /* renamed from: a  reason: collision with root package name */
    private final h f28587a;

    /* renamed from: b  reason: collision with root package name */
    private final w00.i f28588b;

    /* renamed from: c  reason: collision with root package name */
    private final int f28589c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<y, Integer> f28590d;

    /* renamed from: e  reason: collision with root package name */
    private final j20.h<y, m> f28591e;

    /* loaded from: classes5.dex */
    static final class a extends u implements h00.l<y, m> {
        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final m invoke(y typeParameter) {
            s.g(typeParameter, "typeParameter");
            Integer num = (Integer) i.this.f28590d.get(typeParameter);
            if (num == null) {
                return null;
            }
            i iVar = i.this;
            return new m(h10.a.h(h10.a.a(iVar.f28587a, iVar), iVar.f28588b.getAnnotations()), typeParameter, iVar.f28589c + num.intValue(), iVar.f28588b);
        }
    }

    public i(h c11, w00.i containingDeclaration, z typeParameterOwner, int i11) {
        s.g(c11, "c");
        s.g(containingDeclaration, "containingDeclaration");
        s.g(typeParameterOwner, "typeParameterOwner");
        this.f28587a = c11;
        this.f28588b = containingDeclaration;
        this.f28589c = i11;
        this.f28590d = s20.a.d(typeParameterOwner.getTypeParameters());
        this.f28591e = c11.e().h(new a());
    }

    @Override // h10.l
    public s0 a(y javaTypeParameter) {
        s.g(javaTypeParameter, "javaTypeParameter");
        m invoke = this.f28591e.invoke(javaTypeParameter);
        return invoke == null ? this.f28587a.f().a(javaTypeParameter) : invoke;
    }
}