package d2;

import android.view.MotionEvent;
import java.util.List;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final List<u> f23384a;

    /* renamed from: b  reason: collision with root package name */
    private final g f23385b;

    /* renamed from: c  reason: collision with root package name */
    private int f23386c;

    public m(List<u> changes, g gVar) {
        kotlin.jvm.internal.s.g(changes, "changes");
        this.f23384a = changes;
        this.f23385b = gVar;
        MotionEvent c11 = c();
        l.a(c11 == null ? 0 : c11.getButtonState());
        MotionEvent c12 = c();
        d0.a(c12 != null ? c12.getMetaState() : 0);
        this.f23386c = a();
    }

    private final int a() {
        MotionEvent c11 = c();
        if (c11 != null) {
            int actionMasked = c11.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                return o.f23387a.f();
                            case 9:
                                return o.f23387a.a();
                            case 10:
                                return o.f23387a.b();
                            default:
                                return o.f23387a.g();
                        }
                    }
                    return o.f23387a.c();
                }
                return o.f23387a.e();
            }
            return o.f23387a.d();
        }
        List<u> list = this.f23384a;
        int i11 = 0;
        int size = list.size();
        while (i11 < size) {
            int i12 = i11 + 1;
            u uVar = list.get(i11);
            if (n.d(uVar)) {
                return o.f23387a.e();
            }
            if (n.b(uVar)) {
                return o.f23387a.d();
            }
            i11 = i12;
        }
        return o.f23387a.c();
    }

    public final List<u> b() {
        return this.f23384a;
    }

    public final MotionEvent c() {
        g gVar = this.f23385b;
        if (gVar == null) {
            return null;
        }
        return gVar.b();
    }

    public final int d() {
        return this.f23386c;
    }

    public final void e(int i11) {
        this.f23386c = i11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(List<u> changes) {
        this(changes, null);
        kotlin.jvm.internal.s.g(changes, "changes");
    }
}