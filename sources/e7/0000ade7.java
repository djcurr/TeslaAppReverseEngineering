package qf;

import com.facebook.imagepipeline.memory.BasePool;

/* loaded from: classes3.dex */
public class q implements v {

    /* renamed from: a  reason: collision with root package name */
    private static q f48103a;

    private q() {
    }

    public static synchronized q h() {
        q qVar;
        synchronized (q.class) {
            if (f48103a == null) {
                f48103a = new q();
            }
            qVar = f48103a;
        }
        return qVar;
    }

    @Override // qf.v
    public void a() {
    }

    @Override // qf.v
    public void b(int i11) {
    }

    @Override // qf.v
    public void c(int i11) {
    }

    @Override // qf.v
    public void d(int i11) {
    }

    @Override // qf.v
    public void e(int i11) {
    }

    @Override // qf.v
    public void f(BasePool basePool) {
    }

    @Override // qf.v
    public void g() {
    }
}