package ct;

import io.realm.n0;
import io.realm.w0;

/* loaded from: classes6.dex */
public class j extends n0 implements w0 {

    /* renamed from: a  reason: collision with root package name */
    private String f23098a;

    /* renamed from: b  reason: collision with root package name */
    private String f23099b;

    public j() {
        if (this instanceof io.realm.internal.m) {
            ((io.realm.internal.m) this).f();
        }
    }

    @Override // io.realm.w0
    public void a(String str) {
        this.f23098a = str;
    }

    @Override // io.realm.w0
    public String b() {
        return this.f23099b;
    }

    @Override // io.realm.w0
    public String c() {
        return this.f23098a;
    }

    @Override // io.realm.w0
    public void e(String str) {
        this.f23099b = str;
    }

    public String k() {
        return c();
    }

    public String l() {
        return b();
    }

    public j m(String str) {
        a(str);
        return this;
    }

    public j n(String str) {
        e(str);
        return this;
    }
}