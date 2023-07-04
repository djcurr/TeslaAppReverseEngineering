package expo.modules.imagepicker;

import android.os.Bundle;
import com.stripe.android.model.PaymentMethodOptionsParams;
import expo.modules.core.Promise;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lexpo/modules/imagepicker/PendingPromise;", "Lexpo/modules/core/Promise;", "", "value", "Lvz/b0;", "resolve", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "message", "", "e", "reject", "Lexpo/modules/imagepicker/PickerResultsStore;", "pickerResultsStore", "Lexpo/modules/imagepicker/PickerResultsStore;", "", "isBase64", "Z", "<init>", "(Lexpo/modules/imagepicker/PickerResultsStore;Z)V", "expo-image-picker_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class PendingPromise implements Promise {
    private final boolean isBase64;
    private final PickerResultsStore pickerResultsStore;

    public PendingPromise(PickerResultsStore pickerResultsStore, boolean z11) {
        s.g(pickerResultsStore, "pickerResultsStore");
        this.pickerResultsStore = pickerResultsStore;
        this.isBase64 = z11;
    }

    @Override // expo.modules.core.Promise
    public void reject(String code, String message, Throwable th2) {
        s.g(code, "code");
        s.g(message, "message");
        PickerResultsStore pickerResultsStore = this.pickerResultsStore;
        Bundle bundle = new Bundle();
        bundle.putString(PaymentMethodOptionsParams.Blik.PARAM_CODE, code);
        bundle.putString("message", message);
        if (th2 != null) {
            bundle.putString("exception", th2.toString());
        }
        b0 b0Var = b0.f54756a;
        pickerResultsStore.addPendingResult(bundle);
    }

    @Override // expo.modules.core.Promise
    public void resolve(Object obj) {
        if (obj instanceof Bundle) {
            if (this.isBase64) {
                Bundle bundle = (Bundle) obj;
                if (bundle.containsKey("type")) {
                    bundle.putBoolean(ImagePickerConstants.OPTION_BASE64, s.c(bundle.getString("type"), "image"));
                }
            }
            this.pickerResultsStore.addPendingResult((Bundle) obj);
            return;
        }
        throw new IllegalArgumentException("Can not resolve 'DestroyedPromise' with anything else then 'Bundle'.");
    }

    public /* synthetic */ PendingPromise(PickerResultsStore pickerResultsStore, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(pickerResultsStore, (i11 & 2) != 0 ? false : z11);
    }
}