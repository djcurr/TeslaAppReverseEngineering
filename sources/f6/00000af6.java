package atd.q0;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import atd.d.n;
import com.adyen.threeds2.R;

/* loaded from: classes.dex */
public final class e extends d<n, atd.p0.c> {

    /* renamed from: m  reason: collision with root package name */
    private final Button f6930m;

    /* renamed from: n  reason: collision with root package name */
    private final Button f6931n;

    public e(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // atd.q0.d
    /* renamed from: a */
    public void b(n nVar) {
        String p11 = nVar.p();
        if (p11 != null) {
            this.f6930m.setTag(Uri.parse(p11));
            this.f6930m.setText(nVar.o());
            this.f6930m.setOnClickListener(this);
        } else {
            this.f6930m.setVisibility(8);
        }
        this.f6931n.setText(nVar.q());
        this.f6931n.setOnClickListener(this);
    }

    @Override // atd.q0.d
    protected int getChallengeLayoutId() {
        return R.layout.a3ds2_view_challenge_out_of_band;
    }

    @Override // atd.q0.d
    public String getWhitelistStatus() {
        return super.getWhitelistStatus();
    }

    @Override // atd.q0.d, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        if (getChallengeListener() != 0) {
            if (view.equals(this.f6931n)) {
                this.f6931n.setEnabled(false);
                ((atd.p0.c) getChallengeListener()).a(getWhitelistStatus());
            } else if (view.equals(this.f6930m)) {
                this.f6930m.setEnabled(false);
                ((atd.p0.c) getChallengeListener()).a((Uri) this.f6930m.getTag());
            }
        }
    }

    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void b2(n nVar) {
        String n11 = nVar.n();
        if (TextUtils.isEmpty(n11)) {
            return;
        }
        setInfoTextOrHide(n11);
        setInfoTextIndicatorVisibility(false);
    }

    public e(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f6930m = (Button) findViewById(R.id.button_app);
        this.f6931n = (Button) findViewById(R.id.button_continue);
    }
}