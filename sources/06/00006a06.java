package expo.modules.imagepicker.exporters;

import android.net.Uri;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.io.ByteArrayOutputStream;
import java.io.File;
import kotlin.Metadata;

@FunctionalInterface
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0001\nJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\u000b"}, d2 = {"Lexpo/modules/imagepicker/exporters/ImageExporter;", "", "Landroid/net/Uri;", Stripe3ds2AuthParams.FIELD_SOURCE, "Ljava/io/File;", "output", "Lexpo/modules/imagepicker/exporters/ImageExporter$Listener;", "exporterListener", "Lvz/b0;", "export", "Listener", "expo-image-picker_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public interface ImageExporter {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH&¨\u0006\f"}, d2 = {"Lexpo/modules/imagepicker/exporters/ImageExporter$Listener;", "", "Ljava/io/ByteArrayOutputStream;", "out", "", Snapshot.WIDTH, Snapshot.HEIGHT, "Lvz/b0;", "onResult", "", "cause", "onFailure", "expo-image-picker_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes5.dex */
    public interface Listener {
        void onFailure(Throwable th2);

        void onResult(ByteArrayOutputStream byteArrayOutputStream, int i11, int i12);
    }

    void export(Uri uri, File file, Listener listener);
}