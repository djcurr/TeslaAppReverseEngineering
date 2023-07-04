package v;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import v3.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e extends d {
    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Surface surface) {
        super(new OutputConfiguration(surface));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e e(OutputConfiguration outputConfiguration) {
        return new e(outputConfiguration);
    }

    @Override // v.d, v.c, v.f, v.b.a
    public String a() {
        return null;
    }

    @Override // v.d, v.c, v.f, v.b.a
    public Object b() {
        h.a(this.f53760a instanceof OutputConfiguration);
        return this.f53760a;
    }

    e(Object obj) {
        super(obj);
    }
}