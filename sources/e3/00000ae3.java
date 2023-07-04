package atd.o0;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.app.c;
import com.adyen.threeds2.ProgressDialog;
import com.adyen.threeds2.R;

/* loaded from: classes.dex */
public final class a implements ProgressDialog, DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    private c f6910a;

    /* renamed from: b  reason: collision with root package name */
    private final DialogInterface.OnDismissListener f6911b;

    public a(Activity activity, DialogInterface.OnDismissListener onDismissListener) {
        this.f6911b = onDismissListener;
        c create = new c.a(activity, R.style.ThreeDS2Theme_ProgressDialog).setView(LayoutInflater.from(activity).inflate(R.layout.a3ds2_widget_progress_dialog, (ViewGroup) null)).b(false).create();
        this.f6910a = create;
        create.setOnDismissListener(this);
    }

    @Override // com.adyen.threeds2.ProgressDialog
    public void hide() {
        c cVar = this.f6910a;
        if (cVar != null) {
            try {
                cVar.dismiss();
            } catch (IllegalStateException unused) {
            }
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f6910a = null;
        this.f6911b.onDismiss(dialogInterface);
    }

    @Override // com.adyen.threeds2.ProgressDialog
    public void show() {
        c cVar = this.f6910a;
        if (cVar != null) {
            cVar.show();
        }
    }
}