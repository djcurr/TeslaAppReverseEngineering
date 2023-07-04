package qr;

import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.p;
import androidx.lifecycle.v;
import androidx.lifecycle.v0;
import com.squareup.workflow1.ui.androidx.RealWorkflowLifecycleOwner;
import h00.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes2.dex */
public interface b extends v {

    /* renamed from: i1 */
    public static final a f48435i1 = a.f48436a;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f48436a = new a();

        /* renamed from: qr.b$a$a */
        /* loaded from: classes2.dex */
        public static final class C1033a extends u implements l<View, p> {

            /* renamed from: a */
            public static final C1033a f48437a = new C1033a();

            C1033a() {
                super(1);
            }

            @Override // h00.l
            /* renamed from: a */
            public final p invoke(View v11) {
                s.g(v11, "v");
                return a.f48436a.b(v11);
            }
        }

        private a() {
        }

        public final p b(View view) {
            v a11;
            ViewParent parent = view.getParent();
            View view2 = parent instanceof View ? (View) parent : null;
            if (view2 == null || (a11 = qr.a.f48434a.a(view2)) == null) {
                return null;
            }
            return a11.getLifecycle();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void e(a aVar, View view, l lVar, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                lVar = C1033a.f48437a;
            }
            aVar.d(view, lVar);
        }

        public final b c(View view) {
            s.g(view, "view");
            v a11 = v0.a(view);
            if (a11 instanceof b) {
                return (b) a11;
            }
            return null;
        }

        public final void d(View view, l<? super View, ? extends p> findParentLifecycle) {
            s.g(view, "view");
            s.g(findParentLifecycle, "findParentLifecycle");
            RealWorkflowLifecycleOwner realWorkflowLifecycleOwner = new RealWorkflowLifecycleOwner(findParentLifecycle, false, 2, null);
            v0.b(view, realWorkflowLifecycleOwner);
            view.addOnAttachStateChangeListener(realWorkflowLifecycleOwner);
        }
    }

    void j();
}