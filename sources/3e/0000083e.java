package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
class o {

    /* renamed from: b  reason: collision with root package name */
    int f5679b;

    /* renamed from: c  reason: collision with root package name */
    int f5680c;

    /* renamed from: d  reason: collision with root package name */
    int f5681d;

    /* renamed from: e  reason: collision with root package name */
    int f5682e;

    /* renamed from: h  reason: collision with root package name */
    boolean f5685h;

    /* renamed from: i  reason: collision with root package name */
    boolean f5686i;

    /* renamed from: a  reason: collision with root package name */
    boolean f5678a = true;

    /* renamed from: f  reason: collision with root package name */
    int f5683f = 0;

    /* renamed from: g  reason: collision with root package name */
    int f5684g = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(RecyclerView.b0 b0Var) {
        int i11 = this.f5680c;
        return i11 >= 0 && i11 < b0Var.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View b(RecyclerView.w wVar) {
        View o11 = wVar.o(this.f5680c);
        this.f5680c += this.f5681d;
        return o11;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f5679b + ", mCurrentPosition=" + this.f5680c + ", mItemDirection=" + this.f5681d + ", mLayoutDirection=" + this.f5682e + ", mStartLine=" + this.f5683f + ", mEndLine=" + this.f5684g + CoreConstants.CURLY_RIGHT;
    }
}