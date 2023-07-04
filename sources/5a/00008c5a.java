package nf;

import java.io.Closeable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class c implements Closeable, h {

    /* renamed from: b  reason: collision with root package name */
    private static final Set<String> f41635b = new HashSet(Arrays.asList("encoded_size", "encoded_width", "encoded_height", "uri_source", "image_format", "bitmap_config", "is_rounded"));

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Object> f41636a = new HashMap();

    public j a() {
        return i.f41655d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    protected void finalize() {
        if (isClosed()) {
            return;
        }
        nd.a.I("CloseableImage", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public abstract int g();

    @Override // nf.g
    public Map<String, Object> getExtras() {
        return this.f41636a;
    }

    public abstract boolean isClosed();

    public boolean j() {
        return false;
    }

    public void l(String str, Object obj) {
        if (f41635b.contains(str)) {
            this.f41636a.put(str, obj);
        }
    }

    public void m(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        for (String str : f41635b) {
            Object obj = map.get(str);
            if (obj != null) {
                this.f41636a.put(str, obj);
            }
        }
    }
}