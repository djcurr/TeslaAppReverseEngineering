package l0;

import java.util.Iterator;
import l0.k1;
import l0.p;

/* loaded from: classes.dex */
public final class l1<V extends p> implements k1<V> {

    /* renamed from: a */
    private final r f36203a;

    /* renamed from: b */
    private V f36204b;

    /* renamed from: c */
    private V f36205c;

    /* renamed from: d */
    private V f36206d;

    /* loaded from: classes.dex */
    public static final class a implements r {

        /* renamed from: a */
        final /* synthetic */ d0 f36207a;

        a(d0 d0Var) {
            this.f36207a = d0Var;
        }

        @Override // l0.r
        public d0 get(int i11) {
            return this.f36207a;
        }
    }

    public l1(r anims) {
        kotlin.jvm.internal.s.g(anims, "anims");
        this.f36203a = anims;
    }

    @Override // l0.g1
    public boolean a() {
        return k1.a.b(this);
    }

    @Override // l0.g1
    public V b(long j11, V initialValue, V targetValue, V initialVelocity) {
        kotlin.jvm.internal.s.g(initialValue, "initialValue");
        kotlin.jvm.internal.s.g(targetValue, "targetValue");
        kotlin.jvm.internal.s.g(initialVelocity, "initialVelocity");
        if (this.f36204b == null) {
            this.f36204b = (V) q.d(initialValue);
        }
        int i11 = 0;
        V v11 = this.f36204b;
        if (v11 == null) {
            kotlin.jvm.internal.s.x("valueVector");
            v11 = null;
        }
        int b11 = v11.b();
        while (i11 < b11) {
            int i12 = i11 + 1;
            V v12 = this.f36204b;
            if (v12 == null) {
                kotlin.jvm.internal.s.x("valueVector");
                v12 = null;
            }
            v12.e(i11, this.f36203a.get(i11).c(j11, initialValue.a(i11), targetValue.a(i11), initialVelocity.a(i11)));
            i11 = i12;
        }
        V v13 = this.f36204b;
        if (v13 == null) {
            kotlin.jvm.internal.s.x("valueVector");
            return null;
        }
        return v13;
    }

    @Override // l0.g1
    public V d(V initialValue, V targetValue, V initialVelocity) {
        kotlin.jvm.internal.s.g(initialValue, "initialValue");
        kotlin.jvm.internal.s.g(targetValue, "targetValue");
        kotlin.jvm.internal.s.g(initialVelocity, "initialVelocity");
        if (this.f36206d == null) {
            this.f36206d = (V) q.d(initialVelocity);
        }
        int i11 = 0;
        V v11 = this.f36206d;
        if (v11 == null) {
            kotlin.jvm.internal.s.x("endVelocityVector");
            v11 = null;
        }
        int b11 = v11.b();
        while (i11 < b11) {
            int i12 = i11 + 1;
            V v12 = this.f36206d;
            if (v12 == null) {
                kotlin.jvm.internal.s.x("endVelocityVector");
                v12 = null;
            }
            v12.e(i11, this.f36203a.get(i11).b(initialValue.a(i11), targetValue.a(i11), initialVelocity.a(i11)));
            i11 = i12;
        }
        V v13 = this.f36206d;
        if (v13 == null) {
            kotlin.jvm.internal.s.x("endVelocityVector");
            return null;
        }
        return v13;
    }

    @Override // l0.g1
    public long f(V initialValue, V targetValue, V initialVelocity) {
        m00.i r11;
        kotlin.jvm.internal.s.g(initialValue, "initialValue");
        kotlin.jvm.internal.s.g(targetValue, "targetValue");
        kotlin.jvm.internal.s.g(initialVelocity, "initialVelocity");
        r11 = m00.l.r(0, initialValue.b());
        Iterator<Integer> it2 = r11.iterator();
        long j11 = 0;
        while (it2.hasNext()) {
            int a11 = ((wz.n0) it2).a();
            j11 = Math.max(j11, this.f36203a.get(a11).e(initialValue.a(a11), targetValue.a(a11), initialVelocity.a(a11)));
        }
        return j11;
    }

    @Override // l0.g1
    public V g(long j11, V initialValue, V targetValue, V initialVelocity) {
        kotlin.jvm.internal.s.g(initialValue, "initialValue");
        kotlin.jvm.internal.s.g(targetValue, "targetValue");
        kotlin.jvm.internal.s.g(initialVelocity, "initialVelocity");
        if (this.f36205c == null) {
            this.f36205c = (V) q.d(initialVelocity);
        }
        int i11 = 0;
        V v11 = this.f36205c;
        if (v11 == null) {
            kotlin.jvm.internal.s.x("velocityVector");
            v11 = null;
        }
        int b11 = v11.b();
        while (i11 < b11) {
            int i12 = i11 + 1;
            V v12 = this.f36205c;
            if (v12 == null) {
                kotlin.jvm.internal.s.x("velocityVector");
                v12 = null;
            }
            v12.e(i11, this.f36203a.get(i11).d(j11, initialValue.a(i11), targetValue.a(i11), initialVelocity.a(i11)));
            i11 = i12;
        }
        V v13 = this.f36205c;
        if (v13 == null) {
            kotlin.jvm.internal.s.x("velocityVector");
            return null;
        }
        return v13;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l1(d0 anim) {
        this(new a(anim));
        kotlin.jvm.internal.s.g(anim, "anim");
    }
}