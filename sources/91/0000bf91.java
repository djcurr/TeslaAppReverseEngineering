package xj;

import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import fj.u;
import java.util.List;

/* loaded from: classes3.dex */
public final class h extends c {

    /* renamed from: g  reason: collision with root package name */
    private final int f57562g;

    /* renamed from: h  reason: collision with root package name */
    private final Object f57563h;

    public h(u uVar, int i11, int i12, Object obj) {
        super(uVar, i11);
        this.f57562g = i12;
        this.f57563h = obj;
    }

    @Override // xj.g
    public int a() {
        return 0;
    }

    @Override // xj.g
    public Object g() {
        return this.f57563h;
    }

    @Override // xj.g
    public void n(long j11, long j12, long j13, List<? extends hj.m> list, MediaChunkIterator[] mediaChunkIteratorArr) {
    }

    @Override // xj.g
    public int q() {
        return this.f57562g;
    }
}