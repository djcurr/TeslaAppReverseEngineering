package r8;

import com.alipay.tscenter.biz.rpc.report.general.DataReportService;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;

/* loaded from: classes.dex */
public class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DataReportRequest f49306a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f49307b;

    public b(c cVar, DataReportRequest dataReportRequest) {
        this.f49307b = cVar;
        this.f49306a = dataReportRequest;
    }

    @Override // java.lang.Runnable
    public void run() {
        DataReportResult dataReportResult;
        DataReportResult dataReportResult2;
        DataReportService dataReportService;
        try {
            dataReportService = this.f49307b.f49312c;
            DataReportResult unused = c.f49309e = dataReportService.reportData(this.f49306a);
        } catch (Throwable th2) {
            DataReportResult unused2 = c.f49309e = new DataReportResult();
            dataReportResult = c.f49309e;
            dataReportResult.success = false;
            dataReportResult2 = c.f49309e;
            dataReportResult2.resultCode = "static data rpc upload error, " + x9.a.a(th2);
            x9.a.a(th2);
        }
    }
}