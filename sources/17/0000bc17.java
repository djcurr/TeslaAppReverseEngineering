package w3;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    private final int f55444a;

    /* renamed from: b  reason: collision with root package name */
    private final c f55445b;

    /* renamed from: c  reason: collision with root package name */
    private final int f55446c;

    public a(int i11, c cVar, int i12) {
        this.f55444a = i11;
        this.f55445b = cVar;
        this.f55446c = i12;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f55444a);
        this.f55445b.S(this.f55446c, bundle);
    }
}