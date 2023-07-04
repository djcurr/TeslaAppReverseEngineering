package k20;

/* loaded from: classes5.dex */
public interface u0 {

    /* loaded from: classes5.dex */
    public static final class a implements u0 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34332a = new a();

        private a() {
        }

        @Override // k20.u0
        public void a(w00.r0 typeAlias, w00.s0 s0Var, d0 substitutedArgument) {
            kotlin.jvm.internal.s.g(typeAlias, "typeAlias");
            kotlin.jvm.internal.s.g(substitutedArgument, "substitutedArgument");
        }

        @Override // k20.u0
        public void b(w00.r0 typeAlias) {
            kotlin.jvm.internal.s.g(typeAlias, "typeAlias");
        }

        @Override // k20.u0
        public void c(d1 substitutor, d0 unsubstitutedArgument, d0 argument, w00.s0 typeParameter) {
            kotlin.jvm.internal.s.g(substitutor, "substitutor");
            kotlin.jvm.internal.s.g(unsubstitutedArgument, "unsubstitutedArgument");
            kotlin.jvm.internal.s.g(argument, "argument");
            kotlin.jvm.internal.s.g(typeParameter, "typeParameter");
        }

        @Override // k20.u0
        public void d(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c annotation) {
            kotlin.jvm.internal.s.g(annotation, "annotation");
        }
    }

    void a(w00.r0 r0Var, w00.s0 s0Var, d0 d0Var);

    void b(w00.r0 r0Var);

    void c(d1 d1Var, d0 d0Var, d0 d0Var2, w00.s0 s0Var);

    void d(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar);
}