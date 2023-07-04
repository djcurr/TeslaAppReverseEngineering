package u;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.Executor;
import u.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c implements a.InterfaceC1175a {

    /* renamed from: a  reason: collision with root package name */
    final CameraCaptureSession f52775a;

    /* renamed from: b  reason: collision with root package name */
    final Object f52776b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Handler f52777a;

        a(Handler handler) {
            this.f52777a = handler;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(CameraCaptureSession cameraCaptureSession, Object obj) {
        this.f52775a = (CameraCaptureSession) v3.h.f(cameraCaptureSession);
        this.f52776b = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a.InterfaceC1175a d(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new c(cameraCaptureSession, new a(handler));
    }

    @Override // u.a.InterfaceC1175a
    public CameraCaptureSession a() {
        return this.f52775a;
    }

    @Override // u.a.InterfaceC1175a
    public int b(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f52775a.captureBurst(list, new a.b(executor, captureCallback), ((a) this.f52776b).f52777a);
    }

    @Override // u.a.InterfaceC1175a
    public int c(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f52775a.setRepeatingRequest(captureRequest, new a.b(executor, captureCallback), ((a) this.f52776b).f52777a);
    }
}