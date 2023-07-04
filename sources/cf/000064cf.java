package d2;

import androidx.compose.ui.platform.y1;

/* loaded from: classes.dex */
public interface c extends x2.d {

    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ Object a(c cVar, androidx.compose.ui.input.pointer.a aVar, zz.d dVar, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    aVar = androidx.compose.ui.input.pointer.a.Main;
                }
                return cVar.P(aVar, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
    }

    <T> Object N(long j11, h00.p<? super c, ? super zz.d<? super T>, ? extends Object> pVar, zz.d<? super T> dVar);

    Object P(androidx.compose.ui.input.pointer.a aVar, zz.d<? super m> dVar);

    m R();

    long e();

    y1 getViewConfiguration();

    <T> Object w(long j11, h00.p<? super c, ? super zz.d<? super T>, ? extends Object> pVar, zz.d<? super T> dVar);

    long z();
}