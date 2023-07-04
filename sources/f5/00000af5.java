package atd.q0;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import atd.a.h;
import atd.d.l;
import atd.p0.a;
import com.adyen.threeds2.R;
import com.adyen.threeds2.internal.ui.widget.ExpandableInfoTextView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class d<C extends l, L extends atd.p0.a> extends a<C, L> implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final TextView f6919b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f6920c;

    /* renamed from: d  reason: collision with root package name */
    private final TextView f6921d;

    /* renamed from: e  reason: collision with root package name */
    private final ImageView f6922e;

    /* renamed from: f  reason: collision with root package name */
    private final Button f6923f;

    /* renamed from: g  reason: collision with root package name */
    private final ExpandableInfoTextView f6924g;

    /* renamed from: h  reason: collision with root package name */
    private final ExpandableInfoTextView f6925h;

    /* renamed from: i  reason: collision with root package name */
    private final View f6926i;

    /* renamed from: j  reason: collision with root package name */
    private final ImageView f6927j;

    /* renamed from: k  reason: collision with root package name */
    private final ImageView f6928k;

    /* renamed from: l  reason: collision with root package name */
    private final SwitchCompat f6929l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        LinearLayout.inflate(context, getChallengeLayoutId(), (ViewGroup) findViewById(R.id.linearLayout_challengeContainer));
        this.f6919b = (TextView) findViewById(R.id.textView_infoHeader);
        this.f6920c = (TextView) findViewById(R.id.textView_infoText);
        this.f6921d = (TextView) findViewById(R.id.textView_infoLabel);
        this.f6922e = (ImageView) findViewById(R.id.imageView_infoTextIndicator);
        this.f6923f = (Button) findViewById(R.id.button_resend);
        this.f6924g = (ExpandableInfoTextView) findViewById(R.id.expandableInfoText_why);
        this.f6925h = (ExpandableInfoTextView) findViewById(R.id.expandableInfoText_explained);
        this.f6926i = findViewById(R.id.dividerView_logos);
        this.f6927j = (ImageView) findViewById(R.id.imageView_issuer);
        this.f6928k = (ImageView) findViewById(R.id.imageView_scheme);
        this.f6929l = (SwitchCompat) findViewById(R.id.switch_whitelist);
    }

    private void setImagesOrHide(C c11) {
        atd.d.g g11 = c11.g();
        atd.d.g h11 = c11.h();
        if (g11 != null && h11 != null) {
            a(this.f6926i, true);
            a((View) this.f6927j, true);
            a((View) this.f6928k, true);
        } else {
            a(this.f6926i, false);
            a(this.f6927j, g11 != null);
            a(this.f6928k, h11 != null);
        }
        h hVar = h.f6745d;
        hVar.a(this.f6927j, g11);
        hVar.a(this.f6928k, h11);
    }

    private void setWhitelistOrHide(C c11) {
        a(this.f6929l, !TextUtils.isEmpty(c11.j()));
        this.f6929l.setText(c11.j());
    }

    public void a(C c11) {
        a(this.f6919b, c11.b());
        a(this.f6920c, c11.d());
        a(this.f6921d, c11.c());
        a(this.f6922e, c11.m());
        if (c11.a() == atd.e.b.SINGLE_TEXT_INPUT) {
            a(this.f6923f, c11.i());
        } else {
            this.f6923f.setVisibility(8);
        }
        a(this.f6924g, c11.k(), c11.l());
        a(this.f6925h, c11.e(), c11.f());
        setImagesOrHide(c11);
        setWhitelistOrHide(c11);
        this.f6923f.setOnClickListener(this);
        b(c11);
    }

    protected abstract void b(C c11);

    @Override // atd.q0.a
    protected int getChallengeContainerLayoutId() {
        return R.layout.a3ds2_view_challenge_native_container;
    }

    protected abstract int getChallengeLayoutId();

    /* JADX INFO: Access modifiers changed from: protected */
    public String getWhitelistStatus() {
        if (this.f6929l.getVisibility() != 0) {
            return null;
        }
        return atd.s0.a.a(this.f6929l.isChecked() ? -840858771188288L : -840884540992064L);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (getChallengeListener() == null || !view.equals(this.f6923f)) {
            return;
        }
        this.f6923f.setEnabled(false);
        getChallengeListener().d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setInfoLabelFor(int i11) {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f6921d.setLabelFor(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setInfoTextIndicatorVisibility(boolean z11) {
        a(this.f6922e, z11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setInfoTextOrHide(CharSequence charSequence) {
        a(this.f6920c, charSequence);
    }

    private void a(TextView textView, CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(charSequence);
    }

    private void a(ExpandableInfoTextView expandableInfoTextView, String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            expandableInfoTextView.setTitle(str);
            expandableInfoTextView.setInfo(str2);
            return;
        }
        expandableInfoTextView.setVisibility(8);
    }

    private void a(View view, boolean z11) {
        if (view != null) {
            view.setVisibility(z11 ? 0 : 8);
        }
    }
}