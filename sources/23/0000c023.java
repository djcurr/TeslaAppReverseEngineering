package y;

import androidx.camera.core.impl.b1;
import androidx.camera.core.impl.d0;
import androidx.camera.core.impl.f1;
import androidx.camera.core.impl.w0;
import androidx.camera.core.impl.x0;
import y.j;
import z.q;

/* loaded from: classes.dex */
public class j implements f1 {

    /* renamed from: s */
    private final d0 f57813s;

    /* loaded from: classes.dex */
    public static final class a implements q<j> {

        /* renamed from: a */
        private final x0 f57814a = x0.I();

        public static /* synthetic */ boolean c(a aVar, d0 d0Var, d0.a aVar2) {
            return f(aVar, d0Var, aVar2);
        }

        public static a e(final d0 d0Var) {
            a aVar = new a();
            d0Var.c("camera2.captureRequest.option.", new d0.b() { // from class: y.i
                {
                    j.a.this = aVar;
                }

                @Override // androidx.camera.core.impl.d0.b
                public final boolean a(d0.a aVar2) {
                    return j.a.c(j.a.this, d0Var, aVar2);
                }
            });
            return aVar;
        }

        public static /* synthetic */ boolean f(a aVar, d0 d0Var, d0.a aVar2) {
            aVar.a().n(aVar2, d0Var.h(aVar2), d0Var.a(aVar2));
            return true;
        }

        @Override // z.q
        public w0 a() {
            return this.f57814a;
        }

        public j d() {
            return new j(b1.G(this.f57814a));
        }
    }

    public j(d0 d0Var) {
        this.f57813s = d0Var;
    }

    @Override // androidx.camera.core.impl.f1
    public d0 l() {
        return this.f57813s;
    }
}