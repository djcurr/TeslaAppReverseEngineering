package mo;

import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.sdkinternal.i;

/* loaded from: classes2.dex */
public class c {
    public static d a(e eVar) {
        Preconditions.checkNotNull(eVar, "You must provide a valid FaceDetectorOptions.");
        return ((com.google.mlkit.vision.face.internal.c) i.c().a(com.google.mlkit.vision.face.internal.c.class)).a(eVar);
    }
}