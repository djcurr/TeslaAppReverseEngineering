package t10;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e extends r10.a {

    /* renamed from: g  reason: collision with root package name */
    public static final e f51549g;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f51550f;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
        f51549g = new e(1, 5, 1);
        new e(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int[] versionArray, boolean z11) {
        super(Arrays.copyOf(versionArray, versionArray.length));
        s.g(versionArray, "versionArray");
        this.f51550f = z11;
    }

    public boolean h() {
        boolean z11;
        if (a() == 1 && b() == 0) {
            return false;
        }
        if (this.f51550f) {
            z11 = f(f51549g);
        } else {
            int a11 = a();
            e eVar = f51549g;
            z11 = a11 == eVar.a() && b() <= eVar.b() + 1;
        }
        return z11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(int... numbers) {
        this(numbers, false);
        s.g(numbers, "numbers");
    }
}