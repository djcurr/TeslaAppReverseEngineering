package expo.modules.kotlin.events;

import android.content.Intent;
import com.adyen.checkout.components.status.model.StatusResponse;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001b\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lexpo/modules/kotlin/events/OnActivityResultPayload;", "", "", "component1", "component2", "Landroid/content/Intent;", "component3", "requestCode", StatusResponse.RESULT_CODE, MessageExtension.FIELD_DATA, "copy", "", "toString", "hashCode", "other", "", "equals", "I", "getRequestCode", "()I", "getResultCode", "Landroid/content/Intent;", "getData", "()Landroid/content/Intent;", "<init>", "(IILandroid/content/Intent;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class OnActivityResultPayload {
    private final Intent data;
    private final int requestCode;
    private final int resultCode;

    public OnActivityResultPayload(int i11, int i12, Intent intent) {
        this.requestCode = i11;
        this.resultCode = i12;
        this.data = intent;
    }

    public static /* synthetic */ OnActivityResultPayload copy$default(OnActivityResultPayload onActivityResultPayload, int i11, int i12, Intent intent, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = onActivityResultPayload.requestCode;
        }
        if ((i13 & 2) != 0) {
            i12 = onActivityResultPayload.resultCode;
        }
        if ((i13 & 4) != 0) {
            intent = onActivityResultPayload.data;
        }
        return onActivityResultPayload.copy(i11, i12, intent);
    }

    public final int component1() {
        return this.requestCode;
    }

    public final int component2() {
        return this.resultCode;
    }

    public final Intent component3() {
        return this.data;
    }

    public final OnActivityResultPayload copy(int i11, int i12, Intent intent) {
        return new OnActivityResultPayload(i11, i12, intent);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnActivityResultPayload) {
            OnActivityResultPayload onActivityResultPayload = (OnActivityResultPayload) obj;
            return this.requestCode == onActivityResultPayload.requestCode && this.resultCode == onActivityResultPayload.resultCode && s.c(this.data, onActivityResultPayload.data);
        }
        return false;
    }

    public final Intent getData() {
        return this.data;
    }

    public final int getRequestCode() {
        return this.requestCode;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.requestCode) * 31) + Integer.hashCode(this.resultCode)) * 31;
        Intent intent = this.data;
        return hashCode + (intent == null ? 0 : intent.hashCode());
    }

    public String toString() {
        int i11 = this.requestCode;
        int i12 = this.resultCode;
        Intent intent = this.data;
        return "OnActivityResultPayload(requestCode=" + i11 + ", resultCode=" + i12 + ", data=" + intent + ")";
    }
}