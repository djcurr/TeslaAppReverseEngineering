package m00;

import kotlin.jvm.internal.DefaultConstructorMarker;
import wz.s;

/* loaded from: classes5.dex */
public class a implements Iterable<Character>, i00.a {

    /* renamed from: a  reason: collision with root package name */
    private final char f38138a;

    /* renamed from: b  reason: collision with root package name */
    private final char f38139b;

    /* renamed from: c  reason: collision with root package name */
    private final int f38140c;

    /* renamed from: m00.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0731a {
        private C0731a() {
        }

        public /* synthetic */ C0731a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C0731a(null);
    }

    public a(char c11, char c12, int i11) {
        if (i11 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f38138a = c11;
            this.f38139b = (char) b00.c.b(c11, c12, i11);
            this.f38140c = i11;
            return;
        }
        throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
    }

    public final char c() {
        return this.f38138a;
    }

    public final char e() {
        return this.f38139b;
    }

    @Override // java.lang.Iterable
    /* renamed from: f */
    public s iterator() {
        return new b(this.f38138a, this.f38139b, this.f38140c);
    }
}