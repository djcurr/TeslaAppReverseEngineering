package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.p;
import androidx.savedstate.SavedStateRegistry;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SavedStateHandleController implements s {

    /* renamed from: a  reason: collision with root package name */
    private final String f5091a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f5092b = false;

    /* renamed from: c  reason: collision with root package name */
    private final l0 f5093c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a implements SavedStateRegistry.a {
        a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.a
        public void a(androidx.savedstate.c cVar) {
            if (cVar instanceof u0) {
                t0 viewModelStore = ((u0) cVar).getViewModelStore();
                SavedStateRegistry savedStateRegistry = cVar.getSavedStateRegistry();
                for (String str : viewModelStore.c()) {
                    SavedStateHandleController.a(viewModelStore.b(str), savedStateRegistry, cVar.getLifecycle());
                }
                if (viewModelStore.c().isEmpty()) {
                    return;
                }
                savedStateRegistry.e(a.class);
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    SavedStateHandleController(String str, l0 l0Var) {
        this.f5091a = str;
        this.f5093c = l0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(p0 p0Var, SavedStateRegistry savedStateRegistry, p pVar) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) p0Var.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.f()) {
            return;
        }
        savedStateHandleController.b(savedStateRegistry, pVar);
        h(savedStateRegistry, pVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SavedStateHandleController d(SavedStateRegistry savedStateRegistry, p pVar, String str, Bundle bundle) {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, l0.b(savedStateRegistry.a(str), bundle));
        savedStateHandleController.b(savedStateRegistry, pVar);
        h(savedStateRegistry, pVar);
        return savedStateHandleController;
    }

    private static void h(final SavedStateRegistry savedStateRegistry, final p pVar) {
        p.c b11 = pVar.b();
        if (b11 != p.c.INITIALIZED && !b11.isAtLeast(p.c.STARTED)) {
            pVar.a(new s() { // from class: androidx.lifecycle.SavedStateHandleController.1
                @Override // androidx.lifecycle.s
                public void g(v vVar, p.b bVar) {
                    if (bVar == p.b.ON_START) {
                        p.this.c(this);
                        savedStateRegistry.e(a.class);
                    }
                }
            });
        } else {
            savedStateRegistry.e(a.class);
        }
    }

    void b(SavedStateRegistry savedStateRegistry, p pVar) {
        if (!this.f5092b) {
            this.f5092b = true;
            pVar.a(this);
            savedStateRegistry.d(this.f5091a, this.f5093c.g());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l0 e() {
        return this.f5093c;
    }

    boolean f() {
        return this.f5092b;
    }

    @Override // androidx.lifecycle.s
    public void g(v vVar, p.b bVar) {
        if (bVar == p.b.ON_DESTROY) {
            this.f5092b = false;
            vVar.getLifecycle().c(this);
        }
    }
}