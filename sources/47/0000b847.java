package v;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;
import v3.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d extends c {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final OutputConfiguration f53758a;

        /* renamed from: b  reason: collision with root package name */
        String f53759b;

        a(OutputConfiguration outputConfiguration) {
            this.f53758a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return Objects.equals(this.f53758a, aVar.f53758a) && Objects.equals(this.f53759b, aVar.f53759b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f53758a.hashCode() ^ 31;
            int i11 = (hashCode << 5) - hashCode;
            String str = this.f53759b;
            return (str == null ? 0 : str.hashCode()) ^ i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Surface surface) {
        this(new a(new OutputConfiguration(surface)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d d(OutputConfiguration outputConfiguration) {
        return new d(new a(outputConfiguration));
    }

    @Override // v.c, v.f, v.b.a
    public String a() {
        return ((a) this.f53760a).f53759b;
    }

    @Override // v.c, v.f, v.b.a
    public Object b() {
        h.a(this.f53760a instanceof a);
        return ((a) this.f53760a).f53758a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Object obj) {
        super(obj);
    }
}