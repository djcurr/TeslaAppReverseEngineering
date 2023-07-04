package mh;

import android.content.Context;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Handler;
import android.util.Size;
import mh.f;

/* loaded from: classes3.dex */
class d extends c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public d(f.a aVar, i iVar, Context context, Handler handler) {
        super(aVar, iVar, context, handler);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mh.c
    public void d0(k kVar, StreamConfigurationMap streamConfigurationMap) {
        Size[] highResolutionOutputSizes;
        if (streamConfigurationMap.getHighResolutionOutputSizes(256) != null) {
            for (Size size : streamConfigurationMap.getHighResolutionOutputSizes(256)) {
                kVar.a(new j(size.getWidth(), size.getHeight()));
            }
        }
        if (kVar.c()) {
            super.d0(kVar, streamConfigurationMap);
        }
    }
}