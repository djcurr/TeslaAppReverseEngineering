package androidx.camera.camera2;

import android.content.Context;
import androidx.camera.camera2.Camera2Config;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.p;
import androidx.camera.core.impl.q;
import androidx.camera.core.impl.q1;
import androidx.camera.core.impl.y;
import androidx.camera.core.k;
import java.util.Set;
import r.a;
import r.b;
import t.p0;
import t.r0;
import t.u;
import z.e;

/* loaded from: classes.dex */
public final class Camera2Config {

    /* loaded from: classes.dex */
    public static final class DefaultProvider implements k.b {
        @Override // androidx.camera.core.k.b
        public k getCameraXConfig() {
            return Camera2Config.c();
        }
    }

    public static /* synthetic */ q1 a(Context context) {
        return e(context);
    }

    public static /* synthetic */ p b(Context context, Object obj, Set set) {
        return d(context, obj, set);
    }

    public static k c() {
        b bVar = new q.a() { // from class: r.b
            @Override // androidx.camera.core.impl.q.a
            public final q a(Context context, y yVar, e eVar) {
                return new u(context, yVar, eVar);
            }
        };
        a aVar = new p.a() { // from class: r.a
            @Override // androidx.camera.core.impl.p.a
            public final p a(Context context, Object obj, Set set) {
                return Camera2Config.b(context, obj, set);
            }
        };
        return new k.a().c(bVar).d(aVar).g(new q1.b() { // from class: r.c
            @Override // androidx.camera.core.impl.q1.b
            public final q1 a(Context context) {
                return Camera2Config.a(context);
            }
        }).a();
    }

    public static /* synthetic */ p d(Context context, Object obj, Set set) {
        try {
            return new p0(context, obj, set);
        } catch (CameraUnavailableException e11) {
            throw new InitializationException(e11);
        }
    }

    public static /* synthetic */ q1 e(Context context) {
        return new r0(context);
    }
}