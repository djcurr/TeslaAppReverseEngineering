package m9;

import android.database.ContentObserver;
import android.util.Log;

/* loaded from: classes.dex */
public class c extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public String f38459a;

    /* renamed from: b  reason: collision with root package name */
    public int f38460b;

    /* renamed from: c  reason: collision with root package name */
    public b f38461c;

    public c(b bVar, int i11, String str) {
        super(null);
        this.f38461c = bVar;
        this.f38460b = i11;
        this.f38459a = str;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z11) {
        b bVar = this.f38461c;
        if (bVar != null) {
            bVar.d(this.f38460b, this.f38459a);
        } else {
            Log.e("VMS_IDLG_SDK_Observer", "mIdentifierIdClient is null");
        }
    }
}