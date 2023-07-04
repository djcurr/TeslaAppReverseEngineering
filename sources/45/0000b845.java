package v;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;
import v3.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c extends f {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final OutputConfiguration f53755a;

        /* renamed from: b  reason: collision with root package name */
        String f53756b;

        /* renamed from: c  reason: collision with root package name */
        boolean f53757c;

        a(OutputConfiguration outputConfiguration) {
            this.f53755a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return Objects.equals(this.f53755a, aVar.f53755a) && this.f53757c == aVar.f53757c && Objects.equals(this.f53756b, aVar.f53756b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f53755a.hashCode() ^ 31;
            int i11 = (this.f53757c ? 1 : 0) ^ ((hashCode << 5) - hashCode);
            int i12 = (i11 << 5) - i11;
            String str = this.f53756b;
            return (str == null ? 0 : str.hashCode()) ^ i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Surface surface) {
        this(new a(new OutputConfiguration(surface)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c c(OutputConfiguration outputConfiguration) {
        return new c(new a(outputConfiguration));
    }

    @Override // v.f, v.b.a
    public String a() {
        return ((a) this.f53760a).f53756b;
    }

    @Override // v.f, v.b.a
    public Object b() {
        h.a(this.f53760a instanceof a);
        return ((a) this.f53760a).f53755a;
    }

    @Override // v.f, v.b.a
    public Surface getSurface() {
        return ((OutputConfiguration) b()).getSurface();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Object obj) {
        super(obj);
    }
}