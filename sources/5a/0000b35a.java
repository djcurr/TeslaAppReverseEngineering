package t;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import t.u1;

/* loaded from: classes.dex */
final class g2 extends u1.a {

    /* renamed from: a  reason: collision with root package name */
    private final List<u1.a> f50997a;

    g2(List<u1.a> list) {
        ArrayList arrayList = new ArrayList();
        this.f50997a = arrayList;
        arrayList.addAll(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u1.a v(u1.a... aVarArr) {
        return new g2(Arrays.asList(aVarArr));
    }

    @Override // t.u1.a
    public void n(u1 u1Var) {
        for (u1.a aVar : this.f50997a) {
            aVar.n(u1Var);
        }
    }

    @Override // t.u1.a
    public void o(u1 u1Var) {
        for (u1.a aVar : this.f50997a) {
            aVar.o(u1Var);
        }
    }

    @Override // t.u1.a
    public void p(u1 u1Var) {
        for (u1.a aVar : this.f50997a) {
            aVar.p(u1Var);
        }
    }

    @Override // t.u1.a
    public void q(u1 u1Var) {
        for (u1.a aVar : this.f50997a) {
            aVar.q(u1Var);
        }
    }

    @Override // t.u1.a
    public void r(u1 u1Var) {
        for (u1.a aVar : this.f50997a) {
            aVar.r(u1Var);
        }
    }

    @Override // t.u1.a
    public void s(u1 u1Var) {
        for (u1.a aVar : this.f50997a) {
            aVar.s(u1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // t.u1.a
    public void t(u1 u1Var) {
        for (u1.a aVar : this.f50997a) {
            aVar.t(u1Var);
        }
    }

    @Override // t.u1.a
    public void u(u1 u1Var, Surface surface) {
        for (u1.a aVar : this.f50997a) {
            aVar.u(u1Var, surface);
        }
    }

    /* loaded from: classes.dex */
    static class a extends u1.a {

        /* renamed from: a  reason: collision with root package name */
        private final CameraCaptureSession.StateCallback f50998a;

        a(CameraCaptureSession.StateCallback stateCallback) {
            this.f50998a = stateCallback;
        }

        @Override // t.u1.a
        public void n(u1 u1Var) {
            this.f50998a.onActive(u1Var.k().c());
        }

        @Override // t.u1.a
        public void o(u1 u1Var) {
            this.f50998a.onCaptureQueueEmpty(u1Var.k().c());
        }

        @Override // t.u1.a
        public void p(u1 u1Var) {
            this.f50998a.onClosed(u1Var.k().c());
        }

        @Override // t.u1.a
        public void q(u1 u1Var) {
            this.f50998a.onConfigureFailed(u1Var.k().c());
        }

        @Override // t.u1.a
        public void r(u1 u1Var) {
            this.f50998a.onConfigured(u1Var.k().c());
        }

        @Override // t.u1.a
        public void s(u1 u1Var) {
            this.f50998a.onReady(u1Var.k().c());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // t.u1.a
        public void t(u1 u1Var) {
        }

        @Override // t.u1.a
        public void u(u1 u1Var, Surface surface) {
            this.f50998a.onSurfacePrepared(u1Var.k().c(), surface);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(List<CameraCaptureSession.StateCallback> list) {
            this(t0.a(list));
        }
    }
}