package w5;

import android.webkit.MimeTypeMap;
import ch.qos.logback.core.CoreConstants;
import java.io.File;
import kotlin.jvm.internal.s;
import okio.r;
import w5.g;

/* loaded from: classes.dex */
public final class h implements g<File> {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f55611a;

    public h(boolean z11) {
        this.f55611a = z11;
    }

    @Override // w5.g
    /* renamed from: d */
    public Object c(t5.b bVar, File file, c6.g gVar, v5.j jVar, zz.d<? super f> dVar) {
        String m11;
        okio.h d11 = r.d(r.j(file));
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        m11 = e00.j.m(file);
        return new m(d11, singleton.getMimeTypeFromExtension(m11), v5.b.DISK);
    }

    @Override // w5.g
    /* renamed from: e */
    public boolean a(File data) {
        s.g(data, "data");
        return g.a.a(this, data);
    }

    @Override // w5.g
    /* renamed from: f */
    public String b(File data) {
        s.g(data, "data");
        if (!this.f55611a) {
            String path = data.getPath();
            s.f(path, "data.path");
            return path;
        }
        return data.getPath() + CoreConstants.COLON_CHAR + data.lastModified();
    }
}