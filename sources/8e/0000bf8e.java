package xj;

import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.z0;
import fj.u;
import java.util.List;

/* loaded from: classes3.dex */
public interface g extends j {

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final u f57558a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f57559b;

        /* renamed from: c  reason: collision with root package name */
        public final int f57560c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f57561d;

        public a(u uVar, int... iArr) {
            this(uVar, iArr, 0, null);
        }

        public a(u uVar, int[] iArr, int i11, Object obj) {
            this.f57558a = uVar;
            this.f57559b = iArr;
            this.f57560c = i11;
            this.f57561d = obj;
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        g[] a(a[] aVarArr, zj.d dVar, j.a aVar, z0 z0Var);
    }

    int a();

    boolean c(int i11, long j11);

    void disable();

    void enable();

    void f(float f11);

    Object g();

    default void h() {
    }

    default boolean k(long j11, hj.e eVar, List<? extends hj.m> list) {
        return false;
    }

    default void l(boolean z11) {
    }

    int m(long j11, List<? extends hj.m> list);

    void n(long j11, long j12, long j13, List<? extends hj.m> list, MediaChunkIterator[] mediaChunkIteratorArr);

    int o();

    ci.i p();

    int q();

    default void r() {
    }
}