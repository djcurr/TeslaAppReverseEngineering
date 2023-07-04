package nr;

import v20.o0;

/* loaded from: classes2.dex */
public interface a<PropsT, StateT, OutputT> {

    /* renamed from: nr.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0812a {
        public static /* synthetic */ Object a(a aVar, p pVar, Object obj, String str, h00.l lVar, int i11, Object obj2) {
            if (obj2 == null) {
                if ((i11 & 4) != 0) {
                    str = "";
                }
                return aVar.c(pVar, obj, str, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderChild");
        }
    }

    void a(String str, h00.p<? super o0, ? super zz.d<? super vz.b0>, ? extends Object> pVar);

    h<q<? super PropsT, StateT, ? extends OutputT>> b();

    <ChildPropsT, ChildOutputT, ChildRenderingT> ChildRenderingT c(p<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> pVar, ChildPropsT childpropst, String str, h00.l<? super ChildOutputT, ? extends q<? super PropsT, StateT, ? extends OutputT>> lVar);
}