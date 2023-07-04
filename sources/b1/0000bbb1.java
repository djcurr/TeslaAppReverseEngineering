package w00;

import java.util.Collection;

/* loaded from: classes5.dex */
public interface q0 {

    /* loaded from: classes5.dex */
    public static final class a implements q0 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f55322a = new a();

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // w00.q0
        public Collection<k20.d0> a(k20.w0 currentTypeConstructor, Collection<? extends k20.d0> superTypes, h00.l<? super k20.w0, ? extends Iterable<? extends k20.d0>> neighbors, h00.l<? super k20.d0, vz.b0> reportLoop) {
            kotlin.jvm.internal.s.g(currentTypeConstructor, "currentTypeConstructor");
            kotlin.jvm.internal.s.g(superTypes, "superTypes");
            kotlin.jvm.internal.s.g(neighbors, "neighbors");
            kotlin.jvm.internal.s.g(reportLoop, "reportLoop");
            return superTypes;
        }
    }

    Collection<k20.d0> a(k20.w0 w0Var, Collection<? extends k20.d0> collection, h00.l<? super k20.w0, ? extends Iterable<? extends k20.d0>> lVar, h00.l<? super k20.d0, vz.b0> lVar2);
}