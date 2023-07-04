package r8;

import android.content.Context;
import com.alipay.android.phone.mrpc.core.aa;
import com.alipay.android.phone.mrpc.core.h;
import com.alipay.android.phone.mrpc.core.w;
import com.alipay.tscenter.biz.rpc.deviceFp.BugTrackMessageService;
import com.alipay.tscenter.biz.rpc.report.general.DataReportService;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;
import expo.modules.imagepicker.PickerResultsStoreKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c implements a {

    /* renamed from: d */
    public static c f49308d;

    /* renamed from: e */
    public static DataReportResult f49309e;

    /* renamed from: a */
    public w f49310a;

    /* renamed from: b */
    public BugTrackMessageService f49311b;

    /* renamed from: c */
    public DataReportService f49312c;

    public c(Context context, String str) {
        this.f49310a = null;
        this.f49311b = null;
        this.f49312c = null;
        aa aaVar = new aa();
        aaVar.a(str);
        h hVar = new h(context);
        this.f49310a = hVar;
        this.f49311b = (BugTrackMessageService) hVar.a(BugTrackMessageService.class, aaVar);
        this.f49312c = (DataReportService) this.f49310a.a(DataReportService.class, aaVar);
    }

    public static synchronized c e(Context context, String str) {
        c cVar;
        synchronized (c.class) {
            if (f49308d == null) {
                f49308d = new c(context, str);
            }
            cVar = f49308d;
        }
        return cVar;
    }

    @Override // r8.a
    public DataReportResult a(DataReportRequest dataReportRequest) {
        if (dataReportRequest == null) {
            return null;
        }
        if (this.f49312c != null) {
            f49309e = null;
            new Thread(new b(this, dataReportRequest)).start();
            for (int i11 = PickerResultsStoreKt.EXPIRATION_TIME; f49309e == null && i11 >= 0; i11 -= 50) {
                Thread.sleep(50L);
            }
        }
        return f49309e;
    }

    @Override // r8.a
    public boolean logCollect(String str) {
        BugTrackMessageService bugTrackMessageService;
        if (x9.a.c(str) || (bugTrackMessageService = this.f49311b) == null) {
            return false;
        }
        String str2 = null;
        try {
            str2 = bugTrackMessageService.logCollect(x9.a.j(str));
        } catch (Throwable unused) {
        }
        if (x9.a.c(str2)) {
            return false;
        }
        return ((Boolean) new JSONObject(str2).get("success")).booleanValue();
    }
}