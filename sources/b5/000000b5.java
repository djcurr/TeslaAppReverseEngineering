package ak;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes3.dex */
final class e0 implements j {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f459a;

    public e0(Handler handler) {
        this.f459a = handler;
    }

    @Override // ak.j
    public Message a(int i11) {
        return this.f459a.obtainMessage(i11);
    }

    @Override // ak.j
    public boolean b(int i11) {
        return this.f459a.hasMessages(i11);
    }

    @Override // ak.j
    public Message c(int i11, int i12, int i13, Object obj) {
        return this.f459a.obtainMessage(i11, i12, i13, obj);
    }

    @Override // ak.j
    public Message d(int i11, Object obj) {
        return this.f459a.obtainMessage(i11, obj);
    }

    @Override // ak.j
    public void e(Object obj) {
        this.f459a.removeCallbacksAndMessages(obj);
    }

    @Override // ak.j
    public Message f(int i11, int i12, int i13) {
        return this.f459a.obtainMessage(i11, i12, i13);
    }

    @Override // ak.j
    public boolean g(Runnable runnable) {
        return this.f459a.post(runnable);
    }

    @Override // ak.j
    public boolean h(int i11) {
        return this.f459a.sendEmptyMessage(i11);
    }

    @Override // ak.j
    public boolean i(int i11, long j11) {
        return this.f459a.sendEmptyMessageAtTime(i11, j11);
    }

    @Override // ak.j
    public void j(int i11) {
        this.f459a.removeMessages(i11);
    }
}