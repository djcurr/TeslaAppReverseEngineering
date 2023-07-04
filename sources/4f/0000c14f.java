package y00;

import k20.b1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class t implements w00.c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f58910a = new a(null);

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d20.h a(w00.c cVar, b1 typeSubstitution, kotlin.reflect.jvm.internal.impl.types.checker.h kotlinTypeRefiner) {
            kotlin.jvm.internal.s.g(cVar, "<this>");
            kotlin.jvm.internal.s.g(typeSubstitution, "typeSubstitution");
            kotlin.jvm.internal.s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
            t tVar = cVar instanceof t ? (t) cVar : null;
            if (tVar == null) {
                d20.h I = cVar.I(typeSubstitution);
                kotlin.jvm.internal.s.f(I, "this.getMemberScope(\n   …ubstitution\n            )");
                return I;
            }
            return tVar.w(typeSubstitution, kotlinTypeRefiner);
        }

        public final d20.h b(w00.c cVar, kotlin.reflect.jvm.internal.impl.types.checker.h kotlinTypeRefiner) {
            kotlin.jvm.internal.s.g(cVar, "<this>");
            kotlin.jvm.internal.s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
            t tVar = cVar instanceof t ? (t) cVar : null;
            if (tVar == null) {
                d20.h V = cVar.V();
                kotlin.jvm.internal.s.f(V, "this.unsubstitutedMemberScope");
                return V;
            }
            return tVar.M(kotlinTypeRefiner);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract d20.h M(kotlin.reflect.jvm.internal.impl.types.checker.h hVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract d20.h w(b1 b1Var, kotlin.reflect.jvm.internal.impl.types.checker.h hVar);
}