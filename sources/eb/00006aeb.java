package expo.modules.kotlin.modules;

import android.app.Activity;
import com.adyen.checkout.components.status.model.StatusResponse;
import expo.modules.kotlin.events.OnActivityResultPayload;
import h00.p;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Landroid/app/Activity;", "sender", "Lexpo/modules/kotlin/events/OnActivityResultPayload;", StatusResponse.PAYLOAD, "Lvz/b0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ModuleDefinitionBuilder$OnActivityResult$1 extends u implements p<Activity, OnActivityResultPayload, b0> {
    final /* synthetic */ p<Activity, OnActivityResultPayload, b0> $body;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModuleDefinitionBuilder$OnActivityResult$1(p<? super Activity, ? super OnActivityResultPayload, b0> pVar) {
        super(2);
        this.$body = pVar;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(Activity activity, OnActivityResultPayload onActivityResultPayload) {
        invoke2(activity, onActivityResultPayload);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Activity sender, OnActivityResultPayload payload) {
        s.g(sender, "sender");
        s.g(payload, "payload");
        this.$body.invoke(sender, payload);
    }
}