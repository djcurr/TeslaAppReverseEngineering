package k00;

import java.util.Random;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends k00.a {

    /* renamed from: c  reason: collision with root package name */
    private final a f34201c = new a();

    /* loaded from: classes5.dex */
    public static final class a extends ThreadLocal<Random> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // k00.a
    public Random h() {
        Random random = this.f34201c.get();
        s.f(random, "implStorage.get()");
        return random;
    }
}