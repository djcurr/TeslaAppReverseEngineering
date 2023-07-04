package u;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import u.e;
import u.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class m implements j.b {

    /* renamed from: a  reason: collision with root package name */
    final CameraManager f52806a;

    /* renamed from: b  reason: collision with root package name */
    final Object f52807b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final Map<CameraManager.AvailabilityCallback, j.a> f52808a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        final Handler f52809b;

        a(Handler handler) {
            this.f52809b = handler;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(Context context, Object obj) {
        this.f52806a = (CameraManager) context.getSystemService("camera");
        this.f52807b = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m g(Context context, Handler handler) {
        return new m(context, new a(handler));
    }

    @Override // u.j.b
    public void a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        if (executor != null) {
            j.a aVar = null;
            a aVar2 = (a) this.f52807b;
            if (availabilityCallback != null) {
                synchronized (aVar2.f52808a) {
                    aVar = aVar2.f52808a.get(availabilityCallback);
                    if (aVar == null) {
                        aVar = new j.a(executor, availabilityCallback);
                        aVar2.f52808a.put(availabilityCallback, aVar);
                    }
                }
            }
            this.f52806a.registerAvailabilityCallback(aVar, aVar2.f52809b);
            return;
        }
        throw new IllegalArgumentException("executor was null");
    }

    @Override // u.j.b
    public CameraCharacteristics b(String str) {
        try {
            return this.f52806a.getCameraCharacteristics(str);
        } catch (CameraAccessException e11) {
            throw CameraAccessExceptionCompat.c(e11);
        }
    }

    @Override // u.j.b
    public void c(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        v3.h.f(executor);
        v3.h.f(stateCallback);
        try {
            this.f52806a.openCamera(str, new e.b(executor, stateCallback), ((a) this.f52807b).f52809b);
        } catch (CameraAccessException e11) {
            throw CameraAccessExceptionCompat.c(e11);
        }
    }

    @Override // u.j.b
    public String[] d() {
        try {
            return this.f52806a.getCameraIdList();
        } catch (CameraAccessException e11) {
            throw CameraAccessExceptionCompat.c(e11);
        }
    }

    @Override // u.j.b
    public void e(CameraManager.AvailabilityCallback availabilityCallback) {
        j.a aVar;
        if (availabilityCallback != null) {
            a aVar2 = (a) this.f52807b;
            synchronized (aVar2.f52808a) {
                aVar = aVar2.f52808a.remove(availabilityCallback);
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.a();
        }
        this.f52806a.unregisterAvailabilityCallback(aVar);
    }
}