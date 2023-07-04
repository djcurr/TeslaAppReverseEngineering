package com.adyen.checkout.voucher;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.browser.customtabs.d;
import androidx.lifecycle.g0;
import androidx.lifecycle.v;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.ActionComponentData;
import com.adyen.checkout.components.ui.view.a;
import com.adyen.checkout.voucher.VoucherView;
import d7.a;
import d7.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import t7.d;
import t7.g;
import t7.h;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\b\u0012\u0004\u0012\u00020\u00020\u0006B'\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/adyen/checkout/voucher/VoucherView;", "Lcom/adyen/checkout/components/ui/view/a;", "Lt7/h;", "Lt7/g;", "Lcom/adyen/checkout/components/ActionComponentData;", "Lt7/d;", "Landroidx/lifecycle/g0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "voucher_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class VoucherView extends a<h, g, ActionComponentData, d> implements g0<h> {

    /* renamed from: c */
    private final u7.a f9592c;

    /* renamed from: d */
    private d7.a f9593d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VoucherView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.g(context, "context");
    }

    public /* synthetic */ VoucherView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public static /* synthetic */ void g(VoucherView voucherView, View view) {
        h(voucherView, view);
    }

    public static final void h(VoucherView this$0, View view) {
        s.g(this$0, "this$0");
        this$0.i();
    }

    private final void i() {
        String q11 = getComponent().q();
        if (q11 == null) {
            return;
        }
        androidx.browser.customtabs.d b11 = new d.a().i(true).k(l7.a.b(getContext())).b();
        s.f(b11, "Builder()\n            .setShowTitle(true)\n            .setToolbarColor(ThemeUtil.getPrimaryThemeColor(context))\n            .build()");
        b11.a(getContext(), Uri.parse(q11));
    }

    private final void j(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        d7.a aVar = this.f9593d;
        if (aVar == null) {
            s.x("imageLoader");
            throw null;
        }
        ImageView imageView = this.f9592c.f53356b;
        s.f(imageView, "binding.imageViewLogo");
        aVar.d(str, imageView, b.EnumC0455b.MEDIUM, (r13 & 8) != 0 ? 0 : 0, (r13 & 16) != 0 ? 0 : 0);
    }

    @Override // c7.e
    public void a() {
        this.f9592c.f53358d.setOnClickListener(new View.OnClickListener() { // from class: t7.i
            {
                VoucherView.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoucherView.g(VoucherView.this, view);
            }
        });
    }

    @Override // c7.e
    public void b() {
        a.C0454a c0454a = d7.a.f23747d;
        Context context = getContext();
        s.f(context, "context");
        this.f9593d = c0454a.a(context, ((g) getComponent().f()).b());
    }

    @Override // com.adyen.checkout.components.ui.view.a
    protected void e(Context localizedContext) {
        s.g(localizedContext, "localizedContext");
    }

    @Override // com.adyen.checkout.components.ui.view.a
    protected void f(v lifecycleOwner) {
        s.g(lifecycleOwner, "lifecycleOwner");
        getComponent().r(lifecycleOwner, this);
    }

    @Override // androidx.lifecycle.g0
    /* renamed from: k */
    public void onChanged(h hVar) {
        if (hVar == null) {
            return;
        }
        j(hVar.a());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoucherView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.g(context, "context");
        u7.a b11 = u7.a.b(LayoutInflater.from(context), this);
        s.f(b11, "inflate(LayoutInflater.from(context), this)");
        this.f9592c = b11;
        setOrientation(1);
        int dimension = (int) getResources().getDimension(t7.a.f51744a);
        setPadding(dimension, dimension, dimension, dimension);
    }
}