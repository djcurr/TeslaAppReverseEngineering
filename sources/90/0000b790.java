package u8;

import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class b {
    public static DataReportRequest a(d dVar) {
        DataReportRequest dataReportRequest = new DataReportRequest();
        if (dVar == null) {
            return null;
        }
        dataReportRequest.f10243os = dVar.f53377a;
        dataReportRequest.rpcVersion = dVar.f53383g;
        dataReportRequest.bizType = "1";
        HashMap hashMap = new HashMap();
        dataReportRequest.bizData = hashMap;
        hashMap.put("apdid", dVar.f53378b);
        dataReportRequest.bizData.put("apdidToken", dVar.f53379c);
        dataReportRequest.bizData.put("umidToken", dVar.f53380d);
        dataReportRequest.bizData.put("dynamicKey", dVar.f53381e);
        dataReportRequest.deviceData = dVar.f53382f;
        return dataReportRequest;
    }

    public static c b(DataReportResult dataReportResult) {
        c cVar = new c();
        if (dataReportResult == null) {
            return null;
        }
        cVar.f53366a = dataReportResult.success;
        cVar.f53367b = dataReportResult.resultCode;
        Map<String, String> map = dataReportResult.resultData;
        if (map != null) {
            cVar.f53368c = map.get("apdid");
            cVar.f53369d = map.get("apdidToken");
            cVar.f53372g = map.get("dynamicKey");
            cVar.f53373h = map.get("timeInterval");
            cVar.f53374i = map.get("webrtcUrl");
            cVar.f53375j = "";
            String str = map.get("drmSwitch");
            if (x9.a.f(str)) {
                if (str.length() > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str.charAt(0));
                    cVar.f53370e = sb2.toString();
                }
                if (str.length() >= 3) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str.charAt(2));
                    cVar.f53371f = sb3.toString();
                }
            }
            if (map.containsKey("apse_degrade")) {
                cVar.f53376k = map.get("apse_degrade");
            }
        }
        return cVar;
    }
}