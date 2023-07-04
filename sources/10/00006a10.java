package expo.modules.imagepicker.tasks;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import expo.modules.core.Promise;
import expo.modules.core.errors.ModuleDestroyedException;
import expo.modules.imagepicker.ImagePickerConstants;
import h00.p;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import org.webrtc.MediaStreamTrack;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "expo.modules.imagepicker.tasks.VideoResultTask$execute$1", f = "VideoResultTask.kt", l = {49}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lv20/o0;", "Lvz/b0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class VideoResultTask$execute$1 extends l implements p<o0, d<? super b0>, Object> {
    int label;
    final /* synthetic */ VideoResultTask this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoResultTask$execute$1(VideoResultTask videoResultTask, d<? super VideoResultTask$execute$1> dVar) {
        super(2, dVar);
        this.this$0 = videoResultTask;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new VideoResultTask$execute$1(this.this$0, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((VideoResultTask$execute$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        Promise promise;
        Promise promise2;
        Promise promise3;
        Promise promise4;
        Promise promise5;
        Promise promise6;
        int extractMediaMetadata;
        int extractMediaMetadata2;
        int extractMediaMetadata3;
        int extractMediaMetadata4;
        Promise promise7;
        d11 = a00.d.d();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                r.b(obj);
                VideoResultTask videoResultTask = this.this$0;
                this.label = 1;
                obj = videoResultTask.getFile(this);
                if (obj == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                r.b(obj);
            }
            Bundle bundle = new Bundle();
            VideoResultTask videoResultTask2 = this.this$0;
            bundle.putString("uri", Uri.fromFile((File) obj).toString());
            bundle.putBoolean("cancelled", false);
            bundle.putString("type", MediaStreamTrack.VIDEO_TRACK_KIND);
            extractMediaMetadata = videoResultTask2.extractMediaMetadata(18);
            bundle.putInt(Snapshot.WIDTH, extractMediaMetadata);
            extractMediaMetadata2 = videoResultTask2.extractMediaMetadata(19);
            bundle.putInt(Snapshot.HEIGHT, extractMediaMetadata2);
            extractMediaMetadata3 = videoResultTask2.extractMediaMetadata(24);
            bundle.putInt("rotation", extractMediaMetadata3);
            extractMediaMetadata4 = videoResultTask2.extractMediaMetadata(9);
            bundle.putInt("duration", extractMediaMetadata4);
            promise7 = this.this$0.promise;
            promise7.resolve(bundle);
        } catch (ModuleDestroyedException e11) {
            Log.d(ImagePickerConstants.TAG, ImagePickerConstants.COROUTINE_CANCELED, e11);
            promise6 = this.this$0.promise;
            promise6.reject(e11);
        } catch (IOException e12) {
            promise5 = this.this$0.promise;
            promise5.reject(ImagePickerConstants.ERR_CAN_NOT_SAVE_RESULT, ImagePickerConstants.CAN_NOT_SAVE_RESULT_MESSAGE, e12);
        } catch (IllegalArgumentException e13) {
            promise4 = this.this$0.promise;
            promise4.reject(ImagePickerConstants.ERR_CAN_NOT_EXTRACT_METADATA, ImagePickerConstants.CAN_NOT_EXTRACT_METADATA_MESSAGE, e13);
        } catch (NullPointerException e14) {
            promise3 = this.this$0.promise;
            promise3.reject(ImagePickerConstants.ERR_CAN_NOT_EXTRACT_METADATA, ImagePickerConstants.CAN_NOT_EXTRACT_METADATA_MESSAGE, e14);
        } catch (SecurityException e15) {
            promise2 = this.this$0.promise;
            promise2.reject(ImagePickerConstants.ERR_CAN_NOT_EXTRACT_METADATA, ImagePickerConstants.CAN_NOT_EXTRACT_METADATA_MESSAGE, e15);
        } catch (Exception e16) {
            Log.e(ImagePickerConstants.TAG, ImagePickerConstants.UNKNOWN_EXCEPTION, e16);
            promise = this.this$0.promise;
            promise.reject(ImagePickerConstants.UNKNOWN_EXCEPTION, e16);
        }
        return b0.f54756a;
    }
}