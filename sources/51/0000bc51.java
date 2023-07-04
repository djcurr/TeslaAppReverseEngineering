package w5;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.InputStream;
import kotlin.jvm.internal.s;
import okio.r;

/* loaded from: classes.dex */
public final class c implements g<Uri> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f55606a;

    public c(Context context) {
        s.g(context, "context");
        this.f55606a = context;
    }

    @Override // w5.g
    /* renamed from: d */
    public Object c(t5.b bVar, Uri uri, c6.g gVar, v5.j jVar, zz.d<? super f> dVar) {
        InputStream openInputStream;
        if (f(uri)) {
            AssetFileDescriptor openAssetFileDescriptor = this.f55606a.getContentResolver().openAssetFileDescriptor(uri, "r");
            openInputStream = openAssetFileDescriptor != null ? openAssetFileDescriptor.createInputStream() : null;
            if (openInputStream == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + uri + "'.").toString());
            }
        } else {
            openInputStream = this.f55606a.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new IllegalStateException(("Unable to open '" + uri + "'.").toString());
            }
        }
        return new m(r.d(r.k(openInputStream)), this.f55606a.getContentResolver().getType(uri), v5.b.DISK);
    }

    @Override // w5.g
    /* renamed from: e */
    public boolean a(Uri data) {
        s.g(data, "data");
        return s.c(data.getScheme(), "content");
    }

    public final boolean f(Uri data) {
        s.g(data, "data");
        return s.c(data.getAuthority(), "com.android.contacts") && s.c(data.getLastPathSegment(), "display_photo");
    }

    @Override // w5.g
    /* renamed from: g */
    public String b(Uri data) {
        s.g(data, "data");
        String uri = data.toString();
        s.f(uri, "data.toString()");
        return uri;
    }
}