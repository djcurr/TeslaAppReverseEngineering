package go;

import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.sdkinternal.i;

/* loaded from: classes2.dex */
public class c {
    public static a a(b bVar) {
        Preconditions.checkNotNull(bVar, "You must provide a valid BarcodeScannerOptions.");
        return ((com.google.mlkit.vision.barcode.internal.d) i.c().a(com.google.mlkit.vision.barcode.internal.d.class)).a(bVar);
    }
}