package rp;

import com.facebook.react.bridge.Dynamic;

/* loaded from: classes2.dex */
public class m extends k<Integer> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // rp.k
    /* renamed from: d */
    public Integer c(Dynamic dynamic) {
        if (dynamic.isNull()) {
            return null;
        }
        return Integer.valueOf(dynamic.asInt());
    }
}