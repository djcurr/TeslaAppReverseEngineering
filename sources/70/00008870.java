package n0;

/* loaded from: classes.dex */
public interface f0 {

    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ Object a(f0 f0Var, m0.v vVar, h00.p pVar, zz.d dVar, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    vVar = m0.v.Default;
                }
                return f0Var.a(vVar, pVar, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
        }
    }

    Object a(m0.v vVar, h00.p<? super c0, ? super zz.d<? super vz.b0>, ? extends Object> pVar, zz.d<? super vz.b0> dVar);

    float b(float f11);

    boolean c();
}