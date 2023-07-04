package go;

import androidx.lifecycle.h0;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.tasks.Task;
import java.util.List;

/* loaded from: classes2.dex */
public interface a extends OptionalModuleApi, u, OptionalModuleApi {
    Task<List<ho.a>> c(ko.a aVar);

    @h0(p.b.ON_DESTROY)
    void close();
}