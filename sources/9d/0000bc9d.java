package wg;

import android.content.Context;

/* loaded from: classes3.dex */
public class c extends com.facebook.react.views.view.g {

    /* renamed from: a  reason: collision with root package name */
    private int f55789a;

    /* renamed from: b  reason: collision with root package name */
    private int f55790b;

    public c(Context context) {
        super(context);
        this.f55789a = jg.a.d().g(context) ? 1 : 0;
        this.f55790b = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        if (this.f55789a == 1) {
            setLeft(0);
            setRight((i13 - i11) + 0);
            if (this.f55790b != getWidth()) {
                d dVar = (d) getParent();
                dVar.scrollTo(((dVar.getScrollX() + getWidth()) - this.f55790b) - dVar.getWidth(), dVar.getScrollY());
            }
        }
        this.f55790b = getWidth();
    }

    @Override // com.facebook.react.views.view.g
    public void setRemoveClippedSubviews(boolean z11) {
        if (this.f55789a == 1) {
            super.setRemoveClippedSubviews(false);
        } else {
            super.setRemoveClippedSubviews(z11);
        }
    }
}