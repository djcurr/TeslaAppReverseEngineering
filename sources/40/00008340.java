package lo;

import android.graphics.Bitmap;
import android.media.Image;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.mlkit.common.MlKitException;
import java.nio.ByteBuffer;

@KeepForSdk
/* loaded from: classes2.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static d f37251a;

    static {
        new GmsLogger("MLKitImageUtils", "");
        f37251a = new d();
    }

    private d() {
    }

    @KeepForSdk
    public static d b() {
        return f37251a;
    }

    @KeepForSdk
    public IObjectWrapper a(ko.a aVar) {
        int f11 = aVar.f();
        if (f11 != -1) {
            if (f11 != 17) {
                if (f11 == 35) {
                    return ObjectWrapper.wrap(aVar.h());
                }
                if (f11 != 842094169) {
                    int f12 = aVar.f();
                    throw new MlKitException("Unsupported image format: " + f12, 3);
                }
            }
            return ObjectWrapper.wrap((ByteBuffer) Preconditions.checkNotNull(aVar.d()));
        }
        return ObjectWrapper.wrap((Bitmap) Preconditions.checkNotNull(aVar.c()));
    }

    @KeepForSdk
    public int c(ko.a aVar) {
        return aVar.f();
    }

    @KeepForSdk
    public int d(ko.a aVar) {
        if (aVar.f() == -1) {
            return ((Bitmap) Preconditions.checkNotNull(aVar.c())).getAllocationByteCount();
        }
        if (aVar.f() != 17 && aVar.f() != 842094169) {
            if (aVar.f() != 35) {
                return 0;
            }
            return (((Image.Plane[]) Preconditions.checkNotNull(aVar.i()))[0].getBuffer().limit() * 3) / 2;
        }
        return ((ByteBuffer) Preconditions.checkNotNull(aVar.d())).limit();
    }
}