package go;

import com.google.android.gms.common.internal.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final int f28048a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f28049b;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f28050a = 0;

        /* renamed from: b  reason: collision with root package name */
        private Executor f28051b;

        public b a() {
            return new b(this.f28050a, this.f28051b, null);
        }

        public a b(int i11, int... iArr) {
            this.f28050a = i11;
            if (iArr != null) {
                for (int i12 : iArr) {
                    this.f28050a = i12 | this.f28050a;
                }
            }
            return this;
        }
    }

    /* synthetic */ b(int i11, Executor executor, d dVar) {
        this.f28048a = i11;
        this.f28049b = executor;
    }

    public final int a() {
        return this.f28048a;
    }

    public final Executor b() {
        return this.f28049b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f28048a == bVar.f28048a && Objects.equal(this.f28049b, bVar.f28049b);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f28048a), this.f28049b);
    }
}