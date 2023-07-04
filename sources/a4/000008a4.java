package androidx.room;

import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;
import v4.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class y0 implements h.c {

    /* renamed from: a  reason: collision with root package name */
    private final String f5909a;

    /* renamed from: b  reason: collision with root package name */
    private final File f5910b;

    /* renamed from: c  reason: collision with root package name */
    private final Callable<InputStream> f5911c;

    /* renamed from: d  reason: collision with root package name */
    private final h.c f5912d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y0(String str, File file, Callable<InputStream> callable, h.c cVar) {
        this.f5909a = str;
        this.f5910b = file;
        this.f5911c = callable;
        this.f5912d = cVar;
    }

    @Override // v4.h.c
    public v4.h a(h.b bVar) {
        return new x0(bVar.f54036a, this.f5909a, this.f5910b, this.f5911c, bVar.f54038c.f54035a, this.f5912d.a(bVar));
    }
}