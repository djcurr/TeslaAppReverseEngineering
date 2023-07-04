package rr;

import android.view.View;
import androidx.lifecycle.p;
import androidx.lifecycle.v;
import androidx.savedstate.SavedStateRegistry;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class f implements androidx.savedstate.c, v {

    /* renamed from: d  reason: collision with root package name */
    public static final a f49649d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final String f49650a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ v f49651b;

    /* renamed from: c  reason: collision with root package name */
    private final androidx.savedstate.b f49652c;

    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(View view, String key) {
            s.g(view, "view");
            s.g(key, "key");
            qr.b c11 = qr.b.f48435i1.c(view);
            if (c11 != null) {
                f fVar = new f(key, c11, null);
                androidx.savedstate.d.b(view, fVar);
                return fVar;
            }
            throw new IllegalStateException("Expected back stack container view to set a WorkflowLifecycleOwner on its immediate child views.".toString());
        }
    }

    private f(String str, v vVar) {
        this.f49650a = str;
        this.f49651b = vVar;
        androidx.savedstate.b a11 = androidx.savedstate.b.a(this);
        s.f(a11, "create(this)");
        this.f49652c = a11;
    }

    public /* synthetic */ f(String str, v vVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, vVar);
    }

    public final androidx.savedstate.b a() {
        return this.f49652c;
    }

    public final String b() {
        return this.f49650a;
    }

    @Override // androidx.lifecycle.v
    public p getLifecycle() {
        return this.f49651b.getLifecycle();
    }

    @Override // androidx.savedstate.c
    public SavedStateRegistry getSavedStateRegistry() {
        SavedStateRegistry b11 = this.f49652c.b();
        s.f(b11, "controller.savedStateRegistry");
        return b11;
    }
}