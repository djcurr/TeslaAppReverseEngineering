package atd.q0;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import atd.d.q;
import com.adyen.threeds2.R;

/* loaded from: classes.dex */
public final class g extends d<q, atd.p0.e> {

    /* renamed from: m  reason: collision with root package name */
    private final EditText f6946m;

    /* renamed from: n  reason: collision with root package name */
    private final Button f6947n;

    public g(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // atd.q0.d
    /* renamed from: a */
    public void b(q qVar) {
        setInfoLabelFor(this.f6946m.getId());
        this.f6947n.setText(qVar.n());
        this.f6947n.setOnClickListener(this);
    }

    @Override // atd.q0.d
    protected int getChallengeLayoutId() {
        return R.layout.a3ds2_view_challenge_text;
    }

    @Override // atd.q0.d, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        if (getChallengeListener() == 0 || !view.equals(this.f6947n)) {
            return;
        }
        this.f6947n.setEnabled(false);
        String obj = this.f6946m.getText().toString();
        if (TextUtils.isEmpty(obj)) {
            ((atd.p0.e) getChallengeListener()).b();
        } else {
            ((atd.p0.e) getChallengeListener()).a(obj, getWhitelistStatus());
        }
    }

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public g(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f6946m = (EditText) findViewById(R.id.editText_text);
        this.f6947n = (Button) findViewById(R.id.button_continue);
    }
}