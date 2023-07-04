package atd.n0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class b implements LayoutInflater.Factory2 {

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f6907c = {atd.s0.a.a(-842808686340672L), atd.s0.a.a(-842851636013632L), atd.s0.a.a(-843195233397312L), atd.s0.a.a(-843263952874048L)};

    /* renamed from: a  reason: collision with root package name */
    private final Window f6908a;

    /* renamed from: b  reason: collision with root package name */
    private final a f6909b;

    public b(Window window, a aVar) {
        this.f6908a = window;
        this.f6909b = aVar;
        aVar.a(window);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        LayoutInflater layoutInflater = this.f6908a.getLayoutInflater();
        View view2 = null;
        if (str.contains(atd.s0.a.a(-843723514374720L))) {
            try {
                view2 = layoutInflater.createView(str, null, attributeSet);
            } catch (InflateException unused) {
            } catch (ClassNotFoundException e11) {
                throw new RuntimeException(atd.s0.a.a(-842924650457664L) + str + atd.s0.a.a(-842787211504192L), e11);
            }
        } else {
            for (String str2 : f6907c) {
                try {
                    view2 = layoutInflater.createView(str, str2, attributeSet);
                } catch (InflateException | ClassNotFoundException unused2) {
                }
                if (view2 != null) {
                    break;
                }
            }
        }
        if (view2 != null) {
            this.f6909b.a(view2, attributeSet);
        }
        return view2;
    }
}