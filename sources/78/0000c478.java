package z5;

import android.graphics.Bitmap;
import android.view.View;
import b6.h;
import coil.memory.ViewTargetRequestDelegate;
import java.util.UUID;
import v20.a2;
import v20.e1;
import v20.o0;
import v20.t1;
import vz.b0;

/* loaded from: classes.dex */
public final class v implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private ViewTargetRequestDelegate f60318a;

    /* renamed from: b  reason: collision with root package name */
    private volatile UUID f60319b;

    /* renamed from: c  reason: collision with root package name */
    private volatile a2 f60320c;

    /* renamed from: d  reason: collision with root package name */
    private volatile a2 f60321d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f60322e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f60323f = true;

    /* renamed from: g  reason: collision with root package name */
    private final androidx.collection.g<Object, Bitmap> f60324g = new androidx.collection.g<>();

    @kotlin.coroutines.jvm.internal.f(c = "coil.memory.ViewTargetRequestManager$clearCurrentRequest$1", f = "ViewTargetRequestManager.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        private o0 f60325a;

        /* renamed from: b  reason: collision with root package name */
        int f60326b;

        a(zz.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> completion) {
            kotlin.jvm.internal.s.g(completion, "completion");
            a aVar = new a(completion);
            aVar.f60325a = (o0) obj;
            return aVar;
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            if (this.f60326b == 0) {
                vz.r.b(obj);
                v.this.e(null);
                return b0.f54756a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final UUID c() {
        UUID uuid = this.f60319b;
        if (uuid != null && this.f60322e && g6.e.j()) {
            return uuid;
        }
        UUID randomUUID = UUID.randomUUID();
        kotlin.jvm.internal.s.f(randomUUID, "UUID.randomUUID()");
        return randomUUID;
    }

    public final void a() {
        a2 d11;
        this.f60319b = null;
        a2 a2Var = this.f60321d;
        if (a2Var != null) {
            a2.a.a(a2Var, null, 1, null);
        }
        d11 = v20.k.d(t1.f54002a, e1.c().R0(), null, new a(null), 2, null);
        this.f60321d = d11;
    }

    public final UUID b() {
        return this.f60319b;
    }

    public final Bitmap d(Object tag, Bitmap bitmap) {
        kotlin.jvm.internal.s.g(tag, "tag");
        if (bitmap != null) {
            return this.f60324g.put(tag, bitmap);
        }
        return this.f60324g.remove(tag);
    }

    public final void e(ViewTargetRequestDelegate viewTargetRequestDelegate) {
        if (this.f60322e) {
            this.f60322e = false;
        } else {
            a2 a2Var = this.f60321d;
            if (a2Var != null) {
                a2.a.a(a2Var, null, 1, null);
            }
            this.f60321d = null;
        }
        ViewTargetRequestDelegate viewTargetRequestDelegate2 = this.f60318a;
        if (viewTargetRequestDelegate2 != null) {
            viewTargetRequestDelegate2.b();
        }
        this.f60318a = viewTargetRequestDelegate;
        this.f60323f = true;
    }

    public final UUID f(a2 job) {
        kotlin.jvm.internal.s.g(job, "job");
        UUID c11 = c();
        this.f60319b = c11;
        this.f60320c = job;
        return c11;
    }

    public final void g(h.a aVar) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v11) {
        kotlin.jvm.internal.s.g(v11, "v");
        if (this.f60323f) {
            this.f60323f = false;
            return;
        }
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.f60318a;
        if (viewTargetRequestDelegate != null) {
            this.f60322e = true;
            viewTargetRequestDelegate.d();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v11) {
        kotlin.jvm.internal.s.g(v11, "v");
        this.f60323f = false;
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.f60318a;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.b();
        }
    }
}