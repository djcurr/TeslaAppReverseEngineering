package a9;

import com.stripe.android.view.AddPaymentMethodActivityStarter;
import com.stripe.android.view.PaymentFlowActivityStarter;

/* loaded from: classes.dex */
public enum c {
    SUCCEEDED(9000, "处理成功"),
    FAILED(4000, "系统繁忙，请稍后再试"),
    CANCELED(AddPaymentMethodActivityStarter.REQUEST_CODE, "用户取消"),
    NETWORK_ERROR(PaymentFlowActivityStarter.REQUEST_CODE, "网络连接异常"),
    ACTIVITY_NOT_START_EXIT(6007, "支付未完成"),
    PARAMS_ERROR(4001, "参数错误"),
    DOUBLE_REQUEST(5000, "重复请求"),
    PAY_WAITTING(8000, "支付结果确认中");
    

    /* renamed from: a  reason: collision with root package name */
    public int f367a;

    /* renamed from: b  reason: collision with root package name */
    public String f368b;

    c(int i11, String str) {
        this.f367a = i11;
        this.f368b = str;
    }

    public void a(int i11) {
        this.f367a = i11;
    }

    public int b() {
        return this.f367a;
    }

    public static c b(int i11) {
        if (i11 != 4001) {
            if (i11 != 5000) {
                if (i11 != 8000) {
                    if (i11 != 9000) {
                        if (i11 != 6001) {
                            if (i11 != 6002) {
                                return FAILED;
                            }
                            return NETWORK_ERROR;
                        }
                        return CANCELED;
                    }
                    return SUCCEEDED;
                }
                return PAY_WAITTING;
            }
            return DOUBLE_REQUEST;
        }
        return PARAMS_ERROR;
    }

    public void a(String str) {
        this.f368b = str;
    }

    public String a() {
        return this.f368b;
    }
}