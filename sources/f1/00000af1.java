package atd.q0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import atd.d.a;
import atd.p0.a;
import com.adyen.threeds2.R;
import com.adyen.threeds2.internal.ui.widget.ToolbarView;

/* loaded from: classes.dex */
public abstract class a<C extends atd.d.a, L extends atd.p0.a> extends LinearLayout implements ToolbarView.a {

    /* renamed from: a  reason: collision with root package name */
    private L f6915a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        LinearLayout.inflate(context, R.layout.a3ds2_view_challenge_container, this);
        LinearLayout.inflate(context, getChallengeContainerLayoutId(), (ViewGroup) findViewById(R.id.scrollView_content));
        ((ToolbarView) findViewById(R.id.toolbarView)).setToolbarListener(this);
    }

    @Override // com.adyen.threeds2.internal.ui.widget.ToolbarView.a
    public void a() {
        L l11 = this.f6915a;
        if (l11 != null) {
            l11.a();
        }
    }

    protected abstract int getChallengeContainerLayoutId();

    public L getChallengeListener() {
        if (this.f6915a == null) {
            atd.s0.a.a(-842044182161984L);
            atd.s0.a.a(-841296857852480L);
        }
        return this.f6915a;
    }

    public void setChallengeListener(L l11) {
        this.f6915a = l11;
    }
}