package z5;

import java.io.File;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k extends g {

    /* renamed from: c  reason: collision with root package name */
    private static volatile int f60252c;

    /* renamed from: e  reason: collision with root package name */
    public static final k f60254e = new k();

    /* renamed from: b  reason: collision with root package name */
    private static final File f60251b = new File("/proc/self/fd");

    /* renamed from: d  reason: collision with root package name */
    private static volatile boolean f60253d = true;

    private k() {
        super(null);
    }

    private final synchronized boolean b(g6.k kVar) {
        int i11 = f60252c;
        f60252c = i11 + 1;
        if (i11 >= 50) {
            f60252c = 0;
            String[] list = f60251b.list();
            if (list == null) {
                list = new String[0];
            }
            int length = list.length;
            f60253d = length < 750;
            if (f60253d && kVar != null && kVar.getLevel() <= 5) {
                kVar.a("LimitedFileDescriptorHardwareBitmapService", 5, "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + length, null);
            }
        }
        return f60253d;
    }

    @Override // z5.g
    public boolean a(c6.g size, g6.k kVar) {
        kotlin.jvm.internal.s.g(size, "size");
        if (size instanceof c6.c) {
            c6.c cVar = (c6.c) size;
            if (cVar.d() < 75 || cVar.c() < 75) {
                return false;
            }
        }
        return b(kVar);
    }
}