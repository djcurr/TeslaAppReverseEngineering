package v;

import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.n0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import v.b;
import v3.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f implements b.a {

    /* renamed from: a  reason: collision with root package name */
    final Object f53760a;

    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        final List<Surface> f53761a;

        /* renamed from: b  reason: collision with root package name */
        final Size f53762b;

        /* renamed from: c  reason: collision with root package name */
        final int f53763c;

        /* renamed from: d  reason: collision with root package name */
        final int f53764d;

        /* renamed from: e  reason: collision with root package name */
        String f53765e;

        /* renamed from: f  reason: collision with root package name */
        boolean f53766f = false;

        a(Surface surface) {
            h.g(surface, "Surface must not be null");
            this.f53761a = Collections.singletonList(surface);
            this.f53762b = c(surface);
            this.f53763c = a(surface);
            this.f53764d = b(surface);
        }

        private static int a(Surface surface) {
            try {
                Method declaredMethod = Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("detectSurfaceType", Surface.class);
                if (Build.VERSION.SDK_INT < 22) {
                    declaredMethod.setAccessible(true);
                }
                return ((Integer) declaredMethod.invoke(null, surface)).intValue();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e11) {
                n0.d("OutputConfigCompat", "Unable to retrieve surface format.", e11);
                return 0;
            }
        }

        private static int b(Surface surface) {
            try {
                return ((Integer) Surface.class.getDeclaredMethod("getGenerationId", new Class[0]).invoke(surface, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e11) {
                n0.d("OutputConfigCompat", "Unable to retrieve surface generation id.", e11);
                return -1;
            }
        }

        private static Size c(Surface surface) {
            try {
                Method declaredMethod = Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("getSurfaceSize", Surface.class);
                declaredMethod.setAccessible(true);
                return (Size) declaredMethod.invoke(null, surface);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e11) {
                n0.d("OutputConfigCompat", "Unable to retrieve surface size.", e11);
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f53762b.equals(aVar.f53762b) && this.f53763c == aVar.f53763c && this.f53764d == aVar.f53764d && this.f53766f == aVar.f53766f && Objects.equals(this.f53765e, aVar.f53765e)) {
                    int min = Math.min(this.f53761a.size(), aVar.f53761a.size());
                    for (int i11 = 0; i11 < min; i11++) {
                        if (this.f53761a.get(i11) != aVar.f53761a.get(i11)) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f53761a.hashCode() ^ 31;
            int i11 = this.f53764d ^ ((hashCode << 5) - hashCode);
            int hashCode2 = this.f53762b.hashCode() ^ ((i11 << 5) - i11);
            int i12 = this.f53763c ^ ((hashCode2 << 5) - hashCode2);
            int i13 = (this.f53766f ? 1 : 0) ^ ((i12 << 5) - i12);
            int i14 = (i13 << 5) - i13;
            String str = this.f53765e;
            return (str == null ? 0 : str.hashCode()) ^ i14;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Surface surface) {
        this.f53760a = new a(surface);
    }

    @Override // v.b.a
    public String a() {
        return ((a) this.f53760a).f53765e;
    }

    @Override // v.b.a
    public Object b() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return Objects.equals(this.f53760a, ((f) obj).f53760a);
        }
        return false;
    }

    @Override // v.b.a
    public Surface getSurface() {
        List<Surface> list = ((a) this.f53760a).f53761a;
        if (list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    public int hashCode() {
        return this.f53760a.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Object obj) {
        this.f53760a = obj;
    }
}