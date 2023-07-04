package qo;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.mlkit.common.sdkinternal.i;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import oo.d;

/* loaded from: classes2.dex */
public class a implements d {

    /* renamed from: c  reason: collision with root package name */
    public static final a f48375c = new C1032a().a();

    /* renamed from: a  reason: collision with root package name */
    final AtomicReference f48376a = new AtomicReference();

    /* renamed from: b  reason: collision with root package name */
    private final Executor f48377b;

    /* renamed from: qo.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C1032a {

        /* renamed from: a  reason: collision with root package name */
        private Executor f48378a;

        public a a() {
            return new a(this.f48378a, null);
        }
    }

    /* synthetic */ a(Executor executor, b bVar) {
        this.f48377b = executor;
    }

    @Override // oo.d
    public final Executor a() {
        return this.f48377b;
    }

    @Override // oo.d
    public final String b() {
        return true != c() ? "play-services-mlkit-text-recognition" : "text-recognition";
    }

    @Override // oo.d
    public final boolean c() {
        if (this.f48376a.get() != null) {
            return ((Boolean) this.f48376a.get()).booleanValue();
        }
        boolean z11 = DynamiteModule.getLocalVersion(i.c().b(), "com.google.mlkit.dynamite.text.latin") > 0;
        this.f48376a.set(Boolean.valueOf(z11));
        return z11;
    }

    @Override // oo.d
    public final int d() {
        return c() ? 24317 : 24306;
    }

    @Override // oo.d
    public final String e() {
        return true != c() ? "com.google.android.gms.vision.ocr" : "com.google.mlkit.dynamite.text.latin";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            return Objects.equal(this.f48377b, ((a) obj).f48377b);
        }
        return false;
    }

    @Override // oo.d
    public final int f() {
        return 1;
    }

    @Override // oo.d
    public final String g() {
        return true != c() ? "com.google.android.gms.vision.text.mlkit.TextRecognizerCreator" : "com.google.mlkit.vision.text.bundled.latin.BundledLatinTextRecognizerCreator";
    }

    public int hashCode() {
        return Objects.hashCode(this.f48377b);
    }
}