package s2;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import java.util.Objects;

/* loaded from: classes.dex */
public final class p implements o {

    /* renamed from: a  reason: collision with root package name */
    private final vz.k f50132a;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<InputMethodManager> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f50133a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.f50133a = context;
        }

        @Override // h00.a
        /* renamed from: a */
        public final InputMethodManager invoke() {
            Object systemService = this.f50133a.getSystemService("input_method");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    }

    public p(Context context) {
        vz.k b11;
        kotlin.jvm.internal.s.g(context, "context");
        b11 = vz.m.b(kotlin.b.NONE, new a(context));
        this.f50132a = b11;
    }

    private final InputMethodManager f() {
        return (InputMethodManager) this.f50132a.getValue();
    }

    @Override // s2.o
    public void a(IBinder iBinder) {
        f().hideSoftInputFromWindow(iBinder, 0);
    }

    @Override // s2.o
    public void b(View view, int i11, int i12, int i13, int i14) {
        kotlin.jvm.internal.s.g(view, "view");
        f().updateSelection(view, i11, i12, i13, i14);
    }

    @Override // s2.o
    public void c(View view) {
        kotlin.jvm.internal.s.g(view, "view");
        f().showSoftInput(view, 0);
    }

    @Override // s2.o
    public void d(View view, int i11, ExtractedText extractedText) {
        kotlin.jvm.internal.s.g(view, "view");
        kotlin.jvm.internal.s.g(extractedText, "extractedText");
        f().updateExtractedText(view, i11, extractedText);
    }

    @Override // s2.o
    public void e(View view) {
        kotlin.jvm.internal.s.g(view, "view");
        f().restartInput(view);
    }
}